package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupsExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumIsNull() {
            addCriterion("buy_limit_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumIsNotNull() {
            addCriterion("buy_limit_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumEqualTo(Integer value) {
            addCriterion("buy_limit_num =", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumNotEqualTo(Integer value) {
            addCriterion("buy_limit_num <>", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumGreaterThan(Integer value) {
            addCriterion("buy_limit_num >", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_limit_num >=", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumLessThan(Integer value) {
            addCriterion("buy_limit_num <", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_limit_num <=", value, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumIn(List<Integer> values) {
            addCriterion("buy_limit_num in", values, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumNotIn(List<Integer> values) {
            addCriterion("buy_limit_num not in", values, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit_num between", value1, value2, "buyLimitNum");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit_num not between", value1, value2, "buyLimitNum");
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

        public Criteria andGroupExplainIsNull() {
            addCriterion("group_explain is null");
            return (Criteria) this;
        }

        public Criteria andGroupExplainIsNotNull() {
            addCriterion("group_explain is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExplainEqualTo(String value) {
            addCriterion("group_explain =", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainNotEqualTo(String value) {
            addCriterion("group_explain <>", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainGreaterThan(String value) {
            addCriterion("group_explain >", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainGreaterThanOrEqualTo(String value) {
            addCriterion("group_explain >=", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainLessThan(String value) {
            addCriterion("group_explain <", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainLessThanOrEqualTo(String value) {
            addCriterion("group_explain <=", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainLike(String value) {
            addCriterion("group_explain like", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainNotLike(String value) {
            addCriterion("group_explain not like", value, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainIn(List<String> values) {
            addCriterion("group_explain in", values, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainNotIn(List<String> values) {
            addCriterion("group_explain not in", values, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainBetween(String value1, String value2) {
            addCriterion("group_explain between", value1, value2, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupExplainNotBetween(String value1, String value2) {
            addCriterion("group_explain not between", value1, value2, "groupExplain");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleIsNull() {
            addCriterion("group_game_rule is null");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleIsNotNull() {
            addCriterion("group_game_rule is not null");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleEqualTo(String value) {
            addCriterion("group_game_rule =", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleNotEqualTo(String value) {
            addCriterion("group_game_rule <>", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleGreaterThan(String value) {
            addCriterion("group_game_rule >", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleGreaterThanOrEqualTo(String value) {
            addCriterion("group_game_rule >=", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleLessThan(String value) {
            addCriterion("group_game_rule <", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleLessThanOrEqualTo(String value) {
            addCriterion("group_game_rule <=", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleLike(String value) {
            addCriterion("group_game_rule like", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleNotLike(String value) {
            addCriterion("group_game_rule not like", value, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleIn(List<String> values) {
            addCriterion("group_game_rule in", values, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleNotIn(List<String> values) {
            addCriterion("group_game_rule not in", values, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleBetween(String value1, String value2) {
            addCriterion("group_game_rule between", value1, value2, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupGameRuleNotBetween(String value1, String value2) {
            addCriterion("group_game_rule not between", value1, value2, "groupGameRule");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumIsNull() {
            addCriterion("group_joined_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumIsNotNull() {
            addCriterion("group_joined_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumEqualTo(Integer value) {
            addCriterion("group_joined_num =", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumNotEqualTo(Integer value) {
            addCriterion("group_joined_num <>", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumGreaterThan(Integer value) {
            addCriterion("group_joined_num >", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_joined_num >=", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumLessThan(Integer value) {
            addCriterion("group_joined_num <", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_joined_num <=", value, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumIn(List<Integer> values) {
            addCriterion("group_joined_num in", values, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumNotIn(List<Integer> values) {
            addCriterion("group_joined_num not in", values, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumBetween(Integer value1, Integer value2) {
            addCriterion("group_joined_num between", value1, value2, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_joined_num not between", value1, value2, "groupJoinedNum");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualIsNull() {
            addCriterion("group_open_virtual is null");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualIsNotNull() {
            addCriterion("group_open_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualEqualTo(Integer value) {
            addCriterion("group_open_virtual =", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualNotEqualTo(Integer value) {
            addCriterion("group_open_virtual <>", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualGreaterThan(Integer value) {
            addCriterion("group_open_virtual >", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_open_virtual >=", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualLessThan(Integer value) {
            addCriterion("group_open_virtual <", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualLessThanOrEqualTo(Integer value) {
            addCriterion("group_open_virtual <=", value, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualIn(List<Integer> values) {
            addCriterion("group_open_virtual in", values, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualNotIn(List<Integer> values) {
            addCriterion("group_open_virtual not in", values, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualBetween(Integer value1, Integer value2) {
            addCriterion("group_open_virtual between", value1, value2, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupOpenVirtualNotBetween(Integer value1, Integer value2) {
            addCriterion("group_open_virtual not between", value1, value2, "groupOpenVirtual");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumIsNull() {
            addCriterion("group_require_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumIsNotNull() {
            addCriterion("group_require_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumEqualTo(Integer value) {
            addCriterion("group_require_num =", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumNotEqualTo(Integer value) {
            addCriterion("group_require_num <>", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumGreaterThan(Integer value) {
            addCriterion("group_require_num >", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_require_num >=", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumLessThan(Integer value) {
            addCriterion("group_require_num <", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_require_num <=", value, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumIn(List<Integer> values) {
            addCriterion("group_require_num in", values, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumNotIn(List<Integer> values) {
            addCriterion("group_require_num not in", values, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumBetween(Integer value1, Integer value2) {
            addCriterion("group_require_num between", value1, value2, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupRequireNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_require_num not between", value1, value2, "groupRequireNum");
            return (Criteria) this;
        }

        public Criteria andGroupStateIsNull() {
            addCriterion("group_state is null");
            return (Criteria) this;
        }

        public Criteria andGroupStateIsNotNull() {
            addCriterion("group_state is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStateEqualTo(Integer value) {
            addCriterion("group_state =", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotEqualTo(Integer value) {
            addCriterion("group_state <>", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateGreaterThan(Integer value) {
            addCriterion("group_state >", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_state >=", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateLessThan(Integer value) {
            addCriterion("group_state <", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateLessThanOrEqualTo(Integer value) {
            addCriterion("group_state <=", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateIn(List<Integer> values) {
            addCriterion("group_state in", values, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotIn(List<Integer> values) {
            addCriterion("group_state not in", values, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateBetween(Integer value1, Integer value2) {
            addCriterion("group_state between", value1, value2, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotBetween(Integer value1, Integer value2) {
            addCriterion("group_state not between", value1, value2, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIsNull() {
            addCriterion("group_title is null");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIsNotNull() {
            addCriterion("group_title is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTitleEqualTo(String value) {
            addCriterion("group_title =", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotEqualTo(String value) {
            addCriterion("group_title <>", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleGreaterThan(String value) {
            addCriterion("group_title >", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleGreaterThanOrEqualTo(String value) {
            addCriterion("group_title >=", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLessThan(String value) {
            addCriterion("group_title <", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLessThanOrEqualTo(String value) {
            addCriterion("group_title <=", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLike(String value) {
            addCriterion("group_title like", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotLike(String value) {
            addCriterion("group_title not like", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIn(List<String> values) {
            addCriterion("group_title in", values, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotIn(List<String> values) {
            addCriterion("group_title not in", values, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleBetween(String value1, String value2) {
            addCriterion("group_title between", value1, value2, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotBetween(String value1, String value2) {
            addCriterion("group_title not between", value1, value2, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeIsNull() {
            addCriterion("group_virtual_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeIsNotNull() {
            addCriterion("group_virtual_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeEqualTo(Date value) {
            addCriterion("group_virtual_time =", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeNotEqualTo(Date value) {
            addCriterion("group_virtual_time <>", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeGreaterThan(Date value) {
            addCriterion("group_virtual_time >", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_virtual_time >=", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeLessThan(Date value) {
            addCriterion("group_virtual_time <", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_virtual_time <=", value, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeIn(List<Date> values) {
            addCriterion("group_virtual_time in", values, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeNotIn(List<Date> values) {
            addCriterion("group_virtual_time not in", values, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeBetween(Date value1, Date value2) {
            addCriterion("group_virtual_time between", value1, value2, "groupVirtualTime");
            return (Criteria) this;
        }

        public Criteria andGroupVirtualTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_virtual_time not between", value1, value2, "groupVirtualTime");
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