package com.youzufang.javatest.com.youzufang.service.impl;

import com.youzufang.model.*;
import com.youzufang.service.impl.ReviewServiceImpl;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
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
    /*Comment comment=new Comment();
    comment.setContent("comment1");
    House house= new House();
    house.setHouseId(1);
    Account user=new Account();
    user.setUserId(1);
    reviewService.addCommentToHouse(user,house,comment);*/
} 

/** 
* 
* Method: addQuestionToHouse(House house, Question question) 
* 
*/ 
@Test
public void testAddQuestionToHouse() throws Exception {
   /* House house= new House();
    house.setHouseId(1);
    reviewService.addQuestionToHouse(house,new Question());*/
} 

/** 
* 
* Method: addAnswerToQuestion(Account user, Question question, QuestionAns answer) 
* 
*/ 
@Test
public void testAddAnswerToQuestion() throws Exception {
 /*   Account user=new Account();
    user.setUserId(1);
    Question question=new Question();
    question.setQuestionId(1);
    QuestionAns questionAns=new QuestionAns();
    questionAns.setAnscontent("content");
reviewService.addAnswerToQuestion(user,question,questionAns);*/
} 

/** 
* 
* Method: plusToAnswer(Account user, QuestionAns ans, QuestionAnsPlus answerPlus) 
* 
*/ 
@Test
public void testPlusToAnswer() throws Exception {
/*
    Account user=new Account();
    user.setUserId(1);
    QuestionAns ans=new QuestionAns();
    ans.setAnswerId(1);
    reviewService.plusToAnswer(user,ans,new QuestionAnsPlus());
    */
} 

/** 
* 
* Method: removePlusFromAnswer(Account user, QuestionAns answer) 
* 
*/ 
@Test
public void testRemovePlusFromAnswer() throws Exception {
   /* Account user=new Account();
    user.setUserId(1);
    QuestionAns ans=new QuestionAns();
    ans.setAnswerId(1);
    reviewService.removePlusFromAnswer(user,ans);
    */
} 

/** 
* 
* Method: togglePlus(Account user, QuestionAns answer) 
* 
*/ 
@Test
public void testTogglePlus() throws Exception {
    /*
    Account user=new Account();
    user.setUserId(1);
    QuestionAns ans=new QuestionAns();
    ans.setAnswerId(1);
    reviewService.togglePlus(user,ans);
    */
} 


} 
