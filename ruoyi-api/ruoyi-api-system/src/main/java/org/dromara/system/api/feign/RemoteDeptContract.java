package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.vo.RemoteDeptVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 部门服务
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemoteDeptContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteDeptContract {

    /**
     * 通过部门ID查询部门名称
     *
     * @param deptIds 部门ID串逗号分隔
     * @return 部门名称串逗号分隔
     */
    @PostMapping("/api/dept/selectDeptNameByIds")
    String selectDeptNameByIds(@RequestBody String deptIds);

    /**
     * 根据部门ID查询部门负责人
     *
     * @param deptId 部门ID，用于指定需要查询的部门
     * @return 返回该部门的负责人ID
     */
    @PostMapping("/api/dept/selectDeptLeaderById")
    Long selectDeptLeaderById(@RequestBody Long deptId);

    /**
     * 查询部门
     *
     * @return 部门列表
     */
    @PostMapping("/api/dept/selectDeptsByList")
    List<RemoteDeptVo> selectDeptsByList();

}
