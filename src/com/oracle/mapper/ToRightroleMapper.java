package com.oracle.mapper;

import com.oracle.po.ToRightrole;
import com.oracle.po.ToRightroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToRightroleMapper {
    long countByExample(ToRightroleExample example);

    int deleteByExample(ToRightroleExample example);

    int insert(ToRightrole record);

    int insertSelective(ToRightrole record);

    List<ToRightrole> selectByExample(ToRightroleExample example);

    int updateByExampleSelective(@Param("record") ToRightrole record, @Param("example") ToRightroleExample example);

    int updateByExample(@Param("record") ToRightrole record, @Param("example") ToRightroleExample example);
}