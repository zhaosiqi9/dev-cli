package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.bo.RemoteSocialBo;
import org.dromara.system.api.domain.vo.RemoteSocialVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 社会化关系服务
 *
 * @author Michelle.Chung
 */
@FeignClient(contextId = "RemoteSocialContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteSocialContract {

    /**
     * 根据 authId 查询用户授权信息
     *
     * @param authId 认证id
     * @return 授权信息
     */
    @PostMapping("/api/social/selectByAuthId")
    List<RemoteSocialVo> selectByAuthId(@RequestBody String authId);

    /**
     * 查询列表
     *
     * @param bo 社会化关系业务对象
     */
    @PostMapping("/api/social/queryList")
    List<RemoteSocialVo> queryList(@RequestBody RemoteSocialBo bo);

    /**
     * 保存社会化关系
     *
     * @param bo 社会化关系业务对象
     */
    @PostMapping("/api/social/insertByBo")
    void insertByBo(@RequestBody RemoteSocialBo bo);

    /**
     * 更新社会化关系
     *
     * @param bo 社会化关系业务对象
     */
    @PostMapping("/api/social/updateByBo")
    void updateByBo(@RequestBody RemoteSocialBo bo);

    /**
     * 删除社会化关系
     *
     * @param socialId 社会化关系ID
     * @return 结果
     */
    @PostMapping("/api/social/deleteWithValidById")
    Boolean deleteWithValidById(@RequestBody Long socialId);

}
