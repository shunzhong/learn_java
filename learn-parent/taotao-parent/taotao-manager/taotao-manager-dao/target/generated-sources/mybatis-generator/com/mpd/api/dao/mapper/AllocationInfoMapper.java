package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.AllocationInfo;
import com.mpd.api.dao.model.AllocationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllocationInfoMapper {
    long countByExample(AllocationInfoExample example);

    int deleteByExample(AllocationInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AllocationInfo record);

    int insertSelective(AllocationInfo record);

    List<AllocationInfo> selectByExample(AllocationInfoExample example);

    AllocationInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AllocationInfo record, @Param("example") AllocationInfoExample example);

    int updateByExample(@Param("record") AllocationInfo record, @Param("example") AllocationInfoExample example);

    int updateByPrimaryKeySelective(AllocationInfo record);

    int updateByPrimaryKey(AllocationInfo record);
}