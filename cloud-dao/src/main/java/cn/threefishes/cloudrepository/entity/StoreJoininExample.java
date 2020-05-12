package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreJoininExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreJoininExample() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
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

        public Criteria andJoininMessageIsNull() {
            addCriterion("joinin_message is null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIsNotNull() {
            addCriterion("joinin_message is not null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageEqualTo(String value) {
            addCriterion("joinin_message =", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotEqualTo(String value) {
            addCriterion("joinin_message <>", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThan(String value) {
            addCriterion("joinin_message >", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThanOrEqualTo(String value) {
            addCriterion("joinin_message >=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThan(String value) {
            addCriterion("joinin_message <", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThanOrEqualTo(String value) {
            addCriterion("joinin_message <=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLike(String value) {
            addCriterion("joinin_message like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotLike(String value) {
            addCriterion("joinin_message not like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIn(List<String> values) {
            addCriterion("joinin_message in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotIn(List<String> values) {
            addCriterion("joinin_message not in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageBetween(String value1, String value2) {
            addCriterion("joinin_message between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotBetween(String value1, String value2) {
            addCriterion("joinin_message not between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeIsNull() {
            addCriterion("joinin_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeIsNotNull() {
            addCriterion("joinin_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeEqualTo(Date value) {
            addCriterion("joinin_submit_time =", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeNotEqualTo(Date value) {
            addCriterion("joinin_submit_time <>", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeGreaterThan(Date value) {
            addCriterion("joinin_submit_time >", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joinin_submit_time >=", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeLessThan(Date value) {
            addCriterion("joinin_submit_time <", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("joinin_submit_time <=", value, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeIn(List<Date> values) {
            addCriterion("joinin_submit_time in", values, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeNotIn(List<Date> values) {
            addCriterion("joinin_submit_time not in", values, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("joinin_submit_time between", value1, value2, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("joinin_submit_time not between", value1, value2, "joininSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJoininYearIsNull() {
            addCriterion("joinin_year is null");
            return (Criteria) this;
        }

        public Criteria andJoininYearIsNotNull() {
            addCriterion("joinin_year is not null");
            return (Criteria) this;
        }

        public Criteria andJoininYearEqualTo(Integer value) {
            addCriterion("joinin_year =", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotEqualTo(Integer value) {
            addCriterion("joinin_year <>", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearGreaterThan(Integer value) {
            addCriterion("joinin_year >", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinin_year >=", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearLessThan(Integer value) {
            addCriterion("joinin_year <", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearLessThanOrEqualTo(Integer value) {
            addCriterion("joinin_year <=", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearIn(List<Integer> values) {
            addCriterion("joinin_year in", values, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotIn(List<Integer> values) {
            addCriterion("joinin_year not in", values, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearBetween(Integer value1, Integer value2) {
            addCriterion("joinin_year between", value1, value2, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotBetween(Integer value1, Integer value2) {
            addCriterion("joinin_year not between", value1, value2, "joininYear");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIsNull() {
            addCriterion("paying_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIsNotNull() {
            addCriterion("paying_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayingAmountEqualTo(Integer value) {
            addCriterion("paying_amount =", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotEqualTo(Integer value) {
            addCriterion("paying_amount <>", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountGreaterThan(Integer value) {
            addCriterion("paying_amount >", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("paying_amount >=", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountLessThan(Integer value) {
            addCriterion("paying_amount <", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountLessThanOrEqualTo(Integer value) {
            addCriterion("paying_amount <=", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIn(List<Integer> values) {
            addCriterion("paying_amount in", values, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotIn(List<Integer> values) {
            addCriterion("paying_amount not in", values, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountBetween(Integer value1, Integer value2) {
            addCriterion("paying_amount between", value1, value2, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("paying_amount not between", value1, value2, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateIsNull() {
            addCriterion("paying_certificate is null");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateIsNotNull() {
            addCriterion("paying_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateEqualTo(String value) {
            addCriterion("paying_certificate =", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateNotEqualTo(String value) {
            addCriterion("paying_certificate <>", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateGreaterThan(String value) {
            addCriterion("paying_certificate >", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("paying_certificate >=", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateLessThan(String value) {
            addCriterion("paying_certificate <", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateLessThanOrEqualTo(String value) {
            addCriterion("paying_certificate <=", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateLike(String value) {
            addCriterion("paying_certificate like", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateNotLike(String value) {
            addCriterion("paying_certificate not like", value, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateIn(List<String> values) {
            addCriterion("paying_certificate in", values, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateNotIn(List<String> values) {
            addCriterion("paying_certificate not in", values, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateBetween(String value1, String value2) {
            addCriterion("paying_certificate between", value1, value2, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateNotBetween(String value1, String value2) {
            addCriterion("paying_certificate not between", value1, value2, "payingCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpIsNull() {
            addCriterion("paying_CertificateExp is null");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpIsNotNull() {
            addCriterion("paying_CertificateExp is not null");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpEqualTo(String value) {
            addCriterion("paying_CertificateExp =", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpNotEqualTo(String value) {
            addCriterion("paying_CertificateExp <>", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpGreaterThan(String value) {
            addCriterion("paying_CertificateExp >", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpGreaterThanOrEqualTo(String value) {
            addCriterion("paying_CertificateExp >=", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpLessThan(String value) {
            addCriterion("paying_CertificateExp <", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpLessThanOrEqualTo(String value) {
            addCriterion("paying_CertificateExp <=", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpLike(String value) {
            addCriterion("paying_CertificateExp like", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpNotLike(String value) {
            addCriterion("paying_CertificateExp not like", value, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpIn(List<String> values) {
            addCriterion("paying_CertificateExp in", values, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpNotIn(List<String> values) {
            addCriterion("paying_CertificateExp not in", values, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpBetween(String value1, String value2) {
            addCriterion("paying_CertificateExp between", value1, value2, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andPayingCertificateexpNotBetween(String value1, String value2) {
            addCriterion("paying_CertificateExp not between", value1, value2, "payingCertificateexp");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
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

        public Criteria andAuditSubmitTimeIsNull() {
            addCriterion("audit_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeIsNotNull() {
            addCriterion("audit_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeEqualTo(Date value) {
            addCriterion("audit_submit_time =", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeNotEqualTo(Date value) {
            addCriterion("audit_submit_time <>", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeGreaterThan(Date value) {
            addCriterion("audit_submit_time >", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_submit_time >=", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeLessThan(Date value) {
            addCriterion("audit_submit_time <", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_submit_time <=", value, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeIn(List<Date> values) {
            addCriterion("audit_submit_time in", values, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeNotIn(List<Date> values) {
            addCriterion("audit_submit_time not in", values, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("audit_submit_time between", value1, value2, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andAuditSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_submit_time not between", value1, value2, "auditSubmitTime");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageIsNull() {
            addCriterion("bond_joinin_message is null");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageIsNotNull() {
            addCriterion("bond_joinin_message is not null");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageEqualTo(String value) {
            addCriterion("bond_joinin_message =", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageNotEqualTo(String value) {
            addCriterion("bond_joinin_message <>", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageGreaterThan(String value) {
            addCriterion("bond_joinin_message >", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageGreaterThanOrEqualTo(String value) {
            addCriterion("bond_joinin_message >=", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageLessThan(String value) {
            addCriterion("bond_joinin_message <", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageLessThanOrEqualTo(String value) {
            addCriterion("bond_joinin_message <=", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageLike(String value) {
            addCriterion("bond_joinin_message like", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageNotLike(String value) {
            addCriterion("bond_joinin_message not like", value, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageIn(List<String> values) {
            addCriterion("bond_joinin_message in", values, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageNotIn(List<String> values) {
            addCriterion("bond_joinin_message not in", values, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageBetween(String value1, String value2) {
            addCriterion("bond_joinin_message between", value1, value2, "bondJoininMessage");
            return (Criteria) this;
        }

        public Criteria andBondJoininMessageNotBetween(String value1, String value2) {
            addCriterion("bond_joinin_message not between", value1, value2, "bondJoininMessage");
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