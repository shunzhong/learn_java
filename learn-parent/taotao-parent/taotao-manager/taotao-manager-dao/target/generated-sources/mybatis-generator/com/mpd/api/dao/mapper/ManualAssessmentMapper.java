package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.ManualAssessment;
import com.mpd.api.dao.model.ManualAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManualAssessmentMapper {
    long countByExample(ManualAssessmentExample example);

    int deleteByExample(ManualAssessmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManualAssessment record);

    int insertSelective(ManualAssessment record);

    List<ManualAssessment> selectByExample(ManualAssessmentExample example);

    ManualAssessment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManualAssessment record, @Param("example") ManualAssessmentExample example);

    int updateByExample(@Param("record") ManualAssessment record, @Param("example") ManualAssessmentExample example);

    int updateByPrimaryKeySelective(ManualAssessment record);

    int updateByPrimaryKey(ManualAssessment record);
}