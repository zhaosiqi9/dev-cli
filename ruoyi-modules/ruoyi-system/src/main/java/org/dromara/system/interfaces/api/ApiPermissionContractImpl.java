package org.dromara.system.interfaces.api;

import org.dromara.system.api.feign.RemotePermissionContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:17
 */
@RestController
@RequestMapping("/api/permission")
public class ApiPermissionContractImpl implements RemotePermissionContract {

    /**
     * 获取角色权限
     * @param userId  用户id
     * @return 角色权限信息
     */
    @RequestMapping("/getRolePermission")
    @Override
    public Set<String> getRolePermission(Long userId) {
        return Set.of();
    }

    /**
     * 获取菜单权限
     * @param userId  用户id
     * @return 菜单权限信息
     */
    @RequestMapping("/getMenuPermission")
    @Override
    public Set<String> getMenuPermission(Long userId) {
        return Set.of();
    }
}
