package com.mpd.api.dao.mapper;

import com.mpd.api.dao.model.LoanRepaymentPlan;
import com.mpd.api.dao.model.LoanRepaymentPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanRepaymentPlanMapper {
    long countByExample(LoanRepaymentPlanExample example);

    int deleteByExample(LoanRepaymentPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanRepaymentPlan record);

    int insertSelective(LoanRepaymentPlan record);

    List<LoanRepaymentPlan> selectByExample(LoanRepaymentPlanExample example);

    LoanRepaymentPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanRepaymentPlan record, @Param("example") LoanRepaymentPlanExample example);

    int updateByExample(@Param("record") LoanRepaymentPlan record, @Param("example") LoanRepaymentPlanExample example);

    int updateByPrimaryKeySelective(LoanRepaymentPlan record);

    int updateByPrimaryKey(LoanRepaymentPlan record);
}