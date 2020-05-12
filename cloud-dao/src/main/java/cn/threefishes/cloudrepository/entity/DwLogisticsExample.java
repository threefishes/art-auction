package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class DwLogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DwLogisticsExample() {
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

        public Criteria andCodeMgroupIsNull() {
            addCriterion("code_mgroup is null");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupIsNotNull() {
            addCriterion("code_mgroup is not null");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupEqualTo(String value) {
            addCriterion("code_mgroup =", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupNotEqualTo(String value) {
            addCriterion("code_mgroup <>", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupGreaterThan(String value) {
            addCriterion("code_mgroup >", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupGreaterThanOrEqualTo(String value) {
            addCriterion("code_mgroup >=", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupLessThan(String value) {
            addCriterion("code_mgroup <", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupLessThanOrEqualTo(String value) {
            addCriterion("code_mgroup <=", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupLike(String value) {
            addCriterion("code_mgroup like", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupNotLike(String value) {
            addCriterion("code_mgroup not like", value, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupIn(List<String> values) {
            addCriterion("code_mgroup in", values, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupNotIn(List<String> values) {
            addCriterion("code_mgroup not in", values, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupBetween(String value1, String value2) {
            addCriterion("code_mgroup between", value1, value2, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeMgroupNotBetween(String value1, String value2) {
            addCriterion("code_mgroup not between", value1, value2, "codeMgroup");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIsNull() {
            addCriterion("code_sname is null");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIsNotNull() {
            addCriterion("code_sname is not null");
            return (Criteria) this;
        }

        public Criteria andCodeSnameEqualTo(String value) {
            addCriterion("code_sname =", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotEqualTo(String value) {
            addCriterion("code_sname <>", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameGreaterThan(String value) {
            addCriterion("code_sname >", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameGreaterThanOrEqualTo(String value) {
            addCriterion("code_sname >=", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLessThan(String value) {
            addCriterion("code_sname <", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLessThanOrEqualTo(String value) {
            addCriterion("code_sname <=", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLike(String value) {
            addCriterion("code_sname like", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotLike(String value) {
            addCriterion("code_sname not like", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIn(List<String> values) {
            addCriterion("code_sname in", values, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotIn(List<String> values) {
            addCriterion("code_sname not in", values, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameBetween(String value1, String value2) {
            addCriterion("code_sname between", value1, value2, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotBetween(String value1, String value2) {
            addCriterion("code_sname not between", value1, value2, "codeSname");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andKdnCodeIsNull() {
            addCriterion("kdn_code is null");
            return (Criteria) this;
        }

        public Criteria andKdnCodeIsNotNull() {
            addCriterion("kdn_code is not null");
            return (Criteria) this;
        }

        public Criteria andKdnCodeEqualTo(String value) {
            addCriterion("kdn_code =", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeNotEqualTo(String value) {
            addCriterion("kdn_code <>", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeGreaterThan(String value) {
            addCriterion("kdn_code >", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("kdn_code >=", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeLessThan(String value) {
            addCriterion("kdn_code <", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeLessThanOrEqualTo(String value) {
            addCriterion("kdn_code <=", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeLike(String value) {
            addCriterion("kdn_code like", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeNotLike(String value) {
            addCriterion("kdn_code not like", value, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeIn(List<String> values) {
            addCriterion("kdn_code in", values, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeNotIn(List<String> values) {
            addCriterion("kdn_code not in", values, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeBetween(String value1, String value2) {
            addCriterion("kdn_code between", value1, value2, "kdnCode");
            return (Criteria) this;
        }

        public Criteria andKdnCodeNotBetween(String value1, String value2) {
            addCriterion("kdn_code not between", value1, value2, "kdnCode");
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