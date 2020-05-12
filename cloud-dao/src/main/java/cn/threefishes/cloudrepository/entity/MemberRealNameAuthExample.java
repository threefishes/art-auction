package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberRealNameAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberRealNameAuthExample() {
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

        public Criteria andAuthAddTimeIsNull() {
            addCriterion("auth_add_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeIsNotNull() {
            addCriterion("auth_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeEqualTo(Date value) {
            addCriterion("auth_add_time =", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeNotEqualTo(Date value) {
            addCriterion("auth_add_time <>", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeGreaterThan(Date value) {
            addCriterion("auth_add_time >", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_add_time >=", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeLessThan(Date value) {
            addCriterion("auth_add_time <", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("auth_add_time <=", value, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeIn(List<Date> values) {
            addCriterion("auth_add_time in", values, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeNotIn(List<Date> values) {
            addCriterion("auth_add_time not in", values, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeBetween(Date value1, Date value2) {
            addCriterion("auth_add_time between", value1, value2, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("auth_add_time not between", value1, value2, "authAddTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeIsNull() {
            addCriterion("auth_handle_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeIsNotNull() {
            addCriterion("auth_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeEqualTo(Date value) {
            addCriterion("auth_handle_time =", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeNotEqualTo(Date value) {
            addCriterion("auth_handle_time <>", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeGreaterThan(Date value) {
            addCriterion("auth_handle_time >", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_handle_time >=", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeLessThan(Date value) {
            addCriterion("auth_handle_time <", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("auth_handle_time <=", value, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeIn(List<Date> values) {
            addCriterion("auth_handle_time in", values, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeNotIn(List<Date> values) {
            addCriterion("auth_handle_time not in", values, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeBetween(Date value1, Date value2) {
            addCriterion("auth_handle_time between", value1, value2, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("auth_handle_time not between", value1, value2, "authHandleTime");
            return (Criteria) this;
        }

        public Criteria andAuthMessageIsNull() {
            addCriterion("auth_message is null");
            return (Criteria) this;
        }

        public Criteria andAuthMessageIsNotNull() {
            addCriterion("auth_message is not null");
            return (Criteria) this;
        }

        public Criteria andAuthMessageEqualTo(String value) {
            addCriterion("auth_message =", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageNotEqualTo(String value) {
            addCriterion("auth_message <>", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageGreaterThan(String value) {
            addCriterion("auth_message >", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageGreaterThanOrEqualTo(String value) {
            addCriterion("auth_message >=", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageLessThan(String value) {
            addCriterion("auth_message <", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageLessThanOrEqualTo(String value) {
            addCriterion("auth_message <=", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageLike(String value) {
            addCriterion("auth_message like", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageNotLike(String value) {
            addCriterion("auth_message not like", value, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageIn(List<String> values) {
            addCriterion("auth_message in", values, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageNotIn(List<String> values) {
            addCriterion("auth_message not in", values, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageBetween(String value1, String value2) {
            addCriterion("auth_message between", value1, value2, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthMessageNotBetween(String value1, String value2) {
            addCriterion("auth_message not between", value1, value2, "authMessage");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameIsNull() {
            addCriterion("auth_real_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameIsNotNull() {
            addCriterion("auth_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameEqualTo(String value) {
            addCriterion("auth_real_name =", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameNotEqualTo(String value) {
            addCriterion("auth_real_name <>", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameGreaterThan(String value) {
            addCriterion("auth_real_name >", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("auth_real_name >=", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameLessThan(String value) {
            addCriterion("auth_real_name <", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameLessThanOrEqualTo(String value) {
            addCriterion("auth_real_name <=", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameLike(String value) {
            addCriterion("auth_real_name like", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameNotLike(String value) {
            addCriterion("auth_real_name not like", value, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameIn(List<String> values) {
            addCriterion("auth_real_name in", values, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameNotIn(List<String> values) {
            addCriterion("auth_real_name not in", values, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameBetween(String value1, String value2) {
            addCriterion("auth_real_name between", value1, value2, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthRealNameNotBetween(String value1, String value2) {
            addCriterion("auth_real_name not between", value1, value2, "authRealName");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("auth_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("auth_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(Integer value) {
            addCriterion("auth_state =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(Integer value) {
            addCriterion("auth_state <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(Integer value) {
            addCriterion("auth_state >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_state >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(Integer value) {
            addCriterion("auth_state <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(Integer value) {
            addCriterion("auth_state <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<Integer> values) {
            addCriterion("auth_state in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<Integer> values) {
            addCriterion("auth_state not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(Integer value1, Integer value2) {
            addCriterion("auth_state between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_state not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNull() {
            addCriterion("id_cart_back_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNotNull() {
            addCriterion("id_cart_back_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageEqualTo(String value) {
            addCriterion("id_cart_back_image =", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotEqualTo(String value) {
            addCriterion("id_cart_back_image <>", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThan(String value) {
            addCriterion("id_cart_back_image >", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart_back_image >=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThan(String value) {
            addCriterion("id_cart_back_image <", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThanOrEqualTo(String value) {
            addCriterion("id_cart_back_image <=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLike(String value) {
            addCriterion("id_cart_back_image like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotLike(String value) {
            addCriterion("id_cart_back_image not like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIn(List<String> values) {
            addCriterion("id_cart_back_image in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotIn(List<String> values) {
            addCriterion("id_cart_back_image not in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageBetween(String value1, String value2) {
            addCriterion("id_cart_back_image between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotBetween(String value1, String value2) {
            addCriterion("id_cart_back_image not between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNull() {
            addCriterion("id_cart_front_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNotNull() {
            addCriterion("id_cart_front_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageEqualTo(String value) {
            addCriterion("id_cart_front_image =", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotEqualTo(String value) {
            addCriterion("id_cart_front_image <>", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThan(String value) {
            addCriterion("id_cart_front_image >", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart_front_image >=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThan(String value) {
            addCriterion("id_cart_front_image <", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThanOrEqualTo(String value) {
            addCriterion("id_cart_front_image <=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLike(String value) {
            addCriterion("id_cart_front_image like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotLike(String value) {
            addCriterion("id_cart_front_image not like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIn(List<String> values) {
            addCriterion("id_cart_front_image in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotIn(List<String> values) {
            addCriterion("id_cart_front_image not in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageBetween(String value1, String value2) {
            addCriterion("id_cart_front_image between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotBetween(String value1, String value2) {
            addCriterion("id_cart_front_image not between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNull() {
            addCriterion("id_cart_hand_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNotNull() {
            addCriterion("id_cart_hand_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageEqualTo(String value) {
            addCriterion("id_cart_hand_image =", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotEqualTo(String value) {
            addCriterion("id_cart_hand_image <>", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThan(String value) {
            addCriterion("id_cart_hand_image >", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart_hand_image >=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThan(String value) {
            addCriterion("id_cart_hand_image <", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThanOrEqualTo(String value) {
            addCriterion("id_cart_hand_image <=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLike(String value) {
            addCriterion("id_cart_hand_image like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotLike(String value) {
            addCriterion("id_cart_hand_image not like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIn(List<String> values) {
            addCriterion("id_cart_hand_image in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotIn(List<String> values) {
            addCriterion("id_cart_hand_image not in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageBetween(String value1, String value2) {
            addCriterion("id_cart_hand_image between", value1, value2, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotBetween(String value1, String value2) {
            addCriterion("id_cart_hand_image not between", value1, value2, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIsNull() {
            addCriterion("id_cart_number is null");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIsNotNull() {
            addCriterion("id_cart_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberEqualTo(String value) {
            addCriterion("id_cart_number =", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotEqualTo(String value) {
            addCriterion("id_cart_number <>", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberGreaterThan(String value) {
            addCriterion("id_cart_number >", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart_number >=", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLessThan(String value) {
            addCriterion("id_cart_number <", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLessThanOrEqualTo(String value) {
            addCriterion("id_cart_number <=", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLike(String value) {
            addCriterion("id_cart_number like", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotLike(String value) {
            addCriterion("id_cart_number not like", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIn(List<String> values) {
            addCriterion("id_cart_number in", values, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotIn(List<String> values) {
            addCriterion("id_cart_number not in", values, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberBetween(String value1, String value2) {
            addCriterion("id_cart_number between", value1, value2, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotBetween(String value1, String value2) {
            addCriterion("id_cart_number not between", value1, value2, "idCartNumber");
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