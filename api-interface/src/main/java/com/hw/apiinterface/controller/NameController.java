package com.hw.apiinterface.controller;



import com.hw.apiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name){
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "Post 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        if (!accessKey.equals("yupi")){
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000){
//            throw new RuntimeException("无权限");
//        }
//        //时间校验
//
//        //数据库查询 secretkey
//        String serverSign = SignUtil.genSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }

        return "POST 用户名字是" + user.getUsername();
    }
}
