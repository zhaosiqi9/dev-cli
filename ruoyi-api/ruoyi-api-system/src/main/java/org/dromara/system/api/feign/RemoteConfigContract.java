package org.dromara.system.api.feign;


import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

@FeignClient(contextId = "RemoteConfigContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteConfigContract {

    /**
     * 获取注册开关
     * @param tenantId 租户id
     * @return true开启，false关闭
     */
    @PostMapping("/api/config/selectRegisterEnabled")
    boolean selectRegisterEnabled(@RequestBody String tenantId);

}
