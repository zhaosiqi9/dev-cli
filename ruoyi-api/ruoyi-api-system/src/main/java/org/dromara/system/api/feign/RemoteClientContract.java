package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.vo.RemoteClientVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author : gr
 * @version 1.0.0
 * @date : 2025/9/16 16:45
 */
@FeignClient(contextId = "RemoteClientContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteClientContract {

    /**
     * 根据客户端id获取客户端详情
     *
     * @param clientId 客户端id
     * @return 客户端对象
     */
    @PostMapping("/api/client/queryByClientId")
    RemoteClientVo queryByClientId(@RequestBody String clientId);

}
