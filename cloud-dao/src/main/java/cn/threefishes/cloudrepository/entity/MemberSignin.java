package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class MemberSignin {
    private Integer signinId;

    private Date signinAddTime;

    private Integer signinDays;

    private String signinMemberAvatar;

    private Integer signinMemberId;

    private String signinMemberName;

    private Integer signinPoints;

    public Integer getSigninId() {
        return signinId;
    }

    public void setSigninId(Integer signinId) {
        this.signinId = signinId;
    }

    public Date getSigninAddTime() {
        return signinAddTime;
    }

    public void setSigninAddTime(Date signinAddTime) {
        this.signinAddTime = signinAddTime;
    }

    public Integer getSigninDays() {
        return signinDays;
    }

    public void setSigninDays(Integer signinDays) {
        this.signinDays = signinDays;
    }

    public String getSigninMemberAvatar() {
        return signinMemberAvatar;
    }

    public void setSigninMemberAvatar(String signinMemberAvatar) {
        this.signinMemberAvatar = signinMemberAvatar == null ? null : signinMemberAvatar.trim();
    }

    public Integer getSigninMemberId() {
        return signinMemberId;
    }

    public void setSigninMemberId(Integer signinMemberId) {
        this.signinMemberId = signinMemberId;
    }

    public String getSigninMemberName() {
        return signinMemberName;
    }

    public void setSigninMemberName(String signinMemberName) {
        this.signinMemberName = signinMemberName == null ? null : signinMemberName.trim();
    }

    public Integer getSigninPoints() {
        return signinPoints;
    }

    public void setSigninPoints(Integer signinPoints) {
        this.signinPoints = signinPoints;
    }
}