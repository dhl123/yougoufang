package com.youzufang.controller;

import com.youzufang.model.Account;
import com.youzufang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "/account/login",method = RequestMethod.POST)
    // @PostMapping("/account/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, Model model) {
        Account account=accountService.login(username,password);
        if (account== null) {
            String value = "Invalid username or password.  Signon failed.";
            return "error";
        } else {
            session.setAttribute("user",account);
            return account.getUsername();
        }
    }


    @PostMapping("/account/newAccount")
    public String newAccount(HttpSession session,
                             @RequestParam("address") String address,
                             @RequestParam("gender") int gender,
                             @RequestParam("password") String password,
                             @RequestParam("phonenumber") String phonenumber,
                             @RequestParam("privkey") String privkey,
                             @RequestParam("pubkey") String pubkey,
                             @RequestParam("username") String username) {

    /*    if (accountService.login(username) != null) {
            session.setAttribute("errorMessage", "Duplicate account existed.");
            return "error";
        }
        */
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setPubkey(pubkey);
        account.setPrivkey(privkey);
        account.setPhonenumber(phonenumber);
        account.setGender(gender);
        account.setAddress(address);
        accountService.register(account);
        session.setAttribute("account", account);
        return account.getUsername();
    }


}
