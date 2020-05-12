package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ContractQuitapply {
    private Integer ctqId;

    private Date ctqAddtime;

    private Integer ctqAuditstate;

    private Integer ctqItemid;

    private String ctqItemname;

    private Integer ctqStoreid;

    private String ctqStorename;

    public Integer getCtqId() {
        return ctqId;
    }

    public void setCtqId(Integer ctqId) {
        this.ctqId = ctqId;
    }

    public Date getCtqAddtime() {
        return ctqAddtime;
    }

    public void setCtqAddtime(Date ctqAddtime) {
        this.ctqAddtime = ctqAddtime;
    }

    public Integer getCtqAuditstate() {
        return ctqAuditstate;
    }

    public void setCtqAuditstate(Integer ctqAuditstate) {
        this.ctqAuditstate = ctqAuditstate;
    }

    public Integer getCtqItemid() {
        return ctqItemid;
    }

    public void setCtqItemid(Integer ctqItemid) {
        this.ctqItemid = ctqItemid;
    }

    public String getCtqItemname() {
        return ctqItemname;
    }

    public void setCtqItemname(String ctqItemname) {
        this.ctqItemname = ctqItemname == null ? null : ctqItemname.trim();
    }

    public Integer getCtqStoreid() {
        return ctqStoreid;
    }

    public void setCtqStoreid(Integer ctqStoreid) {
        this.ctqStoreid = ctqStoreid;
    }

    public String getCtqStorename() {
        return ctqStorename;
    }

    public void setCtqStorename(String ctqStorename) {
        this.ctqStorename = ctqStorename == null ? null : ctqStorename.trim();
    }
}