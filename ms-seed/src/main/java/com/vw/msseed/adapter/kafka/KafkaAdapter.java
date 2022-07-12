package com.vw.msseed.adapter.kafka;

import com.vw.msseed.application.port.out.NotificationRepository;
import com.vw.msseed.config.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.vw.msseed.adapter.kafka.exeption.NotificationException;
import com.vw.msseed.adapter.kafka.model.SeedNotificationModel;
import com.vw.msseed.config.properties.SpringConfigurationProperties;
import com.vw.msseed.domain.Seed;

import java.util.UUID;

@Component
@Slf4j
public class KafkaAdapter implements NotificationRepository {


    private final KafkaTemplate<String, SeedNotificationModel> kafkaTemplate;
    private final SpringConfigurationProperties springConfigurationProperties;

    public KafkaAdapter(KafkaTemplate<String, SeedNotificationModel> kafkaTemplate, SpringConfigurationProperties springConfigurationProperties){
        this.kafkaTemplate = kafkaTemplate;
        this.springConfigurationProperties = springConfigurationProperties;
    }

    @Override
    public void notify(Seed seed, UUID notificationId) {
        SeedNotificationModel seedModel = SeedNotificationModel.fromDomain(seed);
        seedModel.setUuid(notificationId);
        log.info("Enviando notificacion de seed  {} ", seedModel);
        try {
            kafkaTemplate.send(springConfigurationProperties.getKafka().getTopic().getCreation(),seedModel);
            kafkaTemplate.flush();
        }catch (Exception e){
            log.error("Ocurrio un error en kafka {}" ,e);
            throw  new NotificationException(ErrorCode.KAFKA_EXCEPTION);
        }




    }
}
