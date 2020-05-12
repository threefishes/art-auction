package cn.threefishes.cloudrepository.entity;

public class FormatTemplate {
    private Integer formatId;

    private String formatName;

    private Integer formatSite;

    private Integer storeId;

    public Integer getFormatId() {
        return formatId;
    }

    public void setFormatId(Integer formatId) {
        this.formatId = formatId;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName == null ? null : formatName.trim();
    }

    public Integer getFormatSite() {
        return formatSite;
    }

    public void setFormatSite(Integer formatSite) {
        this.formatSite = formatSite;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}