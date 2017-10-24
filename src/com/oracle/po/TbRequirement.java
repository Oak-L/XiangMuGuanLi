package com.oracle.po;

import java.util.Date;

public class TbRequirement {
    private Integer requirementid;

    private Integer projectid;

    private String requirementname;

    private Float edition;

    private Date createdate;

    private Date updatedate;

    private String descript;

    private byte[] cotent;

    public Integer getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(Integer requirementid) {
        this.requirementid = requirementid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getRequirementname() {
        return requirementname;
    }

    public void setRequirementname(String requirementname) {
        this.requirementname = requirementname == null ? null : requirementname.trim();
    }

    public Float getEdition() {
        return edition;
    }

    public void setEdition(Float edition) {
        this.edition = edition;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public byte[] getCotent() {
        return cotent;
    }

    public void setCotent(byte[] cotent) {
        this.cotent = cotent;
    }
}