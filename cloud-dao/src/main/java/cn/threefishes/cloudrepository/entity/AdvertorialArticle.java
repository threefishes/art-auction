package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class AdvertorialArticle {
    private Integer articleId;

    private Date addTime;

    private String authorAvatar;

    private String authorName;

    private String bannerImage;

    private Integer bannerImageWidth;

    private Integer bannerImageHeight;

    private Integer categoryId;

    private Integer commentNum;

    private Integer enterDetailPageView;

    private Integer followNum;

    private Integer goodCount;

    private Date handleTime;

    private Integer linkNum;

    private Integer memberId;

    private Integer pageView;

    private Integer recommend;

    private String remark;

    private Integer shareNum;

    private Integer state;

    private String subTitle;

    private String title;

    private Integer type;

    private String videoUrl;

    private String videoImage;

    private String vodFilesId;

    private Integer flagType;

    private Integer flagId;

    private String flagName;

    private Integer downloadNum;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(String authorAvatar) {
        this.authorAvatar = authorAvatar == null ? null : authorAvatar.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage == null ? null : bannerImage.trim();
    }

    public Integer getBannerImageWidth() {
        return bannerImageWidth;
    }

    public void setBannerImageWidth(Integer bannerImageWidth) {
        this.bannerImageWidth = bannerImageWidth;
    }

    public Integer getBannerImageHeight() {
        return bannerImageHeight;
    }

    public void setBannerImageHeight(Integer bannerImageHeight) {
        this.bannerImageHeight = bannerImageHeight;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getEnterDetailPageView() {
        return enterDetailPageView;
    }

    public void setEnterDetailPageView(Integer enterDetailPageView) {
        this.enterDetailPageView = enterDetailPageView;
    }

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getLinkNum() {
        return linkNum;
    }

    public void setLinkNum(Integer linkNum) {
        this.linkNum = linkNum;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage == null ? null : videoImage.trim();
    }

    public String getVodFilesId() {
        return vodFilesId;
    }

    public void setVodFilesId(String vodFilesId) {
        this.vodFilesId = vodFilesId == null ? null : vodFilesId.trim();
    }

    public Integer getFlagType() {
        return flagType;
    }

    public void setFlagType(Integer flagType) {
        this.flagType = flagType;
    }

    public Integer getFlagId() {
        return flagId;
    }

    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName == null ? null : flagName.trim();
    }

    public Integer getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }
}