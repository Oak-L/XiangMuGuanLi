package com.oracle.mapper;

import com.oracle.po.TbProjectplan;
import com.oracle.po.TbProjectplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectplanMapper {
    long countByExample(TbProjectplanExample example);

    int deleteByExample(TbProjectplanExample example);

    int deleteByPrimaryKey(Integer planid);

    int insert(TbProjectplan record);

    int insertSelective(TbProjectplan record);

    List<TbProjectplan> selectByExample(TbProjectplanExample example);

    TbProjectplan selectByPrimaryKey(Integer planid);

    int updateByExampleSelective(@Param("record") TbProjectplan record, @Param("example") TbProjectplanExample example);

    int updateByExample(@Param("record") TbProjectplan record, @Param("example") TbProjectplanExample example);

    int updateByPrimaryKeySelective(TbProjectplan record);

    int updateByPrimaryKey(TbProjectplan record);
}