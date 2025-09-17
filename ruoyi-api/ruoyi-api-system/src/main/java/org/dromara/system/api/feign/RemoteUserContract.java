package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import com.ruoyi.common.base.exception.ServiceException;
import com.ruoyi.common.base.exception.user.UserException;
import org.dromara.system.api.domain.bo.RemoteUserBo;
import org.dromara.system.api.domain.vo.RemoteUserVo;
import org.dromara.system.api.model.LoginUser;
import org.dromara.system.api.model.XcxLoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

/**
 * 用户服务
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemoteUserContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteUserContract {

    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @param tenantId 租户id
     * @return 结果
     */
    @PostMapping("/api/user/getUserInfo")
    LoginUser getUserInfo(String username, String tenantId) throws UserException;

    /**
     * 通过用户id查询用户信息
     *
     * @param userId   用户id
     * @param tenantId 租户id
     * @return 结果
     */
    @PostMapping("/api/user/getUserInfoById")
    LoginUser getUserInfo(Long userId, String tenantId) throws UserException;

    /**
     * 通过手机号查询用户信息
     *
     * @param phonenumber 手机号
     * @param tenantId    租户id
     * @return 结果
     */
    @PostMapping("/api/user/getUserInfoByPhonenumber")
    LoginUser getUserInfoByPhonenumber(String phonenumber, String tenantId) throws UserException;

    /**
     * 通过邮箱查询用户信息
     *
     * @param email    邮箱
     * @param tenantId 租户id
     * @return 结果
     */
    @PostMapping("/api/user/getUserInfoByEmail")
    LoginUser getUserInfoByEmail(String email, String tenantId) throws UserException;

    /**
     * 通过openid查询用户信息
     *
     * @param openid openid
     * @return 结果
     */
    @PostMapping("/api/user/getUserInfoByOpenid")
    XcxLoginUser getUserInfoByOpenid(String openid) throws UserException;

    /**
     * 注册用户信息
     *
     * @param remoteUserBo 用户信息
     * @return 结果
     */
    @PostMapping("/api/user/registerUserInfo")
    Boolean registerUserInfo(RemoteUserBo remoteUserBo) throws UserException, ServiceException;

    /**
     * 通过userId查询用户账户
     *
     * @param userId 用户id
     * @return 结果
     */
    @PostMapping("/api/user/selectUserNameById")
    String selectUserNameById(Long userId);

    /**
     * 通过用户ID查询用户昵称
     *
     * @param userId 用户id
     * @return 结果
     */
    @PostMapping("/api/user/selectNicknameById")
    String selectNicknameById(Long userId);

    /**
     * 通过用户ID查询用户账户
     *
     * @param userIds 用户ID 多个用逗号隔开
     * @return 用户名称
     */
    @PostMapping("/api/user/selectUserNameByIds")
    String selectNicknameByIds(String userIds);

    /**
     * 通过用户ID查询用户手机号
     *
     * @param userId 用户id
     * @return 用户手机号
     */
    @PostMapping("/api/user/selectPhonenumberById")
    String selectPhonenumberById(Long userId);

    /**
     * 通过用户ID查询用户邮箱
     *
     * @param userId 用户id
     * @return 用户邮箱
     */
    @PostMapping("/api/user/selectEmailById")
    String selectEmailById(Long userId);

    /**
     * 更新用户信息
     *
     * @param userId 用户ID
     * @param ip     IP地址
     */
    @PostMapping("/api/user/recordLoginInfo")
    void recordLoginInfo(Long userId, String ip);

    /**
     * 通过用户ID查询用户列表
     *
     * @param userIds 用户ids
     * @return 用户列表
     */
    @PostMapping("/api/user/selectListByIds")
    List<RemoteUserVo> selectListByIds(List<Long> userIds);

    /**
     * 通过角色ID查询用户ID
     *
     * @param roleIds 角色ids
     * @return 用户ids
     */
    @PostMapping("/api/user/selectUserIdsByRoleIds")
    List<Long> selectUserIdsByRoleIds(List<Long> roleIds);

    /**
     * 通过角色ID查询用户
     *
     * @param roleIds 角色ids
     * @return 用户
     */
    @PostMapping("/api/user/selectUsersByRoleIds")
    List<RemoteUserVo> selectUsersByRoleIds(List<Long> roleIds);

    /**
     * 通过部门ID查询用户
     *
     * @param deptIds 部门ids
     * @return 用户
     */
    @PostMapping("/api/user/selectUsersByDeptIds")
    List<RemoteUserVo> selectUsersByDeptIds(List<Long> deptIds);

    /**
     * 通过岗位ID查询用户
     *
     * @param postIds 岗位ids
     * @return 用户
     */
    @PostMapping("/api/user/selectUsersByPostIds")
    List<RemoteUserVo> selectUsersByPostIds(List<Long> postIds);

    /**
     * 根据用户 ID 列表查询用户名称映射关系
     *
     * @param userIds 用户 ID 列表
     * @return Map，其中 key 为用户 ID，value 为对应的用户名称
     */
    @PostMapping("/api/user/selectUserNamesByIds")
    Map<Long, String> selectUserNamesByIds(List<Long> userIds);

    /**
     * 根据角色 ID 列表查询角色名称映射关系
     *
     * @param roleIds 角色 ID 列表
     * @return Map，其中 key 为角色 ID，value 为对应的角色名称
     */
    @PostMapping("/api/user/selectRoleNamesByIds")
    Map<Long, String> selectRoleNamesByIds(List<Long> roleIds);

    /**
     * 根据部门 ID 列表查询部门名称映射关系
     *
     * @param deptIds 部门 ID 列表
     * @return Map，其中 key 为部门 ID，value 为对应的部门名称
     */
    @PostMapping("/api/user/selectDeptNamesByIds")
    Map<Long, String> selectDeptNamesByIds(List<Long> deptIds);

    /**
     * 根据岗位 ID 列表查询岗位名称映射关系
     *
     * @param postIds 岗位 ID 列表
     * @return Map，其中 key 为岗位 ID，value 为对应的岗位名称
     */
    @PostMapping("/api/user/selectPostNamesByIds")
    Map<Long, String> selectPostNamesByIds(List<Long> postIds);

}
