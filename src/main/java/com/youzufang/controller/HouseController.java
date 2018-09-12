package com.youzufang.controller;


import com.youzufang.model.House;
import com.youzufang.service.impl.HouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseController {
    @Autowired
    HouseServiceImpl houseService;

    @GetMapping(value = "/house/findAllHouse")
    public List<House> findAllHouse() {
        return houseService.getAllHouse();
    }
}
