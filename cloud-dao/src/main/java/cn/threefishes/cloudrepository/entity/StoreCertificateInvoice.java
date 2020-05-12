package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class StoreCertificateInvoice {
    private Integer sellerId;

    private String taxpayerId;

    private String taxpayerName;

    private String companyAddressDetail;

    private String companyPhone;

    private String bankName;

    private String bankAccountNumber;

    private Integer companyAddressId;

    private Date registerTime;

    private String response;

    private Integer isRegister;

    private String pushJson;

    private Date pushTime;

    private Integer status;

    private Integer isPaperInvoice;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId == null ? null : taxpayerId.trim();
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName == null ? null : taxpayerName.trim();
    }

    public String getCompanyAddressDetail() {
        return companyAddressDetail;
    }

    public void setCompanyAddressDetail(String companyAddressDetail) {
        this.companyAddressDetail = companyAddressDetail == null ? null : companyAddressDetail.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber == null ? null : bankAccountNumber.trim();
    }

    public Integer getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Integer companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public Integer getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Integer isRegister) {
        this.isRegister = isRegister;
    }

    public String getPushJson() {
        return pushJson;
    }

    public void setPushJson(String pushJson) {
        this.pushJson = pushJson == null ? null : pushJson.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsPaperInvoice() {
        return isPaperInvoice;
    }

    public void setIsPaperInvoice(Integer isPaperInvoice) {
        this.isPaperInvoice = isPaperInvoice;
    }
}