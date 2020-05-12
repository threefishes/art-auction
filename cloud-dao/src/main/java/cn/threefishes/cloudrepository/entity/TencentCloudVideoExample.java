package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TencentCloudVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TencentCloudVideoExample() {
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

        public Criteria andDwidIsNull() {
            addCriterion("dwid is null");
            return (Criteria) this;
        }

        public Criteria andDwidIsNotNull() {
            addCriterion("dwid is not null");
            return (Criteria) this;
        }

        public Criteria andDwidEqualTo(Integer value) {
            addCriterion("dwid =", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotEqualTo(Integer value) {
            addCriterion("dwid <>", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidGreaterThan(Integer value) {
            addCriterion("dwid >", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dwid >=", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidLessThan(Integer value) {
            addCriterion("dwid <", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidLessThanOrEqualTo(Integer value) {
            addCriterion("dwid <=", value, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidIn(List<Integer> values) {
            addCriterion("dwid in", values, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotIn(List<Integer> values) {
            addCriterion("dwid not in", values, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidBetween(Integer value1, Integer value2) {
            addCriterion("dwid between", value1, value2, "dwid");
            return (Criteria) this;
        }

        public Criteria andDwidNotBetween(Integer value1, Integer value2) {
            addCriterion("dwid not between", value1, value2, "dwid");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("videoid is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoid =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoid <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoid >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoid >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoid <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoid <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoid like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoid not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoid in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoid not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoid between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoid not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeIsNull() {
            addCriterion("upload_tencent_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeIsNotNull() {
            addCriterion("upload_tencent_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeEqualTo(Date value) {
            addCriterion("upload_tencent_time =", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeNotEqualTo(Date value) {
            addCriterion("upload_tencent_time <>", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeGreaterThan(Date value) {
            addCriterion("upload_tencent_time >", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_tencent_time >=", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeLessThan(Date value) {
            addCriterion("upload_tencent_time <", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_tencent_time <=", value, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeIn(List<Date> values) {
            addCriterion("upload_tencent_time in", values, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeNotIn(List<Date> values) {
            addCriterion("upload_tencent_time not in", values, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeBetween(Date value1, Date value2) {
            addCriterion("upload_tencent_time between", value1, value2, "uploadTencentTime");
            return (Criteria) this;
        }

        public Criteria andUploadTencentTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_tencent_time not between", value1, value2, "uploadTencentTime");
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