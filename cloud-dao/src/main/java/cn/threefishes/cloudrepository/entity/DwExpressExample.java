package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class DwExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DwExpressExample() {
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

        public Criteria andDwExpressIdIsNull() {
            addCriterion("dw_express_id is null");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdIsNotNull() {
            addCriterion("dw_express_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdEqualTo(Integer value) {
            addCriterion("dw_express_id =", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdNotEqualTo(Integer value) {
            addCriterion("dw_express_id <>", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdGreaterThan(Integer value) {
            addCriterion("dw_express_id >", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dw_express_id >=", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdLessThan(Integer value) {
            addCriterion("dw_express_id <", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("dw_express_id <=", value, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdIn(List<Integer> values) {
            addCriterion("dw_express_id in", values, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdNotIn(List<Integer> values) {
            addCriterion("dw_express_id not in", values, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("dw_express_id between", value1, value2, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andDwExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dw_express_id not between", value1, value2, "dwExpressId");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNull() {
            addCriterion("ship_sn is null");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNotNull() {
            addCriterion("ship_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShipSnEqualTo(String value) {
            addCriterion("ship_sn =", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotEqualTo(String value) {
            addCriterion("ship_sn <>", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThan(String value) {
            addCriterion("ship_sn >", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThanOrEqualTo(String value) {
            addCriterion("ship_sn >=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThan(String value) {
            addCriterion("ship_sn <", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThanOrEqualTo(String value) {
            addCriterion("ship_sn <=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLike(String value) {
            addCriterion("ship_sn like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotLike(String value) {
            addCriterion("ship_sn not like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnIn(List<String> values) {
            addCriterion("ship_sn in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotIn(List<String> values) {
            addCriterion("ship_sn not in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnBetween(String value1, String value2) {
            addCriterion("ship_sn between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotBetween(String value1, String value2) {
            addCriterion("ship_sn not between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andDelyGbIsNull() {
            addCriterion("dely_gb is null");
            return (Criteria) this;
        }

        public Criteria andDelyGbIsNotNull() {
            addCriterion("dely_gb is not null");
            return (Criteria) this;
        }

        public Criteria andDelyGbEqualTo(String value) {
            addCriterion("dely_gb =", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbNotEqualTo(String value) {
            addCriterion("dely_gb <>", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbGreaterThan(String value) {
            addCriterion("dely_gb >", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbGreaterThanOrEqualTo(String value) {
            addCriterion("dely_gb >=", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbLessThan(String value) {
            addCriterion("dely_gb <", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbLessThanOrEqualTo(String value) {
            addCriterion("dely_gb <=", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbLike(String value) {
            addCriterion("dely_gb like", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbNotLike(String value) {
            addCriterion("dely_gb not like", value, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbIn(List<String> values) {
            addCriterion("dely_gb in", values, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbNotIn(List<String> values) {
            addCriterion("dely_gb not in", values, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbBetween(String value1, String value2) {
            addCriterion("dely_gb between", value1, value2, "delyGb");
            return (Criteria) this;
        }

        public Criteria andDelyGbNotBetween(String value1, String value2) {
            addCriterion("dely_gb not between", value1, value2, "delyGb");
            return (Criteria) this;
        }

        public Criteria andWbNoIsNull() {
            addCriterion("wb_no is null");
            return (Criteria) this;
        }

        public Criteria andWbNoIsNotNull() {
            addCriterion("wb_no is not null");
            return (Criteria) this;
        }

        public Criteria andWbNoEqualTo(String value) {
            addCriterion("wb_no =", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoNotEqualTo(String value) {
            addCriterion("wb_no <>", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoGreaterThan(String value) {
            addCriterion("wb_no >", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoGreaterThanOrEqualTo(String value) {
            addCriterion("wb_no >=", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoLessThan(String value) {
            addCriterion("wb_no <", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoLessThanOrEqualTo(String value) {
            addCriterion("wb_no <=", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoLike(String value) {
            addCriterion("wb_no like", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoNotLike(String value) {
            addCriterion("wb_no not like", value, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoIn(List<String> values) {
            addCriterion("wb_no in", values, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoNotIn(List<String> values) {
            addCriterion("wb_no not in", values, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoBetween(String value1, String value2) {
            addCriterion("wb_no between", value1, value2, "wbNo");
            return (Criteria) this;
        }

        public Criteria andWbNoNotBetween(String value1, String value2) {
            addCriterion("wb_no not between", value1, value2, "wbNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoIsNull() {
            addCriterion("dw_order_no is null");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoIsNotNull() {
            addCriterion("dw_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoEqualTo(String value) {
            addCriterion("dw_order_no =", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoNotEqualTo(String value) {
            addCriterion("dw_order_no <>", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoGreaterThan(String value) {
            addCriterion("dw_order_no >", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("dw_order_no >=", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoLessThan(String value) {
            addCriterion("dw_order_no <", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoLessThanOrEqualTo(String value) {
            addCriterion("dw_order_no <=", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoLike(String value) {
            addCriterion("dw_order_no like", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoNotLike(String value) {
            addCriterion("dw_order_no not like", value, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoIn(List<String> values) {
            addCriterion("dw_order_no in", values, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoNotIn(List<String> values) {
            addCriterion("dw_order_no not in", values, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoBetween(String value1, String value2) {
            addCriterion("dw_order_no between", value1, value2, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andDwOrderNoNotBetween(String value1, String value2) {
            addCriterion("dw_order_no not between", value1, value2, "dwOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("item_code is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("item_code is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("item_code =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("item_code <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("item_code >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("item_code >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("item_code <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("item_code <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("item_code like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("item_code not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("item_code in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("item_code not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("item_code between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("item_code not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("sku_code =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("sku_code >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("sku_code <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("sku_code like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("sku_code not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("sku_code in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIsNull() {
            addCriterion("code_sname is null");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIsNotNull() {
            addCriterion("code_sname is not null");
            return (Criteria) this;
        }

        public Criteria andCodeSnameEqualTo(String value) {
            addCriterion("code_sname =", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotEqualTo(String value) {
            addCriterion("code_sname <>", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameGreaterThan(String value) {
            addCriterion("code_sname >", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameGreaterThanOrEqualTo(String value) {
            addCriterion("code_sname >=", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLessThan(String value) {
            addCriterion("code_sname <", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLessThanOrEqualTo(String value) {
            addCriterion("code_sname <=", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameLike(String value) {
            addCriterion("code_sname like", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotLike(String value) {
            addCriterion("code_sname not like", value, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameIn(List<String> values) {
            addCriterion("code_sname in", values, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotIn(List<String> values) {
            addCriterion("code_sname not in", values, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameBetween(String value1, String value2) {
            addCriterion("code_sname between", value1, value2, "codeSname");
            return (Criteria) this;
        }

        public Criteria andCodeSnameNotBetween(String value1, String value2) {
            addCriterion("code_sname not between", value1, value2, "codeSname");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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