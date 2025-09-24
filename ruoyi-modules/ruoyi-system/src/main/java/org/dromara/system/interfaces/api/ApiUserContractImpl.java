package org.dromara.system.interfaces.api;

import com.ruoyi.common.base.exception.ServiceException;
import com.ruoyi.common.base.exception.user.UserException;
import org.dromara.system.api.domain.bo.RemoteUserBo;
import org.dromara.system.api.domain.vo.RemoteUserVo;
import org.dromara.system.api.feign.RemoteUserContract;
import org.dromara.system.api.model.LoginUser;
import org.dromara.system.api.model.XcxLoginUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:24
 */
@RestController
@RequestMapping("/api/user")
public class ApiUserContractImpl implements RemoteUserContract {
    @Override
    public LoginUser getUserInfo(String username, String tenantId) throws UserException {
        return null;
    }

    @Override
    public LoginUser getUserInfo(Long userId, String tenantId) throws UserException {
        return null;
    }

    @Override
    public LoginUser getUserInfoByPhonenumber(String phonenumber, String tenantId) throws UserException {
        return null;
    }

    @Override
    public LoginUser getUserInfoByEmail(String email, String tenantId) throws UserException {
        return null;
    }

    @Override
    public XcxLoginUser getUserInfoByOpenid(String openid) throws UserException {
        return null;
    }

    @Override
    public Boolean registerUserInfo(RemoteUserBo remoteUserBo) throws UserException, ServiceException {
        return null;
    }

    @Override
    public String selectUserNameById(Long userId) {
        return "";
    }

    @Override
    public String selectNicknameById(Long userId) {
        return "";
    }

    @Override
    public String selectNicknameByIds(String userIds) {
        return "";
    }

    @Override
    public String selectPhonenumberById(Long userId) {
        return "";
    }

    @Override
    public String selectEmailById(Long userId) {
        return "";
    }

    @Override
    public void recordLoginInfo(Long userId, String ip) {

    }

    @Override
    public List<RemoteUserVo> selectListByIds(List<Long> userIds) {
        return List.of();
    }

    @Override
    public List<Long> selectUserIdsByRoleIds(List<Long> roleIds) {
        return List.of();
    }

    @Override
    public List<RemoteUserVo> selectUsersByRoleIds(List<Long> roleIds) {
        return List.of();
    }

    @Override
    public List<RemoteUserVo> selectUsersByDeptIds(List<Long> deptIds) {
        return List.of();
    }

    @Override
    public List<RemoteUserVo> selectUsersByPostIds(List<Long> postIds) {
        return List.of();
    }

    @Override
    public Map<Long, String> selectUserNamesByIds(List<Long> userIds) {
        return Map.of();
    }

    @Override
    public Map<Long, String> selectRoleNamesByIds(List<Long> roleIds) {
        return Map.of();
    }

    @Override
    public Map<Long, String> selectDeptNamesByIds(List<Long> deptIds) {
        return Map.of();
    }

    @Override
    public Map<Long, String> selectPostNamesByIds(List<Long> postIds) {
        return Map.of();
    }
}
