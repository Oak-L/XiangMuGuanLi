package com.oracle.mapper;

import com.oracle.po.ToSendmessage;
import com.oracle.po.ToSendmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToSendmessageMapper {
    long countByExample(ToSendmessageExample example);

    int deleteByExample(ToSendmessageExample example);

    int deleteByPrimaryKey(Integer sendid);

    int insert(ToSendmessage record);

    int insertSelective(ToSendmessage record);

    List<ToSendmessage> selectByExample(ToSendmessageExample example);

    ToSendmessage selectByPrimaryKey(Integer sendid);

    int updateByExampleSelective(@Param("record") ToSendmessage record, @Param("example") ToSendmessageExample example);

    int updateByExample(@Param("record") ToSendmessage record, @Param("example") ToSendmessageExample example);

    int updateByPrimaryKeySelective(ToSendmessage record);

    int updateByPrimaryKey(ToSendmessage record);
}