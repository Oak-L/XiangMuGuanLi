package com.oracle.po;

public class ToPayoff {
    private Integer payid;

    private Integer empid;

    private Integer tbEmpid;

    private Integer sal;

    private Integer comm;

    private Integer deductsum;

    private String paytype;

    private Integer year;

    private Integer month;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getTbEmpid() {
        return tbEmpid;
    }

    public void setTbEmpid(Integer tbEmpid) {
        this.tbEmpid = tbEmpid;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Integer getDeductsum() {
        return deductsum;
    }

    public void setDeductsum(Integer deductsum) {
        this.deductsum = deductsum;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}