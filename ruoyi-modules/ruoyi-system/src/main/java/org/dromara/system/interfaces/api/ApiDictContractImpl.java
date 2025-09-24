package org.dromara.system.interfaces.api;

import org.dromara.system.api.domain.vo.RemoteDictDataVo;
import org.dromara.system.api.domain.vo.RemoteDictTypeVo;
import org.dromara.system.api.feign.RemoteDictContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : gr
 * @version : 1.0.0
 * @since : 2025/9/24 10:15
 */
@RestController
@RequestMapping("/api/dict")
public class ApiDictContractImpl implements RemoteDictContract {

    /**
     * 根据字典类型查询信息
     * @param dictType 字典类型
     * @return 字典类型
     */
    @RequestMapping("/selectDictTypeByType")
    @Override
    public RemoteDictTypeVo selectDictTypeByType(String dictType) {
        return null;
    }

    /**
     * 根据字典类型查询字典数据
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    @Override
    public List<RemoteDictDataVo> selectDictDataByType(String dictType) {
        return List.of();
    }
}
