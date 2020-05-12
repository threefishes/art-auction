package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsBrowseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsBrowseExample() {
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

        public Criteria andBrowseIdIsNull() {
            addCriterion("browse_id is null");
            return (Criteria) this;
        }

        public Criteria andBrowseIdIsNotNull() {
            addCriterion("browse_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseIdEqualTo(Integer value) {
            addCriterion("browse_id =", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdNotEqualTo(Integer value) {
            addCriterion("browse_id <>", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdGreaterThan(Integer value) {
            addCriterion("browse_id >", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_id >=", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdLessThan(Integer value) {
            addCriterion("browse_id <", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdLessThanOrEqualTo(Integer value) {
            addCriterion("browse_id <=", value, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdIn(List<Integer> values) {
            addCriterion("browse_id in", values, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdNotIn(List<Integer> values) {
            addCriterion("browse_id not in", values, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdBetween(Integer value1, Integer value2) {
            addCriterion("browse_id between", value1, value2, "browseId");
            return (Criteria) this;
        }

        public Criteria andBrowseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_id not between", value1, value2, "browseId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidIsNull() {
            addCriterion("goods_categoryid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidIsNotNull() {
            addCriterion("goods_categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidEqualTo(Integer value) {
            addCriterion("goods_categoryid =", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidNotEqualTo(Integer value) {
            addCriterion("goods_categoryid <>", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidGreaterThan(Integer value) {
            addCriterion("goods_categoryid >", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid >=", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidLessThan(Integer value) {
            addCriterion("goods_categoryid <", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid <=", value, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidIn(List<Integer> values) {
            addCriterion("goods_categoryid in", values, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidNotIn(List<Integer> values) {
            addCriterion("goods_categoryid not in", values, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("goods_categoryid between", value1, value2, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_categoryid not between", value1, value2, "goodsCategoryid");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1IsNull() {
            addCriterion("goods_categoryid_1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1IsNotNull() {
            addCriterion("goods_categoryid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1EqualTo(Integer value) {
            addCriterion("goods_categoryid_1 =", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1NotEqualTo(Integer value) {
            addCriterion("goods_categoryid_1 <>", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1GreaterThan(Integer value) {
            addCriterion("goods_categoryid_1 >", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_1 >=", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1LessThan(Integer value) {
            addCriterion("goods_categoryid_1 <", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1LessThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_1 <=", value, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1In(List<Integer> values) {
            addCriterion("goods_categoryid_1 in", values, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1NotIn(List<Integer> values) {
            addCriterion("goods_categoryid_1 not in", values, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1Between(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_1 between", value1, value2, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid1NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_1 not between", value1, value2, "goodsCategoryid1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2IsNull() {
            addCriterion("goods_categoryid_2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2IsNotNull() {
            addCriterion("goods_categoryid_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2EqualTo(Integer value) {
            addCriterion("goods_categoryid_2 =", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2NotEqualTo(Integer value) {
            addCriterion("goods_categoryid_2 <>", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2GreaterThan(Integer value) {
            addCriterion("goods_categoryid_2 >", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_2 >=", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2LessThan(Integer value) {
            addCriterion("goods_categoryid_2 <", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2LessThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_2 <=", value, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2In(List<Integer> values) {
            addCriterion("goods_categoryid_2 in", values, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2NotIn(List<Integer> values) {
            addCriterion("goods_categoryid_2 not in", values, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2Between(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_2 between", value1, value2, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid2NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_2 not between", value1, value2, "goodsCategoryid2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3IsNull() {
            addCriterion("goods_categoryid_3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3IsNotNull() {
            addCriterion("goods_categoryid_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3EqualTo(Integer value) {
            addCriterion("goods_categoryid_3 =", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3NotEqualTo(Integer value) {
            addCriterion("goods_categoryid_3 <>", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3GreaterThan(Integer value) {
            addCriterion("goods_categoryid_3 >", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_3 >=", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3LessThan(Integer value) {
            addCriterion("goods_categoryid_3 <", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3LessThanOrEqualTo(Integer value) {
            addCriterion("goods_categoryid_3 <=", value, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3In(List<Integer> values) {
            addCriterion("goods_categoryid_3 in", values, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3NotIn(List<Integer> values) {
            addCriterion("goods_categoryid_3 not in", values, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3Between(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_3 between", value1, value2, "goodsCategoryid3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryid3NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_categoryid_3 not between", value1, value2, "goodsCategoryid3");
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