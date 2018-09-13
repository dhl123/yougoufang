package com.youzufang.dao;

import com.youzufang.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Integer> {
    Question getQuestionByQuestionId(int questionId);
}