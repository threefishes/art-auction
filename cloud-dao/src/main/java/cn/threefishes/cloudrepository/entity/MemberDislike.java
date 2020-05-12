package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class MemberDislike {
    private Integer id;

    private Integer memberId;

    private Integer dislikeMemberId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getDislikeMemberId() {
        return dislikeMemberId;
    }

    public void setDislikeMemberId(Integer dislikeMemberId) {
        this.dislikeMemberId = dislikeMemberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}