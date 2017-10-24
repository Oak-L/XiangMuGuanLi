package com.oracle.mapper;

import com.oracle.po.TbWorkrecord;
import com.oracle.po.TbWorkrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWorkrecordMapper {
    long countByExample(TbWorkrecordExample example);

    int deleteByExample(TbWorkrecordExample example);

    int deleteByPrimaryKey(Integer recordid);

    int insert(TbWorkrecord record);

    int insertSelective(TbWorkrecord record);

    List<TbWorkrecord> selectByExample(TbWorkrecordExample example);

    TbWorkrecord selectByPrimaryKey(Integer recordid);

    int updateByExampleSelective(@Param("record") TbWorkrecord record, @Param("example") TbWorkrecordExample example);

    int updateByExample(@Param("record") TbWorkrecord record, @Param("example") TbWorkrecordExample example);

    int updateByPrimaryKeySelective(TbWorkrecord record);

    int updateByPrimaryKey(TbWorkrecord record);
}