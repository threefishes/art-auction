package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class Groups {
    private Integer groupId;

    private Integer buyLimitNum;

    private Date endTime;

    private String groupExplain;

    private String groupGameRule;

    private Integer groupJoinedNum;

    private String groupName;

    private Integer groupOpenVirtual;

    private Integer groupRequireNum;

    private Integer groupState;

    private String groupTitle;

    private Date groupVirtualTime;

    private Date startTime;

    private Integer storeId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getBuyLimitNum() {
        return buyLimitNum;
    }

    public void setBuyLimitNum(Integer buyLimitNum) {
        this.buyLimitNum = buyLimitNum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getGroupExplain() {
        return groupExplain;
    }

    public void setGroupExplain(String groupExplain) {
        this.groupExplain = groupExplain == null ? null : groupExplain.trim();
    }

    public String getGroupGameRule() {
        return groupGameRule;
    }

    public void setGroupGameRule(String groupGameRule) {
        this.groupGameRule = groupGameRule == null ? null : groupGameRule.trim();
    }

    public Integer getGroupJoinedNum() {
        return groupJoinedNum;
    }

    public void setGroupJoinedNum(Integer groupJoinedNum) {
        this.groupJoinedNum = groupJoinedNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getGroupOpenVirtual() {
        return groupOpenVirtual;
    }

    public void setGroupOpenVirtual(Integer groupOpenVirtual) {
        this.groupOpenVirtual = groupOpenVirtual;
    }

    public Integer getGroupRequireNum() {
        return groupRequireNum;
    }

    public void setGroupRequireNum(Integer groupRequireNum) {
        this.groupRequireNum = groupRequireNum;
    }

    public Integer getGroupState() {
        return groupState;
    }

    public void setGroupState(Integer groupState) {
        this.groupState = groupState;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle == null ? null : groupTitle.trim();
    }

    public Date getGroupVirtualTime() {
        return groupVirtualTime;
    }

    public void setGroupVirtualTime(Date groupVirtualTime) {
        this.groupVirtualTime = groupVirtualTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}