package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.UserMortgageHouseInfo;
import com.mpd.api.dao.model.UserMortgageHouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMortgageHouseInfoMapper {
    long countByExample(UserMortgageHouseInfoExample example);

    int deleteByExample(UserMortgageHouseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserMortgageHouseInfo record);

    int insertSelective(UserMortgageHouseInfo record);

    List<UserMortgageHouseInfo> selectByExample(UserMortgageHouseInfoExample example);

    UserMortgageHouseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserMortgageHouseInfo record, @Param("example") UserMortgageHouseInfoExample example);

    int updateByExample(@Param("record") UserMortgageHouseInfo record, @Param("example") UserMortgageHouseInfoExample example);

    int updateByPrimaryKeySelective(UserMortgageHouseInfo record);

    int updateByPrimaryKey(UserMortgageHouseInfo record);
}