package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserContactsInfo;
import com.mpd.api.dao.model.UserContactsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContactsInfoMapper {
    long countByExample(UserContactsInfoExample example);

    int deleteByExample(UserContactsInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserContactsInfo record);

    int insertSelective(UserContactsInfo record);

    List<UserContactsInfo> selectByExample(UserContactsInfoExample example);

    UserContactsInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserContactsInfo record, @Param("example") UserContactsInfoExample example);

    int updateByExample(@Param("record") UserContactsInfo record, @Param("example") UserContactsInfoExample example);

    int updateByPrimaryKeySelective(UserContactsInfo record);

    int updateByPrimaryKey(UserContactsInfo record);
}