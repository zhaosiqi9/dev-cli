package org.dromara.system.domain.repository.sysdept.factory;

import org.dromara.system.domain.repository.sysdept.AbstractSysDeptRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/23 23:51
 */
public class SysDeptRepositoryFactory {

    public static final Map<Integer, AbstractSysDeptRepository> REPOSITORY_MAP = new HashMap<>();

    public static AbstractSysDeptRepository getRepository(Integer type) {
        return REPOSITORY_MAP.get(type);
    }

}
