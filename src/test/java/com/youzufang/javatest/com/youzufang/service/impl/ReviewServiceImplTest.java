package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.service.impl.ReviewServiceImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* ReviewServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 11, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReviewServiceImplTest {
    @Autowired
    ReviewServiceImpl reviewService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addCommentToHouse(Account user, House house, Comment comment) 
* 
*/ 
@Test
public void testAddCommentToHouse() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addQuestionToHouse(House house, Question question) 
* 
*/ 
@Test
public void testAddQuestionToHouse() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addAnswerToQuestion(Account user, Question question, QuestionAns answer) 
* 
*/ 
@Test
public void testAddAnswerToQuestion() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: plusToAnswer(Account user, QuestionAns ans, QuestionAnsPlus answerPlus) 
* 
*/ 
@Test
public void testPlusToAnswer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: removePlusFromAnswer(Account user, QuestionAns answer) 
* 
*/ 
@Test
public void testRemovePlusFromAnswer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: togglePlus(Account user, QuestionAns answer) 
* 
*/ 
@Test
public void testTogglePlus() throws Exception { 
//TODO: Test goes here... 
} 


} 
