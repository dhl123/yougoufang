package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.service.impl.AccountServiceImpl;
import com.youzufang.service.impl.HouseServiceImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllHouse() 
* 
*/ 
@Test
public void testGetAllHouse() throws Exception { 
//TODO: Test goes here... 
} 


} 
