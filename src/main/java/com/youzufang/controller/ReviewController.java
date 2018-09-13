package com.youzufang.controller;

import com.youzufang.model.*;
import com.youzufang.service.HouseService;
import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

// 对 ReviewService 的封装, 加上session之类的功能
@RestController
public class ReviewController {
    final
    ReviewService reviewService;

    final
    HouseService houseService;

    @Autowired
    public ReviewController(ReviewService reviewService, HouseService houseService) {
        this.reviewService = reviewService;
        this.houseService = houseService;
    }

    @PostMapping("/review/addCommentToHouse")
    public Comment addCommentToHouse(@RequestParam("content") String content,
                                      @RequestParam("houseId") int houseId,
                                      HttpSession session) {
        Account account = (Account) session.getAttribute("user");
        House house = houseService.getHouseById(houseId);

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setUserId(account.getUserId());
        comment.setHouseId(house.getHouseId());

        house.getComments().add(comment);

        reviewService.addCommentToHouse(account, house, comment);
        return comment;
    }
    @PostMapping("/review/addQuestionToHouse")
    public Question addQuestionToHouse(@RequestParam("content") String content,@RequestParam("houseId") int houseId,
                                       HttpSession session) {
        House house = houseService.getHouseById(houseId);
        Question question=new Question();
        question.setQuescontent(content);
        return reviewService.addQuestionToHouse(house,question);
        //return question;
    }
    @PostMapping("/review/addAnswerToQuestion")
    public QuestionAns addAnswerToQuestion(@RequestParam("content") String content,@RequestParam("questionId") int questionId,
                                       HttpSession session) {
        Account user=(Account)session.getAttribute("user");
        Question question=reviewService.getQuestionById(questionId);
        QuestionAns questionAns=new QuestionAns();
        questionAns.setAnscontent(content);
        return reviewService.addAnswerToQuestion(user,question,questionAns);
    }
    @PostMapping("/review/togglePlus")
    public QuestionAns togglePlus(@RequestParam("questionAnsId") int ansId,
                                           HttpSession session) {
        Account user=(Account)session.getAttribute("user");
        QuestionAns questionAns=reviewService.getQuestionAnsById(ansId);
        return reviewService.togglePlus(user,questionAns);
    }


    
}
