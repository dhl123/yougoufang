package com.youzufang.dao;

import com.youzufang.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> {
    Account getAccountById(int id);
    Account getAccountByUsernameAndPassword(String username, String password);
    Account getAccountByUsername(String username);
}
