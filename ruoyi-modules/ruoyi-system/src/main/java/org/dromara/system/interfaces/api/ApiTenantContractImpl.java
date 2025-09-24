package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.vo.RemoteTenantVo;
import org.dromara.system.api.feign.RemoteTenantContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:23
 */
@RestController
@RequestMapping("/api/tenant")
public class ApiTenantContractImpl implements RemoteTenantContract {

    /**
     * 根据租户id获取租户详情
     * @param tenantId 租户id
     * @return 结果
     */
    @RequestMapping("/queryByTenantId")
    @Override
    public RemoteTenantVo queryByTenantId(String tenantId) {
        return null;
    }

    /**
     * 获取租户列表
     * @return 列表
     */
    @RequestMapping("/queryList")
    @Override
    public List<RemoteTenantVo> queryList() {
        return List.of();
    }
}
