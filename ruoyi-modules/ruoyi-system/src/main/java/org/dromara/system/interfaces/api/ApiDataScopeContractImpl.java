package org.dromara.system.interfaces.api;

import org.dromara.system.api.feign.RemoteDataScopeContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:10
 */
@RestController
@RequestMapping("/api/dataScope")
public class ApiDataScopeContractImpl implements RemoteDataScopeContract {

    /**
     * 获取角色自定义权限语句
     * @param roleId 角色ID
     * @return 返回角色的自定义权限语句，如果没有找到则返回 null
     */
    @RequestMapping("/getRoleCustom")
    @Override
    public String getRoleCustom(Long roleId) {
        return "";
    }

    /**
     * 获取部门和下级权限语句/**
     * 获取部门和下级权限语句
     * @param deptId 部门ID
     * @return 返回部门及其下级的权限语句，如果没有找到则返回 null
     */
    @RequestMapping("/getDeptAndChild")
    @Override
    public String getDeptAndChild(Long deptId) {
        return "";
    }
}
