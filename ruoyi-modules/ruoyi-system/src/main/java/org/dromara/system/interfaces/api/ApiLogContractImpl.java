package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.bo.RemoteLogininforBo;
import org.dromara.system.api.domain.bo.RemoteOperLogBo;
import org.dromara.system.api.feign.RemoteLogContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:16
 */
@RestController
@RequestMapping("/api/log")
public class ApiLogContractImpl implements RemoteLogContract {

    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     */
    @RequestMapping("/saveLog")
    @Override
    public void saveLog(RemoteOperLogBo sysOperLog) {

    }

    /**
     * 保存访问记录
     *
     * @param sysLogininfor 访问实体
     */
    @RequestMapping("/saveLogininfor")
    @Override
    public void saveLogininfor(RemoteLogininforBo sysLogininfor) {

    }
}
