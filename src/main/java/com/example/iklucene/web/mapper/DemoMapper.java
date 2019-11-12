package com.example.iklucene.web.mapper;

import com.example.iklucene.web.dto.Demo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author changjiexian
 */
@Mapper
public interface DemoMapper {

    /**
     * 查询demo
     * @return
     */
    List<Demo> selectDemos();
}
