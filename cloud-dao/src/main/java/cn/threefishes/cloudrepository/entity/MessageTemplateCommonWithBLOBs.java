package cn.threefishes.cloudrepository.entity;

public class MessageTemplateCommonWithBLOBs extends MessageTemplateCommon {
    private String emailContent;

    private String noticeContent;

    private String weixinDataParams;

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public String getWeixinDataParams() {
        return weixinDataParams;
    }

    public void setWeixinDataParams(String weixinDataParams) {
        this.weixinDataParams = weixinDataParams == null ? null : weixinDataParams.trim();
    }
}