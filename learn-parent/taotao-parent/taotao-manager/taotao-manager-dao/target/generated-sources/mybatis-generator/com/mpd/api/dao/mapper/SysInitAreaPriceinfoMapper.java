package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.SysInitAreaPriceinfo;
import com.mpd.api.dao.model.SysInitAreaPriceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysInitAreaPriceinfoMapper {
    long countByExample(SysInitAreaPriceinfoExample example);

    int deleteByExample(SysInitAreaPriceinfoExample example);

    int deleteByPrimaryKey(Integer areaCode);

    int insert(SysInitAreaPriceinfo record);

    int insertSelective(SysInitAreaPriceinfo record);

    List<SysInitAreaPriceinfo> selectByExample(SysInitAreaPriceinfoExample example);

    SysInitAreaPriceinfo selectByPrimaryKey(Integer areaCode);

    int updateByExampleSelective(@Param("record") SysInitAreaPriceinfo record, @Param("example") SysInitAreaPriceinfoExample example);

    int updateByExample(@Param("record") SysInitAreaPriceinfo record, @Param("example") SysInitAreaPriceinfoExample example);

    int updateByPrimaryKeySelective(SysInitAreaPriceinfo record);

    int updateByPrimaryKey(SysInitAreaPriceinfo record);
}