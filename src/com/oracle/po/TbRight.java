package com.oracle.po;

public class TbRight {
    private String rightid;

    private String rightname;

    private String righturl;

    private String urlname;

    private String code;

    private String rightdesc;

    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid == null ? null : rightid.trim();
    }

    public String getRightname() {
        return rightname;
    }

    public void setRightname(String rightname) {
        this.rightname = rightname == null ? null : rightname.trim();
    }

    public String getRighturl() {
        return righturl;
    }

    public void setRighturl(String righturl) {
        this.righturl = righturl == null ? null : righturl.trim();
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname == null ? null : urlname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRightdesc() {
        return rightdesc;
    }

    public void setRightdesc(String rightdesc) {
        this.rightdesc = rightdesc == null ? null : rightdesc.trim();
    }
}