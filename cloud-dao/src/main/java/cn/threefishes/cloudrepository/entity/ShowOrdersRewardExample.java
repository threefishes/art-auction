package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShowOrdersRewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowOrdersRewardExample() {
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

        public Criteria andRewardIdIsNull() {
            addCriterion("reward_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardIdIsNotNull() {
            addCriterion("reward_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardIdEqualTo(Integer value) {
            addCriterion("reward_id =", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotEqualTo(Integer value) {
            addCriterion("reward_id <>", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThan(Integer value) {
            addCriterion("reward_id >", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_id >=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThan(Integer value) {
            addCriterion("reward_id <", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThanOrEqualTo(Integer value) {
            addCriterion("reward_id <=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdIn(List<Integer> values) {
            addCriterion("reward_id in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotIn(List<Integer> values) {
            addCriterion("reward_id not in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdBetween(Integer value1, Integer value2) {
            addCriterion("reward_id between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_id not between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeIsNull() {
            addCriterion("author_fee is null");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeIsNotNull() {
            addCriterion("author_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeEqualTo(BigDecimal value) {
            addCriterion("author_fee =", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeNotEqualTo(BigDecimal value) {
            addCriterion("author_fee <>", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeGreaterThan(BigDecimal value) {
            addCriterion("author_fee >", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("author_fee >=", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeLessThan(BigDecimal value) {
            addCriterion("author_fee <", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("author_fee <=", value, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeIn(List<BigDecimal> values) {
            addCriterion("author_fee in", values, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeNotIn(List<BigDecimal> values) {
            addCriterion("author_fee not in", values, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("author_fee between", value1, value2, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("author_fee not between", value1, value2, "authorFee");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdIsNull() {
            addCriterion("author_member_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdIsNotNull() {
            addCriterion("author_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdEqualTo(Integer value) {
            addCriterion("author_member_id =", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdNotEqualTo(Integer value) {
            addCriterion("author_member_id <>", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdGreaterThan(Integer value) {
            addCriterion("author_member_id >", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_member_id >=", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdLessThan(Integer value) {
            addCriterion("author_member_id <", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_member_id <=", value, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdIn(List<Integer> values) {
            addCriterion("author_member_id in", values, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdNotIn(List<Integer> values) {
            addCriterion("author_member_id not in", values, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("author_member_id between", value1, value2, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_member_id not between", value1, value2, "authorMemberId");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameIsNull() {
            addCriterion("author_member_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameIsNotNull() {
            addCriterion("author_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameEqualTo(String value) {
            addCriterion("author_member_name =", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameNotEqualTo(String value) {
            addCriterion("author_member_name <>", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameGreaterThan(String value) {
            addCriterion("author_member_name >", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_member_name >=", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameLessThan(String value) {
            addCriterion("author_member_name <", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameLessThanOrEqualTo(String value) {
            addCriterion("author_member_name <=", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameLike(String value) {
            addCriterion("author_member_name like", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameNotLike(String value) {
            addCriterion("author_member_name not like", value, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameIn(List<String> values) {
            addCriterion("author_member_name in", values, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameNotIn(List<String> values) {
            addCriterion("author_member_name not in", values, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameBetween(String value1, String value2) {
            addCriterion("author_member_name between", value1, value2, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andAuthorMemberNameNotBetween(String value1, String value2) {
            addCriterion("author_member_name not between", value1, value2, "authorMemberName");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
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

        public Criteria andPayCodeIsNull() {
            addCriterion("pay_code is null");
            return (Criteria) this;
        }

        public Criteria andPayCodeIsNotNull() {
            addCriterion("pay_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayCodeEqualTo(String value) {
            addCriterion("pay_code =", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotEqualTo(String value) {
            addCriterion("pay_code <>", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThan(String value) {
            addCriterion("pay_code >", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_code >=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThan(String value) {
            addCriterion("pay_code <", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_code <=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLike(String value) {
            addCriterion("pay_code like", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotLike(String value) {
            addCriterion("pay_code not like", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeIn(List<String> values) {
            addCriterion("pay_code in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotIn(List<String> values) {
            addCriterion("pay_code not in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeBetween(String value1, String value2) {
            addCriterion("pay_code between", value1, value2, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotBetween(String value1, String value2) {
            addCriterion("pay_code not between", value1, value2, "payCode");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(Long value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(Long value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(Long value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(Long value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(Long value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<Long> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<Long> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(Long value1, Long value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(Long value1, Long value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Integer value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Integer value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Integer value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Integer value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Integer> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Integer> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Integer value1, Integer value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionIsNull() {
            addCriterion("reward_commission is null");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionIsNotNull() {
            addCriterion("reward_commission is not null");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionEqualTo(Integer value) {
            addCriterion("reward_commission =", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionNotEqualTo(Integer value) {
            addCriterion("reward_commission <>", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionGreaterThan(Integer value) {
            addCriterion("reward_commission >", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_commission >=", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionLessThan(Integer value) {
            addCriterion("reward_commission <", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionLessThanOrEqualTo(Integer value) {
            addCriterion("reward_commission <=", value, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionIn(List<Integer> values) {
            addCriterion("reward_commission in", values, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionNotIn(List<Integer> values) {
            addCriterion("reward_commission not in", values, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionBetween(Integer value1, Integer value2) {
            addCriterion("reward_commission between", value1, value2, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andRewardCommissionNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_commission not between", value1, value2, "rewardCommission");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdIsNull() {
            addCriterion("show_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdIsNotNull() {
            addCriterion("show_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdEqualTo(Integer value) {
            addCriterion("show_orders_id =", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdNotEqualTo(Integer value) {
            addCriterion("show_orders_id <>", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdGreaterThan(Integer value) {
            addCriterion("show_orders_id >", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_orders_id >=", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdLessThan(Integer value) {
            addCriterion("show_orders_id <", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("show_orders_id <=", value, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdIn(List<Integer> values) {
            addCriterion("show_orders_id in", values, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdNotIn(List<Integer> values) {
            addCriterion("show_orders_id not in", values, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("show_orders_id between", value1, value2, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("show_orders_id not between", value1, value2, "showOrdersId");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleIsNull() {
            addCriterion("show_orders_title is null");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleIsNotNull() {
            addCriterion("show_orders_title is not null");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleEqualTo(String value) {
            addCriterion("show_orders_title =", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleNotEqualTo(String value) {
            addCriterion("show_orders_title <>", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleGreaterThan(String value) {
            addCriterion("show_orders_title >", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleGreaterThanOrEqualTo(String value) {
            addCriterion("show_orders_title >=", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleLessThan(String value) {
            addCriterion("show_orders_title <", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleLessThanOrEqualTo(String value) {
            addCriterion("show_orders_title <=", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleLike(String value) {
            addCriterion("show_orders_title like", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleNotLike(String value) {
            addCriterion("show_orders_title not like", value, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleIn(List<String> values) {
            addCriterion("show_orders_title in", values, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleNotIn(List<String> values) {
            addCriterion("show_orders_title not in", values, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleBetween(String value1, String value2) {
            addCriterion("show_orders_title between", value1, value2, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andShowOrdersTitleNotBetween(String value1, String value2) {
            addCriterion("show_orders_title not between", value1, value2, "showOrdersTitle");
            return (Criteria) this;
        }

        public Criteria andSiteFeeIsNull() {
            addCriterion("site_fee is null");
            return (Criteria) this;
        }

        public Criteria andSiteFeeIsNotNull() {
            addCriterion("site_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSiteFeeEqualTo(BigDecimal value) {
            addCriterion("site_fee =", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeNotEqualTo(BigDecimal value) {
            addCriterion("site_fee <>", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeGreaterThan(BigDecimal value) {
            addCriterion("site_fee >", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("site_fee >=", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeLessThan(BigDecimal value) {
            addCriterion("site_fee <", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("site_fee <=", value, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeIn(List<BigDecimal> values) {
            addCriterion("site_fee in", values, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeNotIn(List<BigDecimal> values) {
            addCriterion("site_fee not in", values, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_fee between", value1, value2, "siteFee");
            return (Criteria) this;
        }

        public Criteria andSiteFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("site_fee not between", value1, value2, "siteFee");
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