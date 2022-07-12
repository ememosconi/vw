package com.vw.msseed.application.port.in;

import org.springframework.data.domain.Page;
import com.vw.msseed.domain.Seed;

import java.util.Map;

public interface GetSeedQuery {
    Page<Seed> execute(int page, int size, Map<String, String> filters);
}
