package cn.threefishes.cloudrepository.entity;

public class MessageTemplateSystem {
    private Integer templateSystemId;

    private String tplCode;

    private Integer sendType;

    private String tplContent;

    private String tplName;

    private String tplTitle;

    public Integer getTemplateSystemId() {
        return templateSystemId;
    }

    public void setTemplateSystemId(Integer templateSystemId) {
        this.templateSystemId = templateSystemId;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode == null ? null : tplCode.trim();
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public String getTplContent() {
        return tplContent;
    }

    public void setTplContent(String tplContent) {
        this.tplContent = tplContent == null ? null : tplContent.trim();
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName == null ? null : tplName.trim();
    }

    public String getTplTitle() {
        return tplTitle;
    }

    public void setTplTitle(String tplTitle) {
        this.tplTitle = tplTitle == null ? null : tplTitle.trim();
    }
}