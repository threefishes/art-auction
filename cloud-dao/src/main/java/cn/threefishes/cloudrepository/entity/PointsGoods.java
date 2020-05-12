package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class PointsGoods {
    private Integer pointsGoodsId;

    private Integer commonId;

    private Date createTime;

    private Integer expendPoints;

    private Integer goodsClick;

    private Integer limitMemberGradeLevel;

    private String limitMemberGradeName;

    private Integer storeId;

    public Integer getPointsGoodsId() {
        return pointsGoodsId;
    }

    public void setPointsGoodsId(Integer pointsGoodsId) {
        this.pointsGoodsId = pointsGoodsId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getExpendPoints() {
        return expendPoints;
    }

    public void setExpendPoints(Integer expendPoints) {
        this.expendPoints = expendPoints;
    }

    public Integer getGoodsClick() {
        return goodsClick;
    }

    public void setGoodsClick(Integer goodsClick) {
        this.goodsClick = goodsClick;
    }

    public Integer getLimitMemberGradeLevel() {
        return limitMemberGradeLevel;
    }

    public void setLimitMemberGradeLevel(Integer limitMemberGradeLevel) {
        this.limitMemberGradeLevel = limitMemberGradeLevel;
    }

    public String getLimitMemberGradeName() {
        return limitMemberGradeName;
    }

    public void setLimitMemberGradeName(String limitMemberGradeName) {
        this.limitMemberGradeName = limitMemberGradeName == null ? null : limitMemberGradeName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}