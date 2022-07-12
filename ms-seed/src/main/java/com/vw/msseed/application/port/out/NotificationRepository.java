package com.vw.msseed.application.port.out;

import com.vw.msseed.domain.Seed;

import java.util.UUID;

public interface NotificationRepository {

    void notify(Seed seed, UUID notificationId);
}
