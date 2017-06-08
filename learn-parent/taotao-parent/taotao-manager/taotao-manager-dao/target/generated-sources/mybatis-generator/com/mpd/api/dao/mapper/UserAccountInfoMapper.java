package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserAccountInfo;
import com.mpd.api.dao.model.UserAccountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountInfoMapper {
    long countByExample(UserAccountInfoExample example);

    int deleteByExample(UserAccountInfoExample example);

    int insert(UserAccountInfo record);

    int insertSelective(UserAccountInfo record);

    List<UserAccountInfo> selectByExample(UserAccountInfoExample example);

    int updateByExampleSelective(@Param("record") UserAccountInfo record, @Param("example") UserAccountInfoExample example);

    int updateByExample(@Param("record") UserAccountInfo record, @Param("example") UserAccountInfoExample example);
}