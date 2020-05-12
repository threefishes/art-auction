package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class DistributorJoin {
    private Integer memberId;

    private String accountType;

    private String bankAccountName;

    private String bankAccountNumber;

    private Date handleTime;

    private String idCartBackImage;

    private String idCartFrontImage;

    private String idCartHandImage;

    private String idCartNumber;

    private String joininMessage;

    private Date joininTime;

    private String memberName;

    private String payPerson;

    private String realName;

    private Integer state;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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

    public String getJoininMessage() {
        return joininMessage;
    }

    public void setJoininMessage(String joininMessage) {
        this.joininMessage = joininMessage == null ? null : joininMessage.trim();
    }

    public Date getJoininTime() {
        return joininTime;
    }

    public void setJoininTime(Date joininTime) {
        this.joininTime = joininTime;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
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
}