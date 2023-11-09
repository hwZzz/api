package com.hw.apicommon.service;


import com.hw.apicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface InnerUserService{
    //1.数据库中查是否已分配到用户密钥(ak,sk,布尔)
    User getInvokeUser(String accessKey);
}
