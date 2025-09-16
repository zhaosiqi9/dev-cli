package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

/**
 * 用户权限处理
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemotePermissionService", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemotePermissionContract {

    /**
     * 获取角色数据权限
     *
     * @param userId  用户id
     * @return 角色权限信息
     */
    @PostMapping("/api/permission/getRolePermission")
    Set<String> getRolePermission(@RequestBody Long userId);

    /**
     * 获取菜单数据权限
     *
     * @param userId  用户id
     * @return 菜单权限信息
     */
    @PostMapping("/api/permission/getMenuPermission")
    Set<String> getMenuPermission(@RequestBody Long userId);

}
