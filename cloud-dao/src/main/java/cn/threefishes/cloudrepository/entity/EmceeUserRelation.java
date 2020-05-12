package cn.threefishes.cloudrepository.entity;

public class EmceeUserRelation {
    private Integer id;

    private Integer emceeId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmceeId() {
        return emceeId;
    }

    public void setEmceeId(Integer emceeId) {
        this.emceeId = emceeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}