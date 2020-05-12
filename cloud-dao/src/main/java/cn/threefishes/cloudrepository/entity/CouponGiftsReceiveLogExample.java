package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponGiftsReceiveLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponGiftsReceiveLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIsNull() {
            addCriterion("gifts_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIsNotNull() {
            addCriterion("gifts_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdEqualTo(Integer value) {
            addCriterion("gifts_id =", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotEqualTo(Integer value) {
            addCriterion("gifts_id <>", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThan(Integer value) {
            addCriterion("gifts_id >", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_id >=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThan(Integer value) {
            addCriterion("gifts_id <", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_id <=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIn(List<Integer> values) {
            addCriterion("gifts_id in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotIn(List<Integer> values) {
            addCriterion("gifts_id not in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdBetween(Integer value1, Integer value2) {
            addCriterion("gifts_id between", value1, value2, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_id not between", value1, value2, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIsNull() {
            addCriterion("gifts_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIsNotNull() {
            addCriterion("gifts_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameEqualTo(String value) {
            addCriterion("gifts_name =", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotEqualTo(String value) {
            addCriterion("gifts_name <>", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThan(String value) {
            addCriterion("gifts_name >", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_name >=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThan(String value) {
            addCriterion("gifts_name <", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThanOrEqualTo(String value) {
            addCriterion("gifts_name <=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLike(String value) {
            addCriterion("gifts_name like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotLike(String value) {
            addCriterion("gifts_name not like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIn(List<String> values) {
            addCriterion("gifts_name in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotIn(List<String> values) {
            addCriterion("gifts_name not in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameBetween(String value1, String value2) {
            addCriterion("gifts_name between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotBetween(String value1, String value2) {
            addCriterion("gifts_name not between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIsNull() {
            addCriterion("gifts_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIsNotNull() {
            addCriterion("gifts_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceEqualTo(BigDecimal value) {
            addCriterion("gifts_price =", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotEqualTo(BigDecimal value) {
            addCriterion("gifts_price <>", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceGreaterThan(BigDecimal value) {
            addCriterion("gifts_price >", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts_price >=", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceLessThan(BigDecimal value) {
            addCriterion("gifts_price <", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts_price <=", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIn(List<BigDecimal> values) {
            addCriterion("gifts_price in", values, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotIn(List<BigDecimal> values) {
            addCriterion("gifts_price not in", values, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts_price between", value1, value2, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts_price not between", value1, value2, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andLogContentIsNull() {
            addCriterion("log_content is null");
            return (Criteria) this;
        }

        public Criteria andLogContentIsNotNull() {
            addCriterion("log_content is not null");
            return (Criteria) this;
        }

        public Criteria andLogContentEqualTo(String value) {
            addCriterion("log_content =", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotEqualTo(String value) {
            addCriterion("log_content <>", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentGreaterThan(String value) {
            addCriterion("log_content >", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentGreaterThanOrEqualTo(String value) {
            addCriterion("log_content >=", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLessThan(String value) {
            addCriterion("log_content <", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLessThanOrEqualTo(String value) {
            addCriterion("log_content <=", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLike(String value) {
            addCriterion("log_content like", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotLike(String value) {
            addCriterion("log_content not like", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentIn(List<String> values) {
            addCriterion("log_content in", values, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotIn(List<String> values) {
            addCriterion("log_content not in", values, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentBetween(String value1, String value2) {
            addCriterion("log_content between", value1, value2, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotBetween(String value1, String value2) {
            addCriterion("log_content not between", value1, value2, "logContent");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
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