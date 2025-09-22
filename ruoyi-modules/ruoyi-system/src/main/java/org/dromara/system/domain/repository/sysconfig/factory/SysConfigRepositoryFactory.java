package org.dromara.system.domain.repository.sysconfig.factory;

import org.dromara.system.domain.repository.sysconfig.AbstractSysConfigRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/22 18:24
 */
public class SysConfigRepositoryFactory {
    public static final Map<Integer, AbstractSysConfigRepository> REPOSITORY_MAP = new HashMap<>();

    public static AbstractSysConfigRepository getRepository(Integer type) {
        return REPOSITORY_MAP.get(Optional.ofNullable(type).orElse(0));
    }

}
