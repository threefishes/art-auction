package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscountExample() {
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

        public Criteria andDiscountIdIsNull() {
            addCriterion("discount_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNotNull() {
            addCriterion("discount_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdEqualTo(Integer value) {
            addCriterion("discount_id =", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotEqualTo(Integer value) {
            addCriterion("discount_id <>", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThan(Integer value) {
            addCriterion("discount_id >", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_id >=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThan(Integer value) {
            addCriterion("discount_id <", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThanOrEqualTo(Integer value) {
            addCriterion("discount_id <=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIn(List<Integer> values) {
            addCriterion("discount_id in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotIn(List<Integer> values) {
            addCriterion("discount_id not in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdBetween(Integer value1, Integer value2) {
            addCriterion("discount_id between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_id not between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainIsNull() {
            addCriterion("discount_explain is null");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainIsNotNull() {
            addCriterion("discount_explain is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainEqualTo(String value) {
            addCriterion("discount_explain =", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainNotEqualTo(String value) {
            addCriterion("discount_explain <>", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainGreaterThan(String value) {
            addCriterion("discount_explain >", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainGreaterThanOrEqualTo(String value) {
            addCriterion("discount_explain >=", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainLessThan(String value) {
            addCriterion("discount_explain <", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainLessThanOrEqualTo(String value) {
            addCriterion("discount_explain <=", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainLike(String value) {
            addCriterion("discount_explain like", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainNotLike(String value) {
            addCriterion("discount_explain not like", value, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainIn(List<String> values) {
            addCriterion("discount_explain in", values, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainNotIn(List<String> values) {
            addCriterion("discount_explain not in", values, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainBetween(String value1, String value2) {
            addCriterion("discount_explain between", value1, value2, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountExplainNotBetween(String value1, String value2) {
            addCriterion("discount_explain not between", value1, value2, "discountExplain");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNull() {
            addCriterion("discount_name is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNotNull() {
            addCriterion("discount_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameEqualTo(String value) {
            addCriterion("discount_name =", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotEqualTo(String value) {
            addCriterion("discount_name <>", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThan(String value) {
            addCriterion("discount_name >", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThanOrEqualTo(String value) {
            addCriterion("discount_name >=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThan(String value) {
            addCriterion("discount_name <", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThanOrEqualTo(String value) {
            addCriterion("discount_name <=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLike(String value) {
            addCriterion("discount_name like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotLike(String value) {
            addCriterion("discount_name not like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIn(List<String> values) {
            addCriterion("discount_name in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotIn(List<String> values) {
            addCriterion("discount_name not in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameBetween(String value1, String value2) {
            addCriterion("discount_name between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotBetween(String value1, String value2) {
            addCriterion("discount_name not between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Double value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Double value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Double value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Double value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Double value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Double> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Double> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Double value1, Double value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Double value1, Double value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountStateIsNull() {
            addCriterion("discount_state is null");
            return (Criteria) this;
        }

        public Criteria andDiscountStateIsNotNull() {
            addCriterion("discount_state is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountStateEqualTo(Integer value) {
            addCriterion("discount_state =", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateNotEqualTo(Integer value) {
            addCriterion("discount_state <>", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateGreaterThan(Integer value) {
            addCriterion("discount_state >", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_state >=", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateLessThan(Integer value) {
            addCriterion("discount_state <", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateLessThanOrEqualTo(Integer value) {
            addCriterion("discount_state <=", value, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateIn(List<Integer> values) {
            addCriterion("discount_state in", values, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateNotIn(List<Integer> values) {
            addCriterion("discount_state not in", values, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateBetween(Integer value1, Integer value2) {
            addCriterion("discount_state between", value1, value2, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountStateNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_state not between", value1, value2, "discountState");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleIsNull() {
            addCriterion("discount_title is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleIsNotNull() {
            addCriterion("discount_title is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleEqualTo(String value) {
            addCriterion("discount_title =", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleNotEqualTo(String value) {
            addCriterion("discount_title <>", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleGreaterThan(String value) {
            addCriterion("discount_title >", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleGreaterThanOrEqualTo(String value) {
            addCriterion("discount_title >=", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleLessThan(String value) {
            addCriterion("discount_title <", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleLessThanOrEqualTo(String value) {
            addCriterion("discount_title <=", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleLike(String value) {
            addCriterion("discount_title like", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleNotLike(String value) {
            addCriterion("discount_title not like", value, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleIn(List<String> values) {
            addCriterion("discount_title in", values, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleNotIn(List<String> values) {
            addCriterion("discount_title not in", values, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleBetween(String value1, String value2) {
            addCriterion("discount_title between", value1, value2, "discountTitle");
            return (Criteria) this;
        }

        public Criteria andDiscountTitleNotBetween(String value1, String value2) {
            addCriterion("discount_title not between", value1, value2, "discountTitle");
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

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(Integer value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(Integer value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(Integer value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(Integer value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(Integer value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<Integer> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<Integer> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNull() {
            addCriterion("web_usable is null");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNotNull() {
            addCriterion("web_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWebUsableEqualTo(Integer value) {
            addCriterion("web_usable =", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotEqualTo(Integer value) {
            addCriterion("web_usable <>", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThan(Integer value) {
            addCriterion("web_usable >", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_usable >=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThan(Integer value) {
            addCriterion("web_usable <", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThanOrEqualTo(Integer value) {
            addCriterion("web_usable <=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableIn(List<Integer> values) {
            addCriterion("web_usable in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotIn(List<Integer> values) {
            addCriterion("web_usable not in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableBetween(Integer value1, Integer value2) {
            addCriterion("web_usable between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("web_usable not between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNull() {
            addCriterion("app_usable is null");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNotNull() {
            addCriterion("app_usable is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsableEqualTo(Integer value) {
            addCriterion("app_usable =", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotEqualTo(Integer value) {
            addCriterion("app_usable <>", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThan(Integer value) {
            addCriterion("app_usable >", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_usable >=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThan(Integer value) {
            addCriterion("app_usable <", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThanOrEqualTo(Integer value) {
            addCriterion("app_usable <=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableIn(List<Integer> values) {
            addCriterion("app_usable in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotIn(List<Integer> values) {
            addCriterion("app_usable not in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableBetween(Integer value1, Integer value2) {
            addCriterion("app_usable between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("app_usable not between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNull() {
            addCriterion("wechat_usable is null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNotNull() {
            addCriterion("wechat_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableEqualTo(Integer value) {
            addCriterion("wechat_usable =", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotEqualTo(Integer value) {
            addCriterion("wechat_usable <>", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThan(Integer value) {
            addCriterion("wechat_usable >", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable >=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThan(Integer value) {
            addCriterion("wechat_usable <", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable <=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIn(List<Integer> values) {
            addCriterion("wechat_usable in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotIn(List<Integer> values) {
            addCriterion("wechat_usable not in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable not between", value1, value2, "wechatUsable");
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