package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class StoreJoinin {
    private Integer sellerId;

    private Integer allowForeignGoods;

    private Integer classId;

    private Integer gradeId;

    private String joininMessage;

    private Date joininSubmitTime;

    private Integer joininYear;

    private Integer payingAmount;

    private String payingCertificate;

    private String payingCertificateexp;

    private String sellerName;

    private Integer state;

    private String storeName;

    private Date auditSubmitTime;

    private String bondJoininMessage;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getAllowForeignGoods() {
        return allowForeignGoods;
    }

    public void setAllowForeignGoods(Integer allowForeignGoods) {
        this.allowForeignGoods = allowForeignGoods;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getJoininMessage() {
        return joininMessage;
    }

    public void setJoininMessage(String joininMessage) {
        this.joininMessage = joininMessage == null ? null : joininMessage.trim();
    }

    public Date getJoininSubmitTime() {
        return joininSubmitTime;
    }

    public void setJoininSubmitTime(Date joininSubmitTime) {
        this.joininSubmitTime = joininSubmitTime;
    }

    public Integer getJoininYear() {
        return joininYear;
    }

    public void setJoininYear(Integer joininYear) {
        this.joininYear = joininYear;
    }

    public Integer getPayingAmount() {
        return payingAmount;
    }

    public void setPayingAmount(Integer payingAmount) {
        this.payingAmount = payingAmount;
    }

    public String getPayingCertificate() {
        return payingCertificate;
    }

    public void setPayingCertificate(String payingCertificate) {
        this.payingCertificate = payingCertificate == null ? null : payingCertificate.trim();
    }

    public String getPayingCertificateexp() {
        return payingCertificateexp;
    }

    public void setPayingCertificateexp(String payingCertificateexp) {
        this.payingCertificateexp = payingCertificateexp == null ? null : payingCertificateexp.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Date getAuditSubmitTime() {
        return auditSubmitTime;
    }

    public void setAuditSubmitTime(Date auditSubmitTime) {
        this.auditSubmitTime = auditSubmitTime;
    }

    public String getBondJoininMessage() {
        return bondJoininMessage;
    }

    public void setBondJoininMessage(String bondJoininMessage) {
        this.bondJoininMessage = bondJoininMessage == null ? null : bondJoininMessage.trim();
    }
}