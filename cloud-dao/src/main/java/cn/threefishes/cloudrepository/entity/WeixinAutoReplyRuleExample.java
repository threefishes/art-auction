package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinAutoReplyRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinAutoReplyRuleExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andAllKeywordIsNull() {
            addCriterion("all_keyword is null");
            return (Criteria) this;
        }

        public Criteria andAllKeywordIsNotNull() {
            addCriterion("all_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andAllKeywordEqualTo(String value) {
            addCriterion("all_keyword =", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordNotEqualTo(String value) {
            addCriterion("all_keyword <>", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordGreaterThan(String value) {
            addCriterion("all_keyword >", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("all_keyword >=", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordLessThan(String value) {
            addCriterion("all_keyword <", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordLessThanOrEqualTo(String value) {
            addCriterion("all_keyword <=", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordLike(String value) {
            addCriterion("all_keyword like", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordNotLike(String value) {
            addCriterion("all_keyword not like", value, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordIn(List<String> values) {
            addCriterion("all_keyword in", values, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordNotIn(List<String> values) {
            addCriterion("all_keyword not in", values, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordBetween(String value1, String value2) {
            addCriterion("all_keyword between", value1, value2, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andAllKeywordNotBetween(String value1, String value2) {
            addCriterion("all_keyword not between", value1, value2, "allKeyword");
            return (Criteria) this;
        }

        public Criteria andReplyAllIsNull() {
            addCriterion("reply_all is null");
            return (Criteria) this;
        }

        public Criteria andReplyAllIsNotNull() {
            addCriterion("reply_all is not null");
            return (Criteria) this;
        }

        public Criteria andReplyAllEqualTo(Integer value) {
            addCriterion("reply_all =", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllNotEqualTo(Integer value) {
            addCriterion("reply_all <>", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllGreaterThan(Integer value) {
            addCriterion("reply_all >", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_all >=", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllLessThan(Integer value) {
            addCriterion("reply_all <", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllLessThanOrEqualTo(Integer value) {
            addCriterion("reply_all <=", value, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllIn(List<Integer> values) {
            addCriterion("reply_all in", values, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllNotIn(List<Integer> values) {
            addCriterion("reply_all not in", values, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllBetween(Integer value1, Integer value2) {
            addCriterion("reply_all between", value1, value2, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyAllNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_all not between", value1, value2, "replyAll");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("reply_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Integer value) {
            addCriterion("reply_count =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Integer value) {
            addCriterion("reply_count <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Integer value) {
            addCriterion("reply_count >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_count >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Integer value) {
            addCriterion("reply_count <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_count <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Integer> values) {
            addCriterion("reply_count in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Integer> values) {
            addCriterion("reply_count not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_count between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_count not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountIsNull() {
            addCriterion("reply_type_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountIsNotNull() {
            addCriterion("reply_type_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountEqualTo(String value) {
            addCriterion("reply_type_count =", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountNotEqualTo(String value) {
            addCriterion("reply_type_count <>", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountGreaterThan(String value) {
            addCriterion("reply_type_count >", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountGreaterThanOrEqualTo(String value) {
            addCriterion("reply_type_count >=", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountLessThan(String value) {
            addCriterion("reply_type_count <", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountLessThanOrEqualTo(String value) {
            addCriterion("reply_type_count <=", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountLike(String value) {
            addCriterion("reply_type_count like", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountNotLike(String value) {
            addCriterion("reply_type_count not like", value, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountIn(List<String> values) {
            addCriterion("reply_type_count in", values, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountNotIn(List<String> values) {
            addCriterion("reply_type_count not in", values, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountBetween(String value1, String value2) {
            addCriterion("reply_type_count between", value1, value2, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andReplyTypeCountNotBetween(String value1, String value2) {
            addCriterion("reply_type_count not between", value1, value2, "replyTypeCount");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}