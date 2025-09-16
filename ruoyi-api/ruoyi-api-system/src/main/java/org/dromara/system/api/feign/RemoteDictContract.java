package org.dromara.system.api.feign;

import com.ruoyi.common.base.constant.ServiceNameConstants;
import org.dromara.system.api.domain.vo.RemoteDictDataVo;
import org.dromara.system.api.domain.vo.RemoteDictTypeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 字典服务
 *
 * @author Lion Li
 */
@FeignClient(contextId = "RemoteDictContract", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteDictContract {

    /**
     * 根据字典类型查询信息
     *
     * @param dictType 字典类型
     * @return 字典类型
     */
    @PostMapping("/api/dict/selectDictTypeByType")
    RemoteDictTypeVo selectDictTypeByType(@RequestBody String dictType);

    /**
     * 根据字典类型查询字典数据
     *
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    @PostMapping("/api/dict/selectDictDataByType")
    List<RemoteDictDataVo> selectDictDataByType(@RequestBody String dictType);


}
