package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;

public class Contract {
    private Integer ctId;

    private Integer ctAuditstate;

    private Integer ctClosestate;

    private BigDecimal ctCost;

    private Integer ctItemid;

    private Integer ctJoinstate;

    private Integer ctQuitstate;

    private Integer ctStoreid;

    private String ctStorename;

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getCtAuditstate() {
        return ctAuditstate;
    }

    public void setCtAuditstate(Integer ctAuditstate) {
        this.ctAuditstate = ctAuditstate;
    }

    public Integer getCtClosestate() {
        return ctClosestate;
    }

    public void setCtClosestate(Integer ctClosestate) {
        this.ctClosestate = ctClosestate;
    }

    public BigDecimal getCtCost() {
        return ctCost;
    }

    public void setCtCost(BigDecimal ctCost) {
        this.ctCost = ctCost;
    }

    public Integer getCtItemid() {
        return ctItemid;
    }

    public void setCtItemid(Integer ctItemid) {
        this.ctItemid = ctItemid;
    }

    public Integer getCtJoinstate() {
        return ctJoinstate;
    }

    public void setCtJoinstate(Integer ctJoinstate) {
        this.ctJoinstate = ctJoinstate;
    }

    public Integer getCtQuitstate() {
        return ctQuitstate;
    }

    public void setCtQuitstate(Integer ctQuitstate) {
        this.ctQuitstate = ctQuitstate;
    }

    public Integer getCtStoreid() {
        return ctStoreid;
    }

    public void setCtStoreid(Integer ctStoreid) {
        this.ctStoreid = ctStoreid;
    }

    public String getCtStorename() {
        return ctStorename;
    }

    public void setCtStorename(String ctStorename) {
        this.ctStorename = ctStorename == null ? null : ctStorename.trim();
    }
}