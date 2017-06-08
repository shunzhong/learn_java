package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserCredit;
import com.mpd.api.dao.model.UserCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCreditMapper {
    long countByExample(UserCreditExample example);

    int deleteByExample(UserCreditExample example);

    int deleteByPrimaryKey(String creditId);

    int insert(UserCredit record);

    int insertSelective(UserCredit record);

    List<UserCredit> selectByExample(UserCreditExample example);

    UserCredit selectByPrimaryKey(String creditId);

    int updateByExampleSelective(@Param("record") UserCredit record, @Param("example") UserCreditExample example);

    int updateByExample(@Param("record") UserCredit record, @Param("example") UserCreditExample example);

    int updateByPrimaryKeySelective(UserCredit record);

    int updateByPrimaryKey(UserCredit record);
}