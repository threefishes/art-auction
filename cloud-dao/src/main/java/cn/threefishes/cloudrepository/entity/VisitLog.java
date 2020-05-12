package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class VisitLog {
    private Integer logId;

    private Integer memberId;

    private String memberName;

    private Integer commonId;

    private String visitType;

    private String visitModule;

    private String visitModuleName;

    private String visitUrl;

    private String visitPage;

    private Date createTime;

    private String ip;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
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

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    public String getVisitModule() {
        return visitModule;
    }

    public void setVisitModule(String visitModule) {
        this.visitModule = visitModule == null ? null : visitModule.trim();
    }

    public String getVisitModuleName() {
        return visitModuleName;
    }

    public void setVisitModuleName(String visitModuleName) {
        this.visitModuleName = visitModuleName == null ? null : visitModuleName.trim();
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl == null ? null : visitUrl.trim();
    }

    public String getVisitPage() {
        return visitPage;
    }

    public void setVisitPage(String visitPage) {
        this.visitPage = visitPage == null ? null : visitPage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}