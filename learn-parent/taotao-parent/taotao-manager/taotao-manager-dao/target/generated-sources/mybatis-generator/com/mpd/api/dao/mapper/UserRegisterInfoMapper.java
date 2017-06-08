package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserRegisterInfo;
import com.mpd.api.dao.model.UserRegisterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRegisterInfoMapper {
    long countByExample(UserRegisterInfoExample example);

    int deleteByExample(UserRegisterInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserRegisterInfo record);

    int insertSelective(UserRegisterInfo record);

    List<UserRegisterInfo> selectByExample(UserRegisterInfoExample example);

    UserRegisterInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserRegisterInfo record, @Param("example") UserRegisterInfoExample example);

    int updateByExample(@Param("record") UserRegisterInfo record, @Param("example") UserRegisterInfoExample example);

    int updateByPrimaryKeySelective(UserRegisterInfo record);

    int updateByPrimaryKey(UserRegisterInfo record);
}