package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ContractLog {
    private Integer logId;

    private Date logAddtime;

    private Integer logItemid;

    private String logItemname;

    private String logMsg;

    private String logRole;

    private Integer logStoreid;

    private String logStorename;

    private Integer logUserid;

    private String logUsername;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getLogAddtime() {
        return logAddtime;
    }

    public void setLogAddtime(Date logAddtime) {
        this.logAddtime = logAddtime;
    }

    public Integer getLogItemid() {
        return logItemid;
    }

    public void setLogItemid(Integer logItemid) {
        this.logItemid = logItemid;
    }

    public String getLogItemname() {
        return logItemname;
    }

    public void setLogItemname(String logItemname) {
        this.logItemname = logItemname == null ? null : logItemname.trim();
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg == null ? null : logMsg.trim();
    }

    public String getLogRole() {
        return logRole;
    }

    public void setLogRole(String logRole) {
        this.logRole = logRole == null ? null : logRole.trim();
    }

    public Integer getLogStoreid() {
        return logStoreid;
    }

    public void setLogStoreid(Integer logStoreid) {
        this.logStoreid = logStoreid;
    }

    public String getLogStorename() {
        return logStorename;
    }

    public void setLogStorename(String logStorename) {
        this.logStorename = logStorename == null ? null : logStorename.trim();
    }

    public Integer getLogUserid() {
        return logUserid;
    }

    public void setLogUserid(Integer logUserid) {
        this.logUserid = logUserid;
    }

    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername == null ? null : logUsername.trim();
    }
}