package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.model.House;
import com.youzufang.service.HouseService;
import com.youzufang.service.impl.AccountServiceImpl;
import com.youzufang.service.impl.HouseServiceImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/** 
* HouseServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 11, 2018</pre> 
* @version 1.0 
*/

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HouseServiceImplTest {
    @Autowired
    HouseServiceImpl houseService;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getHouseById(int id) 
* 
*/ 
@Test
public void testGetHouseById() throws Exception {
   // System.out.println(houseService.getHouseById(3));
} 

/** 
* 
* Method: releaseHouse(House house) 
* 
*/ 
@Test
public void testReleaseHouse() throws Exception {
/*
    House house=new House();
    house.setArea(100);
    house.setBookMoney(200);
    house.setDecoration(0);
    house.setEquipment("equipment2");
    house.setFloor(8);
    house.setImages("images1");
    house.setIntroduction("introduction2");
    house.setType("type2");
    house.setRentMoney(10);
    house.setLocation("shanghai");
    house.setUserId(1);
    houseService.releaseHouse(house);
    */

} 

/** 
* 
* Method: getAllHouse() 
* 
*/ 
@Test
public void testGetAllHouse() throws Exception {
   /* List<House> houses=houseService.getAllHouse();
   // System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    for(House house:houses){
    //    System.out.println("----------------------------------------------");
        System.out.println(house.getHouseId());
    }*/
}
} 
