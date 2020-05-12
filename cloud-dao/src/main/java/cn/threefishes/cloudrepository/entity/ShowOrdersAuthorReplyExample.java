package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShowOrdersAuthorReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowOrdersAuthorReplyExample() {
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

        public Criteria andAuthorReplyIdIsNull() {
            addCriterion("author_reply_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdIsNotNull() {
            addCriterion("author_reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdEqualTo(Integer value) {
            addCriterion("author_reply_id =", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdNotEqualTo(Integer value) {
            addCriterion("author_reply_id <>", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdGreaterThan(Integer value) {
            addCriterion("author_reply_id >", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_reply_id >=", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdLessThan(Integer value) {
            addCriterion("author_reply_id <", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_reply_id <=", value, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdIn(List<Integer> values) {
            addCriterion("author_reply_id in", values, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdNotIn(List<Integer> values) {
            addCriterion("author_reply_id not in", values, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("author_reply_id between", value1, value2, "authorReplyId");
            return (Criteria) this;
        }

        public Criteria andAuthorReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_reply_id not between", value1, value2, "authorReplyId");
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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