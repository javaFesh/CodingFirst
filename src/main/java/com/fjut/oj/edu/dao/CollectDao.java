package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Collect;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectDao {


    //添加收藏
    Boolean insertCollect(Collect collect);

    //删除收藏
    Boolean deleteCollect(Integer collectId);
    //查看个人收藏
    List<Collect> findMyCollect(Integer userId);

    //查看某个收藏
    Collect findMyCollectById(Integer userId);
}