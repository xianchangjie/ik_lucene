package com.example.ikluence.controller;

import com.example.ikluence.model.Result;
import com.example.ikluence.model.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changjiexian
 */
@RestController
@RequestMapping("/search")
public class TestController {


    @GetMapping("/test")
    public Result getBook() {
        return ResultGenerator.genSuccessResult("test");
    }

}
