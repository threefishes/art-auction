package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionIsNull() {
            addCriterion("channel_description is null");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionIsNotNull() {
            addCriterion("channel_description is not null");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionEqualTo(String value) {
            addCriterion("channel_description =", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionNotEqualTo(String value) {
            addCriterion("channel_description <>", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionGreaterThan(String value) {
            addCriterion("channel_description >", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("channel_description >=", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionLessThan(String value) {
            addCriterion("channel_description <", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionLessThanOrEqualTo(String value) {
            addCriterion("channel_description <=", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionLike(String value) {
            addCriterion("channel_description like", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionNotLike(String value) {
            addCriterion("channel_description not like", value, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionIn(List<String> values) {
            addCriterion("channel_description in", values, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionNotIn(List<String> values) {
            addCriterion("channel_description not in", values, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionBetween(String value1, String value2) {
            addCriterion("channel_description between", value1, value2, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelDescriptionNotBetween(String value1, String value2) {
            addCriterion("channel_description not between", value1, value2, "channelDescription");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdIsNull() {
            addCriterion("channel_floor_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdIsNotNull() {
            addCriterion("channel_floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdEqualTo(String value) {
            addCriterion("channel_floor_id =", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdNotEqualTo(String value) {
            addCriterion("channel_floor_id <>", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdGreaterThan(String value) {
            addCriterion("channel_floor_id >", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_floor_id >=", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdLessThan(String value) {
            addCriterion("channel_floor_id <", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdLessThanOrEqualTo(String value) {
            addCriterion("channel_floor_id <=", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdLike(String value) {
            addCriterion("channel_floor_id like", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdNotLike(String value) {
            addCriterion("channel_floor_id not like", value, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdIn(List<String> values) {
            addCriterion("channel_floor_id in", values, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdNotIn(List<String> values) {
            addCriterion("channel_floor_id not in", values, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdBetween(String value1, String value2) {
            addCriterion("channel_floor_id between", value1, value2, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelFloorIdNotBetween(String value1, String value2) {
            addCriterion("channel_floor_id not between", value1, value2, "channelFloorId");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsIsNull() {
            addCriterion("channel_keywords is null");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsIsNotNull() {
            addCriterion("channel_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsEqualTo(String value) {
            addCriterion("channel_keywords =", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsNotEqualTo(String value) {
            addCriterion("channel_keywords <>", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsGreaterThan(String value) {
            addCriterion("channel_keywords >", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("channel_keywords >=", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsLessThan(String value) {
            addCriterion("channel_keywords <", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsLessThanOrEqualTo(String value) {
            addCriterion("channel_keywords <=", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsLike(String value) {
            addCriterion("channel_keywords like", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsNotLike(String value) {
            addCriterion("channel_keywords not like", value, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsIn(List<String> values) {
            addCriterion("channel_keywords in", values, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsNotIn(List<String> values) {
            addCriterion("channel_keywords not in", values, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsBetween(String value1, String value2) {
            addCriterion("channel_keywords between", value1, value2, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelKeywordsNotBetween(String value1, String value2) {
            addCriterion("channel_keywords not between", value1, value2, "channelKeywords");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelShowIsNull() {
            addCriterion("channel_show is null");
            return (Criteria) this;
        }

        public Criteria andChannelShowIsNotNull() {
            addCriterion("channel_show is not null");
            return (Criteria) this;
        }

        public Criteria andChannelShowEqualTo(Integer value) {
            addCriterion("channel_show =", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowNotEqualTo(Integer value) {
            addCriterion("channel_show <>", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowGreaterThan(Integer value) {
            addCriterion("channel_show >", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_show >=", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowLessThan(Integer value) {
            addCriterion("channel_show <", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowLessThanOrEqualTo(Integer value) {
            addCriterion("channel_show <=", value, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowIn(List<Integer> values) {
            addCriterion("channel_show in", values, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowNotIn(List<Integer> values) {
            addCriterion("channel_show not in", values, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowBetween(Integer value1, Integer value2) {
            addCriterion("channel_show between", value1, value2, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelShowNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_show not between", value1, value2, "channelShow");
            return (Criteria) this;
        }

        public Criteria andChannelStyleIsNull() {
            addCriterion("channel_style is null");
            return (Criteria) this;
        }

        public Criteria andChannelStyleIsNotNull() {
            addCriterion("channel_style is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStyleEqualTo(String value) {
            addCriterion("channel_style =", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleNotEqualTo(String value) {
            addCriterion("channel_style <>", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleGreaterThan(String value) {
            addCriterion("channel_style >", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleGreaterThanOrEqualTo(String value) {
            addCriterion("channel_style >=", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleLessThan(String value) {
            addCriterion("channel_style <", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleLessThanOrEqualTo(String value) {
            addCriterion("channel_style <=", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleLike(String value) {
            addCriterion("channel_style like", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleNotLike(String value) {
            addCriterion("channel_style not like", value, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleIn(List<String> values) {
            addCriterion("channel_style in", values, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleNotIn(List<String> values) {
            addCriterion("channel_style not in", values, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleBetween(String value1, String value2) {
            addCriterion("channel_style between", value1, value2, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelStyleNotBetween(String value1, String value2) {
            addCriterion("channel_style not between", value1, value2, "channelStyle");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdIsNull() {
            addCriterion("channel_top_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdIsNotNull() {
            addCriterion("channel_top_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdEqualTo(Integer value) {
            addCriterion("channel_top_id =", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdNotEqualTo(Integer value) {
            addCriterion("channel_top_id <>", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdGreaterThan(Integer value) {
            addCriterion("channel_top_id >", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_top_id >=", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdLessThan(Integer value) {
            addCriterion("channel_top_id <", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_top_id <=", value, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdIn(List<Integer> values) {
            addCriterion("channel_top_id in", values, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdNotIn(List<Integer> values) {
            addCriterion("channel_top_id not in", values, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_top_id between", value1, value2, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_top_id not between", value1, value2, "channelTopId");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeIsNull() {
            addCriterion("channel_update_time is null");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeIsNotNull() {
            addCriterion("channel_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeEqualTo(Date value) {
            addCriterion("channel_update_time =", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeNotEqualTo(Date value) {
            addCriterion("channel_update_time <>", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeGreaterThan(Date value) {
            addCriterion("channel_update_time >", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("channel_update_time >=", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeLessThan(Date value) {
            addCriterion("channel_update_time <", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("channel_update_time <=", value, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeIn(List<Date> values) {
            addCriterion("channel_update_time in", values, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeNotIn(List<Date> values) {
            addCriterion("channel_update_time not in", values, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("channel_update_time between", value1, value2, "channelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChannelUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("channel_update_time not between", value1, value2, "channelUpdateTime");
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