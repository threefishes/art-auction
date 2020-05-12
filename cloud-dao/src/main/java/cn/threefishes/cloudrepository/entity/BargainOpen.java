package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BargainOpen {
    private Integer openId;

    private String avatar;

    private Integer bargainId;

    private Integer bargainTimes;

    private Date createTime;

    private Integer memberId;

    private String memberName;

    private BigDecimal openPrice;

    private Integer paymentState;

    public Integer getOpenId() {
        return openId;
    }

    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getBargainId() {
        return bargainId;
    }

    public void setBargainId(Integer bargainId) {
        this.bargainId = bargainId;
    }

    public Integer getBargainTimes() {
        return bargainTimes;
    }

    public void setBargainTimes(Integer bargainTimes) {
        this.bargainTimes = bargainTimes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }
}