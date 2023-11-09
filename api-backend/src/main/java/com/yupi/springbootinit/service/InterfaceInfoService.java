package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.apicommon.model.entity.InterfaceInfo;

/**
* @author 47991
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-16 18:45:50
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
