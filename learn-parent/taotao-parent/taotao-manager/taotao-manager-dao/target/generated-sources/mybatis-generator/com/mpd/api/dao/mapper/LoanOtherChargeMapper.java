package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.LoanOtherCharge;
import com.mpd.api.dao.model.LoanOtherChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanOtherChargeMapper {
    long countByExample(LoanOtherChargeExample example);

    int deleteByExample(LoanOtherChargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanOtherCharge record);

    int insertSelective(LoanOtherCharge record);

    List<LoanOtherCharge> selectByExample(LoanOtherChargeExample example);

    LoanOtherCharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanOtherCharge record, @Param("example") LoanOtherChargeExample example);

    int updateByExample(@Param("record") LoanOtherCharge record, @Param("example") LoanOtherChargeExample example);

    int updateByPrimaryKeySelective(LoanOtherCharge record);

    int updateByPrimaryKey(LoanOtherCharge record);
}