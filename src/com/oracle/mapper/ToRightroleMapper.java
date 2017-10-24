package com.oracle.mapper;

import com.oracle.po.ToRightroleExample;
import com.oracle.po.ToRightroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToRightroleMapper {
    long countByExample(ToRightroleExample example);

    int deleteByExample(ToRightroleExample example);

    int deleteByPrimaryKey(ToRightroleKey key);

    int insert(ToRightroleKey record);

    int insertSelective(ToRightroleKey record);

    List<ToRightroleKey> selectByExample(ToRightroleExample example);

    int updateByExampleSelective(@Param("record") ToRightroleKey record, @Param("example") ToRightroleExample example);

    int updateByExample(@Param("record") ToRightroleKey record, @Param("example") ToRightroleExample example);
}