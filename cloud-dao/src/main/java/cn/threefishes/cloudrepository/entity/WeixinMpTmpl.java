package cn.threefishes.cloudrepository.entity;

public class WeixinMpTmpl {
    private Integer tmplId;

    private String mpDeputyIndustry;

    private String mpPrimaryIndustry;

    private String mpTemplateId;

    private String mpTemplateTitle;

    public Integer getTmplId() {
        return tmplId;
    }

    public void setTmplId(Integer tmplId) {
        this.tmplId = tmplId;
    }

    public String getMpDeputyIndustry() {
        return mpDeputyIndustry;
    }

    public void setMpDeputyIndustry(String mpDeputyIndustry) {
        this.mpDeputyIndustry = mpDeputyIndustry == null ? null : mpDeputyIndustry.trim();
    }

    public String getMpPrimaryIndustry() {
        return mpPrimaryIndustry;
    }

    public void setMpPrimaryIndustry(String mpPrimaryIndustry) {
        this.mpPrimaryIndustry = mpPrimaryIndustry == null ? null : mpPrimaryIndustry.trim();
    }

    public String getMpTemplateId() {
        return mpTemplateId;
    }

    public void setMpTemplateId(String mpTemplateId) {
        this.mpTemplateId = mpTemplateId == null ? null : mpTemplateId.trim();
    }

    public String getMpTemplateTitle() {
        return mpTemplateTitle;
    }

    public void setMpTemplateTitle(String mpTemplateTitle) {
        this.mpTemplateTitle = mpTemplateTitle == null ? null : mpTemplateTitle.trim();
    }
}