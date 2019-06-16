package com.fullmusic.dao;

import java.util.List;
import com.fullmusic.pojo.Talk;
import com.fullmusic.pojo.TalkExample;
import org.apache.ibatis.annotations.Param;

public interface TalkMapper {
    int countByExample(TalkExample example);

    int deleteByExample(TalkExample example);

    int deleteByPrimaryKey(String id);

    int insert(Talk record);

    int insertSelective(Talk record);

    List<Talk> selectByExample(TalkExample example);

    Talk selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
}