package cn.threefishes.cloudrepository.entity;

public class StoreGrade {
    private Integer id;

    private Integer albumLimit;

    private String description;

    private Integer goodsLimit;

    private String name;

    private Integer price;

    private Integer recommendLimit;

    private Integer sort;

    private String template;

    private Integer templateCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumLimit() {
        return albumLimit;
    }

    public void setAlbumLimit(Integer albumLimit) {
        this.albumLimit = albumLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getGoodsLimit() {
        return goodsLimit;
    }

    public void setGoodsLimit(Integer goodsLimit) {
        this.goodsLimit = goodsLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRecommendLimit() {
        return recommendLimit;
    }

    public void setRecommendLimit(Integer recommendLimit) {
        this.recommendLimit = recommendLimit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public Integer getTemplateCount() {
        return templateCount;
    }

    public void setTemplateCount(Integer templateCount) {
        this.templateCount = templateCount;
    }
}