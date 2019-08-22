package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.model.Mall;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MallDao {
    //查询全部商品
    List<Mall> findAllMall();

    //分页查询全部商品
    List<Mall> findAllByPage(RowBounds rowBounds);


    //添加商品
    Boolean insertMall(Mall mall);


    //修改商品信息
    Boolean updataMall(Mall mall);

    //根据ID查询商品
    Mall findById(int id);

    //根据ID删除商品
    Boolean deleteMallById(Integer id);




}