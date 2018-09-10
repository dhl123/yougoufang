package com.youzufang.service.impl;

import com.youzufang.model.Account;
import com.youzufang.dao.AccountDao;
import com.youzufang.model.House;
import com.youzufang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    final AccountDao dao;

    @Autowired
    public AccountServiceImpl(AccountDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public Account register(Account account) {
        if (dao.getAccountByUsername(account.getUsername()) != null) {
            dao.save(account);
            return login(account.getUsername(), account.getPassword());
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public Account login(String username, String password) {
        return dao.getAccountByUsernameAndPassword(username, password);
    }

    @Override
    @Transactional
    public Account getUserById(int id) {
        return dao.getAccountById(id);
    }

    @Override
    public List<House> getUserFavorite(Account user) {
        return null;
    }

    @Override
    public List<House> addHouseToUserFavorite(Account user, House house) {
        return null;
    }

    @Override
    public List<House> removeHouseFromUserFavorite(Account user, House house) {
        return null;
    }
}
