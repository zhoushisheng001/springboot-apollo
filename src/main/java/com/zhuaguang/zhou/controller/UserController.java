package com.zhuaguang.zhou.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Value("${name}")
    private String name;

    @GetMapping("/getUserInfo")
    public String getUserInfo(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println("===========getUserInfo===========");
        return  "============getUserInfo=====ok==============";
    }

    @GetMapping("/getUserName")
    public String getUserName(){
      log.info("=================>name: " + name);
      return name;
    }
}
