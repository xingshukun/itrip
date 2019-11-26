package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/userlogin")
    @ResponseBody
    public Dto userLogin(@RequestParam("userCode")String userCode,
                         @RequestParam("userpassword")String password){
        User user= userService.userLogin(userCode);
        if (user!=null &&user.getUserpassword().equals(password)){
            return DtoUtil.returnSuccess("登录成功");

        }
        return DtoUtil.returnFail("登录失败，用户名或密码错误");
    }

}
