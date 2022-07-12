package com.vw.msseed.adapter.redis;

import com.vw.msseed.adapter.redis.model.ConfirmationSeedModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ConfirmationSeedRedisRepository extends CrudRepository<ConfirmationSeedModel, UUID> {
}
