package cn.threefishes.cloudrepository.entity;

public class AdvertorialArticleCommentReply_like {
    private Long id;

    private Integer articleId;

    private Integer commentId;

    private Integer replyId;

    private Integer likeMemberId;

    private Integer deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getLikeMemberId() {
        return likeMemberId;
    }

    public void setLikeMemberId(Integer likeMemberId) {
        this.likeMemberId = likeMemberId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}