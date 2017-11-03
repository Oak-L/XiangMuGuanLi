package com.oracle.mapper;

import com.oracle.po.TbSendmessage;
import com.oracle.po.TbSendmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSendmessageMapper {
    long countByExample(TbSendmessageExample example);

    int deleteByExample(TbSendmessageExample example);

    int deleteByPrimaryKey(Integer sendid);

    int insert(TbSendmessage record);

    int insertSelective(TbSendmessage record);

    List<TbSendmessage> selectByExample(TbSendmessageExample example);

    TbSendmessage selectByPrimaryKey(Integer sendid);

    int updateByExampleSelective(@Param("record") TbSendmessage record, @Param("example") TbSendmessageExample example);

    int updateByExample(@Param("record") TbSendmessage record, @Param("example") TbSendmessageExample example);

    int updateByPrimaryKeySelective(TbSendmessage record);

    int updateByPrimaryKey(TbSendmessage record);
}