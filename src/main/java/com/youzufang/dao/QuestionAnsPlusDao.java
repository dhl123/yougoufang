package com.youzufang.dao;

import com.youzufang.model.Question;
import com.youzufang.model.QuestionAnsPlus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnsPlusDao extends JpaRepository<QuestionAnsPlus, Integer> {
    QuestionAnsPlus findByUserIdAndaAndAnswerId(int userId,int answerId);
}