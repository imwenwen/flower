package com.flower.flowershop.controller;


import com.flower.flowershop.biz.UserBizService;
import com.flower.flowershop.param.LoginParam;
import com.flower.flowershop.param.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {

    @Autowired
    private UserBizService userBizService;

    /**
     * 登录
     */
    @PostMapping("/Login")
    public String loginIn(Model model,@RequestBody LoginParam param){
        //登录----返回是否成功
        boolean isLoginIn=  userBizService.loginIn(param);
        if(isLoginIn){
            model.addAttribute("msg","登录成功！");
            return "Index";
        }else {
            model.addAttribute("msg","登录失败");
            return "Login";
        }

    }
    /**
     * 注册
     */
    @PostMapping("/Register")
    public String register(Model model,@RequestBody RegisterParam param){
        //注册----返回是否成功
       boolean isRegister= userBizService.register(param);
        if(isRegister){
            model.addAttribute("msg","注册成功");
            return "Index";
       }else {
            model.addAttribute("msg","注册失败");
            return "Register";
       }

    }
}
