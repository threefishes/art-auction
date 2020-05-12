package cn.threefishes.cloudrepository.entity;

public class WeixinMpTmplWithBLOBs extends WeixinMpTmpl {
    private String mpTemplateContent;

    private String mpTemplateExample;

    public String getMpTemplateContent() {
        return mpTemplateContent;
    }

    public void setMpTemplateContent(String mpTemplateContent) {
        this.mpTemplateContent = mpTemplateContent == null ? null : mpTemplateContent.trim();
    }

    public String getMpTemplateExample() {
        return mpTemplateExample;
    }

    public void setMpTemplateExample(String mpTemplateExample) {
        this.mpTemplateExample = mpTemplateExample == null ? null : mpTemplateExample.trim();
    }
}