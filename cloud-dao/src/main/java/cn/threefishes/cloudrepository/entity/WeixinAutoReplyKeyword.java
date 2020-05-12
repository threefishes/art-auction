package cn.threefishes.cloudrepository.entity;

public class WeixinAutoReplyKeyword {
    private Integer keywordId;

    private Integer fullMatch;

    private String keywordName;

    private Integer ruleId;

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    public Integer getFullMatch() {
        return fullMatch;
    }

    public void setFullMatch(Integer fullMatch) {
        this.fullMatch = fullMatch;
    }

    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName == null ? null : keywordName.trim();
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }
}