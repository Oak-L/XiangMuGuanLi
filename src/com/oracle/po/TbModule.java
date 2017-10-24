package com.oracle.po;

import java.util.Date;

public class TbModule {
    private Integer moduleid;

    private Integer projectid;

    private String modulename;

    private Integer priority;

    private Date createdate;

    private String identifier;

    private String moduledesc;

    private String requiredes;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getModuledesc() {
        return moduledesc;
    }

    public void setModuledesc(String moduledesc) {
        this.moduledesc = moduledesc == null ? null : moduledesc.trim();
    }

    public String getRequiredes() {
        return requiredes;
    }

    public void setRequiredes(String requiredes) {
        this.requiredes = requiredes == null ? null : requiredes.trim();
    }
}