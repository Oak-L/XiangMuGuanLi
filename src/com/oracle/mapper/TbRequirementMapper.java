package com.oracle.mapper;

import com.oracle.po.TbRequirement;
import com.oracle.po.TbRequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRequirementMapper {
    long countByExample(TbRequirementExample example);

    int deleteByExample(TbRequirementExample example);

    int deleteByPrimaryKey(Integer requirementid);

    int insert(TbRequirement record);

    int insertSelective(TbRequirement record);

    List<TbRequirement> selectByExampleWithBLOBs(TbRequirementExample example);

    List<TbRequirement> selectByExample(TbRequirementExample example);

    TbRequirement selectByPrimaryKey(Integer requirementid);

    int updateByExampleSelective(@Param("record") TbRequirement record, @Param("example") TbRequirementExample example);

    int updateByExampleWithBLOBs(@Param("record") TbRequirement record, @Param("example") TbRequirementExample example);

    int updateByExample(@Param("record") TbRequirement record, @Param("example") TbRequirementExample example);

    int updateByPrimaryKeySelective(TbRequirement record);

    int updateByPrimaryKeyWithBLOBs(TbRequirement record);

    int updateByPrimaryKey(TbRequirement record);
}