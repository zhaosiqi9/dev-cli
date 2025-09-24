package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.bo.RemoteSocialBo;
import org.dromara.system.api.domain.vo.RemoteSocialVo;
import org.dromara.system.api.feign.RemoteSocialContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:18
 */
@RestController
@RequestMapping("/api/social")
public class ApiContractImpl implements RemoteSocialContract {

    /**
     * 根据 authId 查询用户授权信息
     *
     * @param authId 认证id
     * @return 授权信息
     */
    @RequestMapping("/selectByAuthId")
    @Override
    public List<RemoteSocialVo> selectByAuthId(String authId) {
        return List.of();
    }

    /**
     * 查询列表
     *
     * @param bo 社会化关系业务对象
     */
    @RequestMapping("/queryList")
    @Override
    public List<RemoteSocialVo> queryList(RemoteSocialBo bo) {
        return List.of();
    }

    /**
     * 保存社会化关系
     *
     * @param bo 社会化关系业务对象
     */
    @RequestMapping("/insertByBo")
    @Override
    public void insertByBo(RemoteSocialBo bo) {

    }

    /**
     * 更新社会化关系
     *
     * @param bo 社会化关系业务对象
     */
    @RequestMapping("/updateByBo")
    @Override
    public void updateByBo(RemoteSocialBo bo) {

    }

    /**
     * 删除社会化关系
     *
     * @param socialId 社会化关系ID
     * @return 删除结果
     */
    @RequestMapping("/deleteWithValidById")
    @Override
    public Boolean deleteWithValidById(Long socialId) {
        return null;
    }
}
