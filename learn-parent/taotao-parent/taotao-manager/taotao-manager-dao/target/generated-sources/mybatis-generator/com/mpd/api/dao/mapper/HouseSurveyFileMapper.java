package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseSurveyFile;
import com.mpd.api.dao.model.HouseSurveyFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseSurveyFileMapper {
    long countByExample(HouseSurveyFileExample example);

    int deleteByExample(HouseSurveyFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseSurveyFile record);

    int insertSelective(HouseSurveyFile record);

    List<HouseSurveyFile> selectByExample(HouseSurveyFileExample example);

    HouseSurveyFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseSurveyFile record, @Param("example") HouseSurveyFileExample example);

    int updateByExample(@Param("record") HouseSurveyFile record, @Param("example") HouseSurveyFileExample example);

    int updateByPrimaryKeySelective(HouseSurveyFile record);

    int updateByPrimaryKey(HouseSurveyFile record);
}