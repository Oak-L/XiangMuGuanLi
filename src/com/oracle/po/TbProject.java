package com.oracle.po;

import java.util.Date;

public class TbProject {
    private Integer projectid;

    private Integer companyid;

    private Integer empid;

    private String projectname;

    private Integer prosum;

    private Integer amount;

    private Integer state;

    private Integer budget;

    private Integer realcost;

    private Date planbegindate;

    private Date planenddate;

    private Integer priority;

    private Date realbegindate;

    private Date realenddate;

    private Integer expired;

    private Integer expiredday;

    private String descript;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getProsum() {
        return prosum;
    }

    public void setProsum(Integer prosum) {
        this.prosum = prosum;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getRealcost() {
        return realcost;
    }

    public void setRealcost(Integer realcost) {
        this.realcost = realcost;
    }

    public Date getPlanbegindate() {
        return planbegindate;
    }

    public void setPlanbegindate(Date planbegindate) {
        this.planbegindate = planbegindate;
    }

    public Date getPlanenddate() {
        return planenddate;
    }

    public void setPlanenddate(Date planenddate) {
        this.planenddate = planenddate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getRealbegindate() {
        return realbegindate;
    }

    public void setRealbegindate(Date realbegindate) {
        this.realbegindate = realbegindate;
    }

    public Date getRealenddate() {
        return realenddate;
    }

    public void setRealenddate(Date realenddate) {
        this.realenddate = realenddate;
    }

    public Integer getExpired() {
        return expired;
    }

    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    public Integer getExpiredday() {
        return expiredday;
    }

    public void setExpiredday(Integer expiredday) {
        this.expiredday = expiredday;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}