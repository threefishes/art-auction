package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class MemberReal {
    private Integer realId;

    private String realName;

    private String mobile;

    private String identity;

    private Integer authState;

    private String status;

    private Integer memberId;

    private String bankName;

    private String bankAccount;

    private String oldBankName;

    private String oldBankAccount;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Date authHandleTime;

    private String errorCode;

    private String errorMsg;

    private String workNumber;

    public Integer getRealId() {
        return realId;
    }

    public void setRealId(Integer realId) {
        this.realId = realId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Integer getAuthState() {
        return authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getOldBankName() {
        return oldBankName;
    }

    public void setOldBankName(String oldBankName) {
        this.oldBankName = oldBankName == null ? null : oldBankName.trim();
    }

    public String getOldBankAccount() {
        return oldBankAccount;
    }

    public void setOldBankAccount(String oldBankAccount) {
        this.oldBankAccount = oldBankAccount == null ? null : oldBankAccount.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAuthHandleTime() {
        return authHandleTime;
    }

    public void setAuthHandleTime(Date authHandleTime) {
        this.authHandleTime = authHandleTime;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber == null ? null : workNumber.trim();
    }
}