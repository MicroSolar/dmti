package com.dmti.controller;

import com.dmti.dmtiIntelligence.ComputeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther XuJun
 * @date 2019/11/11 10:44
 */
@RestController
public class ComputeController {
    @Resource
    ComputeService computeservice;

    @ResponseBody
    @RequestMapping("/compute")
    public Object compute() {
        return computeservice.computeBackData();
    }
    @ResponseBody
    @RequestMapping("/computeCommentTime")
    public Object computeCommentTime() {
        return computeservice.computeCommentTime();
    }
    @ResponseBody
    @RequestMapping("/computeUserAgesComment")
    public Object computeUserAgesComment() {
        return computeservice.computeUserAgesComment();
    }
}
