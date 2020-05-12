package cn.threefishes.cloudrepository.entity;

public class TfMessageTemplateWeixin {
    private Integer messageId;

    private String tplCode;

    private String tplName;

    private String weixinTemplateId;

    private String ownerTemplateId;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode == null ? null : tplCode.trim();
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName == null ? null : tplName.trim();
    }

    public String getWeixinTemplateId() {
        return weixinTemplateId;
    }

    public void setWeixinTemplateId(String weixinTemplateId) {
        this.weixinTemplateId = weixinTemplateId == null ? null : weixinTemplateId.trim();
    }

    public String getOwnerTemplateId() {
        return ownerTemplateId;
    }

    public void setOwnerTemplateId(String ownerTemplateId) {
        this.ownerTemplateId = ownerTemplateId == null ? null : ownerTemplateId.trim();
    }
}