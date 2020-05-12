package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class AdvertorialArtCommentReply {
    private Integer replyId;

    private Date addTime;

    private Integer articleId;

    private String articleTitle;

    private Integer commentId;

    private String content;

    private Integer memberId;

    private String memberName;

    private Integer replyMemberId;

    private String replyMemberName;

    private String replySuperContent;

    private Integer replySuperId;

    private Integer state;

    private String avatar;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public Integer getReplyMemberId() {
        return replyMemberId;
    }

    public void setReplyMemberId(Integer replyMemberId) {
        this.replyMemberId = replyMemberId;
    }

    public String getReplyMemberName() {
        return replyMemberName;
    }

    public void setReplyMemberName(String replyMemberName) {
        this.replyMemberName = replyMemberName == null ? null : replyMemberName.trim();
    }

    public String getReplySuperContent() {
        return replySuperContent;
    }

    public void setReplySuperContent(String replySuperContent) {
        this.replySuperContent = replySuperContent == null ? null : replySuperContent.trim();
    }

    public Integer getReplySuperId() {
        return replySuperId;
    }

    public void setReplySuperId(Integer replySuperId) {
        this.replySuperId = replySuperId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }
}