package cn.threefishes.cloudrepository.entity;

public class ImLinkMan {
    private Integer linkId;

    private Integer commonId;

    private String linkManAvatar;

    private Integer linkManId;

    private String linkManName;

    private Integer linkManStoreId;

    private String linkManStoreName;

    private Integer linkState;

    private Integer memberDel;

    private Integer sellerDel;

    private String userAvatar;

    private Integer userId;

    private String userName;

    private Integer userType;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getLinkManAvatar() {
        return linkManAvatar;
    }

    public void setLinkManAvatar(String linkManAvatar) {
        this.linkManAvatar = linkManAvatar == null ? null : linkManAvatar.trim();
    }

    public Integer getLinkManId() {
        return linkManId;
    }

    public void setLinkManId(Integer linkManId) {
        this.linkManId = linkManId;
    }

    public String getLinkManName() {
        return linkManName;
    }

    public void setLinkManName(String linkManName) {
        this.linkManName = linkManName == null ? null : linkManName.trim();
    }

    public Integer getLinkManStoreId() {
        return linkManStoreId;
    }

    public void setLinkManStoreId(Integer linkManStoreId) {
        this.linkManStoreId = linkManStoreId;
    }

    public String getLinkManStoreName() {
        return linkManStoreName;
    }

    public void setLinkManStoreName(String linkManStoreName) {
        this.linkManStoreName = linkManStoreName == null ? null : linkManStoreName.trim();
    }

    public Integer getLinkState() {
        return linkState;
    }

    public void setLinkState(Integer linkState) {
        this.linkState = linkState;
    }

    public Integer getMemberDel() {
        return memberDel;
    }

    public void setMemberDel(Integer memberDel) {
        this.memberDel = memberDel;
    }

    public Integer getSellerDel() {
        return sellerDel;
    }

    public void setSellerDel(Integer sellerDel) {
        this.sellerDel = sellerDel;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}