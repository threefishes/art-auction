package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfTvGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfTvGoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNull() {
            addCriterion("dw_id is null");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNotNull() {
            addCriterion("dw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwIdEqualTo(Integer value) {
            addCriterion("dw_id =", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotEqualTo(Integer value) {
            addCriterion("dw_id <>", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThan(Integer value) {
            addCriterion("dw_id >", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_id >=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThan(Integer value) {
            addCriterion("dw_id <", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThanOrEqualTo(Integer value) {
            addCriterion("dw_id <=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdIn(List<Integer> values) {
            addCriterion("dw_id in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotIn(List<Integer> values) {
            addCriterion("dw_id not in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdBetween(Integer value1, Integer value2) {
            addCriterion("dw_id between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_id not between", value1, value2, "dwId");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andJingleIsNull() {
            addCriterion("jingle is null");
            return (Criteria) this;
        }

        public Criteria andJingleIsNotNull() {
            addCriterion("jingle is not null");
            return (Criteria) this;
        }

        public Criteria andJingleEqualTo(String value) {
            addCriterion("jingle =", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotEqualTo(String value) {
            addCriterion("jingle <>", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleGreaterThan(String value) {
            addCriterion("jingle >", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleGreaterThanOrEqualTo(String value) {
            addCriterion("jingle >=", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLessThan(String value) {
            addCriterion("jingle <", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLessThanOrEqualTo(String value) {
            addCriterion("jingle <=", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleLike(String value) {
            addCriterion("jingle like", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotLike(String value) {
            addCriterion("jingle not like", value, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleIn(List<String> values) {
            addCriterion("jingle in", values, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotIn(List<String> values) {
            addCriterion("jingle not in", values, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleBetween(String value1, String value2) {
            addCriterion("jingle between", value1, value2, "jingle");
            return (Criteria) this;
        }

        public Criteria andJingleNotBetween(String value1, String value2) {
            addCriterion("jingle not between", value1, value2, "jingle");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIsNull() {
            addCriterion("bd_btime is null");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIsNotNull() {
            addCriterion("bd_btime is not null");
            return (Criteria) this;
        }

        public Criteria andBdBtimeEqualTo(Date value) {
            addCriterion("bd_btime =", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotEqualTo(Date value) {
            addCriterion("bd_btime <>", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeGreaterThan(Date value) {
            addCriterion("bd_btime >", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bd_btime >=", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeLessThan(Date value) {
            addCriterion("bd_btime <", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeLessThanOrEqualTo(Date value) {
            addCriterion("bd_btime <=", value, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeIn(List<Date> values) {
            addCriterion("bd_btime in", values, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotIn(List<Date> values) {
            addCriterion("bd_btime not in", values, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeBetween(Date value1, Date value2) {
            addCriterion("bd_btime between", value1, value2, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdBtimeNotBetween(Date value1, Date value2) {
            addCriterion("bd_btime not between", value1, value2, "bdBtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIsNull() {
            addCriterion("bd_etime is null");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIsNotNull() {
            addCriterion("bd_etime is not null");
            return (Criteria) this;
        }

        public Criteria andBdEtimeEqualTo(Date value) {
            addCriterion("bd_etime =", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotEqualTo(Date value) {
            addCriterion("bd_etime <>", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeGreaterThan(Date value) {
            addCriterion("bd_etime >", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bd_etime >=", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeLessThan(Date value) {
            addCriterion("bd_etime <", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeLessThanOrEqualTo(Date value) {
            addCriterion("bd_etime <=", value, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeIn(List<Date> values) {
            addCriterion("bd_etime in", values, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotIn(List<Date> values) {
            addCriterion("bd_etime not in", values, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeBetween(Date value1, Date value2) {
            addCriterion("bd_etime between", value1, value2, "bdEtime");
            return (Criteria) this;
        }

        public Criteria andBdEtimeNotBetween(Date value1, Date value2) {
            addCriterion("bd_etime not between", value1, value2, "bdEtime");
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

        public Criteria andSaleAmtIsNull() {
            addCriterion("sale_amt is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIsNotNull() {
            addCriterion("sale_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtEqualTo(BigDecimal value) {
            addCriterion("sale_amt =", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotEqualTo(BigDecimal value) {
            addCriterion("sale_amt <>", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThan(BigDecimal value) {
            addCriterion("sale_amt >", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amt >=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThan(BigDecimal value) {
            addCriterion("sale_amt <", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amt <=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIn(List<BigDecimal> values) {
            addCriterion("sale_amt in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotIn(List<BigDecimal> values) {
            addCriterion("sale_amt not in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amt between", value1, value2, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amt not between", value1, value2, "saleAmt");
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