package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class CouponPwd {
    private Integer pwdId;

    private Date activeTime;

    private Integer activityId;

    private Integer memberId;

    private String memberName;

    private String pwdCode;

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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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
}