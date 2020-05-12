package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreGradeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitIsNull() {
            addCriterion("album_limit is null");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitIsNotNull() {
            addCriterion("album_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitEqualTo(Integer value) {
            addCriterion("album_limit =", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitNotEqualTo(Integer value) {
            addCriterion("album_limit <>", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitGreaterThan(Integer value) {
            addCriterion("album_limit >", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_limit >=", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitLessThan(Integer value) {
            addCriterion("album_limit <", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitLessThanOrEqualTo(Integer value) {
            addCriterion("album_limit <=", value, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitIn(List<Integer> values) {
            addCriterion("album_limit in", values, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitNotIn(List<Integer> values) {
            addCriterion("album_limit not in", values, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitBetween(Integer value1, Integer value2) {
            addCriterion("album_limit between", value1, value2, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andAlbumLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("album_limit not between", value1, value2, "albumLimit");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitIsNull() {
            addCriterion("goods_limit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitIsNotNull() {
            addCriterion("goods_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitEqualTo(Integer value) {
            addCriterion("goods_limit =", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitNotEqualTo(Integer value) {
            addCriterion("goods_limit <>", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitGreaterThan(Integer value) {
            addCriterion("goods_limit >", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_limit >=", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitLessThan(Integer value) {
            addCriterion("goods_limit <", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitLessThanOrEqualTo(Integer value) {
            addCriterion("goods_limit <=", value, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitIn(List<Integer> values) {
            addCriterion("goods_limit in", values, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitNotIn(List<Integer> values) {
            addCriterion("goods_limit not in", values, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitBetween(Integer value1, Integer value2) {
            addCriterion("goods_limit between", value1, value2, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andGoodsLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_limit not between", value1, value2, "goodsLimit");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIsNull() {
            addCriterion("recommend_limit is null");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIsNotNull() {
            addCriterion("recommend_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitEqualTo(Integer value) {
            addCriterion("recommend_limit =", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotEqualTo(Integer value) {
            addCriterion("recommend_limit <>", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThan(Integer value) {
            addCriterion("recommend_limit >", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_limit >=", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThan(Integer value) {
            addCriterion("recommend_limit <", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_limit <=", value, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitIn(List<Integer> values) {
            addCriterion("recommend_limit in", values, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotIn(List<Integer> values) {
            addCriterion("recommend_limit not in", values, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitBetween(Integer value1, Integer value2) {
            addCriterion("recommend_limit between", value1, value2, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andRecommendLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_limit not between", value1, value2, "recommendLimit");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateCountIsNull() {
            addCriterion("template_count is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCountIsNotNull() {
            addCriterion("template_count is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCountEqualTo(Integer value) {
            addCriterion("template_count =", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountNotEqualTo(Integer value) {
            addCriterion("template_count <>", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountGreaterThan(Integer value) {
            addCriterion("template_count >", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_count >=", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountLessThan(Integer value) {
            addCriterion("template_count <", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountLessThanOrEqualTo(Integer value) {
            addCriterion("template_count <=", value, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountIn(List<Integer> values) {
            addCriterion("template_count in", values, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountNotIn(List<Integer> values) {
            addCriterion("template_count not in", values, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountBetween(Integer value1, Integer value2) {
            addCriterion("template_count between", value1, value2, "templateCount");
            return (Criteria) this;
        }

        public Criteria andTemplateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("template_count not between", value1, value2, "templateCount");
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