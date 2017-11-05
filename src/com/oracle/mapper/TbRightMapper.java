package com.oracle.mapper;

import com.oracle.po.ParentTbRight;
import com.oracle.po.TbRight;
import com.oracle.po.TbRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRightMapper {
	long countByExample(TbRightExample example);

	int deleteByExample(TbRightExample example);

	int deleteByPrimaryKey(String rightid);

	int insert(TbRight record);

	int insertSelective(TbRight record);

	List<TbRight> selectByExample(TbRightExample example);

	TbRight selectByPrimaryKey(String rightid);

	int updateByExampleSelective(@Param("record") TbRight record, @Param("example") TbRightExample example);

	int updateByExample(@Param("record") TbRight record, @Param("example") TbRightExample example);

	int updateByPrimaryKeySelective(TbRight record);

	int updateByPrimaryKey(TbRight record);

	List<ParentTbRight> getTbrightByTbemp(int empid);
}