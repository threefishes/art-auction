package cn.threefishes.cloudrepository.entity;

public class Payment {
    private Integer paymentId;

    private String clientType;

    private String clientTypeText;

    private String paymentCode;

    private String paymentInfo;

    private String paymentName;

    private Integer paymentState;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public String getClientTypeText() {
        return clientTypeText;
    }

    public void setClientTypeText(String clientTypeText) {
        this.clientTypeText = clientTypeText == null ? null : clientTypeText.trim();
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo == null ? null : paymentInfo.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }
}