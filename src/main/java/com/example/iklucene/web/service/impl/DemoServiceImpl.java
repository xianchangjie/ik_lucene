package com.example.iklucene.web.service.impl;

import com.example.iklucene.web.dto.Demo;
import com.example.iklucene.web.mapper.DemoMapper;
import com.example.iklucene.web.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author changjiexian
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapper mapper;
    @Override
    public List<Demo> selectDemos() {
        return mapper.selectDemos();
    }
}
