package com.youzufang.service.impl;

import com.youzufang.dao.*;
import com.youzufang.model.*;
import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{
    final CommentDao dao;
    final QuestionDao questionDao;
    final QuestionAnsDao questionAnsDao;
    final QuestionAnsPlusDao questionAnsPlusDao;
    final HouseDao houseDao;

    @Autowired
    public ReviewServiceImpl(CommentDao dao, QuestionDao questionDao, QuestionAnsDao questionAnsDao, QuestionAnsPlusDao questionAnsPlusDao, HouseDao houseDao) {
        this.dao = dao;
        this.questionDao=questionDao;
        this.questionAnsDao=questionAnsDao;
        this.questionAnsPlusDao=questionAnsPlusDao;
        this.houseDao = houseDao;
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
        QuestionAnsPlus questionAnsPlus=questionAnsPlusDao.findByUserIdAndAnswerId(user.getUserId(),answer.getAnswerId());
        questionAnsPlusDao.delete(questionAnsPlus);
        return answer;
    }

    @Override
   public QuestionAns togglePlus(Account user, QuestionAns answer){
       QuestionAnsPlus questionAnsPlus=questionAnsPlusDao.findByUserIdAndAnswerId(user.getUserId(),answer.getAnswerId());
       if(questionAnsPlus==null){
            plusToAnswer(user,answer,new QuestionAnsPlus());
       }
       else {
           removePlusFromAnswer(user, answer);
       }
       return answer;
    }

    @Override
    public List<Question> getQuestionsByHouseId(int houseId) {
        return houseDao.getHouseByHouseId(houseId).getQuestions();
    }

    @Override
    public List<Comment> getCommentsByHouseId(int houseId) {
        return houseDao.getHouseByHouseId(houseId).getComments();
    }

    @Override
    public List<QuestionAns> getAnswerByQuestionId(int questionId) {
        return questionDao.getOne(questionId).getAnswers();
    }

    @Override
    public List<QuestionAnsPlus> getPlusByAnswerId(int answerId) {
        return questionAnsDao.getOne(answerId).getPluses();
    }
    public Question getQuestionById(int questionId){
        return questionDao.getQuestionByQuestionId(questionId);
    }
    public QuestionAns getQuestionAnsById(int answerId){
        return questionAnsDao.getQuestionAnsByAnswerId(answerId);
    }
}
