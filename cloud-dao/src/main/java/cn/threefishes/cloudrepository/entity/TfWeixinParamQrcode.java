package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TfWeixinParamQrcode {
    private Integer codeId;

    private Integer codeParam;

    private String codeTitle;

    private String codeExplain;

    private String qrcodeTicket;

    private String qrcodeUrl;

    private Date addTime;

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public Integer getCodeParam() {
        return codeParam;
    }

    public void setCodeParam(Integer codeParam) {
        this.codeParam = codeParam;
    }

    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle == null ? null : codeTitle.trim();
    }

    public String getCodeExplain() {
        return codeExplain;
    }

    public void setCodeExplain(String codeExplain) {
        this.codeExplain = codeExplain == null ? null : codeExplain.trim();
    }

    public String getQrcodeTicket() {
        return qrcodeTicket;
    }

    public void setQrcodeTicket(String qrcodeTicket) {
        this.qrcodeTicket = qrcodeTicket == null ? null : qrcodeTicket.trim();
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl == null ? null : qrcodeUrl.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}