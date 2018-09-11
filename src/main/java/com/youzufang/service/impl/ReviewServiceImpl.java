package com.youzufang.service.impl;

import com.youzufang.dao.CommentDao;
import com.youzufang.dao.QuestionAnsDao;
import com.youzufang.dao.QuestionAnsPlusDao;
import com.youzufang.dao.QuestionDao;
import com.youzufang.model.*;
import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{
    final CommentDao dao;
    final QuestionDao questionDao;
    final QuestionAnsDao questionAnsDao;
    final QuestionAnsPlusDao questionAnsPlusDao;
    @Autowired
    public ReviewServiceImpl(CommentDao dao,QuestionDao questionDao,QuestionAnsDao questionAnsDao,QuestionAnsPlusDao questionAnsPlusDao) {
        this.dao = dao;
        this.questionDao=questionDao;
        this.questionAnsDao=questionAnsDao;
        this.questionAnsPlusDao=questionAnsPlusDao;
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
    public QuestionAns addAnswerToQuestion(Account user, Question question, QuestionAns answer){
        answer.setQuestionId(question.getQuestionId());
        answer.setUserId(user.getUserId());
        questionAnsDao.save(answer);
        return answer;
    }
    // 创建一个 QuestionAnsPlus 然后添加到 answer 里, 返回 QuestionAns
    // 要设置 userId
   public QuestionAns plusToAnswer(Account user, QuestionAns ans,QuestionAnsPlus answerPlus){
        answerPlus.setAnswerId(ans.getAnswerId());
        answerPlus.setUserId(user.getUserId());
        questionAnsPlusDao.save(answerPlus);
        return ans;
    }
}
