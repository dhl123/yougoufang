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
    @Override
    public Comment addCommentToHouse(Account user, House house, Comment comment){
        comment.setUserId(user.getUserId());
        comment.setHouseId(house.getHouseId());
        dao.save(comment);
        return comment;
     }
    @Override
    public Question addQuestionToHouse(House house, Question question){
        question.setHouseId(house.getHouseId());
        questionDao.save(question);
        return question;
    }
    @Override
    public QuestionAns addAnswerToQuestion(Account user, Question question, QuestionAns answer){
        answer.setQuestionId(question.getQuestionId());
        answer.setUserId(user.getUserId());
        questionAnsDao.save(answer);
        return answer;
    }
    @Override
   public QuestionAns plusToAnswer(Account user, QuestionAns ans,QuestionAnsPlus answerPlus){
        answerPlus.setAnswerId(ans.getAnswerId());
        answerPlus.setUserId(user.getUserId());
        questionAnsPlusDao.save(answerPlus);
        return ans;
    }
    @Override
    public QuestionAns removePlusFromAnswer(Account user, QuestionAns answer){
        QuestionAnsPlus questionAnsPlus=questionAnsPlusDao.findByUserIdAndaAndAnswerId(user.getUserId(),answer.getAnswerId());
        questionAnsPlusDao.delete(questionAnsPlus);
        return answer;
    }

    @Override
   public QuestionAns togglePlus(Account user, QuestionAns answer){
       QuestionAnsPlus questionAnsPlus=questionAnsPlusDao.findByUserIdAndaAndAnswerId(user.getUserId(),answer.getAnswerId());
       if(questionAnsPlus==null){
            plusToAnswer(user,answer,questionAnsPlus);
       }
       else {
           removePlusFromAnswer(user, answer);
       }
       return answer;
    }
}
