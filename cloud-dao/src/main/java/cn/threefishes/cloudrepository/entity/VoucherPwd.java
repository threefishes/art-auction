package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class VoucherPwd {
    private Integer pwdId;

    private Date activeTime;

    private Integer memberId;

    private String memberName;

    private String pwdCode;

    private Integer templateId;

    public Integer getPwdId() {
        return pwdId;
    }

    public void setPwdId(Integer pwdId) {
        this.pwdId = pwdId;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getPwdCode() {
        return pwdCode;
    }

    public void setPwdCode(String pwdCode) {
        this.pwdCode = pwdCode == null ? null : pwdCode.trim();
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
}