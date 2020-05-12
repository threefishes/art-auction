package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AdvertorialAuthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertorialAuthorExample() {
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

        public Criteria andArticleCountIsNull() {
            addCriterion("article_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleCountIsNotNull() {
            addCriterion("article_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCountEqualTo(Integer value) {
            addCriterion("article_count =", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotEqualTo(Integer value) {
            addCriterion("article_count <>", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountGreaterThan(Integer value) {
            addCriterion("article_count >", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_count >=", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountLessThan(Integer value) {
            addCriterion("article_count <", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_count <=", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountIn(List<Integer> values) {
            addCriterion("article_count in", values, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotIn(List<Integer> values) {
            addCriterion("article_count not in", values, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountBetween(Integer value1, Integer value2) {
            addCriterion("article_count between", value1, value2, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_count not between", value1, value2, "articleCount");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractIsNull() {
            addCriterion("author_abstract is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractIsNotNull() {
            addCriterion("author_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractEqualTo(String value) {
            addCriterion("author_abstract =", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractNotEqualTo(String value) {
            addCriterion("author_abstract <>", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractGreaterThan(String value) {
            addCriterion("author_abstract >", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("author_abstract >=", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractLessThan(String value) {
            addCriterion("author_abstract <", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractLessThanOrEqualTo(String value) {
            addCriterion("author_abstract <=", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractLike(String value) {
            addCriterion("author_abstract like", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractNotLike(String value) {
            addCriterion("author_abstract not like", value, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractIn(List<String> values) {
            addCriterion("author_abstract in", values, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractNotIn(List<String> values) {
            addCriterion("author_abstract not in", values, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractBetween(String value1, String value2) {
            addCriterion("author_abstract between", value1, value2, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAbstractNotBetween(String value1, String value2) {
            addCriterion("author_abstract not between", value1, value2, "authorAbstract");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarIsNull() {
            addCriterion("author_avatar is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarIsNotNull() {
            addCriterion("author_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarEqualTo(String value) {
            addCriterion("author_avatar =", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotEqualTo(String value) {
            addCriterion("author_avatar <>", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarGreaterThan(String value) {
            addCriterion("author_avatar >", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("author_avatar >=", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLessThan(String value) {
            addCriterion("author_avatar <", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLessThanOrEqualTo(String value) {
            addCriterion("author_avatar <=", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLike(String value) {
            addCriterion("author_avatar like", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotLike(String value) {
            addCriterion("author_avatar not like", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarIn(List<String> values) {
            addCriterion("author_avatar in", values, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotIn(List<String> values) {
            addCriterion("author_avatar not in", values, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarBetween(String value1, String value2) {
            addCriterion("author_avatar between", value1, value2, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotBetween(String value1, String value2) {
            addCriterion("author_avatar not between", value1, value2, "authorAvatar");
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

        public Criteria andSubCountIsNull() {
            addCriterion("sub_count is null");
            return (Criteria) this;
        }

        public Criteria andSubCountIsNotNull() {
            addCriterion("sub_count is not null");
            return (Criteria) this;
        }

        public Criteria andSubCountEqualTo(Integer value) {
            addCriterion("sub_count =", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountNotEqualTo(Integer value) {
            addCriterion("sub_count <>", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountGreaterThan(Integer value) {
            addCriterion("sub_count >", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_count >=", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountLessThan(Integer value) {
            addCriterion("sub_count <", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountLessThanOrEqualTo(Integer value) {
            addCriterion("sub_count <=", value, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountIn(List<Integer> values) {
            addCriterion("sub_count in", values, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountNotIn(List<Integer> values) {
            addCriterion("sub_count not in", values, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountBetween(Integer value1, Integer value2) {
            addCriterion("sub_count between", value1, value2, "subCount");
            return (Criteria) this;
        }

        public Criteria andSubCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_count not between", value1, value2, "subCount");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Integer value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Integer value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Integer value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Integer value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Integer> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Integer> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andBigVIsNull() {
            addCriterion("big_v is null");
            return (Criteria) this;
        }

        public Criteria andBigVIsNotNull() {
            addCriterion("big_v is not null");
            return (Criteria) this;
        }

        public Criteria andBigVEqualTo(Integer value) {
            addCriterion("big_v =", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVNotEqualTo(Integer value) {
            addCriterion("big_v <>", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVGreaterThan(Integer value) {
            addCriterion("big_v >", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_v >=", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVLessThan(Integer value) {
            addCriterion("big_v <", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVLessThanOrEqualTo(Integer value) {
            addCriterion("big_v <=", value, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVIn(List<Integer> values) {
            addCriterion("big_v in", values, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVNotIn(List<Integer> values) {
            addCriterion("big_v not in", values, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVBetween(Integer value1, Integer value2) {
            addCriterion("big_v between", value1, value2, "bigV");
            return (Criteria) this;
        }

        public Criteria andBigVNotBetween(Integer value1, Integer value2) {
            addCriterion("big_v not between", value1, value2, "bigV");
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