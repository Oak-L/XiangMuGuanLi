package com.oracle.po;

import java.util.Date;

public class TbSendmessage {
    private Integer sendid;

    private Integer empid;

    private String sendman;

    private String messagetitle;

    private String messagecontent;

    private Date createdate;

    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getSendman() {
        return sendman;
    }

    public void setSendman(String sendman) {
        this.sendman = sendman == null ? null : sendman.trim();
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle == null ? null : messagetitle.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}