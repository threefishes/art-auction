package cn.threefishes.cloudrepository.entity.auction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtAuctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtAuctionExample() {
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

        public Criteria andAuctionIdIsNull() {
            addCriterion("auction_id is null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIsNotNull() {
            addCriterion("auction_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdEqualTo(Integer value) {
            addCriterion("auction_id =", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotEqualTo(Integer value) {
            addCriterion("auction_id <>", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThan(Integer value) {
            addCriterion("auction_id >", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auction_id >=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThan(Integer value) {
            addCriterion("auction_id <", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("auction_id <=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIn(List<Integer> values) {
            addCriterion("auction_id in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotIn(List<Integer> values) {
            addCriterion("auction_id not in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdBetween(Integer value1, Integer value2) {
            addCriterion("auction_id between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auction_id not between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andInitPriceIsNull() {
            addCriterion("init_price is null");
            return (Criteria) this;
        }

        public Criteria andInitPriceIsNotNull() {
            addCriterion("init_price is not null");
            return (Criteria) this;
        }

        public Criteria andInitPriceEqualTo(BigDecimal value) {
            addCriterion("init_price =", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceNotEqualTo(BigDecimal value) {
            addCriterion("init_price <>", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceGreaterThan(BigDecimal value) {
            addCriterion("init_price >", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("init_price >=", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceLessThan(BigDecimal value) {
            addCriterion("init_price <", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("init_price <=", value, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceIn(List<BigDecimal> values) {
            addCriterion("init_price in", values, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceNotIn(List<BigDecimal> values) {
            addCriterion("init_price not in", values, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_price between", value1, value2, "initPrice");
            return (Criteria) this;
        }

        public Criteria andInitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_price not between", value1, value2, "initPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceIsNull() {
            addCriterion("add_price is null");
            return (Criteria) this;
        }

        public Criteria andAddPriceIsNotNull() {
            addCriterion("add_price is not null");
            return (Criteria) this;
        }

        public Criteria andAddPriceEqualTo(BigDecimal value) {
            addCriterion("add_price =", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotEqualTo(BigDecimal value) {
            addCriterion("add_price <>", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceGreaterThan(BigDecimal value) {
            addCriterion("add_price >", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("add_price >=", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceLessThan(BigDecimal value) {
            addCriterion("add_price <", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("add_price <=", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceIn(List<BigDecimal> values) {
            addCriterion("add_price in", values, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotIn(List<BigDecimal> values) {
            addCriterion("add_price not in", values, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_price between", value1, value2, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_price not between", value1, value2, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAuctionStateIsNull() {
            addCriterion("auction_state is null");
            return (Criteria) this;
        }

        public Criteria andAuctionStateIsNotNull() {
            addCriterion("auction_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionStateEqualTo(Short value) {
            addCriterion("auction_state =", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateNotEqualTo(Short value) {
            addCriterion("auction_state <>", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateGreaterThan(Short value) {
            addCriterion("auction_state >", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateGreaterThanOrEqualTo(Short value) {
            addCriterion("auction_state >=", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateLessThan(Short value) {
            addCriterion("auction_state <", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateLessThanOrEqualTo(Short value) {
            addCriterion("auction_state <=", value, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateIn(List<Short> values) {
            addCriterion("auction_state in", values, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateNotIn(List<Short> values) {
            addCriterion("auction_state not in", values, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateBetween(Short value1, Short value2) {
            addCriterion("auction_state between", value1, value2, "auctionState");
            return (Criteria) this;
        }

        public Criteria andAuctionStateNotBetween(Short value1, Short value2) {
            addCriterion("auction_state not between", value1, value2, "auctionState");
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

        public Criteria andAuctionTypeIsNull() {
            addCriterion("auction_type is null");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeIsNotNull() {
            addCriterion("auction_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeEqualTo(Integer value) {
            addCriterion("auction_type =", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeNotEqualTo(Integer value) {
            addCriterion("auction_type <>", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeGreaterThan(Integer value) {
            addCriterion("auction_type >", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auction_type >=", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeLessThan(Integer value) {
            addCriterion("auction_type <", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("auction_type <=", value, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeIn(List<Integer> values) {
            addCriterion("auction_type in", values, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeNotIn(List<Integer> values) {
            addCriterion("auction_type not in", values, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeBetween(Integer value1, Integer value2) {
            addCriterion("auction_type between", value1, value2, "auctionType");
            return (Criteria) this;
        }

        public Criteria andAuctionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("auction_type not between", value1, value2, "auctionType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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