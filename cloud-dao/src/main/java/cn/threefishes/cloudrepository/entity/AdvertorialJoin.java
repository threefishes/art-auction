package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class AdvertorialJoin {
    private Integer memberId;

    private Date addTime;

    private String authorName;

    private Date handleTime;

    private String idCartBackImage;

    private String idCartFrontImage;

    private String idCartHandImage;

    private String idCartNumber;

    private String memberName;

    private String message;

    private String realName;

    private Integer state;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}