package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ShowOrders {
    private Integer showOrdersId;

    private Date addTime;

    private Integer memberId;

    private String memberName;

    private Integer musicAuto;

    private Integer musicId;

    private Integer readCount;

    private Integer recommend;

    private Integer recommendJoin;

    private Date recommendTime;

    private Integer state;

    private Integer templateId;

    private String titleImage;

    private String titleText;

    private Integer zanCount;

    public Integer getShowOrdersId() {
        return showOrdersId;
    }

    public void setShowOrdersId(Integer showOrdersId) {
        this.showOrdersId = showOrdersId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
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

    public Integer getMusicAuto() {
        return musicAuto;
    }

    public void setMusicAuto(Integer musicAuto) {
        this.musicAuto = musicAuto;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getRecommendJoin() {
        return recommendJoin;
    }

    public void setRecommendJoin(Integer recommendJoin) {
        this.recommendJoin = recommendJoin;
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage == null ? null : titleImage.trim();
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText == null ? null : titleText.trim();
    }

    public Integer getZanCount() {
        return zanCount;
    }

    public void setZanCount(Integer zanCount) {
        this.zanCount = zanCount;
    }
}