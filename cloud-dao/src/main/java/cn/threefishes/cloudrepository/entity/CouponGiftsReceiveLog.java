package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CouponGiftsReceiveLog {
    private Integer logId;

    private Date activeTime;

    private Integer giftsId;

    private String giftsName;

    private BigDecimal giftsPrice;

    private String logContent;

    private Integer memberId;

    private String memberName;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getGiftsId() {
        return giftsId;
    }

    public void setGiftsId(Integer giftsId) {
        this.giftsId = giftsId;
    }

    public String getGiftsName() {
        return giftsName;
    }

    public void setGiftsName(String giftsName) {
        this.giftsName = giftsName == null ? null : giftsName.trim();
    }

    public BigDecimal getGiftsPrice() {
        return giftsPrice;
    }

    public void setGiftsPrice(BigDecimal giftsPrice) {
        this.giftsPrice = giftsPrice;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
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
}