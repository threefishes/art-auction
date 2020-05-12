package cn.threefishes.cloudrepository.entity;

public class ApiSpecial {
    private Integer specialId;

    private String specialDesc;

    private String shareTitle;

    private String shareDesc;

    private String shareImgurl;

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public String getSpecialDesc() {
        return specialDesc;
    }

    public void setSpecialDesc(String specialDesc) {
        this.specialDesc = specialDesc == null ? null : specialDesc.trim();
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc == null ? null : shareDesc.trim();
    }

    public String getShareImgurl() {
        return shareImgurl;
    }

    public void setShareImgurl(String shareImgurl) {
        this.shareImgurl = shareImgurl == null ? null : shareImgurl.trim();
    }
}