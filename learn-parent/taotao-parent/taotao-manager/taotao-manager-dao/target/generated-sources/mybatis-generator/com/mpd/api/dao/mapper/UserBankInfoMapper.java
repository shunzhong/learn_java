package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserBankInfo;
import com.mpd.api.dao.model.UserBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankInfoMapper {
    long countByExample(UserBankInfoExample example);

    int deleteByExample(UserBankInfoExample example);

    int insert(UserBankInfo record);

    int insertSelective(UserBankInfo record);

    List<UserBankInfo> selectByExample(UserBankInfoExample example);

    int updateByExampleSelective(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);

    int updateByExample(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);
}