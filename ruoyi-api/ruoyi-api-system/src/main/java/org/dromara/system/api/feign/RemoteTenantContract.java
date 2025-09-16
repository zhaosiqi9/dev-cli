package org.dromara.system.api.feign;


import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.vo.RemoteTenantVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 租户服务
 *
 * @author zhujie
 */
@FeignClient(contextId = "RemoteTenantContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteTenantContract {

    /**
     * 根据租户id获取租户详情
     * @param tenantId 租户id
     * @return 结果
     */
    @PostMapping("/api/tenant/queryByTenantId")
    RemoteTenantVo queryByTenantId(@RequestBody String tenantId);

    /**
     * 获取租户列表
     * @return 结果
     */
    @PostMapping("/api/tenant/queryList")
    List<RemoteTenantVo> queryList();

}
