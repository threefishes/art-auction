package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Material {
    private Integer materialId;

    private Integer commonId;

    private Integer memberId;

    private String memberName;

    private String avatar;

    private String images;

    private Date createTime;

    private String videoUrl;

    private String videoId;

    private Integer materialType;

    private Integer materialShareType;

    private Integer isHot;

    private String videoImage;

    private Integer isVisible;

    private Integer shareNum;

    private Integer videoAlbumFilesId;

    private Integer isDel;

    private Integer isAudit;

    private String materialBody;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public Integer getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    public Integer getMaterialShareType() {
        return materialShareType;
    }

    public void setMaterialShareType(Integer materialShareType) {
        this.materialShareType = materialShareType;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage == null ? null : videoImage.trim();
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    public Integer getVideoAlbumFilesId() {
        return videoAlbumFilesId;
    }

    public void setVideoAlbumFilesId(Integer videoAlbumFilesId) {
        this.videoAlbumFilesId = videoAlbumFilesId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
    }

    public String getMaterialBody() {
        return materialBody;
    }

    public void setMaterialBody(String materialBody) {
        this.materialBody = materialBody == null ? null : materialBody.trim();
    }
}