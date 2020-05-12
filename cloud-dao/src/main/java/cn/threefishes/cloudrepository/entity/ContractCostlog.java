package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContractCostlog {
    private Integer clogId;

    private Date clogAddtime;

    private Integer clogAdminid;

    private String clogAdminname;

    private String clogDesc;

    private Integer clogItemid;

    private String clogItemname;

    private BigDecimal clogPrice;

    private Integer clogStoreid;

    private String clogStorename;

    public Integer getClogId() {
        return clogId;
    }

    public void setClogId(Integer clogId) {
        this.clogId = clogId;
    }

    public Date getClogAddtime() {
        return clogAddtime;
    }

    public void setClogAddtime(Date clogAddtime) {
        this.clogAddtime = clogAddtime;
    }

    public Integer getClogAdminid() {
        return clogAdminid;
    }

    public void setClogAdminid(Integer clogAdminid) {
        this.clogAdminid = clogAdminid;
    }

    public String getClogAdminname() {
        return clogAdminname;
    }

    public void setClogAdminname(String clogAdminname) {
        this.clogAdminname = clogAdminname == null ? null : clogAdminname.trim();
    }

    public String getClogDesc() {
        return clogDesc;
    }

    public void setClogDesc(String clogDesc) {
        this.clogDesc = clogDesc == null ? null : clogDesc.trim();
    }

    public Integer getClogItemid() {
        return clogItemid;
    }

    public void setClogItemid(Integer clogItemid) {
        this.clogItemid = clogItemid;
    }

    public String getClogItemname() {
        return clogItemname;
    }

    public void setClogItemname(String clogItemname) {
        this.clogItemname = clogItemname == null ? null : clogItemname.trim();
    }

    public BigDecimal getClogPrice() {
        return clogPrice;
    }

    public void setClogPrice(BigDecimal clogPrice) {
        this.clogPrice = clogPrice;
    }

    public Integer getClogStoreid() {
        return clogStoreid;
    }

    public void setClogStoreid(Integer clogStoreid) {
        this.clogStoreid = clogStoreid;
    }

    public String getClogStorename() {
        return clogStorename;
    }

    public void setClogStorename(String clogStorename) {
        this.clogStorename = clogStorename == null ? null : clogStorename.trim();
    }
}