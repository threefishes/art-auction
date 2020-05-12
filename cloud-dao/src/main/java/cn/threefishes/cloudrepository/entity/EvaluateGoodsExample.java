package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateGoodsExample() {
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

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Integer value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Integer value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Integer value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Integer value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Integer> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Integer> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
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

        public Criteria andContentAgainIsNull() {
            addCriterion("content_again is null");
            return (Criteria) this;
        }

        public Criteria andContentAgainIsNotNull() {
            addCriterion("content_again is not null");
            return (Criteria) this;
        }

        public Criteria andContentAgainEqualTo(String value) {
            addCriterion("content_again =", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainNotEqualTo(String value) {
            addCriterion("content_again <>", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainGreaterThan(String value) {
            addCriterion("content_again >", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainGreaterThanOrEqualTo(String value) {
            addCriterion("content_again >=", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainLessThan(String value) {
            addCriterion("content_again <", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainLessThanOrEqualTo(String value) {
            addCriterion("content_again <=", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainLike(String value) {
            addCriterion("content_again like", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainNotLike(String value) {
            addCriterion("content_again not like", value, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainIn(List<String> values) {
            addCriterion("content_again in", values, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainNotIn(List<String> values) {
            addCriterion("content_again not in", values, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainBetween(String value1, String value2) {
            addCriterion("content_again between", value1, value2, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andContentAgainNotBetween(String value1, String value2) {
            addCriterion("content_again not between", value1, value2, "contentAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNull() {
            addCriterion("evaluate_num is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIsNotNull() {
            addCriterion("evaluate_num is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumEqualTo(Integer value) {
            addCriterion("evaluate_num =", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotEqualTo(Integer value) {
            addCriterion("evaluate_num <>", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThan(Integer value) {
            addCriterion("evaluate_num >", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num >=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThan(Integer value) {
            addCriterion("evaluate_num <", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_num <=", value, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumIn(List<Integer> values) {
            addCriterion("evaluate_num in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotIn(List<Integer> values) {
            addCriterion("evaluate_num not in", values, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_num not between", value1, value2, "evaluateNum");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeEqualTo(Date value) {
            addCriterion("evaluate_time =", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotEqualTo(Date value) {
            addCriterion("evaluate_time <>", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThan(Date value) {
            addCriterion("evaluate_time >", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_time >=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThan(Date value) {
            addCriterion("evaluate_time <", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_time <=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIn(List<Date> values) {
            addCriterion("evaluate_time in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotIn(List<Date> values) {
            addCriterion("evaluate_time not in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainIsNull() {
            addCriterion("evaluate_time_again is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainIsNotNull() {
            addCriterion("evaluate_time_again is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainEqualTo(Date value) {
            addCriterion("evaluate_time_again =", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainNotEqualTo(Date value) {
            addCriterion("evaluate_time_again <>", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainGreaterThan(Date value) {
            addCriterion("evaluate_time_again >", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_time_again >=", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainLessThan(Date value) {
            addCriterion("evaluate_time_again <", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_time_again <=", value, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainIn(List<Date> values) {
            addCriterion("evaluate_time_again in", values, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainNotIn(List<Date> values) {
            addCriterion("evaluate_time_again not in", values, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainBetween(Date value1, Date value2) {
            addCriterion("evaluate_time_again between", value1, value2, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeAgainNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_time_again not between", value1, value2, "evaluateTimeAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentIsNull() {
            addCriterion("explain_content is null");
            return (Criteria) this;
        }

        public Criteria andExplainContentIsNotNull() {
            addCriterion("explain_content is not null");
            return (Criteria) this;
        }

        public Criteria andExplainContentEqualTo(String value) {
            addCriterion("explain_content =", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentNotEqualTo(String value) {
            addCriterion("explain_content <>", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentGreaterThan(String value) {
            addCriterion("explain_content >", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentGreaterThanOrEqualTo(String value) {
            addCriterion("explain_content >=", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentLessThan(String value) {
            addCriterion("explain_content <", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentLessThanOrEqualTo(String value) {
            addCriterion("explain_content <=", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentLike(String value) {
            addCriterion("explain_content like", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentNotLike(String value) {
            addCriterion("explain_content not like", value, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentIn(List<String> values) {
            addCriterion("explain_content in", values, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentNotIn(List<String> values) {
            addCriterion("explain_content not in", values, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentBetween(String value1, String value2) {
            addCriterion("explain_content between", value1, value2, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentNotBetween(String value1, String value2) {
            addCriterion("explain_content not between", value1, value2, "explainContent");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainIsNull() {
            addCriterion("explain_content_again is null");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainIsNotNull() {
            addCriterion("explain_content_again is not null");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainEqualTo(String value) {
            addCriterion("explain_content_again =", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainNotEqualTo(String value) {
            addCriterion("explain_content_again <>", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainGreaterThan(String value) {
            addCriterion("explain_content_again >", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainGreaterThanOrEqualTo(String value) {
            addCriterion("explain_content_again >=", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainLessThan(String value) {
            addCriterion("explain_content_again <", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainLessThanOrEqualTo(String value) {
            addCriterion("explain_content_again <=", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainLike(String value) {
            addCriterion("explain_content_again like", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainNotLike(String value) {
            addCriterion("explain_content_again not like", value, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainIn(List<String> values) {
            addCriterion("explain_content_again in", values, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainNotIn(List<String> values) {
            addCriterion("explain_content_again not in", values, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainBetween(String value1, String value2) {
            addCriterion("explain_content_again between", value1, value2, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andExplainContentAgainNotBetween(String value1, String value2) {
            addCriterion("explain_content_again not between", value1, value2, "explainContentAgain");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNull() {
            addCriterion("goods_full_specs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNotNull() {
            addCriterion("goods_full_specs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsEqualTo(String value) {
            addCriterion("goods_full_specs =", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotEqualTo(String value) {
            addCriterion("goods_full_specs <>", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThan(String value) {
            addCriterion("goods_full_specs >", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_full_specs >=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThan(String value) {
            addCriterion("goods_full_specs <", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThanOrEqualTo(String value) {
            addCriterion("goods_full_specs <=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLike(String value) {
            addCriterion("goods_full_specs like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotLike(String value) {
            addCriterion("goods_full_specs not like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIn(List<String> values) {
            addCriterion("goods_full_specs in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotIn(List<String> values) {
            addCriterion("goods_full_specs not in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsBetween(String value1, String value2) {
            addCriterion("goods_full_specs between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotBetween(String value1, String value2) {
            addCriterion("goods_full_specs not between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andHasImageIsNull() {
            addCriterion("has_image is null");
            return (Criteria) this;
        }

        public Criteria andHasImageIsNotNull() {
            addCriterion("has_image is not null");
            return (Criteria) this;
        }

        public Criteria andHasImageEqualTo(Integer value) {
            addCriterion("has_image =", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotEqualTo(Integer value) {
            addCriterion("has_image <>", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageGreaterThan(Integer value) {
            addCriterion("has_image >", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_image >=", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageLessThan(Integer value) {
            addCriterion("has_image <", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageLessThanOrEqualTo(Integer value) {
            addCriterion("has_image <=", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageIn(List<Integer> values) {
            addCriterion("has_image in", values, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotIn(List<Integer> values) {
            addCriterion("has_image not in", values, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageBetween(Integer value1, Integer value2) {
            addCriterion("has_image between", value1, value2, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotBetween(Integer value1, Integer value2) {
            addCriterion("has_image not between", value1, value2, "hasImage");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesAgainIsNull() {
            addCriterion("images_again is null");
            return (Criteria) this;
        }

        public Criteria andImagesAgainIsNotNull() {
            addCriterion("images_again is not null");
            return (Criteria) this;
        }

        public Criteria andImagesAgainEqualTo(String value) {
            addCriterion("images_again =", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainNotEqualTo(String value) {
            addCriterion("images_again <>", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainGreaterThan(String value) {
            addCriterion("images_again >", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainGreaterThanOrEqualTo(String value) {
            addCriterion("images_again >=", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainLessThan(String value) {
            addCriterion("images_again <", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainLessThanOrEqualTo(String value) {
            addCriterion("images_again <=", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainLike(String value) {
            addCriterion("images_again like", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainNotLike(String value) {
            addCriterion("images_again not like", value, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainIn(List<String> values) {
            addCriterion("images_again in", values, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainNotIn(List<String> values) {
            addCriterion("images_again not in", values, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainBetween(String value1, String value2) {
            addCriterion("images_again between", value1, value2, "imagesAgain");
            return (Criteria) this;
        }

        public Criteria andImagesAgainNotBetween(String value1, String value2) {
            addCriterion("images_again not between", value1, value2, "imagesAgain");
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

        public Criteria andOrdersSnEqualTo(Long value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(Long value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(Long value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(Long value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(Long value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<Long> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<Long> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(Long value1, Long value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(Long value1, Long value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andScoresIsNull() {
            addCriterion("scores is null");
            return (Criteria) this;
        }

        public Criteria andScoresIsNotNull() {
            addCriterion("scores is not null");
            return (Criteria) this;
        }

        public Criteria andScoresEqualTo(Integer value) {
            addCriterion("scores =", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotEqualTo(Integer value) {
            addCriterion("scores <>", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresGreaterThan(Integer value) {
            addCriterion("scores >", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("scores >=", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresLessThan(Integer value) {
            addCriterion("scores <", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresLessThanOrEqualTo(Integer value) {
            addCriterion("scores <=", value, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresIn(List<Integer> values) {
            addCriterion("scores in", values, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotIn(List<Integer> values) {
            addCriterion("scores not in", values, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresBetween(Integer value1, Integer value2) {
            addCriterion("scores between", value1, value2, "scores");
            return (Criteria) this;
        }

        public Criteria andScoresNotBetween(Integer value1, Integer value2) {
            addCriterion("scores not between", value1, value2, "scores");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
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