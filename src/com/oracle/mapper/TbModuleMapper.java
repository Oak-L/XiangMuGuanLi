package com.oracle.mapper;

import com.oracle.po.TbModule;
import com.oracle.po.TbModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbModuleMapper {
    long countByExample(TbModuleExample example);

    int deleteByExample(TbModuleExample example);

    int deleteByPrimaryKey(Integer moduleid);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    List<TbModule> selectByExample(TbModuleExample example);

    TbModule selectByPrimaryKey(Integer moduleid);

    int updateByExampleSelective(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByExample(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}