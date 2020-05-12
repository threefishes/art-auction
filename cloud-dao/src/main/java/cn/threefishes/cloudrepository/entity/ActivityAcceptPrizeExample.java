package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAcceptPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAcceptPrizeExample() {
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

        public Criteria andAcceptPrizeIdIsNull() {
            addCriterion("accept_prize_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdIsNotNull() {
            addCriterion("accept_prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdEqualTo(Integer value) {
            addCriterion("accept_prize_id =", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdNotEqualTo(Integer value) {
            addCriterion("accept_prize_id <>", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdGreaterThan(Integer value) {
            addCriterion("accept_prize_id >", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accept_prize_id >=", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdLessThan(Integer value) {
            addCriterion("accept_prize_id <", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("accept_prize_id <=", value, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdIn(List<Integer> values) {
            addCriterion("accept_prize_id in", values, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdNotIn(List<Integer> values) {
            addCriterion("accept_prize_id not in", values, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("accept_prize_id between", value1, value2, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accept_prize_id not between", value1, value2, "acceptPrizeId");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressIsNull() {
            addCriterion("accept_prize_address is null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressIsNotNull() {
            addCriterion("accept_prize_address is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressEqualTo(String value) {
            addCriterion("accept_prize_address =", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressNotEqualTo(String value) {
            addCriterion("accept_prize_address <>", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressGreaterThan(String value) {
            addCriterion("accept_prize_address >", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("accept_prize_address >=", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressLessThan(String value) {
            addCriterion("accept_prize_address <", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressLessThanOrEqualTo(String value) {
            addCriterion("accept_prize_address <=", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressLike(String value) {
            addCriterion("accept_prize_address like", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressNotLike(String value) {
            addCriterion("accept_prize_address not like", value, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressIn(List<String> values) {
            addCriterion("accept_prize_address in", values, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressNotIn(List<String> values) {
            addCriterion("accept_prize_address not in", values, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressBetween(String value1, String value2) {
            addCriterion("accept_prize_address between", value1, value2, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeAddressNotBetween(String value1, String value2) {
            addCriterion("accept_prize_address not between", value1, value2, "acceptPrizeAddress");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameIsNull() {
            addCriterion("accept_prize_name is null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameIsNotNull() {
            addCriterion("accept_prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameEqualTo(String value) {
            addCriterion("accept_prize_name =", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameNotEqualTo(String value) {
            addCriterion("accept_prize_name <>", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameGreaterThan(String value) {
            addCriterion("accept_prize_name >", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("accept_prize_name >=", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameLessThan(String value) {
            addCriterion("accept_prize_name <", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("accept_prize_name <=", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameLike(String value) {
            addCriterion("accept_prize_name like", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameNotLike(String value) {
            addCriterion("accept_prize_name not like", value, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameIn(List<String> values) {
            addCriterion("accept_prize_name in", values, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameNotIn(List<String> values) {
            addCriterion("accept_prize_name not in", values, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameBetween(String value1, String value2) {
            addCriterion("accept_prize_name between", value1, value2, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizeNameNotBetween(String value1, String value2) {
            addCriterion("accept_prize_name not between", value1, value2, "acceptPrizeName");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneIsNull() {
            addCriterion("accept_prize_phone is null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneIsNotNull() {
            addCriterion("accept_prize_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneEqualTo(String value) {
            addCriterion("accept_prize_phone =", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneNotEqualTo(String value) {
            addCriterion("accept_prize_phone <>", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneGreaterThan(String value) {
            addCriterion("accept_prize_phone >", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("accept_prize_phone >=", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneLessThan(String value) {
            addCriterion("accept_prize_phone <", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneLessThanOrEqualTo(String value) {
            addCriterion("accept_prize_phone <=", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneLike(String value) {
            addCriterion("accept_prize_phone like", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneNotLike(String value) {
            addCriterion("accept_prize_phone not like", value, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneIn(List<String> values) {
            addCriterion("accept_prize_phone in", values, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneNotIn(List<String> values) {
            addCriterion("accept_prize_phone not in", values, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneBetween(String value1, String value2) {
            addCriterion("accept_prize_phone between", value1, value2, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptPrizePhoneNotBetween(String value1, String value2) {
            addCriterion("accept_prize_phone not between", value1, value2, "acceptPrizePhone");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIsNull() {
            addCriterion("accept_state is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIsNotNull() {
            addCriterion("accept_state is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStateEqualTo(Integer value) {
            addCriterion("accept_state =", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotEqualTo(Integer value) {
            addCriterion("accept_state <>", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateGreaterThan(Integer value) {
            addCriterion("accept_state >", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("accept_state >=", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateLessThan(Integer value) {
            addCriterion("accept_state <", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateLessThanOrEqualTo(Integer value) {
            addCriterion("accept_state <=", value, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateIn(List<Integer> values) {
            addCriterion("accept_state in", values, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotIn(List<Integer> values) {
            addCriterion("accept_state not in", values, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateBetween(Integer value1, Integer value2) {
            addCriterion("accept_state between", value1, value2, "acceptState");
            return (Criteria) this;
        }

        public Criteria andAcceptStateNotBetween(Integer value1, Integer value2) {
            addCriterion("accept_state not between", value1, value2, "acceptState");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Integer value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Integer value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Integer value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Integer value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Integer> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Integer> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Integer value1, Integer value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
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

        public Criteria andAwardsContentIsNull() {
            addCriterion("awards_content is null");
            return (Criteria) this;
        }

        public Criteria andAwardsContentIsNotNull() {
            addCriterion("awards_content is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsContentEqualTo(String value) {
            addCriterion("awards_content =", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotEqualTo(String value) {
            addCriterion("awards_content <>", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentGreaterThan(String value) {
            addCriterion("awards_content >", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentGreaterThanOrEqualTo(String value) {
            addCriterion("awards_content >=", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLessThan(String value) {
            addCriterion("awards_content <", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLessThanOrEqualTo(String value) {
            addCriterion("awards_content <=", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentLike(String value) {
            addCriterion("awards_content like", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotLike(String value) {
            addCriterion("awards_content not like", value, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentIn(List<String> values) {
            addCriterion("awards_content in", values, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotIn(List<String> values) {
            addCriterion("awards_content not in", values, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentBetween(String value1, String value2) {
            addCriterion("awards_content between", value1, value2, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsContentNotBetween(String value1, String value2) {
            addCriterion("awards_content not between", value1, value2, "awardsContent");
            return (Criteria) this;
        }

        public Criteria andAwardsIdIsNull() {
            addCriterion("awards_id is null");
            return (Criteria) this;
        }

        public Criteria andAwardsIdIsNotNull() {
            addCriterion("awards_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsIdEqualTo(Integer value) {
            addCriterion("awards_id =", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotEqualTo(Integer value) {
            addCriterion("awards_id <>", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdGreaterThan(Integer value) {
            addCriterion("awards_id >", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("awards_id >=", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdLessThan(Integer value) {
            addCriterion("awards_id <", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdLessThanOrEqualTo(Integer value) {
            addCriterion("awards_id <=", value, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdIn(List<Integer> values) {
            addCriterion("awards_id in", values, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotIn(List<Integer> values) {
            addCriterion("awards_id not in", values, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdBetween(Integer value1, Integer value2) {
            addCriterion("awards_id between", value1, value2, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("awards_id not between", value1, value2, "awardsId");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIsNull() {
            addCriterion("awards_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIsNotNull() {
            addCriterion("awards_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsNameEqualTo(String value) {
            addCriterion("awards_name =", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotEqualTo(String value) {
            addCriterion("awards_name <>", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameGreaterThan(String value) {
            addCriterion("awards_name >", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameGreaterThanOrEqualTo(String value) {
            addCriterion("awards_name >=", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLessThan(String value) {
            addCriterion("awards_name <", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLessThanOrEqualTo(String value) {
            addCriterion("awards_name <=", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameLike(String value) {
            addCriterion("awards_name like", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotLike(String value) {
            addCriterion("awards_name not like", value, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameIn(List<String> values) {
            addCriterion("awards_name in", values, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotIn(List<String> values) {
            addCriterion("awards_name not in", values, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameBetween(String value1, String value2) {
            addCriterion("awards_name between", value1, value2, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsNameNotBetween(String value1, String value2) {
            addCriterion("awards_name not between", value1, value2, "awardsName");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNull() {
            addCriterion("awards_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNotNull() {
            addCriterion("awards_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeEqualTo(String value) {
            addCriterion("awards_type =", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotEqualTo(String value) {
            addCriterion("awards_type <>", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThan(String value) {
            addCriterion("awards_type >", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("awards_type >=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThan(String value) {
            addCriterion("awards_type <", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThanOrEqualTo(String value) {
            addCriterion("awards_type <=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLike(String value) {
            addCriterion("awards_type like", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotLike(String value) {
            addCriterion("awards_type not like", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIn(List<String> values) {
            addCriterion("awards_type in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotIn(List<String> values) {
            addCriterion("awards_type not in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeBetween(String value1, String value2) {
            addCriterion("awards_type between", value1, value2, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotBetween(String value1, String value2) {
            addCriterion("awards_type not between", value1, value2, "awardsType");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateIsNull() {
            addCriterion("give_out_state is null");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateIsNotNull() {
            addCriterion("give_out_state is not null");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateEqualTo(Integer value) {
            addCriterion("give_out_state =", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateNotEqualTo(Integer value) {
            addCriterion("give_out_state <>", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateGreaterThan(Integer value) {
            addCriterion("give_out_state >", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_out_state >=", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateLessThan(Integer value) {
            addCriterion("give_out_state <", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateLessThanOrEqualTo(Integer value) {
            addCriterion("give_out_state <=", value, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateIn(List<Integer> values) {
            addCriterion("give_out_state in", values, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateNotIn(List<Integer> values) {
            addCriterion("give_out_state not in", values, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateBetween(Integer value1, Integer value2) {
            addCriterion("give_out_state between", value1, value2, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutStateNotBetween(Integer value1, Integer value2) {
            addCriterion("give_out_state not between", value1, value2, "giveOutState");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeIsNull() {
            addCriterion("give_out_time is null");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeIsNotNull() {
            addCriterion("give_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeEqualTo(Date value) {
            addCriterion("give_out_time =", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeNotEqualTo(Date value) {
            addCriterion("give_out_time <>", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeGreaterThan(Date value) {
            addCriterion("give_out_time >", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("give_out_time >=", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeLessThan(Date value) {
            addCriterion("give_out_time <", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("give_out_time <=", value, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeIn(List<Date> values) {
            addCriterion("give_out_time in", values, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeNotIn(List<Date> values) {
            addCriterion("give_out_time not in", values, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeBetween(Date value1, Date value2) {
            addCriterion("give_out_time between", value1, value2, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andGiveOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("give_out_time not between", value1, value2, "giveOutTime");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIsNull() {
            addCriterion("member_avatar is null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIsNotNull() {
            addCriterion("member_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarEqualTo(String value) {
            addCriterion("member_avatar =", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotEqualTo(String value) {
            addCriterion("member_avatar <>", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThan(String value) {
            addCriterion("member_avatar >", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("member_avatar >=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThan(String value) {
            addCriterion("member_avatar <", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThanOrEqualTo(String value) {
            addCriterion("member_avatar <=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLike(String value) {
            addCriterion("member_avatar like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotLike(String value) {
            addCriterion("member_avatar not like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIn(List<String> values) {
            addCriterion("member_avatar in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotIn(List<String> values) {
            addCriterion("member_avatar not in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarBetween(String value1, String value2) {
            addCriterion("member_avatar between", value1, value2, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotBetween(String value1, String value2) {
            addCriterion("member_avatar not between", value1, value2, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlIsNull() {
            addCriterion("member_avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlIsNotNull() {
            addCriterion("member_avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlEqualTo(String value) {
            addCriterion("member_avatar_url =", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlNotEqualTo(String value) {
            addCriterion("member_avatar_url <>", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlGreaterThan(String value) {
            addCriterion("member_avatar_url >", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("member_avatar_url >=", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlLessThan(String value) {
            addCriterion("member_avatar_url <", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("member_avatar_url <=", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlLike(String value) {
            addCriterion("member_avatar_url like", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlNotLike(String value) {
            addCriterion("member_avatar_url not like", value, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlIn(List<String> values) {
            addCriterion("member_avatar_url in", values, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlNotIn(List<String> values) {
            addCriterion("member_avatar_url not in", values, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlBetween(String value1, String value2) {
            addCriterion("member_avatar_url between", value1, value2, "memberAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("member_avatar_url not between", value1, value2, "memberAvatarUrl");
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

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
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

        public Criteria andTakePointsIsNull() {
            addCriterion("take_points is null");
            return (Criteria) this;
        }

        public Criteria andTakePointsIsNotNull() {
            addCriterion("take_points is not null");
            return (Criteria) this;
        }

        public Criteria andTakePointsEqualTo(Integer value) {
            addCriterion("take_points =", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotEqualTo(Integer value) {
            addCriterion("take_points <>", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsGreaterThan(Integer value) {
            addCriterion("take_points >", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_points >=", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsLessThan(Integer value) {
            addCriterion("take_points <", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsLessThanOrEqualTo(Integer value) {
            addCriterion("take_points <=", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsIn(List<Integer> values) {
            addCriterion("take_points in", values, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotIn(List<Integer> values) {
            addCriterion("take_points not in", values, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsBetween(Integer value1, Integer value2) {
            addCriterion("take_points between", value1, value2, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("take_points not between", value1, value2, "takePoints");
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