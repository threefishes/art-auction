package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacketRainLuckilyDetail {
    private Integer id;

    private Integer rainId;

    private String rainNum;

    private String rainName;

    private Integer memberId;

    private String memberName;

    private Integer prizeId;

    private String prizeDesc;

    private Integer prizeType;

    private BigDecimal price;

    private Integer storeId;

    private Integer getPrize;

    private Date getPrizeTime;

    private Date prizeExpireTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRainId() {
        return rainId;
    }

    public void setRainId(Integer rainId) {
        this.rainId = rainId;
    }

    public String getRainNum() {
        return rainNum;
    }

    public void setRainNum(String rainNum) {
        this.rainNum = rainNum == null ? null : rainNum.trim();
    }

    public String getRainName() {
        return rainName;
    }

    public void setRainName(String rainName) {
        this.rainName = rainName == null ? null : rainName.trim();
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

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeDesc() {
        return prizeDesc;
    }

    public void setPrizeDesc(String prizeDesc) {
        this.prizeDesc = prizeDesc == null ? null : prizeDesc.trim();
    }

    public Integer getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(Integer prizeType) {
        this.prizeType = prizeType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGetPrize() {
        return getPrize;
    }

    public void setGetPrize(Integer getPrize) {
        this.getPrize = getPrize;
    }

    public Date getGetPrizeTime() {
        return getPrizeTime;
    }

    public void setGetPrizeTime(Date getPrizeTime) {
        this.getPrizeTime = getPrizeTime;
    }

    public Date getPrizeExpireTime() {
        return prizeExpireTime;
    }

    public void setPrizeExpireTime(Date prizeExpireTime) {
        this.prizeExpireTime = prizeExpireTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}