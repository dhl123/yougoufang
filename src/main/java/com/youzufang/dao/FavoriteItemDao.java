package com.youzufang.dao;

import com.youzufang.model.FavoriteSetItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteItemDao extends JpaRepository<FavoriteSetItem, Integer> {
    //House getAccountByUsername(String username);
    List<FavoriteSetItem> getFavoriteSetItemsBySetId(int setId);
    FavoriteSetItem getFavoriteSetItemBySetIdAndHouseId(int setId,int houseId);
    void removeBySetIdAndHouseId(int setId,int houseId);
}