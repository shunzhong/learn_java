package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.ScoreRecord;
import com.mpd.api.dao.model.ScoreRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreRecordMapper {
    long countByExample(ScoreRecordExample example);

    int deleteByExample(ScoreRecordExample example);

    int insert(ScoreRecord record);

    int insertSelective(ScoreRecord record);

    List<ScoreRecord> selectByExample(ScoreRecordExample example);

    int updateByExampleSelective(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);

    int updateByExample(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);
}