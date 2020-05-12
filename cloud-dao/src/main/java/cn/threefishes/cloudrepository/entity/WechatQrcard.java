package cn.threefishes.cloudrepository.entity;

public class WechatQrcard {
    private Integer memberId;

    private String qrcardImg;

    private Integer imgWidth;

    private Integer imgHeight;

    private Integer isShow;

    private Integer superIsShow;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getQrcardImg() {
        return qrcardImg;
    }

    public void setQrcardImg(String qrcardImg) {
        this.qrcardImg = qrcardImg == null ? null : qrcardImg.trim();
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getSuperIsShow() {
        return superIsShow;
    }

    public void setSuperIsShow(Integer superIsShow) {
        this.superIsShow = superIsShow;
    }
}