package cn.threefishes.cloudrepository.entity;

public class AppStat {
    private Integer statId;

    private Integer statCount;

    private String statKey;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public Integer getStatCount() {
        return statCount;
    }

    public void setStatCount(Integer statCount) {
        this.statCount = statCount;
    }

    public String getStatKey() {
        return statKey;
    }

    public void setStatKey(String statKey) {
        this.statKey = statKey == null ? null : statKey.trim();
    }
}