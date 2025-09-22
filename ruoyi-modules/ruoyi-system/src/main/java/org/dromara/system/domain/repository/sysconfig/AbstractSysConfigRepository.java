package org.dromara.system.domain.repository.sysconfig;

import jakarta.annotation.PostConstruct;
import org.dromara.system.domain.repository.sysconfig.factory.SysConfigRepositoryFactory;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/22 18:22
 */
public abstract class AbstractSysConfigRepository {

    protected abstract Integer getType();

    @PostConstruct
    protected void initRepository() {
        SysConfigRepositoryFactory.REPOSITORY_MAP.put(getType(), this);
    }
}
