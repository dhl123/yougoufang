package com.youzufang.youzufang.service.impl;

import com.youzufang.youzufang.domain.Account;
import com.youzufang.youzufang.persistence.AccountMapper;
import com.youzufang.youzufang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService{
    @Resource
    AccountMapper accountmapper;
    public void signIn(Account user){
        accountmapper.save(user);
    }
}
