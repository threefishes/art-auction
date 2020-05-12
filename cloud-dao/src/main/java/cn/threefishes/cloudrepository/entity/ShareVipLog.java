package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ShareVipLog {
    private Integer vipLogId;

    private Integer memberId;

    private String avatar;

    private String nickName;

    private BigDecimal giftsPrice;

    private String imageUrl;

    private Date updateTime;

    public Integer getVipLogId() {
        return vipLogId;
    }

    public void setVipLogId(Integer vipLogId) {
        this.vipLogId = vipLogId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public BigDecimal getGiftsPrice() {
        return giftsPrice;
    }

    public void setGiftsPrice(BigDecimal giftsPrice) {
        this.giftsPrice = giftsPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}