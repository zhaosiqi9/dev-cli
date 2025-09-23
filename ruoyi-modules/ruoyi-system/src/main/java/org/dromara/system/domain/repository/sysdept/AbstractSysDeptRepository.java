package org.dromara.system.domain.repository.sysdept;

import jakarta.annotation.PostConstruct;
import org.dromara.system.domain.repository.sysdept.factory.SysDeptRepositoryFactory;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/23 23:51
 */
public abstract class AbstractSysDeptRepository {

    protected abstract Integer getType();

    @PostConstruct
    protected void init(){
        SysDeptRepositoryFactory.REPOSITORY_MAP.put(getType(),this);
    }
}
