package cn.threefishes.cloudrepository.entity;

public class FormatTemplateWithBLOBs extends FormatTemplate {
    private String formatContent;

    private String formatMobileContent;

    public String getFormatContent() {
        return formatContent;
    }

    public void setFormatContent(String formatContent) {
        this.formatContent = formatContent == null ? null : formatContent.trim();
    }

    public String getFormatMobileContent() {
        return formatMobileContent;
    }

    public void setFormatMobileContent(String formatMobileContent) {
        this.formatMobileContent = formatMobileContent == null ? null : formatMobileContent.trim();
    }
}