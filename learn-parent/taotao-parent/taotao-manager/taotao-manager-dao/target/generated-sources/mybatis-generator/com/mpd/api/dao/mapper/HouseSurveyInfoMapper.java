package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseSurveyInfo;
import com.mpd.api.dao.model.HouseSurveyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseSurveyInfoMapper {
    long countByExample(HouseSurveyInfoExample example);

    int deleteByExample(HouseSurveyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseSurveyInfo record);

    int insertSelective(HouseSurveyInfo record);

    List<HouseSurveyInfo> selectByExample(HouseSurveyInfoExample example);

    HouseSurveyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseSurveyInfo record, @Param("example") HouseSurveyInfoExample example);

    int updateByExample(@Param("record") HouseSurveyInfo record, @Param("example") HouseSurveyInfoExample example);

    int updateByPrimaryKeySelective(HouseSurveyInfo record);

    int updateByPrimaryKey(HouseSurveyInfo record);
}