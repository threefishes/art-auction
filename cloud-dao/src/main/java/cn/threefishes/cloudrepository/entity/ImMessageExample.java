package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ImMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImMessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
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

        public Criteria andAddTimeEqualTo(Long value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Long value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Long value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Long value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Long value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Long> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Long> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Long value1, Long value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Long value1, Long value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNull() {
            addCriterion("from_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("from_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(Integer value) {
            addCriterion("from_user_id =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(Integer value) {
            addCriterion("from_user_id <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(Integer value) {
            addCriterion("from_user_id >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_user_id >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(Integer value) {
            addCriterion("from_user_id <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_user_id <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<Integer> values) {
            addCriterion("from_user_id in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<Integer> values) {
            addCriterion("from_user_id not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserNameIsNull() {
            addCriterion("from_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFromUserNameIsNotNull() {
            addCriterion("from_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserNameEqualTo(String value) {
            addCriterion("from_user_name =", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameNotEqualTo(String value) {
            addCriterion("from_user_name <>", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameGreaterThan(String value) {
            addCriterion("from_user_name >", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_user_name >=", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameLessThan(String value) {
            addCriterion("from_user_name <", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameLessThanOrEqualTo(String value) {
            addCriterion("from_user_name <=", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameLike(String value) {
            addCriterion("from_user_name like", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameNotLike(String value) {
            addCriterion("from_user_name not like", value, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameIn(List<String> values) {
            addCriterion("from_user_name in", values, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameNotIn(List<String> values) {
            addCriterion("from_user_name not in", values, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameBetween(String value1, String value2) {
            addCriterion("from_user_name between", value1, value2, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserNameNotBetween(String value1, String value2) {
            addCriterion("from_user_name not between", value1, value2, "fromUserName");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIsNull() {
            addCriterion("from_user_type is null");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIsNotNull() {
            addCriterion("from_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeEqualTo(Integer value) {
            addCriterion("from_user_type =", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotEqualTo(Integer value) {
            addCriterion("from_user_type <>", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeGreaterThan(Integer value) {
            addCriterion("from_user_type >", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_user_type >=", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeLessThan(Integer value) {
            addCriterion("from_user_type <", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("from_user_type <=", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIn(List<Integer> values) {
            addCriterion("from_user_type in", values, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotIn(List<Integer> values) {
            addCriterion("from_user_type not in", values, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("from_user_type between", value1, value2, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("from_user_type not between", value1, value2, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("message_state is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("message_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(Integer value) {
            addCriterion("message_state =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(Integer value) {
            addCriterion("message_state <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(Integer value) {
            addCriterion("message_state >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_state >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(Integer value) {
            addCriterion("message_state <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(Integer value) {
            addCriterion("message_state <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<Integer> values) {
            addCriterion("message_state in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<Integer> values) {
            addCriterion("message_state not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(Integer value1, Integer value2) {
            addCriterion("message_state between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(Integer value1, Integer value2) {
            addCriterion("message_state not between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidIsNull() {
            addCriterion("message_state_android is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidIsNotNull() {
            addCriterion("message_state_android is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidEqualTo(Integer value) {
            addCriterion("message_state_android =", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidNotEqualTo(Integer value) {
            addCriterion("message_state_android <>", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidGreaterThan(Integer value) {
            addCriterion("message_state_android >", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_state_android >=", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidLessThan(Integer value) {
            addCriterion("message_state_android <", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidLessThanOrEqualTo(Integer value) {
            addCriterion("message_state_android <=", value, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidIn(List<Integer> values) {
            addCriterion("message_state_android in", values, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidNotIn(List<Integer> values) {
            addCriterion("message_state_android not in", values, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidBetween(Integer value1, Integer value2) {
            addCriterion("message_state_android between", value1, value2, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateAndroidNotBetween(Integer value1, Integer value2) {
            addCriterion("message_state_android not between", value1, value2, "messageStateAndroid");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosIsNull() {
            addCriterion("message_state_ios is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosIsNotNull() {
            addCriterion("message_state_ios is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosEqualTo(Integer value) {
            addCriterion("message_state_ios =", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosNotEqualTo(Integer value) {
            addCriterion("message_state_ios <>", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosGreaterThan(Integer value) {
            addCriterion("message_state_ios >", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_state_ios >=", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosLessThan(Integer value) {
            addCriterion("message_state_ios <", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosLessThanOrEqualTo(Integer value) {
            addCriterion("message_state_ios <=", value, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosIn(List<Integer> values) {
            addCriterion("message_state_ios in", values, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosNotIn(List<Integer> values) {
            addCriterion("message_state_ios not in", values, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosBetween(Integer value1, Integer value2) {
            addCriterion("message_state_ios between", value1, value2, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateIosNotBetween(Integer value1, Integer value2) {
            addCriterion("message_state_ios not between", value1, value2, "messageStateIos");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapIsNull() {
            addCriterion("message_state_wap is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapIsNotNull() {
            addCriterion("message_state_wap is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapEqualTo(Integer value) {
            addCriterion("message_state_wap =", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapNotEqualTo(Integer value) {
            addCriterion("message_state_wap <>", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapGreaterThan(Integer value) {
            addCriterion("message_state_wap >", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_state_wap >=", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapLessThan(Integer value) {
            addCriterion("message_state_wap <", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapLessThanOrEqualTo(Integer value) {
            addCriterion("message_state_wap <=", value, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapIn(List<Integer> values) {
            addCriterion("message_state_wap in", values, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapNotIn(List<Integer> values) {
            addCriterion("message_state_wap not in", values, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapBetween(Integer value1, Integer value2) {
            addCriterion("message_state_wap between", value1, value2, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageStateWapNotBetween(Integer value1, Integer value2) {
            addCriterion("message_state_wap not between", value1, value2, "messageStateWap");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Integer value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Integer value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Integer value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Integer value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Integer> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Integer> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Integer value1, Integer value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(Integer value) {
            addCriterion("to_user_id =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(Integer value) {
            addCriterion("to_user_id <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(Integer value) {
            addCriterion("to_user_id >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_user_id >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(Integer value) {
            addCriterion("to_user_id <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_user_id <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<Integer> values) {
            addCriterion("to_user_id in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<Integer> values) {
            addCriterion("to_user_id not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(Integer value1, Integer value2) {
            addCriterion("to_user_id between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_user_id not between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserNameIsNull() {
            addCriterion("to_user_name is null");
            return (Criteria) this;
        }

        public Criteria andToUserNameIsNotNull() {
            addCriterion("to_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andToUserNameEqualTo(String value) {
            addCriterion("to_user_name =", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameNotEqualTo(String value) {
            addCriterion("to_user_name <>", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameGreaterThan(String value) {
            addCriterion("to_user_name >", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_name >=", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameLessThan(String value) {
            addCriterion("to_user_name <", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameLessThanOrEqualTo(String value) {
            addCriterion("to_user_name <=", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameLike(String value) {
            addCriterion("to_user_name like", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameNotLike(String value) {
            addCriterion("to_user_name not like", value, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameIn(List<String> values) {
            addCriterion("to_user_name in", values, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameNotIn(List<String> values) {
            addCriterion("to_user_name not in", values, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameBetween(String value1, String value2) {
            addCriterion("to_user_name between", value1, value2, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserNameNotBetween(String value1, String value2) {
            addCriterion("to_user_name not between", value1, value2, "toUserName");
            return (Criteria) this;
        }

        public Criteria andToUserTypeIsNull() {
            addCriterion("to_user_type is null");
            return (Criteria) this;
        }

        public Criteria andToUserTypeIsNotNull() {
            addCriterion("to_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andToUserTypeEqualTo(Integer value) {
            addCriterion("to_user_type =", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeNotEqualTo(Integer value) {
            addCriterion("to_user_type <>", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeGreaterThan(Integer value) {
            addCriterion("to_user_type >", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_user_type >=", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeLessThan(Integer value) {
            addCriterion("to_user_type <", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("to_user_type <=", value, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeIn(List<Integer> values) {
            addCriterion("to_user_type in", values, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeNotIn(List<Integer> values) {
            addCriterion("to_user_type not in", values, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("to_user_type between", value1, value2, "toUserType");
            return (Criteria) this;
        }

        public Criteria andToUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("to_user_type not between", value1, value2, "toUserType");
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