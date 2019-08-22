package com.fjut.oj.edu.service;

import com.fjut.oj.edu.model.Mall;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface MallService {
    //添加商品数量,修改商品信息,商品数量变化
    Boolean updataMall(Mall mall);

    //查询总页数
    Integer mallCount();

    //分页查询所有
    List<Mall> findAllByPage(int pageNum);
}
