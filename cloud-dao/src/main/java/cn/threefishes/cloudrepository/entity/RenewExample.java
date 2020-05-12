package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RenewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RenewExample() {
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

        public Criteria andRenewIdIsNull() {
            addCriterion("renew_id is null");
            return (Criteria) this;
        }

        public Criteria andRenewIdIsNotNull() {
            addCriterion("renew_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenewIdEqualTo(Integer value) {
            addCriterion("renew_id =", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdNotEqualTo(Integer value) {
            addCriterion("renew_id <>", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdGreaterThan(Integer value) {
            addCriterion("renew_id >", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("renew_id >=", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdLessThan(Integer value) {
            addCriterion("renew_id <", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdLessThanOrEqualTo(Integer value) {
            addCriterion("renew_id <=", value, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdIn(List<Integer> values) {
            addCriterion("renew_id in", values, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdNotIn(List<Integer> values) {
            addCriterion("renew_id not in", values, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdBetween(Integer value1, Integer value2) {
            addCriterion("renew_id between", value1, value2, "renewId");
            return (Criteria) this;
        }

        public Criteria andRenewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("renew_id not between", value1, value2, "renewId");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsIsNull() {
            addCriterion("allow_foreign_goods is null");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsIsNotNull() {
            addCriterion("allow_foreign_goods is not null");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsEqualTo(Integer value) {
            addCriterion("allow_foreign_goods =", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotEqualTo(Integer value) {
            addCriterion("allow_foreign_goods <>", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsGreaterThan(Integer value) {
            addCriterion("allow_foreign_goods >", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_foreign_goods >=", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsLessThan(Integer value) {
            addCriterion("allow_foreign_goods <", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("allow_foreign_goods <=", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsIn(List<Integer> values) {
            addCriterion("allow_foreign_goods in", values, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotIn(List<Integer> values) {
            addCriterion("allow_foreign_goods not in", values, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsBetween(Integer value1, Integer value2) {
            addCriterion("allow_foreign_goods between", value1, value2, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_foreign_goods not between", value1, value2, "allowForeignGoods");
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayCertIsNull() {
            addCriterion("pay_cert is null");
            return (Criteria) this;
        }

        public Criteria andPayCertIsNotNull() {
            addCriterion("pay_cert is not null");
            return (Criteria) this;
        }

        public Criteria andPayCertEqualTo(String value) {
            addCriterion("pay_cert =", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertNotEqualTo(String value) {
            addCriterion("pay_cert <>", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertGreaterThan(String value) {
            addCriterion("pay_cert >", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertGreaterThanOrEqualTo(String value) {
            addCriterion("pay_cert >=", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertLessThan(String value) {
            addCriterion("pay_cert <", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertLessThanOrEqualTo(String value) {
            addCriterion("pay_cert <=", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertLike(String value) {
            addCriterion("pay_cert like", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertNotLike(String value) {
            addCriterion("pay_cert not like", value, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertIn(List<String> values) {
            addCriterion("pay_cert in", values, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertNotIn(List<String> values) {
            addCriterion("pay_cert not in", values, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertBetween(String value1, String value2) {
            addCriterion("pay_cert between", value1, value2, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertNotBetween(String value1, String value2) {
            addCriterion("pay_cert not between", value1, value2, "payCert");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteIsNull() {
            addCriterion("pay_cert_note is null");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteIsNotNull() {
            addCriterion("pay_cert_note is not null");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteEqualTo(String value) {
            addCriterion("pay_cert_note =", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteNotEqualTo(String value) {
            addCriterion("pay_cert_note <>", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteGreaterThan(String value) {
            addCriterion("pay_cert_note >", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pay_cert_note >=", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteLessThan(String value) {
            addCriterion("pay_cert_note <", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteLessThanOrEqualTo(String value) {
            addCriterion("pay_cert_note <=", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteLike(String value) {
            addCriterion("pay_cert_note like", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteNotLike(String value) {
            addCriterion("pay_cert_note not like", value, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteIn(List<String> values) {
            addCriterion("pay_cert_note in", values, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteNotIn(List<String> values) {
            addCriterion("pay_cert_note not in", values, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteBetween(String value1, String value2) {
            addCriterion("pay_cert_note between", value1, value2, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andPayCertNoteNotBetween(String value1, String value2) {
            addCriterion("pay_cert_note not between", value1, value2, "payCertNote");
            return (Criteria) this;
        }

        public Criteria andRenewPriceIsNull() {
            addCriterion("renew_price is null");
            return (Criteria) this;
        }

        public Criteria andRenewPriceIsNotNull() {
            addCriterion("renew_price is not null");
            return (Criteria) this;
        }

        public Criteria andRenewPriceEqualTo(BigDecimal value) {
            addCriterion("renew_price =", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceNotEqualTo(BigDecimal value) {
            addCriterion("renew_price <>", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceGreaterThan(BigDecimal value) {
            addCriterion("renew_price >", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renew_price >=", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceLessThan(BigDecimal value) {
            addCriterion("renew_price <", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renew_price <=", value, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceIn(List<BigDecimal> values) {
            addCriterion("renew_price in", values, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceNotIn(List<BigDecimal> values) {
            addCriterion("renew_price not in", values, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renew_price between", value1, value2, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renew_price not between", value1, value2, "renewPrice");
            return (Criteria) this;
        }

        public Criteria andRenewStateIsNull() {
            addCriterion("renew_state is null");
            return (Criteria) this;
        }

        public Criteria andRenewStateIsNotNull() {
            addCriterion("renew_state is not null");
            return (Criteria) this;
        }

        public Criteria andRenewStateEqualTo(Integer value) {
            addCriterion("renew_state =", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotEqualTo(Integer value) {
            addCriterion("renew_state <>", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateGreaterThan(Integer value) {
            addCriterion("renew_state >", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("renew_state >=", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateLessThan(Integer value) {
            addCriterion("renew_state <", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateLessThanOrEqualTo(Integer value) {
            addCriterion("renew_state <=", value, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateIn(List<Integer> values) {
            addCriterion("renew_state in", values, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotIn(List<Integer> values) {
            addCriterion("renew_state not in", values, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateBetween(Integer value1, Integer value2) {
            addCriterion("renew_state between", value1, value2, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewStateNotBetween(Integer value1, Integer value2) {
            addCriterion("renew_state not between", value1, value2, "renewState");
            return (Criteria) this;
        }

        public Criteria andRenewYearIsNull() {
            addCriterion("renew_year is null");
            return (Criteria) this;
        }

        public Criteria andRenewYearIsNotNull() {
            addCriterion("renew_year is not null");
            return (Criteria) this;
        }

        public Criteria andRenewYearEqualTo(Integer value) {
            addCriterion("renew_year =", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearNotEqualTo(Integer value) {
            addCriterion("renew_year <>", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearGreaterThan(Integer value) {
            addCriterion("renew_year >", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("renew_year >=", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearLessThan(Integer value) {
            addCriterion("renew_year <", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearLessThanOrEqualTo(Integer value) {
            addCriterion("renew_year <=", value, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearIn(List<Integer> values) {
            addCriterion("renew_year in", values, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearNotIn(List<Integer> values) {
            addCriterion("renew_year not in", values, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearBetween(Integer value1, Integer value2) {
            addCriterion("renew_year between", value1, value2, "renewYear");
            return (Criteria) this;
        }

        public Criteria andRenewYearNotBetween(Integer value1, Integer value2) {
            addCriterion("renew_year not between", value1, value2, "renewYear");
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