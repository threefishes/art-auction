package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TfOdsUsersNumber {
    private Date datelist;

    private Integer newIosUser;

    private Integer newAndroidUser;

    private Integer liveIosUser;

    private Integer liveAndroidUser;

    private Integer accumulativeIosUser;

    private Integer accumulativeAndroidUser;

    public Date getDatelist() {
        return datelist;
    }

    public void setDatelist(Date datelist) {
        this.datelist = datelist;
    }

    public Integer getNewIosUser() {
        return newIosUser;
    }

    public void setNewIosUser(Integer newIosUser) {
        this.newIosUser = newIosUser;
    }

    public Integer getNewAndroidUser() {
        return newAndroidUser;
    }

    public void setNewAndroidUser(Integer newAndroidUser) {
        this.newAndroidUser = newAndroidUser;
    }

    public Integer getLiveIosUser() {
        return liveIosUser;
    }

    public void setLiveIosUser(Integer liveIosUser) {
        this.liveIosUser = liveIosUser;
    }

    public Integer getLiveAndroidUser() {
        return liveAndroidUser;
    }

    public void setLiveAndroidUser(Integer liveAndroidUser) {
        this.liveAndroidUser = liveAndroidUser;
    }

    public Integer getAccumulativeIosUser() {
        return accumulativeIosUser;
    }

    public void setAccumulativeIosUser(Integer accumulativeIosUser) {
        this.accumulativeIosUser = accumulativeIosUser;
    }

    public Integer getAccumulativeAndroidUser() {
        return accumulativeAndroidUser;
    }

    public void setAccumulativeAndroidUser(Integer accumulativeAndroidUser) {
        this.accumulativeAndroidUser = accumulativeAndroidUser;
    }
}