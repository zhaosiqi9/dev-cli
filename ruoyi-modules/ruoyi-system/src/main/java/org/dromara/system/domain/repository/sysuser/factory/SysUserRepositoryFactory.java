package org.dromara.system.domain.repository.sysuser.factory;

import lombok.extern.slf4j.Slf4j;
import org.dromara.system.domain.repository.sysuser.AbstractSysUserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/22 18:17
 */
@Slf4j
public class SysUserRepositoryFactory {

    public static final Map<Integer, AbstractSysUserRepository> REPOSITORY_MAP = new HashMap<>();

    public static AbstractSysUserRepository getRepository(Integer type) {
        return REPOSITORY_MAP.get(Optional.ofNullable(type).orElse(0));
    }


}
