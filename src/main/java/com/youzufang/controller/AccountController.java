package com.youzufang.controller;

import com.youzufang.model.Account;
import com.youzufang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/toHello")
    public String toHello(ModelMap modelMap){
        Account user = new Account();
        user.setId(1);
        user.setAddress("address");
        user.setGender(0);
        user.setPassword("123456");
        user.setPhonenumber("000001");
        user.setPrivkey("prikey");
        user.setPubkey("pubkey");
        user.setUsername("user1");
        user.setCreatedat(new Timestamp(new Date().getTime()));
        user.setUpdateat(new Timestamp(new Date().getTime()));

        System.out.println(accountService);
        accountService.signIn(user);
        return "helloBoot";
    }
}
