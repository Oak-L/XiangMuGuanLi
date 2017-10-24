package com.oracle.mapper;

import com.oracle.po.TbProject;
import com.oracle.po.TbProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectMapper {
    long countByExample(TbProjectExample example);

    int deleteByExample(TbProjectExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(TbProject record);

    int insertSelective(TbProject record);

    List<TbProject> selectByExample(TbProjectExample example);

    TbProject selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") TbProject record, @Param("example") TbProjectExample example);

    int updateByExample(@Param("record") TbProject record, @Param("example") TbProjectExample example);

    int updateByPrimaryKeySelective(TbProject record);

    int updateByPrimaryKey(TbProject record);
}