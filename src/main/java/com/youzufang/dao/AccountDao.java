package com.youzufang.dao;

import com.youzufang.model.Account;
import com.youzufang.model.FavoriteSet;
import com.youzufang.model.FavoriteSetItem;
import com.youzufang.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, Integer> {
    Account getAccountById(int id);
    Account getAccountByUsernameAndPassword(String username, String password);
    Account getAccountByUsername(String username);
    FavoriteSet getSetByUserId(int userId);
    List<FavoriteSetItem> getItemsBySetId(int userId);
}
