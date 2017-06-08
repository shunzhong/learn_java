package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.LoanInfoOprInfo;
import com.mpd.api.dao.model.LoanInfoOprInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanInfoOprInfoMapper {
    long countByExample(LoanInfoOprInfoExample example);

    int deleteByExample(LoanInfoOprInfoExample example);

    int insert(LoanInfoOprInfo record);

    int insertSelective(LoanInfoOprInfo record);

    List<LoanInfoOprInfo> selectByExample(LoanInfoOprInfoExample example);

    int updateByExampleSelective(@Param("record") LoanInfoOprInfo record, @Param("example") LoanInfoOprInfoExample example);

    int updateByExample(@Param("record") LoanInfoOprInfo record, @Param("example") LoanInfoOprInfoExample example);
}