package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxclickreplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxclickreplyExample() {
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

        public Criteria andCrIdIsNull() {
            addCriterion("cr_id is null");
            return (Criteria) this;
        }

        public Criteria andCrIdIsNotNull() {
            addCriterion("cr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrIdEqualTo(Integer value) {
            addCriterion("cr_id =", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotEqualTo(Integer value) {
            addCriterion("cr_id <>", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThan(Integer value) {
            addCriterion("cr_id >", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_id >=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThan(Integer value) {
            addCriterion("cr_id <", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThanOrEqualTo(Integer value) {
            addCriterion("cr_id <=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdIn(List<Integer> values) {
            addCriterion("cr_id in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotIn(List<Integer> values) {
            addCriterion("cr_id not in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdBetween(Integer value1, Integer value2) {
            addCriterion("cr_id between", value1, value2, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_id not between", value1, value2, "crId");
            return (Criteria) this;
        }

        public Criteria andCrTitleIsNull() {
            addCriterion("cr_title is null");
            return (Criteria) this;
        }

        public Criteria andCrTitleIsNotNull() {
            addCriterion("cr_title is not null");
            return (Criteria) this;
        }

        public Criteria andCrTitleEqualTo(String value) {
            addCriterion("cr_title =", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleNotEqualTo(String value) {
            addCriterion("cr_title <>", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleGreaterThan(String value) {
            addCriterion("cr_title >", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cr_title >=", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleLessThan(String value) {
            addCriterion("cr_title <", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleLessThanOrEqualTo(String value) {
            addCriterion("cr_title <=", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleLike(String value) {
            addCriterion("cr_title like", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleNotLike(String value) {
            addCriterion("cr_title not like", value, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleIn(List<String> values) {
            addCriterion("cr_title in", values, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleNotIn(List<String> values) {
            addCriterion("cr_title not in", values, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleBetween(String value1, String value2) {
            addCriterion("cr_title between", value1, value2, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrTitleNotBetween(String value1, String value2) {
            addCriterion("cr_title not between", value1, value2, "crTitle");
            return (Criteria) this;
        }

        public Criteria andCrNoteIsNull() {
            addCriterion("cr_note is null");
            return (Criteria) this;
        }

        public Criteria andCrNoteIsNotNull() {
            addCriterion("cr_note is not null");
            return (Criteria) this;
        }

        public Criteria andCrNoteEqualTo(String value) {
            addCriterion("cr_note =", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteNotEqualTo(String value) {
            addCriterion("cr_note <>", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteGreaterThan(String value) {
            addCriterion("cr_note >", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteGreaterThanOrEqualTo(String value) {
            addCriterion("cr_note >=", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteLessThan(String value) {
            addCriterion("cr_note <", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteLessThanOrEqualTo(String value) {
            addCriterion("cr_note <=", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteLike(String value) {
            addCriterion("cr_note like", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteNotLike(String value) {
            addCriterion("cr_note not like", value, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteIn(List<String> values) {
            addCriterion("cr_note in", values, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteNotIn(List<String> values) {
            addCriterion("cr_note not in", values, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteBetween(String value1, String value2) {
            addCriterion("cr_note between", value1, value2, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrNoteNotBetween(String value1, String value2) {
            addCriterion("cr_note not between", value1, value2, "crNote");
            return (Criteria) this;
        }

        public Criteria andCrContentIsNull() {
            addCriterion("cr_content is null");
            return (Criteria) this;
        }

        public Criteria andCrContentIsNotNull() {
            addCriterion("cr_content is not null");
            return (Criteria) this;
        }

        public Criteria andCrContentEqualTo(String value) {
            addCriterion("cr_content =", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentNotEqualTo(String value) {
            addCriterion("cr_content <>", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentGreaterThan(String value) {
            addCriterion("cr_content >", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentGreaterThanOrEqualTo(String value) {
            addCriterion("cr_content >=", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentLessThan(String value) {
            addCriterion("cr_content <", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentLessThanOrEqualTo(String value) {
            addCriterion("cr_content <=", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentLike(String value) {
            addCriterion("cr_content like", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentNotLike(String value) {
            addCriterion("cr_content not like", value, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentIn(List<String> values) {
            addCriterion("cr_content in", values, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentNotIn(List<String> values) {
            addCriterion("cr_content not in", values, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentBetween(String value1, String value2) {
            addCriterion("cr_content between", value1, value2, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrContentNotBetween(String value1, String value2) {
            addCriterion("cr_content not between", value1, value2, "crContent");
            return (Criteria) this;
        }

        public Criteria andCrCodeIsNull() {
            addCriterion("cr_code is null");
            return (Criteria) this;
        }

        public Criteria andCrCodeIsNotNull() {
            addCriterion("cr_code is not null");
            return (Criteria) this;
        }

        public Criteria andCrCodeEqualTo(String value) {
            addCriterion("cr_code =", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeNotEqualTo(String value) {
            addCriterion("cr_code <>", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeGreaterThan(String value) {
            addCriterion("cr_code >", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cr_code >=", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeLessThan(String value) {
            addCriterion("cr_code <", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeLessThanOrEqualTo(String value) {
            addCriterion("cr_code <=", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeLike(String value) {
            addCriterion("cr_code like", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeNotLike(String value) {
            addCriterion("cr_code not like", value, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeIn(List<String> values) {
            addCriterion("cr_code in", values, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeNotIn(List<String> values) {
            addCriterion("cr_code not in", values, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeBetween(String value1, String value2) {
            addCriterion("cr_code between", value1, value2, "crCode");
            return (Criteria) this;
        }

        public Criteria andCrCodeNotBetween(String value1, String value2) {
            addCriterion("cr_code not between", value1, value2, "crCode");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNull() {
            addCriterion("wx_id is null");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNotNull() {
            addCriterion("wx_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxIdEqualTo(Integer value) {
            addCriterion("wx_id =", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotEqualTo(Integer value) {
            addCriterion("wx_id <>", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThan(Integer value) {
            addCriterion("wx_id >", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_id >=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThan(Integer value) {
            addCriterion("wx_id <", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThanOrEqualTo(Integer value) {
            addCriterion("wx_id <=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdIn(List<Integer> values) {
            addCriterion("wx_id in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotIn(List<Integer> values) {
            addCriterion("wx_id not in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdBetween(Integer value1, Integer value2) {
            addCriterion("wx_id between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_id not between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andCrTypeIsNull() {
            addCriterion("cr_type is null");
            return (Criteria) this;
        }

        public Criteria andCrTypeIsNotNull() {
            addCriterion("cr_type is not null");
            return (Criteria) this;
        }

        public Criteria andCrTypeEqualTo(Integer value) {
            addCriterion("cr_type =", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotEqualTo(Integer value) {
            addCriterion("cr_type <>", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeGreaterThan(Integer value) {
            addCriterion("cr_type >", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_type >=", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeLessThan(Integer value) {
            addCriterion("cr_type <", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cr_type <=", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeIn(List<Integer> values) {
            addCriterion("cr_type in", values, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotIn(List<Integer> values) {
            addCriterion("cr_type not in", values, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeBetween(Integer value1, Integer value2) {
            addCriterion("cr_type between", value1, value2, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_type not between", value1, value2, "crType");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeIsNull() {
            addCriterion("cr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeIsNotNull() {
            addCriterion("cr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeEqualTo(Date value) {
            addCriterion("cr_add_time =", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeNotEqualTo(Date value) {
            addCriterion("cr_add_time <>", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeGreaterThan(Date value) {
            addCriterion("cr_add_time >", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cr_add_time >=", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeLessThan(Date value) {
            addCriterion("cr_add_time <", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("cr_add_time <=", value, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeIn(List<Date> values) {
            addCriterion("cr_add_time in", values, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeNotIn(List<Date> values) {
            addCriterion("cr_add_time not in", values, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeBetween(Date value1, Date value2) {
            addCriterion("cr_add_time between", value1, value2, "crAddTime");
            return (Criteria) this;
        }

        public Criteria andCrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("cr_add_time not between", value1, value2, "crAddTime");
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