package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertorialJoinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertorialJoinExample() {
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

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNull() {
            addCriterion("Id_cart_back_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNotNull() {
            addCriterion("Id_cart_back_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageEqualTo(String value) {
            addCriterion("Id_cart_back_image =", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotEqualTo(String value) {
            addCriterion("Id_cart_back_image <>", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThan(String value) {
            addCriterion("Id_cart_back_image >", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_back_image >=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThan(String value) {
            addCriterion("Id_cart_back_image <", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_back_image <=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLike(String value) {
            addCriterion("Id_cart_back_image like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotLike(String value) {
            addCriterion("Id_cart_back_image not like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIn(List<String> values) {
            addCriterion("Id_cart_back_image in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotIn(List<String> values) {
            addCriterion("Id_cart_back_image not in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageBetween(String value1, String value2) {
            addCriterion("Id_cart_back_image between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_back_image not between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNull() {
            addCriterion("Id_cart_front_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNotNull() {
            addCriterion("Id_cart_front_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageEqualTo(String value) {
            addCriterion("Id_cart_front_image =", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotEqualTo(String value) {
            addCriterion("Id_cart_front_image <>", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThan(String value) {
            addCriterion("Id_cart_front_image >", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_front_image >=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThan(String value) {
            addCriterion("Id_cart_front_image <", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_front_image <=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLike(String value) {
            addCriterion("Id_cart_front_image like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotLike(String value) {
            addCriterion("Id_cart_front_image not like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIn(List<String> values) {
            addCriterion("Id_cart_front_image in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotIn(List<String> values) {
            addCriterion("Id_cart_front_image not in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageBetween(String value1, String value2) {
            addCriterion("Id_cart_front_image between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_front_image not between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNull() {
            addCriterion("Id_cart_hand_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNotNull() {
            addCriterion("Id_cart_hand_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageEqualTo(String value) {
            addCriterion("Id_cart_hand_image =", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotEqualTo(String value) {
            addCriterion("Id_cart_hand_image <>", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThan(String value) {
            addCriterion("Id_cart_hand_image >", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_hand_image >=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThan(String value) {
            addCriterion("Id_cart_hand_image <", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_hand_image <=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLike(String value) {
            addCriterion("Id_cart_hand_image like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotLike(String value) {
            addCriterion("Id_cart_hand_image not like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIn(List<String> values) {
            addCriterion("Id_cart_hand_image in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotIn(List<String> values) {
            addCriterion("Id_cart_hand_image not in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageBetween(String value1, String value2) {
            addCriterion("Id_cart_hand_image between", value1, value2, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_hand_image not between", value1, value2, "idCartHandImage");
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

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
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