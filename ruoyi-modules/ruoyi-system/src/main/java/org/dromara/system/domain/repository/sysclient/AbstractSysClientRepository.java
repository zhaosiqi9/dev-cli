package org.dromara.system.domain.repository.sysclient;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.dromara.system.domain.repository.sysclient.factory.SysClientRepositoryFactory;

@Slf4j
public abstract class AbstractSysClientRepository {

    @PostConstruct
    protected void initRepository() {
        SysClientRepositoryFactory.REPOSITORY_MAP.put(getType(), this);
    }

    protected abstract int getType();
}
