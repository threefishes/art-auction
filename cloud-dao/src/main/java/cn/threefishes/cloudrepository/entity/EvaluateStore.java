package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class EvaluateStore {
    private Integer evaluateId;

    private Integer deliveryCredit;

    private Integer descriptionCredit;

    private Date evaluateTime;

    private Integer memberId;

    private String memberName;

    private Integer ordersId;

    private Long ordersSn;

    private Integer ordersType;

    private Integer serviceCredit;

    private Integer storeId;

    private String storeName;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getDeliveryCredit() {
        return deliveryCredit;
    }

    public void setDeliveryCredit(Integer deliveryCredit) {
        this.deliveryCredit = deliveryCredit;
    }

    public Integer getDescriptionCredit() {
        return descriptionCredit;
    }

    public void setDescriptionCredit(Integer descriptionCredit) {
        this.descriptionCredit = descriptionCredit;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getOrdersSn() {
        return ordersSn;
    }

    public void setOrdersSn(Long ordersSn) {
        this.ordersSn = ordersSn;
    }

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public Integer getServiceCredit() {
        return serviceCredit;
    }

    public void setServiceCredit(Integer serviceCredit) {
        this.serviceCredit = serviceCredit;
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