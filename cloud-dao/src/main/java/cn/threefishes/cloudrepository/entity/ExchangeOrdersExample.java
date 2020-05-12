package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeOrdersExample() {
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

        public Criteria andExchangeSnIsNull() {
            addCriterion("exchange_sn is null");
            return (Criteria) this;
        }

        public Criteria andExchangeSnIsNotNull() {
            addCriterion("exchange_sn is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeSnEqualTo(String value) {
            addCriterion("exchange_sn =", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnNotEqualTo(String value) {
            addCriterion("exchange_sn <>", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnGreaterThan(String value) {
            addCriterion("exchange_sn >", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_sn >=", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnLessThan(String value) {
            addCriterion("exchange_sn <", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnLessThanOrEqualTo(String value) {
            addCriterion("exchange_sn <=", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnLike(String value) {
            addCriterion("exchange_sn like", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnNotLike(String value) {
            addCriterion("exchange_sn not like", value, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnIn(List<String> values) {
            addCriterion("exchange_sn in", values, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnNotIn(List<String> values) {
            addCriterion("exchange_sn not in", values, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnBetween(String value1, String value2) {
            addCriterion("exchange_sn between", value1, value2, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeSnNotBetween(String value1, String value2) {
            addCriterion("exchange_sn not between", value1, value2, "exchangeSn");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameIsNull() {
            addCriterion("exchange_user_name is null");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameIsNotNull() {
            addCriterion("exchange_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameEqualTo(String value) {
            addCriterion("exchange_user_name =", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameNotEqualTo(String value) {
            addCriterion("exchange_user_name <>", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameGreaterThan(String value) {
            addCriterion("exchange_user_name >", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_user_name >=", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameLessThan(String value) {
            addCriterion("exchange_user_name <", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameLessThanOrEqualTo(String value) {
            addCriterion("exchange_user_name <=", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameLike(String value) {
            addCriterion("exchange_user_name like", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameNotLike(String value) {
            addCriterion("exchange_user_name not like", value, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameIn(List<String> values) {
            addCriterion("exchange_user_name in", values, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameNotIn(List<String> values) {
            addCriterion("exchange_user_name not in", values, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameBetween(String value1, String value2) {
            addCriterion("exchange_user_name between", value1, value2, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andExchangeUserNameNotBetween(String value1, String value2) {
            addCriterion("exchange_user_name not between", value1, value2, "exchangeUserName");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNull() {
            addCriterion("orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNotNull() {
            addCriterion("orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnEqualTo(String value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(String value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(String value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(String value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLike(String value) {
            addCriterion("orders_sn like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotLike(String value) {
            addCriterion("orders_sn not like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<String> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<String> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(String value1, String value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(String value1, String value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdIsNull() {
            addCriterion("goods_common_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdIsNotNull() {
            addCriterion("goods_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdEqualTo(Integer value) {
            addCriterion("goods_common_id =", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotEqualTo(Integer value) {
            addCriterion("goods_common_id <>", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdGreaterThan(Integer value) {
            addCriterion("goods_common_id >", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_common_id >=", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdLessThan(Integer value) {
            addCriterion("goods_common_id <", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_common_id <=", value, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdIn(List<Integer> values) {
            addCriterion("goods_common_id in", values, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotIn(List<Integer> values) {
            addCriterion("goods_common_id not in", values, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_common_id between", value1, value2, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_common_id not between", value1, value2, "goodsCommonId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
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

        public Criteria andExchangeAmountIsNull() {
            addCriterion("exchange_amount is null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIsNotNull() {
            addCriterion("exchange_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountEqualTo(Double value) {
            addCriterion("exchange_amount =", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotEqualTo(Double value) {
            addCriterion("exchange_amount <>", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThan(Double value) {
            addCriterion("exchange_amount >", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("exchange_amount >=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThan(Double value) {
            addCriterion("exchange_amount <", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThanOrEqualTo(Double value) {
            addCriterion("exchange_amount <=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIn(List<Double> values) {
            addCriterion("exchange_amount in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotIn(List<Double> values) {
            addCriterion("exchange_amount not in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountBetween(Double value1, Double value2) {
            addCriterion("exchange_amount between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotBetween(Double value1, Double value2) {
            addCriterion("exchange_amount not between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNull() {
            addCriterion("exchange_num is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNotNull() {
            addCriterion("exchange_num is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumEqualTo(Integer value) {
            addCriterion("exchange_num =", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotEqualTo(Integer value) {
            addCriterion("exchange_num <>", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThan(Integer value) {
            addCriterion("exchange_num >", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_num >=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThan(Integer value) {
            addCriterion("exchange_num <", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_num <=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIn(List<Integer> values) {
            addCriterion("exchange_num in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotIn(List<Integer> values) {
            addCriterion("exchange_num not in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumBetween(Integer value1, Integer value2) {
            addCriterion("exchange_num between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_num not between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNull() {
            addCriterion("ship_code is null");
            return (Criteria) this;
        }

        public Criteria andShipCodeIsNotNull() {
            addCriterion("ship_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodeEqualTo(String value) {
            addCriterion("ship_code =", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotEqualTo(String value) {
            addCriterion("ship_code <>", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThan(String value) {
            addCriterion("ship_code >", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_code >=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThan(String value) {
            addCriterion("ship_code <", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLessThanOrEqualTo(String value) {
            addCriterion("ship_code <=", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeLike(String value) {
            addCriterion("ship_code like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotLike(String value) {
            addCriterion("ship_code not like", value, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeIn(List<String> values) {
            addCriterion("ship_code in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotIn(List<String> values) {
            addCriterion("ship_code not in", values, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeBetween(String value1, String value2) {
            addCriterion("ship_code between", value1, value2, "shipCode");
            return (Criteria) this;
        }

        public Criteria andShipCodeNotBetween(String value1, String value2) {
            addCriterion("ship_code not between", value1, value2, "shipCode");
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

        public Criteria andShipInfoIsNull() {
            addCriterion("ship_info is null");
            return (Criteria) this;
        }

        public Criteria andShipInfoIsNotNull() {
            addCriterion("ship_info is not null");
            return (Criteria) this;
        }

        public Criteria andShipInfoEqualTo(String value) {
            addCriterion("ship_info =", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoNotEqualTo(String value) {
            addCriterion("ship_info <>", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoGreaterThan(String value) {
            addCriterion("ship_info >", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ship_info >=", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoLessThan(String value) {
            addCriterion("ship_info <", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoLessThanOrEqualTo(String value) {
            addCriterion("ship_info <=", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoLike(String value) {
            addCriterion("ship_info like", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoNotLike(String value) {
            addCriterion("ship_info not like", value, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoIn(List<String> values) {
            addCriterion("ship_info in", values, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoNotIn(List<String> values) {
            addCriterion("ship_info not in", values, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoBetween(String value1, String value2) {
            addCriterion("ship_info between", value1, value2, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipInfoNotBetween(String value1, String value2) {
            addCriterion("ship_info not between", value1, value2, "shipInfo");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Date value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Date value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Date value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Date value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Date> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Date> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Date value1, Date value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteIsNull() {
            addCriterion("exchange_note is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteIsNotNull() {
            addCriterion("exchange_note is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteEqualTo(String value) {
            addCriterion("exchange_note =", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteNotEqualTo(String value) {
            addCriterion("exchange_note <>", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteGreaterThan(String value) {
            addCriterion("exchange_note >", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_note >=", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteLessThan(String value) {
            addCriterion("exchange_note <", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteLessThanOrEqualTo(String value) {
            addCriterion("exchange_note <=", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteLike(String value) {
            addCriterion("exchange_note like", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteNotLike(String value) {
            addCriterion("exchange_note not like", value, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteIn(List<String> values) {
            addCriterion("exchange_note in", values, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteNotIn(List<String> values) {
            addCriterion("exchange_note not in", values, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteBetween(String value1, String value2) {
            addCriterion("exchange_note between", value1, value2, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeNoteNotBetween(String value1, String value2) {
            addCriterion("exchange_note not between", value1, value2, "exchangeNote");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNull() {
            addCriterion("exchange_reason is null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNotNull() {
            addCriterion("exchange_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonEqualTo(String value) {
            addCriterion("exchange_reason =", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotEqualTo(String value) {
            addCriterion("exchange_reason <>", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThan(String value) {
            addCriterion("exchange_reason >", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_reason >=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThan(String value) {
            addCriterion("exchange_reason <", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThanOrEqualTo(String value) {
            addCriterion("exchange_reason <=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLike(String value) {
            addCriterion("exchange_reason like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotLike(String value) {
            addCriterion("exchange_reason not like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIn(List<String> values) {
            addCriterion("exchange_reason in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotIn(List<String> values) {
            addCriterion("exchange_reason not in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonBetween(String value1, String value2) {
            addCriterion("exchange_reason between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotBetween(String value1, String value2) {
            addCriterion("exchange_reason not between", value1, value2, "exchangeReason");
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