package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.bo.RemoteTaskAssigneeBo;
import org.dromara.system.api.domain.vo.RemoteTaskAssigneeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 工作流设计器获取任务执行人
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemoteTaskAssigneeContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteTaskAssigneeContract {

    /**
     * 查询角色并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 办理人
     */
    @PostMapping("/api/task/selectRolesByTaskAssigneeList")
    RemoteTaskAssigneeVo selectRolesByTaskAssigneeList(@RequestBody RemoteTaskAssigneeBo taskQuery);

    /**
     * 查询岗位并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 办理人
     */
    @PostMapping("/api/task/selectPostsByTaskAssigneeList")
    RemoteTaskAssigneeVo selectPostsByTaskAssigneeList(@RequestBody RemoteTaskAssigneeBo taskQuery);

    /**
     * 查询部门并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 办理人
     */
    @PostMapping("/api/task/selectDeptsByTaskAssigneeList")
    RemoteTaskAssigneeVo selectDeptsByTaskAssigneeList(@RequestBody RemoteTaskAssigneeBo taskQuery);

    /**
     * 查询用户并返回任务指派的列表，支持分页
     *
     * @param taskQuery 查询条件
     * @return 办理人
     */
    @PostMapping("/api/task/selectUsersByTaskAssigneeList")
    RemoteTaskAssigneeVo selectUsersByTaskAssigneeList(@RequestBody RemoteTaskAssigneeBo taskQuery);

}
