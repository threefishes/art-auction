package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChainPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChainPromotionExample() {
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

        public Criteria andPromotionIdIsNull() {
            addCriterion("promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdEqualTo(Integer value) {
            addCriterion("promotion_id =", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotEqualTo(Integer value) {
            addCriterion("promotion_id <>", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThan(Integer value) {
            addCriterion("promotion_id >", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_id >=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThan(Integer value) {
            addCriterion("promotion_id <", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_id <=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIn(List<Integer> values) {
            addCriterion("promotion_id in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotIn(List<Integer> values) {
            addCriterion("promotion_id not in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id not between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andChainIdIsNull() {
            addCriterion("chain_id is null");
            return (Criteria) this;
        }

        public Criteria andChainIdIsNotNull() {
            addCriterion("chain_id is not null");
            return (Criteria) this;
        }

        public Criteria andChainIdEqualTo(Integer value) {
            addCriterion("chain_id =", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotEqualTo(Integer value) {
            addCriterion("chain_id <>", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdGreaterThan(Integer value) {
            addCriterion("chain_id >", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_id >=", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdLessThan(Integer value) {
            addCriterion("chain_id <", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdLessThanOrEqualTo(Integer value) {
            addCriterion("chain_id <=", value, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdIn(List<Integer> values) {
            addCriterion("chain_id in", values, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotIn(List<Integer> values) {
            addCriterion("chain_id not in", values, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdBetween(Integer value1, Integer value2) {
            addCriterion("chain_id between", value1, value2, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_id not between", value1, value2, "chainId");
            return (Criteria) this;
        }

        public Criteria andChainNameIsNull() {
            addCriterion("chain_name is null");
            return (Criteria) this;
        }

        public Criteria andChainNameIsNotNull() {
            addCriterion("chain_name is not null");
            return (Criteria) this;
        }

        public Criteria andChainNameEqualTo(String value) {
            addCriterion("chain_name =", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotEqualTo(String value) {
            addCriterion("chain_name <>", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameGreaterThan(String value) {
            addCriterion("chain_name >", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameGreaterThanOrEqualTo(String value) {
            addCriterion("chain_name >=", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLessThan(String value) {
            addCriterion("chain_name <", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLessThanOrEqualTo(String value) {
            addCriterion("chain_name <=", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameLike(String value) {
            addCriterion("chain_name like", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotLike(String value) {
            addCriterion("chain_name not like", value, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameIn(List<String> values) {
            addCriterion("chain_name in", values, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotIn(List<String> values) {
            addCriterion("chain_name not in", values, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameBetween(String value1, String value2) {
            addCriterion("chain_name between", value1, value2, "chainName");
            return (Criteria) this;
        }

        public Criteria andChainNameNotBetween(String value1, String value2) {
            addCriterion("chain_name not between", value1, value2, "chainName");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionIsNull() {
            addCriterion("promotion_description is null");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionIsNotNull() {
            addCriterion("promotion_description is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionEqualTo(String value) {
            addCriterion("promotion_description =", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionNotEqualTo(String value) {
            addCriterion("promotion_description <>", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionGreaterThan(String value) {
            addCriterion("promotion_description >", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_description >=", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionLessThan(String value) {
            addCriterion("promotion_description <", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("promotion_description <=", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionLike(String value) {
            addCriterion("promotion_description like", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionNotLike(String value) {
            addCriterion("promotion_description not like", value, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionIn(List<String> values) {
            addCriterion("promotion_description in", values, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionNotIn(List<String> values) {
            addCriterion("promotion_description not in", values, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionBetween(String value1, String value2) {
            addCriterion("promotion_description between", value1, value2, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionDescriptionNotBetween(String value1, String value2) {
            addCriterion("promotion_description not between", value1, value2, "promotionDescription");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIsNull() {
            addCriterion("promotion_image is null");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIsNotNull() {
            addCriterion("promotion_image is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionImageEqualTo(String value) {
            addCriterion("promotion_image =", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotEqualTo(String value) {
            addCriterion("promotion_image <>", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageGreaterThan(String value) {
            addCriterion("promotion_image >", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_image >=", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLessThan(String value) {
            addCriterion("promotion_image <", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLessThanOrEqualTo(String value) {
            addCriterion("promotion_image <=", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLike(String value) {
            addCriterion("promotion_image like", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotLike(String value) {
            addCriterion("promotion_image not like", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIn(List<String> values) {
            addCriterion("promotion_image in", values, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotIn(List<String> values) {
            addCriterion("promotion_image not in", values, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageBetween(String value1, String value2) {
            addCriterion("promotion_image between", value1, value2, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotBetween(String value1, String value2) {
            addCriterion("promotion_image not between", value1, value2, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNull() {
            addCriterion("promotion_name is null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNotNull() {
            addCriterion("promotion_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameEqualTo(String value) {
            addCriterion("promotion_name =", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotEqualTo(String value) {
            addCriterion("promotion_name <>", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThan(String value) {
            addCriterion("promotion_name >", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_name >=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThan(String value) {
            addCriterion("promotion_name <", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThanOrEqualTo(String value) {
            addCriterion("promotion_name <=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLike(String value) {
            addCriterion("promotion_name like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotLike(String value) {
            addCriterion("promotion_name not like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIn(List<String> values) {
            addCriterion("promotion_name in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotIn(List<String> values) {
            addCriterion("promotion_name not in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameBetween(String value1, String value2) {
            addCriterion("promotion_name between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotBetween(String value1, String value2) {
            addCriterion("promotion_name not between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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