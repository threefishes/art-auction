package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractItemExample() {
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

        public Criteria andCtiIdIsNull() {
            addCriterion("cti_id is null");
            return (Criteria) this;
        }

        public Criteria andCtiIdIsNotNull() {
            addCriterion("cti_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtiIdEqualTo(Integer value) {
            addCriterion("cti_id =", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdNotEqualTo(Integer value) {
            addCriterion("cti_id <>", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdGreaterThan(Integer value) {
            addCriterion("cti_id >", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cti_id >=", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdLessThan(Integer value) {
            addCriterion("cti_id <", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdLessThanOrEqualTo(Integer value) {
            addCriterion("cti_id <=", value, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdIn(List<Integer> values) {
            addCriterion("cti_id in", values, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdNotIn(List<Integer> values) {
            addCriterion("cti_id not in", values, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdBetween(Integer value1, Integer value2) {
            addCriterion("cti_id between", value1, value2, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cti_id not between", value1, value2, "ctiId");
            return (Criteria) this;
        }

        public Criteria andCtiCostIsNull() {
            addCriterion("cti_cost is null");
            return (Criteria) this;
        }

        public Criteria andCtiCostIsNotNull() {
            addCriterion("cti_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCtiCostEqualTo(BigDecimal value) {
            addCriterion("cti_cost =", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostNotEqualTo(BigDecimal value) {
            addCriterion("cti_cost <>", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostGreaterThan(BigDecimal value) {
            addCriterion("cti_cost >", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cti_cost >=", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostLessThan(BigDecimal value) {
            addCriterion("cti_cost <", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cti_cost <=", value, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostIn(List<BigDecimal> values) {
            addCriterion("cti_cost in", values, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostNotIn(List<BigDecimal> values) {
            addCriterion("cti_cost not in", values, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cti_cost between", value1, value2, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cti_cost not between", value1, value2, "ctiCost");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeIsNull() {
            addCriterion("cti_describe is null");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeIsNotNull() {
            addCriterion("cti_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeEqualTo(String value) {
            addCriterion("cti_describe =", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeNotEqualTo(String value) {
            addCriterion("cti_describe <>", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeGreaterThan(String value) {
            addCriterion("cti_describe >", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cti_describe >=", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeLessThan(String value) {
            addCriterion("cti_describe <", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeLessThanOrEqualTo(String value) {
            addCriterion("cti_describe <=", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeLike(String value) {
            addCriterion("cti_describe like", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeNotLike(String value) {
            addCriterion("cti_describe not like", value, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeIn(List<String> values) {
            addCriterion("cti_describe in", values, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeNotIn(List<String> values) {
            addCriterion("cti_describe not in", values, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeBetween(String value1, String value2) {
            addCriterion("cti_describe between", value1, value2, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescribeNotBetween(String value1, String value2) {
            addCriterion("cti_describe not between", value1, value2, "ctiDescribe");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlIsNull() {
            addCriterion("cti_descurl is null");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlIsNotNull() {
            addCriterion("cti_descurl is not null");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlEqualTo(String value) {
            addCriterion("cti_descurl =", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlNotEqualTo(String value) {
            addCriterion("cti_descurl <>", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlGreaterThan(String value) {
            addCriterion("cti_descurl >", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlGreaterThanOrEqualTo(String value) {
            addCriterion("cti_descurl >=", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlLessThan(String value) {
            addCriterion("cti_descurl <", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlLessThanOrEqualTo(String value) {
            addCriterion("cti_descurl <=", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlLike(String value) {
            addCriterion("cti_descurl like", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlNotLike(String value) {
            addCriterion("cti_descurl not like", value, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlIn(List<String> values) {
            addCriterion("cti_descurl in", values, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlNotIn(List<String> values) {
            addCriterion("cti_descurl not in", values, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlBetween(String value1, String value2) {
            addCriterion("cti_descurl between", value1, value2, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiDescurlNotBetween(String value1, String value2) {
            addCriterion("cti_descurl not between", value1, value2, "ctiDescurl");
            return (Criteria) this;
        }

        public Criteria andCtiIconIsNull() {
            addCriterion("cti_icon is null");
            return (Criteria) this;
        }

        public Criteria andCtiIconIsNotNull() {
            addCriterion("cti_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCtiIconEqualTo(String value) {
            addCriterion("cti_icon =", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconNotEqualTo(String value) {
            addCriterion("cti_icon <>", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconGreaterThan(String value) {
            addCriterion("cti_icon >", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconGreaterThanOrEqualTo(String value) {
            addCriterion("cti_icon >=", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconLessThan(String value) {
            addCriterion("cti_icon <", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconLessThanOrEqualTo(String value) {
            addCriterion("cti_icon <=", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconLike(String value) {
            addCriterion("cti_icon like", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconNotLike(String value) {
            addCriterion("cti_icon not like", value, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconIn(List<String> values) {
            addCriterion("cti_icon in", values, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconNotIn(List<String> values) {
            addCriterion("cti_icon not in", values, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconBetween(String value1, String value2) {
            addCriterion("cti_icon between", value1, value2, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiIconNotBetween(String value1, String value2) {
            addCriterion("cti_icon not between", value1, value2, "ctiIcon");
            return (Criteria) this;
        }

        public Criteria andCtiNameIsNull() {
            addCriterion("cti_name is null");
            return (Criteria) this;
        }

        public Criteria andCtiNameIsNotNull() {
            addCriterion("cti_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtiNameEqualTo(String value) {
            addCriterion("cti_name =", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameNotEqualTo(String value) {
            addCriterion("cti_name <>", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameGreaterThan(String value) {
            addCriterion("cti_name >", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameGreaterThanOrEqualTo(String value) {
            addCriterion("cti_name >=", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameLessThan(String value) {
            addCriterion("cti_name <", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameLessThanOrEqualTo(String value) {
            addCriterion("cti_name <=", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameLike(String value) {
            addCriterion("cti_name like", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameNotLike(String value) {
            addCriterion("cti_name not like", value, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameIn(List<String> values) {
            addCriterion("cti_name in", values, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameNotIn(List<String> values) {
            addCriterion("cti_name not in", values, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameBetween(String value1, String value2) {
            addCriterion("cti_name between", value1, value2, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiNameNotBetween(String value1, String value2) {
            addCriterion("cti_name not between", value1, value2, "ctiName");
            return (Criteria) this;
        }

        public Criteria andCtiSortIsNull() {
            addCriterion("cti_sort is null");
            return (Criteria) this;
        }

        public Criteria andCtiSortIsNotNull() {
            addCriterion("cti_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCtiSortEqualTo(Integer value) {
            addCriterion("cti_sort =", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortNotEqualTo(Integer value) {
            addCriterion("cti_sort <>", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortGreaterThan(Integer value) {
            addCriterion("cti_sort >", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("cti_sort >=", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortLessThan(Integer value) {
            addCriterion("cti_sort <", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortLessThanOrEqualTo(Integer value) {
            addCriterion("cti_sort <=", value, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortIn(List<Integer> values) {
            addCriterion("cti_sort in", values, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortNotIn(List<Integer> values) {
            addCriterion("cti_sort not in", values, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortBetween(Integer value1, Integer value2) {
            addCriterion("cti_sort between", value1, value2, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiSortNotBetween(Integer value1, Integer value2) {
            addCriterion("cti_sort not between", value1, value2, "ctiSort");
            return (Criteria) this;
        }

        public Criteria andCtiStateIsNull() {
            addCriterion("cti_state is null");
            return (Criteria) this;
        }

        public Criteria andCtiStateIsNotNull() {
            addCriterion("cti_state is not null");
            return (Criteria) this;
        }

        public Criteria andCtiStateEqualTo(Integer value) {
            addCriterion("cti_state =", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateNotEqualTo(Integer value) {
            addCriterion("cti_state <>", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateGreaterThan(Integer value) {
            addCriterion("cti_state >", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cti_state >=", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateLessThan(Integer value) {
            addCriterion("cti_state <", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateLessThanOrEqualTo(Integer value) {
            addCriterion("cti_state <=", value, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateIn(List<Integer> values) {
            addCriterion("cti_state in", values, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateNotIn(List<Integer> values) {
            addCriterion("cti_state not in", values, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateBetween(Integer value1, Integer value2) {
            addCriterion("cti_state between", value1, value2, "ctiState");
            return (Criteria) this;
        }

        public Criteria andCtiStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cti_state not between", value1, value2, "ctiState");
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