package com.example.iklucene.web.controller;

import com.example.iklucene.model.Result;
import com.example.iklucene.model.ResultGenerator;
import com.example.iklucene.web.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changjiexian
 */
@RestController
@RequestMapping("/search")
public class TestController {

    @Autowired
    private IDemoService demoService;

    @GetMapping("/test")
    public Result test() {
        return ResultGenerator.genSuccessResult(demoService.selectDemos());
    }

}
