package com.hw.apicommon.service;


import com.hw.apicommon.model.entity.InterfaceInfo;

/**
* @author 47991
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-16 18:45:50
*/
public interface InnerInterfaceInfoService {

    //2.从数据库中查询模拟接口是否存在(请求路径，请求方法，请求参数)
    InterfaceInfo getInterfaceInfo(String path,String method);
}
