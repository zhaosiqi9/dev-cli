package org.dromara.system.domain.repository.sysclient.factory;

import lombok.extern.slf4j.Slf4j;
import org.dromara.system.domain.repository.sysclient.AbstractSysClientRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Slf4j
public class SysClientRepositoryFactory {

    public static final Map<Integer, AbstractSysClientRepository> REPOSITORY_MAP = new HashMap<>();

    @SuppressWarnings("unused")
    public static AbstractSysClientRepository getRepository(Integer type) {
        return REPOSITORY_MAP.get(Optional.ofNullable(type).orElse(0));
    }

}
