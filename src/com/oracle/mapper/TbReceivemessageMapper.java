package com.oracle.mapper;

import com.oracle.po.TbReceivemessage;
import com.oracle.po.TbReceivemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReceivemessageMapper {
    long countByExample(TbReceivemessageExample example);

    int deleteByExample(TbReceivemessageExample example);

    int deleteByPrimaryKey(Integer receiveid);

    int insert(TbReceivemessage record);

    int insertSelective(TbReceivemessage record);

    List<TbReceivemessage> selectByExample(TbReceivemessageExample example);

    TbReceivemessage selectByPrimaryKey(Integer receiveid);

    int updateByExampleSelective(@Param("record") TbReceivemessage record, @Param("example") TbReceivemessageExample example);

    int updateByExample(@Param("record") TbReceivemessage record, @Param("example") TbReceivemessageExample example);

    int updateByPrimaryKeySelective(TbReceivemessage record);

    int updateByPrimaryKey(TbReceivemessage record);
}