package com.flower.flowershop.controller;


import com.flower.flowershop.param.LoginParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


    /**
     * 登录
     * @return ModelAndView 登录信息
     */
    @PostMapping("/Login")
    public String loginIn(@RequestBody LoginParam param){

        String phone = param.getPhone();
        String pwd= param.getPwd();
        return "index";
    }
}
