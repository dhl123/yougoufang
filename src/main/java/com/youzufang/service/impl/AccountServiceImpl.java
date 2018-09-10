package com.youzufang.service.impl;

import com.youzufang.model.Account;
import com.youzufang.dao.AccountDao;
import com.youzufang.model.FavoriteSet;
import com.youzufang.model.FavoriteSetItem;
import com.youzufang.model.House;
import com.youzufang.service.AccountService;
import com.youzufang.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    final AccountDao dao;

    @Autowired
    HouseService houseService;
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
        FavoriteSet favoriteSet= dao.getSetByUserId(user.getId());
        List<FavoriteSetItem> items=dao.getItemsBySetId(favoriteSet.getId());
        List<House> houses=new ArrayList<House>();
        for(FavoriteSetItem item :items){
            houses.add(houseService.getHouseById(item.getHouseId()));
        }
        return houses;
    }

    // 添加到收藏夹
    // 获得用户的收藏夹, 然后创建一个新的 FavoriteSetItem, 设置它的 houseId 之后添加到 user.favoriteSet.items 里
    @Override
    public List<House> addHouseToUserFavorite(Account user, House house) {
        return null;
    }
    // 删掉收藏夹里的收藏
    // 逻辑和上面的差不多
    @Override
    public List<House> removeHouseFromUserFavorite(Account user, House house) {
        return null;
    }
}

