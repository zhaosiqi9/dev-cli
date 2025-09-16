package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.bo.RemoteLogininforBo;
import org.dromara.system.api.domain.bo.RemoteOperLogBo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 日志服务
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemoteLogService", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteLogContract {

    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     */
    @PostMapping("/api/log/saveLog")
    void saveLog(@RequestBody RemoteOperLogBo sysOperLog);

    /**
     * 保存访问记录
     *
     * @param sysLogininfor 访问实体
     */
    @PostMapping("/api/log/saveLogininfor")
    void saveLogininfor(@RequestBody RemoteLogininforBo sysLogininfor);

}
