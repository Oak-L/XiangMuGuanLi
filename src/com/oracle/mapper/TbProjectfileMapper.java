package com.oracle.mapper;

import com.oracle.po.TbProjectfile;
import com.oracle.po.TbProjectfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectfileMapper {
    long countByExample(TbProjectfileExample example);

    int deleteByExample(TbProjectfileExample example);

    int deleteByPrimaryKey(Integer projectfileid);

    int insert(TbProjectfile record);

    int insertSelective(TbProjectfile record);

    List<TbProjectfile> selectByExampleWithBLOBs(TbProjectfileExample example);

    List<TbProjectfile> selectByExample(TbProjectfileExample example);

    TbProjectfile selectByPrimaryKey(Integer projectfileid);

    int updateByExampleSelective(@Param("record") TbProjectfile record, @Param("example") TbProjectfileExample example);

    int updateByExampleWithBLOBs(@Param("record") TbProjectfile record, @Param("example") TbProjectfileExample example);

    int updateByExample(@Param("record") TbProjectfile record, @Param("example") TbProjectfileExample example);

    int updateByPrimaryKeySelective(TbProjectfile record);

    int updateByPrimaryKeyWithBLOBs(TbProjectfile record);

    int updateByPrimaryKey(TbProjectfile record);
}