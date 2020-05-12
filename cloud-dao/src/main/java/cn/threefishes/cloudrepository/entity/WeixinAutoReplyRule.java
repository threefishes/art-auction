package cn.threefishes.cloudrepository.entity;

public class WeixinAutoReplyRule {
    private Integer ruleId;

    private String allKeyword;

    private Integer replyAll;

    private Integer replyCount;

    private String replyTypeCount;

    private String ruleName;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getAllKeyword() {
        return allKeyword;
    }

    public void setAllKeyword(String allKeyword) {
        this.allKeyword = allKeyword == null ? null : allKeyword.trim();
    }

    public Integer getReplyAll() {
        return replyAll;
    }

    public void setReplyAll(Integer replyAll) {
        this.replyAll = replyAll;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getReplyTypeCount() {
        return replyTypeCount;
    }

    public void setReplyTypeCount(String replyTypeCount) {
        this.replyTypeCount = replyTypeCount == null ? null : replyTypeCount.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }
}