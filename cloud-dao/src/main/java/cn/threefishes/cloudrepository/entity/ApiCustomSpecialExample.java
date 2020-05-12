package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ApiCustomSpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiCustomSpecialExample() {
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

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(Integer value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(Integer value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(Integer value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(Integer value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(Integer value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<Integer> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<Integer> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(Integer value1, Integer value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialDescIsNull() {
            addCriterion("special_desc is null");
            return (Criteria) this;
        }

        public Criteria andSpecialDescIsNotNull() {
            addCriterion("special_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialDescEqualTo(String value) {
            addCriterion("special_desc =", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescNotEqualTo(String value) {
            addCriterion("special_desc <>", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescGreaterThan(String value) {
            addCriterion("special_desc >", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescGreaterThanOrEqualTo(String value) {
            addCriterion("special_desc >=", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescLessThan(String value) {
            addCriterion("special_desc <", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescLessThanOrEqualTo(String value) {
            addCriterion("special_desc <=", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescLike(String value) {
            addCriterion("special_desc like", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescNotLike(String value) {
            addCriterion("special_desc not like", value, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescIn(List<String> values) {
            addCriterion("special_desc in", values, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescNotIn(List<String> values) {
            addCriterion("special_desc not in", values, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescBetween(String value1, String value2) {
            addCriterion("special_desc between", value1, value2, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andSpecialDescNotBetween(String value1, String value2) {
            addCriterion("special_desc not between", value1, value2, "specialDesc");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareDescIsNull() {
            addCriterion("share_desc is null");
            return (Criteria) this;
        }

        public Criteria andShareDescIsNotNull() {
            addCriterion("share_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShareDescEqualTo(String value) {
            addCriterion("share_desc =", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotEqualTo(String value) {
            addCriterion("share_desc <>", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescGreaterThan(String value) {
            addCriterion("share_desc >", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescGreaterThanOrEqualTo(String value) {
            addCriterion("share_desc >=", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLessThan(String value) {
            addCriterion("share_desc <", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLessThanOrEqualTo(String value) {
            addCriterion("share_desc <=", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescLike(String value) {
            addCriterion("share_desc like", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotLike(String value) {
            addCriterion("share_desc not like", value, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescIn(List<String> values) {
            addCriterion("share_desc in", values, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotIn(List<String> values) {
            addCriterion("share_desc not in", values, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescBetween(String value1, String value2) {
            addCriterion("share_desc between", value1, value2, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareDescNotBetween(String value1, String value2) {
            addCriterion("share_desc not between", value1, value2, "shareDesc");
            return (Criteria) this;
        }

        public Criteria andShareImgurlIsNull() {
            addCriterion("share_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andShareImgurlIsNotNull() {
            addCriterion("share_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andShareImgurlEqualTo(String value) {
            addCriterion("share_imgurl =", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlNotEqualTo(String value) {
            addCriterion("share_imgurl <>", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlGreaterThan(String value) {
            addCriterion("share_imgurl >", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("share_imgurl >=", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlLessThan(String value) {
            addCriterion("share_imgurl <", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlLessThanOrEqualTo(String value) {
            addCriterion("share_imgurl <=", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlLike(String value) {
            addCriterion("share_imgurl like", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlNotLike(String value) {
            addCriterion("share_imgurl not like", value, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlIn(List<String> values) {
            addCriterion("share_imgurl in", values, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlNotIn(List<String> values) {
            addCriterion("share_imgurl not in", values, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlBetween(String value1, String value2) {
            addCriterion("share_imgurl between", value1, value2, "shareImgurl");
            return (Criteria) this;
        }

        public Criteria andShareImgurlNotBetween(String value1, String value2) {
            addCriterion("share_imgurl not between", value1, value2, "shareImgurl");
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