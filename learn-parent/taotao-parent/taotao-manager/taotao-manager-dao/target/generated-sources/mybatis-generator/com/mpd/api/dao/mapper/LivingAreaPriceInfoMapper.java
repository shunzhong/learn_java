package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.LivingAreaPriceInfo;
import com.mpd.api.dao.model.LivingAreaPriceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LivingAreaPriceInfoMapper {
    long countByExample(LivingAreaPriceInfoExample example);

    int deleteByExample(LivingAreaPriceInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LivingAreaPriceInfo record);

    int insertSelective(LivingAreaPriceInfo record);

    List<LivingAreaPriceInfo> selectByExample(LivingAreaPriceInfoExample example);

    LivingAreaPriceInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LivingAreaPriceInfo record, @Param("example") LivingAreaPriceInfoExample example);

    int updateByExample(@Param("record") LivingAreaPriceInfo record, @Param("example") LivingAreaPriceInfoExample example);

    int updateByPrimaryKeySelective(LivingAreaPriceInfo record);

    int updateByPrimaryKey(LivingAreaPriceInfo record);
}