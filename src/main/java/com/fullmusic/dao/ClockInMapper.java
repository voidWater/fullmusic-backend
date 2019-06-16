package com.fullmusic.dao;

import java.util.List;
import com.fullmusic.pojo.ClockIn;
import com.fullmusic.pojo.ClockInExample;
import org.apache.ibatis.annotations.Param;

public interface ClockInMapper {
    int countByExample(ClockInExample example);

    int deleteByExample(ClockInExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClockIn record);

    int insertSelective(ClockIn record);

    List<ClockIn> selectByExample(ClockInExample example);

    ClockIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClockIn record, @Param("example") ClockInExample example);

    int updateByExample(@Param("record") ClockIn record, @Param("example") ClockInExample example);

    int updateByPrimaryKeySelective(ClockIn record);

    int updateByPrimaryKey(ClockIn record);
}