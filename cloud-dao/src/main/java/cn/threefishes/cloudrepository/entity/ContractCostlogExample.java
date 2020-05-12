package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractCostlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractCostlogExample() {
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

        public Criteria andClogIdIsNull() {
            addCriterion("clog_id is null");
            return (Criteria) this;
        }

        public Criteria andClogIdIsNotNull() {
            addCriterion("clog_id is not null");
            return (Criteria) this;
        }

        public Criteria andClogIdEqualTo(Integer value) {
            addCriterion("clog_id =", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdNotEqualTo(Integer value) {
            addCriterion("clog_id <>", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdGreaterThan(Integer value) {
            addCriterion("clog_id >", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clog_id >=", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdLessThan(Integer value) {
            addCriterion("clog_id <", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdLessThanOrEqualTo(Integer value) {
            addCriterion("clog_id <=", value, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdIn(List<Integer> values) {
            addCriterion("clog_id in", values, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdNotIn(List<Integer> values) {
            addCriterion("clog_id not in", values, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdBetween(Integer value1, Integer value2) {
            addCriterion("clog_id between", value1, value2, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clog_id not between", value1, value2, "clogId");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeIsNull() {
            addCriterion("clog_addtime is null");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeIsNotNull() {
            addCriterion("clog_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeEqualTo(Date value) {
            addCriterion("clog_addtime =", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeNotEqualTo(Date value) {
            addCriterion("clog_addtime <>", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeGreaterThan(Date value) {
            addCriterion("clog_addtime >", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clog_addtime >=", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeLessThan(Date value) {
            addCriterion("clog_addtime <", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("clog_addtime <=", value, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeIn(List<Date> values) {
            addCriterion("clog_addtime in", values, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeNotIn(List<Date> values) {
            addCriterion("clog_addtime not in", values, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeBetween(Date value1, Date value2) {
            addCriterion("clog_addtime between", value1, value2, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("clog_addtime not between", value1, value2, "clogAddtime");
            return (Criteria) this;
        }

        public Criteria andClogAdminidIsNull() {
            addCriterion("clog_adminid is null");
            return (Criteria) this;
        }

        public Criteria andClogAdminidIsNotNull() {
            addCriterion("clog_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andClogAdminidEqualTo(Integer value) {
            addCriterion("clog_adminid =", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidNotEqualTo(Integer value) {
            addCriterion("clog_adminid <>", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidGreaterThan(Integer value) {
            addCriterion("clog_adminid >", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clog_adminid >=", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidLessThan(Integer value) {
            addCriterion("clog_adminid <", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("clog_adminid <=", value, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidIn(List<Integer> values) {
            addCriterion("clog_adminid in", values, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidNotIn(List<Integer> values) {
            addCriterion("clog_adminid not in", values, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidBetween(Integer value1, Integer value2) {
            addCriterion("clog_adminid between", value1, value2, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("clog_adminid not between", value1, value2, "clogAdminid");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameIsNull() {
            addCriterion("clog_adminname is null");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameIsNotNull() {
            addCriterion("clog_adminname is not null");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameEqualTo(String value) {
            addCriterion("clog_adminname =", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameNotEqualTo(String value) {
            addCriterion("clog_adminname <>", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameGreaterThan(String value) {
            addCriterion("clog_adminname >", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("clog_adminname >=", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameLessThan(String value) {
            addCriterion("clog_adminname <", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameLessThanOrEqualTo(String value) {
            addCriterion("clog_adminname <=", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameLike(String value) {
            addCriterion("clog_adminname like", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameNotLike(String value) {
            addCriterion("clog_adminname not like", value, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameIn(List<String> values) {
            addCriterion("clog_adminname in", values, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameNotIn(List<String> values) {
            addCriterion("clog_adminname not in", values, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameBetween(String value1, String value2) {
            addCriterion("clog_adminname between", value1, value2, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogAdminnameNotBetween(String value1, String value2) {
            addCriterion("clog_adminname not between", value1, value2, "clogAdminname");
            return (Criteria) this;
        }

        public Criteria andClogDescIsNull() {
            addCriterion("clog_desc is null");
            return (Criteria) this;
        }

        public Criteria andClogDescIsNotNull() {
            addCriterion("clog_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClogDescEqualTo(String value) {
            addCriterion("clog_desc =", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescNotEqualTo(String value) {
            addCriterion("clog_desc <>", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescGreaterThan(String value) {
            addCriterion("clog_desc >", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescGreaterThanOrEqualTo(String value) {
            addCriterion("clog_desc >=", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescLessThan(String value) {
            addCriterion("clog_desc <", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescLessThanOrEqualTo(String value) {
            addCriterion("clog_desc <=", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescLike(String value) {
            addCriterion("clog_desc like", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescNotLike(String value) {
            addCriterion("clog_desc not like", value, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescIn(List<String> values) {
            addCriterion("clog_desc in", values, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescNotIn(List<String> values) {
            addCriterion("clog_desc not in", values, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescBetween(String value1, String value2) {
            addCriterion("clog_desc between", value1, value2, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogDescNotBetween(String value1, String value2) {
            addCriterion("clog_desc not between", value1, value2, "clogDesc");
            return (Criteria) this;
        }

        public Criteria andClogItemidIsNull() {
            addCriterion("clog_itemid is null");
            return (Criteria) this;
        }

        public Criteria andClogItemidIsNotNull() {
            addCriterion("clog_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andClogItemidEqualTo(Integer value) {
            addCriterion("clog_itemid =", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidNotEqualTo(Integer value) {
            addCriterion("clog_itemid <>", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidGreaterThan(Integer value) {
            addCriterion("clog_itemid >", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clog_itemid >=", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidLessThan(Integer value) {
            addCriterion("clog_itemid <", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidLessThanOrEqualTo(Integer value) {
            addCriterion("clog_itemid <=", value, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidIn(List<Integer> values) {
            addCriterion("clog_itemid in", values, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidNotIn(List<Integer> values) {
            addCriterion("clog_itemid not in", values, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidBetween(Integer value1, Integer value2) {
            addCriterion("clog_itemid between", value1, value2, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("clog_itemid not between", value1, value2, "clogItemid");
            return (Criteria) this;
        }

        public Criteria andClogItemnameIsNull() {
            addCriterion("clog_itemname is null");
            return (Criteria) this;
        }

        public Criteria andClogItemnameIsNotNull() {
            addCriterion("clog_itemname is not null");
            return (Criteria) this;
        }

        public Criteria andClogItemnameEqualTo(String value) {
            addCriterion("clog_itemname =", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameNotEqualTo(String value) {
            addCriterion("clog_itemname <>", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameGreaterThan(String value) {
            addCriterion("clog_itemname >", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("clog_itemname >=", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameLessThan(String value) {
            addCriterion("clog_itemname <", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameLessThanOrEqualTo(String value) {
            addCriterion("clog_itemname <=", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameLike(String value) {
            addCriterion("clog_itemname like", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameNotLike(String value) {
            addCriterion("clog_itemname not like", value, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameIn(List<String> values) {
            addCriterion("clog_itemname in", values, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameNotIn(List<String> values) {
            addCriterion("clog_itemname not in", values, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameBetween(String value1, String value2) {
            addCriterion("clog_itemname between", value1, value2, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogItemnameNotBetween(String value1, String value2) {
            addCriterion("clog_itemname not between", value1, value2, "clogItemname");
            return (Criteria) this;
        }

        public Criteria andClogPriceIsNull() {
            addCriterion("clog_price is null");
            return (Criteria) this;
        }

        public Criteria andClogPriceIsNotNull() {
            addCriterion("clog_price is not null");
            return (Criteria) this;
        }

        public Criteria andClogPriceEqualTo(BigDecimal value) {
            addCriterion("clog_price =", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceNotEqualTo(BigDecimal value) {
            addCriterion("clog_price <>", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceGreaterThan(BigDecimal value) {
            addCriterion("clog_price >", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("clog_price >=", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceLessThan(BigDecimal value) {
            addCriterion("clog_price <", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("clog_price <=", value, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceIn(List<BigDecimal> values) {
            addCriterion("clog_price in", values, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceNotIn(List<BigDecimal> values) {
            addCriterion("clog_price not in", values, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clog_price between", value1, value2, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clog_price not between", value1, value2, "clogPrice");
            return (Criteria) this;
        }

        public Criteria andClogStoreidIsNull() {
            addCriterion("clog_storeid is null");
            return (Criteria) this;
        }

        public Criteria andClogStoreidIsNotNull() {
            addCriterion("clog_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andClogStoreidEqualTo(Integer value) {
            addCriterion("clog_storeid =", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidNotEqualTo(Integer value) {
            addCriterion("clog_storeid <>", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidGreaterThan(Integer value) {
            addCriterion("clog_storeid >", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clog_storeid >=", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidLessThan(Integer value) {
            addCriterion("clog_storeid <", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("clog_storeid <=", value, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidIn(List<Integer> values) {
            addCriterion("clog_storeid in", values, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidNotIn(List<Integer> values) {
            addCriterion("clog_storeid not in", values, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidBetween(Integer value1, Integer value2) {
            addCriterion("clog_storeid between", value1, value2, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("clog_storeid not between", value1, value2, "clogStoreid");
            return (Criteria) this;
        }

        public Criteria andClogStorenameIsNull() {
            addCriterion("clog_storename is null");
            return (Criteria) this;
        }

        public Criteria andClogStorenameIsNotNull() {
            addCriterion("clog_storename is not null");
            return (Criteria) this;
        }

        public Criteria andClogStorenameEqualTo(String value) {
            addCriterion("clog_storename =", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameNotEqualTo(String value) {
            addCriterion("clog_storename <>", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameGreaterThan(String value) {
            addCriterion("clog_storename >", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("clog_storename >=", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameLessThan(String value) {
            addCriterion("clog_storename <", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameLessThanOrEqualTo(String value) {
            addCriterion("clog_storename <=", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameLike(String value) {
            addCriterion("clog_storename like", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameNotLike(String value) {
            addCriterion("clog_storename not like", value, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameIn(List<String> values) {
            addCriterion("clog_storename in", values, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameNotIn(List<String> values) {
            addCriterion("clog_storename not in", values, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameBetween(String value1, String value2) {
            addCriterion("clog_storename between", value1, value2, "clogStorename");
            return (Criteria) this;
        }

        public Criteria andClogStorenameNotBetween(String value1, String value2) {
            addCriterion("clog_storename not between", value1, value2, "clogStorename");
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