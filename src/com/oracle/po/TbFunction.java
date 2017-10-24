package com.oracle.po;

import java.util.Date;

public class TbFunction {
    private Integer functionid;

    private Integer moduleid;

    private String functionname;

    private Integer priority;

    private Date createdate;

    private String functiondesc;

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getFunctiondesc() {
        return functiondesc;
    }

    public void setFunctiondesc(String functiondesc) {
        this.functiondesc = functiondesc == null ? null : functiondesc.trim();
    }
}