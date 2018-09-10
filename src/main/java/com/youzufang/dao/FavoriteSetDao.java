package com.youzufang.dao;

import com.youzufang.model.FavoriteSet;
import com.youzufang.model.FavoriteSetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteSetDao extends JpaRepository<FavoriteSet, Integer> {
    FavoriteSet getFavoriteSetByUserId(int userId);
}