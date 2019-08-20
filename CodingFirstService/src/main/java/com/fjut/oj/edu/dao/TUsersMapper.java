package com.fjut.oj.edu.dao;

import com.fjut.oj.edu.pojo.TUsers;
import com.fjut.oj.edu.pojo.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TUsersMapper {
    int countByExample(TUsersExample example);

    int deleteByExample(TUsersExample example);

    int deleteByPrimaryKey(String userid);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    List<TUsers> selectByExample(TUsersExample example);

    TUsers selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);
}