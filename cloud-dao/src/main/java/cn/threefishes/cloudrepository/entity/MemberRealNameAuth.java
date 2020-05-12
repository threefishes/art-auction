package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class MemberRealNameAuth {
    private Integer memberId;

    private Date authAddTime;

    private Date authHandleTime;

    private String authMessage;

    private String authRealName;

    private Integer authState;

    private String idCartBackImage;

    private String idCartFrontImage;

    private String idCartHandImage;

    private String idCartNumber;

    private String memberName;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getAuthAddTime() {
        return authAddTime;
    }

    public void setAuthAddTime(Date authAddTime) {
        this.authAddTime = authAddTime;
    }

    public Date getAuthHandleTime() {
        return authHandleTime;
    }

    public void setAuthHandleTime(Date authHandleTime) {
        this.authHandleTime = authHandleTime;
    }

    public String getAuthMessage() {
        return authMessage;
    }

    public void setAuthMessage(String authMessage) {
        this.authMessage = authMessage == null ? null : authMessage.trim();
    }

    public String getAuthRealName() {
        return authRealName;
    }

    public void setAuthRealName(String authRealName) {
        this.authRealName = authRealName == null ? null : authRealName.trim();
    }

    public Integer getAuthState() {
        return authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public String getIdCartBackImage() {
        return idCartBackImage;
    }

    public void setIdCartBackImage(String idCartBackImage) {
        this.idCartBackImage = idCartBackImage == null ? null : idCartBackImage.trim();
    }

    public String getIdCartFrontImage() {
        return idCartFrontImage;
    }

    public void setIdCartFrontImage(String idCartFrontImage) {
        this.idCartFrontImage = idCartFrontImage == null ? null : idCartFrontImage.trim();
    }

    public String getIdCartHandImage() {
        return idCartHandImage;
    }

    public void setIdCartHandImage(String idCartHandImage) {
        this.idCartHandImage = idCartHandImage == null ? null : idCartHandImage.trim();
    }

    public String getIdCartNumber() {
        return idCartNumber;
    }

    public void setIdCartNumber(String idCartNumber) {
        this.idCartNumber = idCartNumber == null ? null : idCartNumber.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }
}