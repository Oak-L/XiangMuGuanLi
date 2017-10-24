package com.oracle.mapper;

import com.oracle.po.ToReceivemessage;
import com.oracle.po.ToReceivemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToReceivemessageMapper {
    long countByExample(ToReceivemessageExample example);

    int deleteByExample(ToReceivemessageExample example);

    int deleteByPrimaryKey(Integer receiveid);

    int insert(ToReceivemessage record);

    int insertSelective(ToReceivemessage record);

    List<ToReceivemessage> selectByExample(ToReceivemessageExample example);

    ToReceivemessage selectByPrimaryKey(Integer receiveid);

    int updateByExampleSelective(@Param("record") ToReceivemessage record, @Param("example") ToReceivemessageExample example);

    int updateByExample(@Param("record") ToReceivemessage record, @Param("example") ToReceivemessageExample example);

    int updateByPrimaryKeySelective(ToReceivemessage record);

    int updateByPrimaryKey(ToReceivemessage record);
}