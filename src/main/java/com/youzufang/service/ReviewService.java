package com.youzufang.service;

import com.youzufang.model.*;

// 评论相关
public interface ReviewService {
    // 创建一个 Comment 然后添加到 house.comments 这个 list 里, 返回 comment
    // 设置 comment 的 userId 为 user.id
    Comment addCommentToHouse(Account user, House house, Comment comment);

    // 创建一个 Question 然后添加到 house.questions 里, 返回 question
    // 设置 question 的 userId 为 user.id
    Question addQuestionToHouse(House house, Question question);

    // 创建一个 QuestionAns 然后添加到这个 question 里, 返回 answer
    // 设置 answer 的 userId 为 user.id
    QuestionAns addAnswerToQuestion(Account user, Question question, QuestionAns answer);

    // 创建一个 QuestionAnsPlus 然后添加到 answer 里, 返回 QuestionAns
    // 要设置 userId
    QuestionAns plusToAnswer(Account user, QuestionAns ans,QuestionAnsPlus answerPlus);

    // 删除指定的 QuestionAnsPlus
    // 根据 user.id -> userId 查到对应的 QuestionAns 然后删除
    // 返回 answer
    QuestionAns removePlusFromAnswer(Account user, QuestionAns answer);

    // 上面两个的封装, 切换目前的点赞状态
    // 先检查有没有点赞记录, 如果有就调用 removeFrom..., 否则调用 plusTo...
    // 返回 answer
    QuestionAns togglePlus(Account user, QuestionAns answer);
}
