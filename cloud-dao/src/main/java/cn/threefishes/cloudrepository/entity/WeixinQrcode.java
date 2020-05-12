package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class WeixinQrcode {
    private Integer codeId;

    private Date addTime;

    private String codeExplain;

    private String codeTitle;

    private Integer expireSeconds;

    private String handleType;

    private String qrcodeTicket;

    private String qrcodeUrl;

    private Integer sceneId;

    private String handleParams;

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getCodeExplain() {
        return codeExplain;
    }

    public void setCodeExplain(String codeExplain) {
        this.codeExplain = codeExplain == null ? null : codeExplain.trim();
    }

    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle == null ? null : codeTitle.trim();
    }

    public Integer getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType == null ? null : handleType.trim();
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

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getHandleParams() {
        return handleParams;
    }

    public void setHandleParams(String handleParams) {
        this.handleParams = handleParams == null ? null : handleParams.trim();
    }
}