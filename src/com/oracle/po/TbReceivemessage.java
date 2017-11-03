package com.oracle.po;

public class TbReceivemessage {
    private Integer receiveid;

    private Integer sendid;

    private String messagestate;

    private Integer empid;

    public Integer getReceiveid() {
        return receiveid;
    }

    public void setReceiveid(Integer receiveid) {
        this.receiveid = receiveid;
    }

    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    public String getMessagestate() {
        return messagestate;
    }

    public void setMessagestate(String messagestate) {
        this.messagestate = messagestate == null ? null : messagestate.trim();
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}