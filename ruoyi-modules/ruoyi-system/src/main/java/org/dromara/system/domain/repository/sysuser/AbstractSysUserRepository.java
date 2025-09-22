package org.dromara.system.domain.repository.sysuser;

import jakarta.annotation.PostConstruct;
import org.dromara.system.domain.repository.sysuser.factory.SysUserRepositoryFactory;

/**
 * @author : gr
 * @version 1.0.0
 * @since : 2025/9/22 17:13
 */
public abstract class AbstractSysUserRepository {

    protected abstract Integer getType();

    @PostConstruct
    public void init() {
        SysUserRepositoryFactory.REPOSITORY_MAP.put(getType(), this);
    }
}
