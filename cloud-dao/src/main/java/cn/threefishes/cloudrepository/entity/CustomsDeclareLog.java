package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CustomsDeclareLog {
    private Integer id;

    private Integer ordersId;

    private Long paySn;

    private Integer isSplit;

    private String plateForm;

    private String customsPlace;

    private Integer requestStatus;

    private Integer resultStatus;

    private Integer customsStatus;

    private String remark;

    private Date pushTime;

    private Integer associatedPush;

    private String associateCustomsPlace;

    private Integer associateRequestStatus;

    private Integer associateResultStatus;

    private Integer associateCustomsStatus;

    private String associatedPushRemark;

    private Date associatedPushTime;

    private Date createTime;

    private BigDecimal amount;

    private String verDept;

    private String payTransactionId;

    private String customsTradeNo;

    private String requestBody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getPaySn() {
        return paySn;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }

    public Integer getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Integer isSplit) {
        this.isSplit = isSplit;
    }

    public String getPlateForm() {
        return plateForm;
    }

    public void setPlateForm(String plateForm) {
        this.plateForm = plateForm == null ? null : plateForm.trim();
    }

    public String getCustomsPlace() {
        return customsPlace;
    }

    public void setCustomsPlace(String customsPlace) {
        this.customsPlace = customsPlace == null ? null : customsPlace.trim();
    }

    public Integer getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Integer requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Integer getCustomsStatus() {
        return customsStatus;
    }

    public void setCustomsStatus(Integer customsStatus) {
        this.customsStatus = customsStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getAssociatedPush() {
        return associatedPush;
    }

    public void setAssociatedPush(Integer associatedPush) {
        this.associatedPush = associatedPush;
    }

    public String getAssociateCustomsPlace() {
        return associateCustomsPlace;
    }

    public void setAssociateCustomsPlace(String associateCustomsPlace) {
        this.associateCustomsPlace = associateCustomsPlace == null ? null : associateCustomsPlace.trim();
    }

    public Integer getAssociateRequestStatus() {
        return associateRequestStatus;
    }

    public void setAssociateRequestStatus(Integer associateRequestStatus) {
        this.associateRequestStatus = associateRequestStatus;
    }

    public Integer getAssociateResultStatus() {
        return associateResultStatus;
    }

    public void setAssociateResultStatus(Integer associateResultStatus) {
        this.associateResultStatus = associateResultStatus;
    }

    public Integer getAssociateCustomsStatus() {
        return associateCustomsStatus;
    }

    public void setAssociateCustomsStatus(Integer associateCustomsStatus) {
        this.associateCustomsStatus = associateCustomsStatus;
    }

    public String getAssociatedPushRemark() {
        return associatedPushRemark;
    }

    public void setAssociatedPushRemark(String associatedPushRemark) {
        this.associatedPushRemark = associatedPushRemark == null ? null : associatedPushRemark.trim();
    }

    public Date getAssociatedPushTime() {
        return associatedPushTime;
    }

    public void setAssociatedPushTime(Date associatedPushTime) {
        this.associatedPushTime = associatedPushTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getVerDept() {
        return verDept;
    }

    public void setVerDept(String verDept) {
        this.verDept = verDept == null ? null : verDept.trim();
    }

    public String getPayTransactionId() {
        return payTransactionId;
    }

    public void setPayTransactionId(String payTransactionId) {
        this.payTransactionId = payTransactionId == null ? null : payTransactionId.trim();
    }

    public String getCustomsTradeNo() {
        return customsTradeNo;
    }

    public void setCustomsTradeNo(String customsTradeNo) {
        this.customsTradeNo = customsTradeNo == null ? null : customsTradeNo.trim();
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody == null ? null : requestBody.trim();
    }
}