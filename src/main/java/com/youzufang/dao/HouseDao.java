package com.youzufang.dao;

import com.youzufang.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseDao extends JpaRepository<House, Integer> {
    //House getAccountByUsername(String username);
    House getHouseById(int Id);
}
