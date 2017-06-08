package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.CreditRecord;
import com.mpd.api.dao.model.CreditRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditRecordMapper {
    long countByExample(CreditRecordExample example);

    int deleteByExample(CreditRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CreditRecord record);

    int insertSelective(CreditRecord record);

    List<CreditRecord> selectByExample(CreditRecordExample example);

    CreditRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CreditRecord record, @Param("example") CreditRecordExample example);

    int updateByExample(@Param("record") CreditRecord record, @Param("example") CreditRecordExample example);

    int updateByPrimaryKeySelective(CreditRecord record);

    int updateByPrimaryKey(CreditRecord record);
}