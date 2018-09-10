package com.youzufang.controller;

import com.youzufang.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;

// 对 ReviewService 的封装, 加上session之类的功能
public class ReviewController {
    final
    ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
