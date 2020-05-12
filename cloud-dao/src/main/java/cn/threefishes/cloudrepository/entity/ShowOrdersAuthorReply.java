package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ShowOrdersAuthorReply {
    private Integer authorReplyId;

    private Date addTime;

    private Integer commentId;

    private String content;

    private Integer memberId;

    private String memberName;

    private Integer showOrdersId;

    private String showOrdersTitle;

    private Integer state;

    public Integer getAuthorReplyId() {
        return authorReplyId;
    }

    public void setAuthorReplyId(Integer authorReplyId) {
        this.authorReplyId = authorReplyId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
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

    public Integer getShowOrdersId() {
        return showOrdersId;
    }

    public void setShowOrdersId(Integer showOrdersId) {
        this.showOrdersId = showOrdersId;
    }

    public String getShowOrdersTitle() {
        return showOrdersTitle;
    }

    public void setShowOrdersTitle(String showOrdersTitle) {
        this.showOrdersTitle = showOrdersTitle == null ? null : showOrdersTitle.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}