package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.bo.RemoteTaskAssigneeBo;
import org.dromara.system.api.domain.vo.RemoteTaskAssigneeVo;
import org.dromara.system.api.feign.RemoteTaskAssigneeContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:19
 */
@RestController
@RequestMapping("/api/task/assignee")
public class ApiTaskAssigneeContractImpl implements RemoteTaskAssigneeContract {

    /****
     * 获取角色并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 处理结果
     */
    @RequestMapping("/selectRolesByTaskAssigneeList")
    @Override
    public RemoteTaskAssigneeVo selectRolesByTaskAssigneeList(RemoteTaskAssigneeBo taskQuery) {
        return null;
    }

    /**
     * 获取岗位并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 处理结果
     */
    @RequestMapping("/selectPostsByTaskAssigneeList")
    @Override
    public RemoteTaskAssigneeVo selectPostsByTaskAssigneeList(RemoteTaskAssigneeBo taskQuery) {
        return null;
    }

    /**
     * 获取部门并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 处理结果
     */
    @RequestMapping("/selectDeptsByTaskAssigneeList")
    @Override
    public RemoteTaskAssigneeVo selectDeptsByTaskAssigneeList(RemoteTaskAssigneeBo taskQuery) {
        return null;
    }

    /**
     * 获取用户并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 处理结果
     */
    @RequestMapping("/selectUsersByTaskAssigneeList")
    @Override
    public RemoteTaskAssigneeVo selectUsersByTaskAssigneeList(RemoteTaskAssigneeBo taskQuery) {
        return null;
    }
}
