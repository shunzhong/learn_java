package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserJobInfo;
import com.mpd.api.dao.model.UserJobInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserJobInfoMapper {
    long countByExample(UserJobInfoExample example);

    int deleteByExample(UserJobInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserJobInfo record);

    int insertSelective(UserJobInfo record);

    List<UserJobInfo> selectByExample(UserJobInfoExample example);

    UserJobInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserJobInfo record, @Param("example") UserJobInfoExample example);

    int updateByExample(@Param("record") UserJobInfo record, @Param("example") UserJobInfoExample example);

    int updateByPrimaryKeySelective(UserJobInfo record);

    int updateByPrimaryKey(UserJobInfo record);
}