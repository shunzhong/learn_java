package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HandlerUser;
import com.mpd.api.dao.model.HandlerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandlerUserMapper {
    long countByExample(HandlerUserExample example);

    int deleteByExample(HandlerUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HandlerUser record);

    int insertSelective(HandlerUser record);

    List<HandlerUser> selectByExample(HandlerUserExample example);

    HandlerUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HandlerUser record, @Param("example") HandlerUserExample example);

    int updateByExample(@Param("record") HandlerUser record, @Param("example") HandlerUserExample example);

    int updateByPrimaryKeySelective(HandlerUser record);

    int updateByPrimaryKey(HandlerUser record);
}