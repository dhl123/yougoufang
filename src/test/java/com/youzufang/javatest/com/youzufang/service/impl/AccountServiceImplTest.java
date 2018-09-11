package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.model.Account;
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
//TODO: Test goes here... 
} 

/** 
* 
* Method: addHouseToUserFavorite(Account user, House house) 
* 
*/ 
@Test
public void testAddHouseToUserFavorite() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: removeHouseFromUserFavorite(Account user, House house) 
* 
*/ 
@Test
public void testRemoveHouseFromUserFavorite() throws Exception { 
//TODO: Test goes here... 
} 


} 
