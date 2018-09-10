package com.youzufang.service.impl;

import com.youzufang.dao.HouseDao;
import com.youzufang.model.House;
import com.youzufang.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService{
    final HouseDao dao;

    @Autowired
    public HouseServiceImpl(HouseDao dao) {
        this.dao = dao;
    }
    public House getHouseById(int id){
        return dao.getHouseById(id);
    }
}
