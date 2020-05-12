package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Distributor {
    private Integer distributorId;

    private String accountType;

    private String bankAccountName;

    private String bankAccountNumber;

    private String bindEmail;

    private String bindPhone;

    private BigDecimal commissionAvailable;

    private BigDecimal commissionFreeze;

    private Integer defaultFavoritesId;

    private BigDecimal distributionAmount;

    private Integer distributionOrdersCount;

    private String idCartBackImage;

    private String idCartFrontImage;

    private String idCartHandImage;

    private String idCartNumber;

    private Date joininTime;

    private Date lastLoginTime;

    private Integer memberId;

    private String memberName;

    private BigDecimal payCommission;

    private String payPerson;

    private String realName;

    private Integer state;

    private BigDecimal unpayCommission;

    private String backImg;

    private String weixinNumber;

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber == null ? null : bankAccountNumber.trim();
    }

    public String getBindEmail() {
        return bindEmail;
    }

    public void setBindEmail(String bindEmail) {
        this.bindEmail = bindEmail == null ? null : bindEmail.trim();
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone == null ? null : bindPhone.trim();
    }

    public BigDecimal getCommissionAvailable() {
        return commissionAvailable;
    }

    public void setCommissionAvailable(BigDecimal commissionAvailable) {
        this.commissionAvailable = commissionAvailable;
    }

    public BigDecimal getCommissionFreeze() {
        return commissionFreeze;
    }

    public void setCommissionFreeze(BigDecimal commissionFreeze) {
        this.commissionFreeze = commissionFreeze;
    }

    public Integer getDefaultFavoritesId() {
        return defaultFavoritesId;
    }

    public void setDefaultFavoritesId(Integer defaultFavoritesId) {
        this.defaultFavoritesId = defaultFavoritesId;
    }

    public BigDecimal getDistributionAmount() {
        return distributionAmount;
    }

    public void setDistributionAmount(BigDecimal distributionAmount) {
        this.distributionAmount = distributionAmount;
    }

    public Integer getDistributionOrdersCount() {
        return distributionOrdersCount;
    }

    public void setDistributionOrdersCount(Integer distributionOrdersCount) {
        this.distributionOrdersCount = distributionOrdersCount;
    }

    public String getIdCartBackImage() {
        return idCartBackImage;
    }

    public void setIdCartBackImage(String idCartBackImage) {
        this.idCartBackImage = idCartBackImage == null ? null : idCartBackImage.trim();
    }

    public String getIdCartFrontImage() {
        return idCartFrontImage;
    }

    public void setIdCartFrontImage(String idCartFrontImage) {
        this.idCartFrontImage = idCartFrontImage == null ? null : idCartFrontImage.trim();
    }

    public String getIdCartHandImage() {
        return idCartHandImage;
    }

    public void setIdCartHandImage(String idCartHandImage) {
        this.idCartHandImage = idCartHandImage == null ? null : idCartHandImage.trim();
    }

    public String getIdCartNumber() {
        return idCartNumber;
    }

    public void setIdCartNumber(String idCartNumber) {
        this.idCartNumber = idCartNumber == null ? null : idCartNumber.trim();
    }

    public Date getJoininTime() {
        return joininTime;
    }

    public void setJoininTime(Date joininTime) {
        this.joininTime = joininTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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

    public BigDecimal getPayCommission() {
        return payCommission;
    }

    public void setPayCommission(BigDecimal payCommission) {
        this.payCommission = payCommission;
    }

    public String getPayPerson() {
        return payPerson;
    }

    public void setPayPerson(String payPerson) {
        this.payPerson = payPerson == null ? null : payPerson.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getUnpayCommission() {
        return unpayCommission;
    }

    public void setUnpayCommission(BigDecimal unpayCommission) {
        this.unpayCommission = unpayCommission;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg == null ? null : backImg.trim();
    }

    public String getWeixinNumber() {
        return weixinNumber;
    }

    public void setWeixinNumber(String weixinNumber) {
        this.weixinNumber = weixinNumber == null ? null : weixinNumber.trim();
    }
}