package com.youzufang.service.impl;

import com.youzufang.dao.CommentDao;
import com.youzufang.dao.QuestionDao;
import com.youzufang.model.*;
import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{
    final CommentDao dao;
    final QuestionDao questionDao;
    @Autowired
    public ReviewServiceImpl(CommentDao dao,QuestionDao questionDao) {
        this.dao = dao;
        this.questionDao=questionDao;
    }

    public Comment addCommentToHouse(Account user, House house, Comment comment){
        comment.setUserId(user.getUserId());
        comment.setHouseId(house.getHouseId());
        dao.save(comment);
        return comment;
     }

    public Question addQuestionToHouse(House house, Question question){
        question.setHouseId(house.getHouseId());
        questionDao.save(question);
        return question;
    }
    // 创建一个 QuestionAns 然后添加到这个 question 里, 返回 answer
    // 设置 answer 的 userId 为 user.id

}
