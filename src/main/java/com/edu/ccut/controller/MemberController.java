package com.edu.ccut.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.service.impl.IUserServiceImpl;

/**
 * Created by zhongyuan on 2016/5/11.
 */
@Controller
@RequestMapping( value = "/user")
public class MemberController {
    private static Logger logger = Logger.getLogger(MemberController.class);
    @Resource
    private IUserServiceImpl userService;

    @RequestMapping("/showUser")
    public String toIndex(String id ,HttpServletRequest request,Model model){

        System.out.println("111111111111111111111111:"+id);
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("2222222222333333222222222::"+userId);
        Member member = this.userService.getMemberById(userId);
        model.addAttribute("user", member);
        return "showUser";
    }
}
