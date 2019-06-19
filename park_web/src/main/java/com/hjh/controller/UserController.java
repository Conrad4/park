package com.hjh.controller;

import com.hjh.dao.pojo.Merchant;
import com.hjh.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;



        @RequestMapping("/register.do")
        public String register(Merchant merchant, Model model) throws Exception {
            userService.register(merchant);
            return "redirect:login.do";
        }
//        @RequestMapping("/login.do")
//        public String login()

//    @RequestMapping("/register.do")
//
//    public String register(String merName, String parkLocation, int parkTotal, double charge) throws Exception {
//
//        Merchant merchant = new Merchant();
//
//        merchant.setMerName(merName);
//        merchant.setParkLocation(parkLocation);
//        merchant.setParkTotal(parkTotal);
//        merchant.setCharge(charge);
//
//        userService.register(merchant);
//        return "login";
//
//
//
//    }
}
