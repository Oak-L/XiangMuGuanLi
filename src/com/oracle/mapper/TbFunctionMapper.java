package com.oracle.mapper;

import com.oracle.po.TbFunction;
import com.oracle.po.TbFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFunctionMapper {
    long countByExample(TbFunctionExample example);

    int deleteByExample(TbFunctionExample example);

    int deleteByPrimaryKey(Integer functionid);

    int insert(TbFunction record);

    int insertSelective(TbFunction record);

    List<TbFunction> selectByExample(TbFunctionExample example);

    TbFunction selectByPrimaryKey(Integer functionid);

    int updateByExampleSelective(@Param("record") TbFunction record, @Param("example") TbFunctionExample example);

    int updateByExample(@Param("record") TbFunction record, @Param("example") TbFunctionExample example);

    int updateByPrimaryKeySelective(TbFunction record);

    int updateByPrimaryKey(TbFunction record);
}