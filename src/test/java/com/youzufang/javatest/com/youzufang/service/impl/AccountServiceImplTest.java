package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.model.Account;
import com.youzufang.model.House;
import com.youzufang.service.AccountService;
import com.youzufang.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import sun.net.www.http.Hurryable;

import java.util.List;

/** 
* AccountServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 11, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountServiceImplTest {
    @Autowired
    AccountServiceImpl accountService;
@Before
public void before() throws Exception {
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: register(Account account) 
* 
*/ 
@Test
public void testRegister() throws Exception {
    /*Account account=new Account();
    account.setAddress("ad");
    account.setGender(0);
    account.setPassword("123");
    account.setPhonenumber("321");
    account.setPrivkey("000");
    account.setPubkey("000");
    account.setUsername("user1");
    accountService.register(account);*/
} 

/** 
* 
* Method: login(String username, String password) 
* 
*/ 
@Test
public void testLogin() throws Exception {
    //Account account=accountService.login("user1","123");
    //System.out.println(account.getUsername());
} 

/** 
* 
* Method: getUserById(int id) 
* 
*/ 
@Test
public void testGetUserById() throws Exception {
    //Account account=new Account();
    //System.out.println(accountService.getUserById(1).getUsername());
} 

/** 
* 
* Method: getUserFavorite(Account user) 
* 
*/ 
@Test
public void testGetUserFavorite() throws Exception {
/*Account account=new Account();
account.setUserId(1);
    List<House> houses= accountService.getUserFavorite(account);
    for(House house:houses){
        System.out.println(house.getHouseId());
    }
*/
} 

/** 
* 
* Method: addHouseToUserFavorite(Account user, House house) 
* 
*/ 
@Test
public void testAddHouseToUserFavorite() throws Exception {
    //Account account=new Account();
    //account.setUserId(1);
    //House house=new House();
    /*house.setArea(100);
    house.setBookMoney(200);
    house.setDecoration(0);
    house.setEquipment("equipment2");
    house.setFloor(8);
    house.setImages("images1");
    house.setIntroduction("introduction2");
    house.setType("type2");
    house.setRentMoney(10);
    house.setLocation("shanghai");*/
    //house.setHouseId(1);
    //accountService.addHouseToUserFavorite(account,house);
} 

/** 
* 
* Method: removeHouseFromUserFavorite(Account user, House house) 
* 
*/ 
@Test
public void testRemoveHouseFromUserFavorite() throws Exception {

} 


} 
