package com.youzufang.dao;

import com.youzufang.model.QuestionAns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnsDao extends JpaRepository<QuestionAns, Integer> {
    QuestionAns getQuestionAnsByAnswerId(int answerId);
}