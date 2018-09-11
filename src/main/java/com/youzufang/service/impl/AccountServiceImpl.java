package com.youzufang.service.impl;

import com.youzufang.dao.FavoriteItemDao;
import com.youzufang.dao.FavoriteSetDao;
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
import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    final AccountDao dao;
    final FavoriteItemDao itemDao;
    final FavoriteSetDao setDao;
    @Autowired
    HouseService houseService;
    @Autowired
    public AccountServiceImpl(AccountDao dao,FavoriteItemDao itemDao,final FavoriteSetDao setDao) {
        this.dao = dao;
        this.itemDao=itemDao;
        this.setDao=setDao;
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
        return dao.getAccountByUserId(id);
    }


    @Override
    public List<House> getUserFavorite(Account user) {
        FavoriteSet favoriteSet= setDao.getFavoriteSetByUserId(user.getUserId());
        List<FavoriteSetItem> items=itemDao.getFavoriteSetItemsBySetId(favoriteSet.getSetId());
        List<House> houses=new ArrayList<House>();
        for(FavoriteSetItem item :items){
            houses.add(houseService.getHouseById(item.getHouseId()));
        }
        return houses;
    }

    @Override
    public List<House> addHouseToUserFavorite(Account user, House house) {
        FavoriteSet favoriteSet= setDao.getFavoriteSetByUserId(user.getUserId());
        FavoriteSetItem item=new FavoriteSetItem();
        item.setHouseId(house.getHouseId());
        item.setUserId(user.getUserId());
        item.setSetId(favoriteSet.getSetId());
        itemDao.save(item);
        return getUserFavorite(user);
    }

    @Override
    public List<House> removeHouseFromUserFavorite(Account user, House house) {
        FavoriteSet favoriteSet= setDao.getFavoriteSetByUserId(user.getUserId());
        itemDao.deleteFavoriteSetItemBySetIdAndHouseId(favoriteSet.getSetId(),house.getHouseId());
        return getUserFavorite(user);

    }
}

