package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HandlerRecord;
import com.mpd.api.dao.model.HandlerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandlerRecordMapper {
    long countByExample(HandlerRecordExample example);

    int deleteByExample(HandlerRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(HandlerRecord record);

    int insertSelective(HandlerRecord record);

    List<HandlerRecord> selectByExampleWithBLOBs(HandlerRecordExample example);

    List<HandlerRecord> selectByExample(HandlerRecordExample example);

    HandlerRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HandlerRecord record, @Param("example") HandlerRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") HandlerRecord record, @Param("example") HandlerRecordExample example);

    int updateByExample(@Param("record") HandlerRecord record, @Param("example") HandlerRecordExample example);

    int updateByPrimaryKeySelective(HandlerRecord record);

    int updateByPrimaryKeyWithBLOBs(HandlerRecord record);

    int updateByPrimaryKey(HandlerRecord record);
}