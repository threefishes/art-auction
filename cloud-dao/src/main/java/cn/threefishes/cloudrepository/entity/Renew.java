package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Renew {
    private Integer renewId;

    private Integer allowForeignGoods;

    private Date createTime;

    private Date endTime;

    private Integer gradeId;

    private String gradeName;

    private BigDecimal payAmount;

    private String payCert;

    private String payCertNote;

    private BigDecimal renewPrice;

    private Integer renewState;

    private Integer renewYear;

    private Date startTime;

    private Integer storeId;

    private String storeName;

    public Integer getRenewId() {
        return renewId;
    }

    public void setRenewId(Integer renewId) {
        this.renewId = renewId;
    }

    public Integer getAllowForeignGoods() {
        return allowForeignGoods;
    }

    public void setAllowForeignGoods(Integer allowForeignGoods) {
        this.allowForeignGoods = allowForeignGoods;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayCert() {
        return payCert;
    }

    public void setPayCert(String payCert) {
        this.payCert = payCert == null ? null : payCert.trim();
    }

    public String getPayCertNote() {
        return payCertNote;
    }

    public void setPayCertNote(String payCertNote) {
        this.payCertNote = payCertNote == null ? null : payCertNote.trim();
    }

    public BigDecimal getRenewPrice() {
        return renewPrice;
    }

    public void setRenewPrice(BigDecimal renewPrice) {
        this.renewPrice = renewPrice;
    }

    public Integer getRenewState() {
        return renewState;
    }

    public void setRenewState(Integer renewState) {
        this.renewState = renewState;
    }

    public Integer getRenewYear() {
        return renewYear;
    }

    public void setRenewYear(Integer renewYear) {
        this.renewYear = renewYear;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }
}