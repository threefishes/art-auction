package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class TopicalityFlag {
    private Integer id;

    private String flagSn;

    private String flagName;

    private String flagImage;

    private String flagDescription;

    private String flagType;

    private String flagSource;

    private Integer flagState;

    private Integer flagChoice;

    private Integer useNum;

    private String createName;

    private Date createTime;

    private Date pushTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlagSn() {
        return flagSn;
    }

    public void setFlagSn(String flagSn) {
        this.flagSn = flagSn == null ? null : flagSn.trim();
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName == null ? null : flagName.trim();
    }

    public String getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(String flagImage) {
        this.flagImage = flagImage == null ? null : flagImage.trim();
    }

    public String getFlagDescription() {
        return flagDescription;
    }

    public void setFlagDescription(String flagDescription) {
        this.flagDescription = flagDescription == null ? null : flagDescription.trim();
    }

    public String getFlagType() {
        return flagType;
    }

    public void setFlagType(String flagType) {
        this.flagType = flagType == null ? null : flagType.trim();
    }

    public String getFlagSource() {
        return flagSource;
    }

    public void setFlagSource(String flagSource) {
        this.flagSource = flagSource == null ? null : flagSource.trim();
    }

    public Integer getFlagState() {
        return flagState;
    }

    public void setFlagState(Integer flagState) {
        this.flagState = flagState;
    }

    public Integer getFlagChoice() {
        return flagChoice;
    }

    public void setFlagChoice(Integer flagChoice) {
        this.flagChoice = flagChoice;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}