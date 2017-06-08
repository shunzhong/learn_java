package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseCoparcenaryRatio;
import com.mpd.api.dao.model.HouseCoparcenaryRatioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseCoparcenaryRatioMapper {
    long countByExample(HouseCoparcenaryRatioExample example);

    int deleteByExample(HouseCoparcenaryRatioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseCoparcenaryRatio record);

    int insertSelective(HouseCoparcenaryRatio record);

    List<HouseCoparcenaryRatio> selectByExample(HouseCoparcenaryRatioExample example);

    HouseCoparcenaryRatio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseCoparcenaryRatio record, @Param("example") HouseCoparcenaryRatioExample example);

    int updateByExample(@Param("record") HouseCoparcenaryRatio record, @Param("example") HouseCoparcenaryRatioExample example);

    int updateByPrimaryKeySelective(HouseCoparcenaryRatio record);

    int updateByPrimaryKey(HouseCoparcenaryRatio record);
}