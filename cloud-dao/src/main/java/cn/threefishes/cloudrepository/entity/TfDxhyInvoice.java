package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TfDxhyInvoice {
    private String serialNumber;

    private Integer ordersId;

    private Long ordersSn;

    private String invoiceJson;

    private String invoiceReturnJson;

    private Date invoiceTime;

    private String refundId;

    private String pushJson;

    private String pushResponseStatus;

    private Date invoicePushTime;

    private String invoicePdf;

    private Integer isInvoice;

    private Integer type;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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

    public String getInvoiceJson() {
        return invoiceJson;
    }

    public void setInvoiceJson(String invoiceJson) {
        this.invoiceJson = invoiceJson == null ? null : invoiceJson.trim();
    }

    public String getInvoiceReturnJson() {
        return invoiceReturnJson;
    }

    public void setInvoiceReturnJson(String invoiceReturnJson) {
        this.invoiceReturnJson = invoiceReturnJson == null ? null : invoiceReturnJson.trim();
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getPushJson() {
        return pushJson;
    }

    public void setPushJson(String pushJson) {
        this.pushJson = pushJson == null ? null : pushJson.trim();
    }

    public String getPushResponseStatus() {
        return pushResponseStatus;
    }

    public void setPushResponseStatus(String pushResponseStatus) {
        this.pushResponseStatus = pushResponseStatus == null ? null : pushResponseStatus.trim();
    }

    public Date getInvoicePushTime() {
        return invoicePushTime;
    }

    public void setInvoicePushTime(Date invoicePushTime) {
        this.invoicePushTime = invoicePushTime;
    }

    public String getInvoicePdf() {
        return invoicePdf;
    }

    public void setInvoicePdf(String invoicePdf) {
        this.invoicePdf = invoicePdf == null ? null : invoicePdf.trim();
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}