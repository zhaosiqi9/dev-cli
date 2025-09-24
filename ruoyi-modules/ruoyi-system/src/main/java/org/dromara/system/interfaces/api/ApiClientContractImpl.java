package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.vo.RemoteClientVo;
import org.dromara.system.api.feign.RemoteClientContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:06
 */
@RestController
@RequestMapping("/api/client")
public class ApiClientContractImpl implements RemoteClientContract {


    /**
     * 根据客户端id查询客户端详情
     * @param clientId 客户端id
     * @return 客户端详情
     */
    @RequestMapping("/queryByClientId")
    @Override
    public RemoteClientVo queryByClientId(String clientId) {
        return null;
    }
}
