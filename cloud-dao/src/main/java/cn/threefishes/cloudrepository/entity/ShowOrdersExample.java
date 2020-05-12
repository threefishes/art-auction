package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShowOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowOrdersExample() {
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

        public Criteria andMusicAutoIsNull() {
            addCriterion("music_auto is null");
            return (Criteria) this;
        }

        public Criteria andMusicAutoIsNotNull() {
            addCriterion("music_auto is not null");
            return (Criteria) this;
        }

        public Criteria andMusicAutoEqualTo(Integer value) {
            addCriterion("music_auto =", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoNotEqualTo(Integer value) {
            addCriterion("music_auto <>", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoGreaterThan(Integer value) {
            addCriterion("music_auto >", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoGreaterThanOrEqualTo(Integer value) {
            addCriterion("music_auto >=", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoLessThan(Integer value) {
            addCriterion("music_auto <", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoLessThanOrEqualTo(Integer value) {
            addCriterion("music_auto <=", value, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoIn(List<Integer> values) {
            addCriterion("music_auto in", values, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoNotIn(List<Integer> values) {
            addCriterion("music_auto not in", values, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoBetween(Integer value1, Integer value2) {
            addCriterion("music_auto between", value1, value2, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicAutoNotBetween(Integer value1, Integer value2) {
            addCriterion("music_auto not between", value1, value2, "musicAuto");
            return (Criteria) this;
        }

        public Criteria andMusicIdIsNull() {
            addCriterion("music_id is null");
            return (Criteria) this;
        }

        public Criteria andMusicIdIsNotNull() {
            addCriterion("music_id is not null");
            return (Criteria) this;
        }

        public Criteria andMusicIdEqualTo(Integer value) {
            addCriterion("music_id =", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotEqualTo(Integer value) {
            addCriterion("music_id <>", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThan(Integer value) {
            addCriterion("music_id >", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("music_id >=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThan(Integer value) {
            addCriterion("music_id <", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThanOrEqualTo(Integer value) {
            addCriterion("music_id <=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdIn(List<Integer> values) {
            addCriterion("music_id in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotIn(List<Integer> values) {
            addCriterion("music_id not in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdBetween(Integer value1, Integer value2) {
            addCriterion("music_id between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("music_id not between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Integer value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Integer value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Integer value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Integer value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Integer> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Integer> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Integer value1, Integer value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinIsNull() {
            addCriterion("recommend_join is null");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinIsNotNull() {
            addCriterion("recommend_join is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinEqualTo(Integer value) {
            addCriterion("recommend_join =", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinNotEqualTo(Integer value) {
            addCriterion("recommend_join <>", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinGreaterThan(Integer value) {
            addCriterion("recommend_join >", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_join >=", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinLessThan(Integer value) {
            addCriterion("recommend_join <", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_join <=", value, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinIn(List<Integer> values) {
            addCriterion("recommend_join in", values, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinNotIn(List<Integer> values) {
            addCriterion("recommend_join not in", values, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinBetween(Integer value1, Integer value2) {
            addCriterion("recommend_join between", value1, value2, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendJoinNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_join not between", value1, value2, "recommendJoin");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNull() {
            addCriterion("recommend_time is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNotNull() {
            addCriterion("recommend_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeEqualTo(Date value) {
            addCriterion("recommend_time =", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotEqualTo(Date value) {
            addCriterion("recommend_time <>", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThan(Date value) {
            addCriterion("recommend_time >", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recommend_time >=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThan(Date value) {
            addCriterion("recommend_time <", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThanOrEqualTo(Date value) {
            addCriterion("recommend_time <=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIn(List<Date> values) {
            addCriterion("recommend_time in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotIn(List<Date> values) {
            addCriterion("recommend_time not in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeBetween(Date value1, Date value2) {
            addCriterion("recommend_time between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotBetween(Date value1, Date value2) {
            addCriterion("recommend_time not between", value1, value2, "recommendTime");
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTitleImageIsNull() {
            addCriterion("title_image is null");
            return (Criteria) this;
        }

        public Criteria andTitleImageIsNotNull() {
            addCriterion("title_image is not null");
            return (Criteria) this;
        }

        public Criteria andTitleImageEqualTo(String value) {
            addCriterion("title_image =", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageNotEqualTo(String value) {
            addCriterion("title_image <>", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageGreaterThan(String value) {
            addCriterion("title_image >", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageGreaterThanOrEqualTo(String value) {
            addCriterion("title_image >=", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageLessThan(String value) {
            addCriterion("title_image <", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageLessThanOrEqualTo(String value) {
            addCriterion("title_image <=", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageLike(String value) {
            addCriterion("title_image like", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageNotLike(String value) {
            addCriterion("title_image not like", value, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageIn(List<String> values) {
            addCriterion("title_image in", values, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageNotIn(List<String> values) {
            addCriterion("title_image not in", values, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageBetween(String value1, String value2) {
            addCriterion("title_image between", value1, value2, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleImageNotBetween(String value1, String value2) {
            addCriterion("title_image not between", value1, value2, "titleImage");
            return (Criteria) this;
        }

        public Criteria andTitleTextIsNull() {
            addCriterion("title_text is null");
            return (Criteria) this;
        }

        public Criteria andTitleTextIsNotNull() {
            addCriterion("title_text is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTextEqualTo(String value) {
            addCriterion("title_text =", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotEqualTo(String value) {
            addCriterion("title_text <>", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThan(String value) {
            addCriterion("title_text >", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThanOrEqualTo(String value) {
            addCriterion("title_text >=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThan(String value) {
            addCriterion("title_text <", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThanOrEqualTo(String value) {
            addCriterion("title_text <=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLike(String value) {
            addCriterion("title_text like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotLike(String value) {
            addCriterion("title_text not like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextIn(List<String> values) {
            addCriterion("title_text in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotIn(List<String> values) {
            addCriterion("title_text not in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextBetween(String value1, String value2) {
            addCriterion("title_text between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotBetween(String value1, String value2) {
            addCriterion("title_text not between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andZanCountIsNull() {
            addCriterion("zan_count is null");
            return (Criteria) this;
        }

        public Criteria andZanCountIsNotNull() {
            addCriterion("zan_count is not null");
            return (Criteria) this;
        }

        public Criteria andZanCountEqualTo(Integer value) {
            addCriterion("zan_count =", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountNotEqualTo(Integer value) {
            addCriterion("zan_count <>", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountGreaterThan(Integer value) {
            addCriterion("zan_count >", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan_count >=", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountLessThan(Integer value) {
            addCriterion("zan_count <", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountLessThanOrEqualTo(Integer value) {
            addCriterion("zan_count <=", value, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountIn(List<Integer> values) {
            addCriterion("zan_count in", values, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountNotIn(List<Integer> values) {
            addCriterion("zan_count not in", values, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountBetween(Integer value1, Integer value2) {
            addCriterion("zan_count between", value1, value2, "zanCount");
            return (Criteria) this;
        }

        public Criteria andZanCountNotBetween(Integer value1, Integer value2) {
            addCriterion("zan_count not between", value1, value2, "zanCount");
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