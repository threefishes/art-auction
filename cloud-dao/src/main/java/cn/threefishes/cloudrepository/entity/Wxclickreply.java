package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Wxclickreply {
    private Integer crId;

    private String crTitle;

    private String crNote;

    private String crContent;

    private String crCode;

    private Integer wxId;

    private Integer crType;

    private Date crAddTime;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public String getCrTitle() {
        return crTitle;
    }

    public void setCrTitle(String crTitle) {
        this.crTitle = crTitle == null ? null : crTitle.trim();
    }

    public String getCrNote() {
        return crNote;
    }

    public void setCrNote(String crNote) {
        this.crNote = crNote == null ? null : crNote.trim();
    }

    public String getCrContent() {
        return crContent;
    }

    public void setCrContent(String crContent) {
        this.crContent = crContent == null ? null : crContent.trim();
    }

    public String getCrCode() {
        return crCode;
    }

    public void setCrCode(String crCode) {
        this.crCode = crCode == null ? null : crCode.trim();
    }

    public Integer getWxId() {
        return wxId;
    }

    public void setWxId(Integer wxId) {
        this.wxId = wxId;
    }

    public Integer getCrType() {
        return crType;
    }

    public void setCrType(Integer crType) {
        this.crType = crType;
    }

    public Date getCrAddTime() {
        return crAddTime;
    }

    public void setCrAddTime(Date crAddTime) {
        this.crAddTime = crAddTime;
    }
}