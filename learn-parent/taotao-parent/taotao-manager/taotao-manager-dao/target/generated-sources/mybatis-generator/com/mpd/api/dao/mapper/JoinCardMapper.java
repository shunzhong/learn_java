package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.JoinCard;
import com.mpd.api.dao.model.JoinCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinCardMapper {
    long countByExample(JoinCardExample example);

    int deleteByExample(JoinCardExample example);

    int deleteByPrimaryKey(String id);

    int insert(JoinCard record);

    int insertSelective(JoinCard record);

    List<JoinCard> selectByExample(JoinCardExample example);

    JoinCard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JoinCard record, @Param("example") JoinCardExample example);

    int updateByExample(@Param("record") JoinCard record, @Param("example") JoinCardExample example);

    int updateByPrimaryKeySelective(JoinCard record);

    int updateByPrimaryKey(JoinCard record);
}