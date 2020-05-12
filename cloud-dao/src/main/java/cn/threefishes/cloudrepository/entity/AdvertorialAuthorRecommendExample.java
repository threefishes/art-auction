package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AdvertorialAuthorRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertorialAuthorRecommendExample() {
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

        public Criteria andRecommendIdIsNull() {
            addCriterion("recommend_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNotNull() {
            addCriterion("recommend_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdEqualTo(Integer value) {
            addCriterion("recommend_id =", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotEqualTo(Integer value) {
            addCriterion("recommend_id <>", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThan(Integer value) {
            addCriterion("recommend_id >", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_id >=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThan(Integer value) {
            addCriterion("recommend_id <", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_id <=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIn(List<Integer> values) {
            addCriterion("recommend_id in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotIn(List<Integer> values) {
            addCriterion("recommend_id not in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdBetween(Integer value1, Integer value2) {
            addCriterion("recommend_id between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_id not between", value1, value2, "recommendId");
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

        public Criteria andShareNumIsNull() {
            addCriterion("share_num is null");
            return (Criteria) this;
        }

        public Criteria andShareNumIsNotNull() {
            addCriterion("share_num is not null");
            return (Criteria) this;
        }

        public Criteria andShareNumEqualTo(Integer value) {
            addCriterion("share_num =", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotEqualTo(Integer value) {
            addCriterion("share_num <>", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThan(Integer value) {
            addCriterion("share_num >", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_num >=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThan(Integer value) {
            addCriterion("share_num <", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThanOrEqualTo(Integer value) {
            addCriterion("share_num <=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumIn(List<Integer> values) {
            addCriterion("share_num in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotIn(List<Integer> values) {
            addCriterion("share_num not in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumBetween(Integer value1, Integer value2) {
            addCriterion("share_num between", value1, value2, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotBetween(Integer value1, Integer value2) {
            addCriterion("share_num not between", value1, value2, "shareNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNull() {
            addCriterion("like_num is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("like_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(Integer value) {
            addCriterion("like_num =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(Integer value) {
            addCriterion("like_num <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(Integer value) {
            addCriterion("like_num >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_num >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(Integer value) {
            addCriterion("like_num <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("like_num <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<Integer> values) {
            addCriterion("like_num in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<Integer> values) {
            addCriterion("like_num not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("like_num between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("like_num not between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNull() {
            addCriterion("follow_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNotNull() {
            addCriterion("follow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowNumEqualTo(Integer value) {
            addCriterion("follow_num =", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotEqualTo(Integer value) {
            addCriterion("follow_num <>", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThan(Integer value) {
            addCriterion("follow_num >", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_num >=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThan(Integer value) {
            addCriterion("follow_num <", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_num <=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIn(List<Integer> values) {
            addCriterion("follow_num in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotIn(List<Integer> values) {
            addCriterion("follow_num not in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_num between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_num not between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNull() {
            addCriterion("page_view is null");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNotNull() {
            addCriterion("page_view is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewEqualTo(Integer value) {
            addCriterion("page_view =", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotEqualTo(Integer value) {
            addCriterion("page_view <>", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThan(Integer value) {
            addCriterion("page_view >", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_view >=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThan(Integer value) {
            addCriterion("page_view <", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("page_view <=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewIn(List<Integer> values) {
            addCriterion("page_view in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotIn(List<Integer> values) {
            addCriterion("page_view not in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewBetween(Integer value1, Integer value2) {
            addCriterion("page_view between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("page_view not between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIsNull() {
            addCriterion("enter_detail_page_view is null");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIsNotNull() {
            addCriterion("enter_detail_page_view is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewEqualTo(Integer value) {
            addCriterion("enter_detail_page_view =", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotEqualTo(Integer value) {
            addCriterion("enter_detail_page_view <>", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewGreaterThan(Integer value) {
            addCriterion("enter_detail_page_view >", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_detail_page_view >=", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewLessThan(Integer value) {
            addCriterion("enter_detail_page_view <", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("enter_detail_page_view <=", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIn(List<Integer> values) {
            addCriterion("enter_detail_page_view in", values, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotIn(List<Integer> values) {
            addCriterion("enter_detail_page_view not in", values, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewBetween(Integer value1, Integer value2) {
            addCriterion("enter_detail_page_view between", value1, value2, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_detail_page_view not between", value1, value2, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIsNull() {
            addCriterion("material_num is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIsNotNull() {
            addCriterion("material_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumEqualTo(Integer value) {
            addCriterion("material_num =", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotEqualTo(Integer value) {
            addCriterion("material_num <>", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThan(Integer value) {
            addCriterion("material_num >", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_num >=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThan(Integer value) {
            addCriterion("material_num <", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThanOrEqualTo(Integer value) {
            addCriterion("material_num <=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIn(List<Integer> values) {
            addCriterion("material_num in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotIn(List<Integer> values) {
            addCriterion("material_num not in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumBetween(Integer value1, Integer value2) {
            addCriterion("material_num between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("material_num not between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumIsNull() {
            addCriterion("material_hot_num is null");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumIsNotNull() {
            addCriterion("material_hot_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumEqualTo(Integer value) {
            addCriterion("material_hot_num =", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumNotEqualTo(Integer value) {
            addCriterion("material_hot_num <>", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumGreaterThan(Integer value) {
            addCriterion("material_hot_num >", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_hot_num >=", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumLessThan(Integer value) {
            addCriterion("material_hot_num <", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumLessThanOrEqualTo(Integer value) {
            addCriterion("material_hot_num <=", value, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumIn(List<Integer> values) {
            addCriterion("material_hot_num in", values, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumNotIn(List<Integer> values) {
            addCriterion("material_hot_num not in", values, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumBetween(Integer value1, Integer value2) {
            addCriterion("material_hot_num between", value1, value2, "materialHotNum");
            return (Criteria) this;
        }

        public Criteria andMaterialHotNumNotBetween(Integer value1, Integer value2) {
            addCriterion("material_hot_num not between", value1, value2, "materialHotNum");
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