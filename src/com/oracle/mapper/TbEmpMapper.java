package com.oracle.mapper;

import com.oracle.po.TbEmp;
import com.oracle.po.TbEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEmpMapper {
    long countByExample(TbEmpExample example);

    int deleteByExample(TbEmpExample example);

    int deleteByPrimaryKey(Integer empid);

    int insert(TbEmp record);

    int insertSelective(TbEmp record);

    List<TbEmp> selectByExample(TbEmpExample example);

    TbEmp selectByPrimaryKey(Integer empid);

    int updateByExampleSelective(@Param("record") TbEmp record, @Param("example") TbEmpExample example);

    int updateByExample(@Param("record") TbEmp record, @Param("example") TbEmpExample example);

    int updateByPrimaryKeySelective(TbEmp record);

    int updateByPrimaryKey(TbEmp record);
}