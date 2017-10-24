package com.oracle.po;

public class ToRightroleKey {
    private Integer roleid;

    private String rightid;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid == null ? null : rightid.trim();
    }
}