package com.youzufang.service.impl;

import com.youzufang.dao.CommentDao;
import com.youzufang.model.Account;
import com.youzufang.model.Comment;
import com.youzufang.model.House;
import com.youzufang.model.Question;
import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{
    final CommentDao dao;

    @Autowired
    public ReviewServiceImpl(CommentDao dao) {
        this.dao = dao;
    }
    // 创建一个 Comment 然后添加到 house.comments 这个 list 里, 返回 comment
    // 设置 comment 的 userId 为 user.id
    public Comment addCommentToHouse(Account user, House house, Comment comment){
        comment.setUserId(user.getUserId());
     }


    // 创建一个 Question 然后添加到 house.questions 里, 返回 question
    // 设置 question 的 userId 为 user.id
  //  public Question addQuestionToHouse(Account user, House house, Question question){

    //}
}
