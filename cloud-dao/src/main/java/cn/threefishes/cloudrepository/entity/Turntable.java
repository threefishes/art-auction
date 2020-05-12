package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Turntable {
    private Integer turntableId;

    private String title;

    private String rule;

    private String background;

    private Integer showWinners;

    private Integer luckilyCount;

    private Integer luckilyLimitType;

    private Integer joinCount;

    private Integer joinLimitType;

    private String unawardTitle;

    private String unawardContent;

    private Integer takePoints;

    private Integer state;

    private Date createTime;

    public Integer getTurntableId() {
        return turntableId;
    }

    public void setTurntableId(Integer turntableId) {
        this.turntableId = turntableId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    public Integer getShowWinners() {
        return showWinners;
    }

    public void setShowWinners(Integer showWinners) {
        this.showWinners = showWinners;
    }

    public Integer getLuckilyCount() {
        return luckilyCount;
    }

    public void setLuckilyCount(Integer luckilyCount) {
        this.luckilyCount = luckilyCount;
    }

    public Integer getLuckilyLimitType() {
        return luckilyLimitType;
    }

    public void setLuckilyLimitType(Integer luckilyLimitType) {
        this.luckilyLimitType = luckilyLimitType;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getJoinLimitType() {
        return joinLimitType;
    }

    public void setJoinLimitType(Integer joinLimitType) {
        this.joinLimitType = joinLimitType;
    }

    public String getUnawardTitle() {
        return unawardTitle;
    }

    public void setUnawardTitle(String unawardTitle) {
        this.unawardTitle = unawardTitle == null ? null : unawardTitle.trim();
    }

    public String getUnawardContent() {
        return unawardContent;
    }

    public void setUnawardContent(String unawardContent) {
        this.unawardContent = unawardContent == null ? null : unawardContent.trim();
    }

    public Integer getTakePoints() {
        return takePoints;
    }

    public void setTakePoints(Integer takePoints) {
        this.takePoints = takePoints;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}