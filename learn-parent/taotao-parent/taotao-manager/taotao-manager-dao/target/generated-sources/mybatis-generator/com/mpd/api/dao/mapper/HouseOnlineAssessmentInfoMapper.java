package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseOnlineAssessmentInfo;
import com.mpd.api.dao.model.HouseOnlineAssessmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseOnlineAssessmentInfoMapper {
    long countByExample(HouseOnlineAssessmentInfoExample example);

    int deleteByExample(HouseOnlineAssessmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseOnlineAssessmentInfo record);

    int insertSelective(HouseOnlineAssessmentInfo record);

    List<HouseOnlineAssessmentInfo> selectByExample(HouseOnlineAssessmentInfoExample example);

    HouseOnlineAssessmentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseOnlineAssessmentInfo record, @Param("example") HouseOnlineAssessmentInfoExample example);

    int updateByExample(@Param("record") HouseOnlineAssessmentInfo record, @Param("example") HouseOnlineAssessmentInfoExample example);

    int updateByPrimaryKeySelective(HouseOnlineAssessmentInfo record);

    int updateByPrimaryKey(HouseOnlineAssessmentInfo record);
}