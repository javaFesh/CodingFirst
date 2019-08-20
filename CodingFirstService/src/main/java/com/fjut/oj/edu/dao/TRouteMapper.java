package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TRoute;
import com.fjut.oj.edu.pojo.TRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRouteMapper {
    int countByExample(TRouteExample example);

    int deleteByExample(TRouteExample example);

    int deleteByPrimaryKey(Long routeouteid);

    int insert(TRoute record);

    int insertSelective(TRoute record);

    List<TRoute> selectByExample(TRouteExample example);

    TRoute selectByPrimaryKey(Long routeouteid);

    int updateByExampleSelective(@Param("record") TRoute record, @Param("example") TRouteExample example);

    int updateByExample(@Param("record") TRoute record, @Param("example") TRouteExample example);

    int updateByPrimaryKeySelective(TRoute record);

    int updateByPrimaryKey(TRoute record);
}