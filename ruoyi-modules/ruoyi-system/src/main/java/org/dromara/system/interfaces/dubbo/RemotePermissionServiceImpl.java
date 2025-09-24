package org.dromara.system.interfaces.dubbo;

import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.dromara.system.api.dubbo.RemotePermissionService;
import org.dromara.system.application.service.ISysPermissionService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * 权限服务
 *
 * @author Lion Li
 */
@RequiredArgsConstructor
@Service
@DubboService
public class RemotePermissionServiceImpl implements RemotePermissionService {

    private final ISysPermissionService permissionService;

    @Override
    public Set<String> getRolePermission(Long userId) {
        return permissionService.getRolePermission(userId);
    }

    @Override
    public Set<String> getMenuPermission(Long userId) {
        return permissionService.getMenuPermission(userId);
    }
}
