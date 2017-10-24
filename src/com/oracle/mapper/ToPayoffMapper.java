package com.oracle.mapper;

import com.oracle.po.ToPayoff;
import com.oracle.po.ToPayoffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToPayoffMapper {
    long countByExample(ToPayoffExample example);

    int deleteByExample(ToPayoffExample example);

    int deleteByPrimaryKey(Integer payid);

    int insert(ToPayoff record);

    int insertSelective(ToPayoff record);

    List<ToPayoff> selectByExample(ToPayoffExample example);

    ToPayoff selectByPrimaryKey(Integer payid);

    int updateByExampleSelective(@Param("record") ToPayoff record, @Param("example") ToPayoffExample example);

    int updateByExample(@Param("record") ToPayoff record, @Param("example") ToPayoffExample example);

    int updateByPrimaryKeySelective(ToPayoff record);

    int updateByPrimaryKey(ToPayoff record);
}