package com.vw.msseed.application.port.out;

import org.springframework.data.domain.Page;
import com.vw.msseed.domain.Seed;

public interface SeedRepository {
    Page<Seed> getByFilters(int page, int size);
}
