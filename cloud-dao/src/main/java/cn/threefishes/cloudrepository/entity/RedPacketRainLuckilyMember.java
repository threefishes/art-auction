package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class RedPacketRainLuckilyMember {
    private Integer id;

    private Integer memberId;

    private String memberName;

    private Integer joinNum;

    private Integer rainNum;

    private Long couponNum;

    private Long voucherNum;

    private Integer giftNum;

    private String receiveName;

    private String receivePhone;

    private String receiveArea;

    private String receiveAddress;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    public Integer getRainNum() {
        return rainNum;
    }

    public void setRainNum(Integer rainNum) {
        this.rainNum = rainNum;
    }

    public Long getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Long couponNum) {
        this.couponNum = couponNum;
    }

    public Long getVoucherNum() {
        return voucherNum;
    }

    public void setVoucherNum(Long voucherNum) {
        this.voucherNum = voucherNum;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveArea() {
        return receiveArea;
    }

    public void setReceiveArea(String receiveArea) {
        this.receiveArea = receiveArea == null ? null : receiveArea.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}