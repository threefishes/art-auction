package cn.threefishes.cloudrepository.entity;

public class MessageTemplateCommon {
    private Integer templateCommonId;

    private String tplCode;

    private Integer emailState;

    private String emailTitle;

    private String smsContent;

    private Integer smsState;

    private Integer tplClass;

    private String tplName;

    private Integer tplType;

    private String weixinMpTemplateId;

    private String weixinMpTemplateStoreId;

    private String weixinMpTemplateStoreTitle;

    private Integer weixinState;

    private String weixinTemplateUrl;

    private String huaweiTplCode;

    public Integer getTemplateCommonId() {
        return templateCommonId;
    }

    public void setTemplateCommonId(Integer templateCommonId) {
        this.templateCommonId = templateCommonId;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode == null ? null : tplCode.trim();
    }

    public Integer getEmailState() {
        return emailState;
    }

    public void setEmailState(Integer emailState) {
        this.emailState = emailState;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle == null ? null : emailTitle.trim();
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent == null ? null : smsContent.trim();
    }

    public Integer getSmsState() {
        return smsState;
    }

    public void setSmsState(Integer smsState) {
        this.smsState = smsState;
    }

    public Integer getTplClass() {
        return tplClass;
    }

    public void setTplClass(Integer tplClass) {
        this.tplClass = tplClass;
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName == null ? null : tplName.trim();
    }

    public Integer getTplType() {
        return tplType;
    }

    public void setTplType(Integer tplType) {
        this.tplType = tplType;
    }

    public String getWeixinMpTemplateId() {
        return weixinMpTemplateId;
    }

    public void setWeixinMpTemplateId(String weixinMpTemplateId) {
        this.weixinMpTemplateId = weixinMpTemplateId == null ? null : weixinMpTemplateId.trim();
    }

    public String getWeixinMpTemplateStoreId() {
        return weixinMpTemplateStoreId;
    }

    public void setWeixinMpTemplateStoreId(String weixinMpTemplateStoreId) {
        this.weixinMpTemplateStoreId = weixinMpTemplateStoreId == null ? null : weixinMpTemplateStoreId.trim();
    }

    public String getWeixinMpTemplateStoreTitle() {
        return weixinMpTemplateStoreTitle;
    }

    public void setWeixinMpTemplateStoreTitle(String weixinMpTemplateStoreTitle) {
        this.weixinMpTemplateStoreTitle = weixinMpTemplateStoreTitle == null ? null : weixinMpTemplateStoreTitle.trim();
    }

    public Integer getWeixinState() {
        return weixinState;
    }

    public void setWeixinState(Integer weixinState) {
        this.weixinState = weixinState;
    }

    public String getWeixinTemplateUrl() {
        return weixinTemplateUrl;
    }

    public void setWeixinTemplateUrl(String weixinTemplateUrl) {
        this.weixinTemplateUrl = weixinTemplateUrl == null ? null : weixinTemplateUrl.trim();
    }

    public String getHuaweiTplCode() {
        return huaweiTplCode;
    }

    public void setHuaweiTplCode(String huaweiTplCode) {
        this.huaweiTplCode = huaweiTplCode == null ? null : huaweiTplCode.trim();
    }
}