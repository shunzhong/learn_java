package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HousePropertyInfo;
import com.mpd.api.dao.model.HousePropertyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousePropertyInfoMapper {
    long countByExample(HousePropertyInfoExample example);

    int deleteByExample(HousePropertyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HousePropertyInfo record);

    int insertSelective(HousePropertyInfo record);

    List<HousePropertyInfo> selectByExample(HousePropertyInfoExample example);

    HousePropertyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HousePropertyInfo record, @Param("example") HousePropertyInfoExample example);

    int updateByExample(@Param("record") HousePropertyInfo record, @Param("example") HousePropertyInfoExample example);

    int updateByPrimaryKeySelective(HousePropertyInfo record);

    int updateByPrimaryKey(HousePropertyInfo record);
}