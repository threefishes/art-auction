package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContractApply {
    private Integer ctaId;

    private Date ctaAddtime;

    private Integer ctaAuditstate;

    private BigDecimal ctaCost;

    private String ctaCostimg;

    private Integer ctaItemid;

    private Integer ctaStoreid;

    private String ctaStorename;

    public Integer getCtaId() {
        return ctaId;
    }

    public void setCtaId(Integer ctaId) {
        this.ctaId = ctaId;
    }

    public Date getCtaAddtime() {
        return ctaAddtime;
    }

    public void setCtaAddtime(Date ctaAddtime) {
        this.ctaAddtime = ctaAddtime;
    }

    public Integer getCtaAuditstate() {
        return ctaAuditstate;
    }

    public void setCtaAuditstate(Integer ctaAuditstate) {
        this.ctaAuditstate = ctaAuditstate;
    }

    public BigDecimal getCtaCost() {
        return ctaCost;
    }

    public void setCtaCost(BigDecimal ctaCost) {
        this.ctaCost = ctaCost;
    }

    public String getCtaCostimg() {
        return ctaCostimg;
    }

    public void setCtaCostimg(String ctaCostimg) {
        this.ctaCostimg = ctaCostimg == null ? null : ctaCostimg.trim();
    }

    public Integer getCtaItemid() {
        return ctaItemid;
    }

    public void setCtaItemid(Integer ctaItemid) {
        this.ctaItemid = ctaItemid;
    }

    public Integer getCtaStoreid() {
        return ctaStoreid;
    }

    public void setCtaStoreid(Integer ctaStoreid) {
        this.ctaStoreid = ctaStoreid;
    }

    public String getCtaStorename() {
        return ctaStorename;
    }

    public void setCtaStorename(String ctaStorename) {
        this.ctaStorename = ctaStorename == null ? null : ctaStorename.trim();
    }
}