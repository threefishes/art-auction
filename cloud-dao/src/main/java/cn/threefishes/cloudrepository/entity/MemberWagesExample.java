package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberWagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberWagesExample() {
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

        public Criteria andMemberWagesIdIsNull() {
            addCriterion("member_wages_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdIsNotNull() {
            addCriterion("member_wages_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdEqualTo(Integer value) {
            addCriterion("member_wages_id =", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdNotEqualTo(Integer value) {
            addCriterion("member_wages_id <>", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdGreaterThan(Integer value) {
            addCriterion("member_wages_id >", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_wages_id >=", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdLessThan(Integer value) {
            addCriterion("member_wages_id <", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_wages_id <=", value, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdIn(List<Integer> values) {
            addCriterion("member_wages_id in", values, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdNotIn(List<Integer> values) {
            addCriterion("member_wages_id not in", values, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdBetween(Integer value1, Integer value2) {
            addCriterion("member_wages_id between", value1, value2, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andMemberWagesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_wages_id not between", value1, value2, "memberWagesId");
            return (Criteria) this;
        }

        public Criteria andIsSuperIsNull() {
            addCriterion("is_super is null");
            return (Criteria) this;
        }

        public Criteria andIsSuperIsNotNull() {
            addCriterion("is_super is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuperEqualTo(Integer value) {
            addCriterion("is_super =", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotEqualTo(Integer value) {
            addCriterion("is_super <>", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThan(Integer value) {
            addCriterion("is_super >", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_super >=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThan(Integer value) {
            addCriterion("is_super <", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThanOrEqualTo(Integer value) {
            addCriterion("is_super <=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperIn(List<Integer> values) {
            addCriterion("is_super in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotIn(List<Integer> values) {
            addCriterion("is_super not in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperBetween(Integer value1, Integer value2) {
            addCriterion("is_super between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotBetween(Integer value1, Integer value2) {
            addCriterion("is_super not between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdIsNull() {
            addCriterion("wages_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdIsNotNull() {
            addCriterion("wages_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdEqualTo(Integer value) {
            addCriterion("wages_bill_id =", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdNotEqualTo(Integer value) {
            addCriterion("wages_bill_id <>", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdGreaterThan(Integer value) {
            addCriterion("wages_bill_id >", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wages_bill_id >=", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdLessThan(Integer value) {
            addCriterion("wages_bill_id <", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("wages_bill_id <=", value, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdIn(List<Integer> values) {
            addCriterion("wages_bill_id in", values, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdNotIn(List<Integer> values) {
            addCriterion("wages_bill_id not in", values, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdBetween(Integer value1, Integer value2) {
            addCriterion("wages_bill_id between", value1, value2, "wagesBillId");
            return (Criteria) this;
        }

        public Criteria andWagesBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wages_bill_id not between", value1, value2, "wagesBillId");
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

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNull() {
            addCriterion("do_time is null");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNotNull() {
            addCriterion("do_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoTimeEqualTo(Date value) {
            addCriterion("do_time =", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotEqualTo(Date value) {
            addCriterion("do_time <>", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThan(Date value) {
            addCriterion("do_time >", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("do_time >=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThan(Date value) {
            addCriterion("do_time <", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThanOrEqualTo(Date value) {
            addCriterion("do_time <=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeIn(List<Date> values) {
            addCriterion("do_time in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotIn(List<Date> values) {
            addCriterion("do_time not in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeBetween(Date value1, Date value2) {
            addCriterion("do_time between", value1, value2, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotBetween(Date value1, Date value2) {
            addCriterion("do_time not between", value1, value2, "doTime");
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

        public Criteria andWagesAmountIsNull() {
            addCriterion("wages_amount is null");
            return (Criteria) this;
        }

        public Criteria andWagesAmountIsNotNull() {
            addCriterion("wages_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWagesAmountEqualTo(BigDecimal value) {
            addCriterion("wages_amount =", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountNotEqualTo(BigDecimal value) {
            addCriterion("wages_amount <>", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountGreaterThan(BigDecimal value) {
            addCriterion("wages_amount >", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wages_amount >=", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountLessThan(BigDecimal value) {
            addCriterion("wages_amount <", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wages_amount <=", value, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountIn(List<BigDecimal> values) {
            addCriterion("wages_amount in", values, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountNotIn(List<BigDecimal> values) {
            addCriterion("wages_amount not in", values, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wages_amount between", value1, value2, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andWagesAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wages_amount not between", value1, value2, "wagesAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountIsNull() {
            addCriterion("eagle_award_amount is null");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountIsNotNull() {
            addCriterion("eagle_award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountEqualTo(BigDecimal value) {
            addCriterion("eagle_award_amount =", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("eagle_award_amount <>", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("eagle_award_amount >", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eagle_award_amount >=", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountLessThan(BigDecimal value) {
            addCriterion("eagle_award_amount <", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eagle_award_amount <=", value, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountIn(List<BigDecimal> values) {
            addCriterion("eagle_award_amount in", values, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("eagle_award_amount not in", values, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eagle_award_amount between", value1, value2, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andEagleAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eagle_award_amount not between", value1, value2, "eagleAwardAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountIsNull() {
            addCriterion("team_amount is null");
            return (Criteria) this;
        }

        public Criteria andTeamAmountIsNotNull() {
            addCriterion("team_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTeamAmountEqualTo(BigDecimal value) {
            addCriterion("team_amount =", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountNotEqualTo(BigDecimal value) {
            addCriterion("team_amount <>", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountGreaterThan(BigDecimal value) {
            addCriterion("team_amount >", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_amount >=", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountLessThan(BigDecimal value) {
            addCriterion("team_amount <", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_amount <=", value, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountIn(List<BigDecimal> values) {
            addCriterion("team_amount in", values, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountNotIn(List<BigDecimal> values) {
            addCriterion("team_amount not in", values, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_amount between", value1, value2, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andTeamAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_amount not between", value1, value2, "teamAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountIsNull() {
            addCriterion("distributor_up_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountIsNotNull() {
            addCriterion("distributor_up_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountEqualTo(BigDecimal value) {
            addCriterion("distributor_up_amount =", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountNotEqualTo(BigDecimal value) {
            addCriterion("distributor_up_amount <>", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountGreaterThan(BigDecimal value) {
            addCriterion("distributor_up_amount >", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distributor_up_amount >=", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountLessThan(BigDecimal value) {
            addCriterion("distributor_up_amount <", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distributor_up_amount <=", value, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountIn(List<BigDecimal> values) {
            addCriterion("distributor_up_amount in", values, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountNotIn(List<BigDecimal> values) {
            addCriterion("distributor_up_amount not in", values, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distributor_up_amount between", value1, value2, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andDistributorUpAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distributor_up_amount not between", value1, value2, "distributorUpAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountIsNull() {
            addCriterion("open_shop_amount is null");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountIsNotNull() {
            addCriterion("open_shop_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount =", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount <>", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountGreaterThan(BigDecimal value) {
            addCriterion("open_shop_amount >", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount >=", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountLessThan(BigDecimal value) {
            addCriterion("open_shop_amount <", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("open_shop_amount <=", value, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountIn(List<BigDecimal> values) {
            addCriterion("open_shop_amount in", values, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotIn(List<BigDecimal> values) {
            addCriterion("open_shop_amount not in", values, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_shop_amount between", value1, value2, "openShopAmount");
            return (Criteria) this;
        }

        public Criteria andOpenShopAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_shop_amount not between", value1, value2, "openShopAmount");
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