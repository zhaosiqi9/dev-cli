package org.dromara.system.interfaces.api;

import org.dromara.system.api.feign.RemoteConfigContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:09
 */
@RestController
@RequestMapping("/api/config")
public class ApiConfigContractImpl implements RemoteConfigContract {

    /**
     * 获取注册开关
     * @param tenantId 租户id
     * @return true开启，false关闭
     */
    @RequestMapping("/selectRegisterEnabled")
    @Override
    public boolean selectRegisterEnabled(String tenantId) {
        return false;
    }
}
