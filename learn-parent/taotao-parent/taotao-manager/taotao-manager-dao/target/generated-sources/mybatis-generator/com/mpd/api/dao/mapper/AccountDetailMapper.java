package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.AccountDetail;
import com.mpd.api.dao.model.AccountDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountDetailMapper {
    long countByExample(AccountDetailExample example);

    int deleteByExample(AccountDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountDetail record);

    int insertSelective(AccountDetail record);

    List<AccountDetail> selectByExample(AccountDetailExample example);

    AccountDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountDetail record, @Param("example") AccountDetailExample example);

    int updateByExample(@Param("record") AccountDetail record, @Param("example") AccountDetailExample example);

    int updateByPrimaryKeySelective(AccountDetail record);

    int updateByPrimaryKey(AccountDetail record);
}