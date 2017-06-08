package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseAssessmentInfo;
import com.mpd.api.dao.model.HouseAssessmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseAssessmentInfoMapper {
    long countByExample(HouseAssessmentInfoExample example);

    int deleteByExample(HouseAssessmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseAssessmentInfo record);

    int insertSelective(HouseAssessmentInfo record);

    List<HouseAssessmentInfo> selectByExample(HouseAssessmentInfoExample example);

    HouseAssessmentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseAssessmentInfo record, @Param("example") HouseAssessmentInfoExample example);

    int updateByExample(@Param("record") HouseAssessmentInfo record, @Param("example") HouseAssessmentInfoExample example);

    int updateByPrimaryKeySelective(HouseAssessmentInfo record);

    int updateByPrimaryKey(HouseAssessmentInfo record);
}