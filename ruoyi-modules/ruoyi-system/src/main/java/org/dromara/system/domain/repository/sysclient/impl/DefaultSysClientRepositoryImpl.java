package org.dromara.system.domain.repository.sysclient.impl;

import org.dromara.system.domain.repository.sysclient.AbstractSysClientRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultSysClientRepositoryImpl extends AbstractSysClientRepository {

    @Override
    protected int getType() {
        return 0;
    }
}
