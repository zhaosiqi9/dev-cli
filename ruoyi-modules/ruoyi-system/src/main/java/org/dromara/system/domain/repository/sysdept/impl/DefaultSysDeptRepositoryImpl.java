package org.dromara.system.domain.repository.sysdept.impl;

import org.dromara.system.domain.repository.sysdept.AbstractSysDeptRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/23 23:53
 */
@Repository
public class DefaultSysDeptRepositoryImpl extends AbstractSysDeptRepository {
    @Override
    protected Integer getType() {
        return 0;
    }
}
