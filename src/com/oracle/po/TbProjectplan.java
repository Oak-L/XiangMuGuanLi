package com.oracle.po;

import java.util.Date;

public class TbProjectplan {
    private Integer planid;

    private Integer functionid;

    private Integer empid;

    private Integer tbPlanid;

    private Integer tbEmpid;

    private String plantitle;

    private Date planbegindate;

    private Date planenddate;

    private Date realbegindate;

    private Date realenddate;

    private Integer timelimit;

    private Integer priority;

    private Integer tasktype;

    private Date createdate;

    private Integer state;

    private Integer expired;

    private Integer expiredday;

    private String plandesc;

    private Integer finishrate;

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getTbPlanid() {
        return tbPlanid;
    }

    public void setTbPlanid(Integer tbPlanid) {
        this.tbPlanid = tbPlanid;
    }

    public Integer getTbEmpid() {
        return tbEmpid;
    }

    public void setTbEmpid(Integer tbEmpid) {
        this.tbEmpid = tbEmpid;
    }

    public String getPlantitle() {
        return plantitle;
    }

    public void setPlantitle(String plantitle) {
        this.plantitle = plantitle == null ? null : plantitle.trim();
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

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getTasktype() {
        return tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getPlandesc() {
        return plandesc;
    }

    public void setPlandesc(String plandesc) {
        this.plandesc = plandesc == null ? null : plandesc.trim();
    }

    public Integer getFinishrate() {
        return finishrate;
    }

    public void setFinishrate(Integer finishrate) {
        this.finishrate = finishrate;
    }
}