package cn.threefishes.cloudrepository.entity;

import java.util.Date;

public class ChannelModule {
    private Integer moduleId;

    private String moduleName;

    private Integer moduleShow;

    private String moduleTemplateName;

    private String moduleType;

    private Date moduleUpdateTime;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public Integer getModuleShow() {
        return moduleShow;
    }

    public void setModuleShow(Integer moduleShow) {
        this.moduleShow = moduleShow;
    }

    public String getModuleTemplateName() {
        return moduleTemplateName;
    }

    public void setModuleTemplateName(String moduleTemplateName) {
        this.moduleTemplateName = moduleTemplateName == null ? null : moduleTemplateName.trim();
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public Date getModuleUpdateTime() {
        return moduleUpdateTime;
    }

    public void setModuleUpdateTime(Date moduleUpdateTime) {
        this.moduleUpdateTime = moduleUpdateTime;
    }
}