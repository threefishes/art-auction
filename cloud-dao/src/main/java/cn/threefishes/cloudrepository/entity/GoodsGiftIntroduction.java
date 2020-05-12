package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class GoodsGiftIntroduction {
    private Integer id;

    private Integer dwId;

    private Long dwPromotionId;

    private String introduction;

    private Date beginTime;

    private Date endTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDwId() {
        return dwId;
    }

    public void setDwId(Integer dwId) {
        this.dwId = dwId;
    }

    public Long getDwPromotionId() {
        return dwPromotionId;
    }

    public void setDwPromotionId(Long dwPromotionId) {
        this.dwPromotionId = dwPromotionId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}