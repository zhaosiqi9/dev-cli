package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(contextId = "RemoteDataScopeContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteDataScopeContract {

    /**
     * 获取角色自定义权限语句
     *
     * @param roleId 角色ID
     * @return 返回角色的自定义权限语句，如果没有找到则返回 null
     */
    @PostMapping("/api/dataScope/getRoleCustom")
    String getRoleCustom(@RequestBody Long roleId);

    /**
     * 获取部门和下级权限语句
     *
     * @param deptId 部门ID
     * @return 返回部门及其下级的权限语句，如果没有找到则返回 null
     */
    @PostMapping("/api/dataScope/getDeptAndChild")
    String getDeptAndChild(@RequestBody Long deptId);

}
