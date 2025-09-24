package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.vo.RemoteDeptVo;
import org.dromara.system.api.feign.RemoteDeptContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:13
 */
@RestController
@RequestMapping("/api/dept")
public class ApiDeptContractImpl implements RemoteDeptContract {

    /**
     * 通过部门ID查询部门名称
     *
     * @param deptIds 部门ID串逗号分隔
     * @return 部门名称串逗号分隔
     */
    @RequestMapping("/selectDeptNameByIds")
    @Override
    public String selectDeptNameByIds(String deptIds) {
        return "";
    }

    /**
     * 根据部门ID查询部门负责人
     * @param deptId 部门ID，用于指定需要查询的部门
     * @return 返回该部门的负责人ID
     */
    @RequestMapping("/selectDeptLeaderById")
    @Override
    public Long selectDeptLeaderById(Long deptId) {
        return 0L;
    }

    /**
     * 获取部门列表
     * @return 部门列表
     */
    @RequestMapping("/selectDeptsByList")
    @Override
    public List<RemoteDeptVo> selectDeptsByList() {
        return List.of();
    }
}
