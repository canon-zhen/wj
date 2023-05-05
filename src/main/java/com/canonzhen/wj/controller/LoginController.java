package com.canonzhen.wj.controller;

import com.canonzhen.wj.pojo.User;
import com.canonzhen.wj.result.Result;
import com.canonzhen.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        //对html标签进行转义，防止xss攻击
        String username = requestUser.getUsername();
        System.out.println(username);
        System.out.println(requestUser.getPassword());
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if(user == null){
            String message ="账号密码错误";
            System.out.println(message+"--test");
            return new Result(400);//失败
        }else{
            return new Result(200);//成功
        }
    }
}
