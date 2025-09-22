package org.dromara.system.domain.repository.sysconfig.impl;

import org.dromara.system.domain.repository.sysconfig.AbstractSysConfigRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/22 18:25
 */
@Repository
public class DefaultSysConfigRepositoryImpl extends AbstractSysConfigRepository {

    @Override
    protected Integer getType() {
        return 0;
    }
}
