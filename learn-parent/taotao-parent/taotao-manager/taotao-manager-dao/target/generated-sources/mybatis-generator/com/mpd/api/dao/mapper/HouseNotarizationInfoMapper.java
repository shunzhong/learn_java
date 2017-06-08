package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseNotarizationInfo;
import com.mpd.api.dao.model.HouseNotarizationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseNotarizationInfoMapper {
    long countByExample(HouseNotarizationInfoExample example);

    int deleteByExample(HouseNotarizationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseNotarizationInfo record);

    int insertSelective(HouseNotarizationInfo record);

    List<HouseNotarizationInfo> selectByExample(HouseNotarizationInfoExample example);

    HouseNotarizationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseNotarizationInfo record, @Param("example") HouseNotarizationInfoExample example);

    int updateByExample(@Param("record") HouseNotarizationInfo record, @Param("example") HouseNotarizationInfoExample example);

    int updateByPrimaryKeySelective(HouseNotarizationInfo record);

    int updateByPrimaryKey(HouseNotarizationInfo record);
}