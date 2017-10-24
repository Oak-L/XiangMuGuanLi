package com.oracle.mapper;

import com.oracle.po.TbDuty;
import com.oracle.po.TbDutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDutyMapper {
    long countByExample(TbDutyExample example);

    int deleteByExample(TbDutyExample example);

    int deleteByPrimaryKey(Integer dutyid);

    int insert(TbDuty record);

    int insertSelective(TbDuty record);

    List<TbDuty> selectByExample(TbDutyExample example);

    TbDuty selectByPrimaryKey(Integer dutyid);

    int updateByExampleSelective(@Param("record") TbDuty record, @Param("example") TbDutyExample example);

    int updateByExample(@Param("record") TbDuty record, @Param("example") TbDutyExample example);

    int updateByPrimaryKeySelective(TbDuty record);

    int updateByPrimaryKey(TbDuty record);
}