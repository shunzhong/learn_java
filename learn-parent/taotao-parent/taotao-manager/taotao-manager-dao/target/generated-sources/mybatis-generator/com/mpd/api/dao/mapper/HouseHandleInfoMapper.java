package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.HouseHandleInfo;
import com.mpd.api.dao.model.HouseHandleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseHandleInfoMapper {
    long countByExample(HouseHandleInfoExample example);

    int deleteByExample(HouseHandleInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseHandleInfo record);

    int insertSelective(HouseHandleInfo record);

    List<HouseHandleInfo> selectByExample(HouseHandleInfoExample example);

    HouseHandleInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseHandleInfo record, @Param("example") HouseHandleInfoExample example);

    int updateByExample(@Param("record") HouseHandleInfo record, @Param("example") HouseHandleInfoExample example);

    int updateByPrimaryKeySelective(HouseHandleInfo record);

    int updateByPrimaryKey(HouseHandleInfo record);
}