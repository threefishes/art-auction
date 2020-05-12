package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("apply_state is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("apply_state is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(Integer value) {
            addCriterion("apply_state =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(Integer value) {
            addCriterion("apply_state <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(Integer value) {
            addCriterion("apply_state >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_state >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(Integer value) {
            addCriterion("apply_state <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(Integer value) {
            addCriterion("apply_state <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<Integer> values) {
            addCriterion("apply_state in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<Integer> values) {
            addCriterion("apply_state not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(Integer value1, Integer value2) {
            addCriterion("apply_state between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_state not between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishIsNull() {
            addCriterion("brand_english is null");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishIsNotNull() {
            addCriterion("brand_english is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishEqualTo(String value) {
            addCriterion("brand_english =", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishNotEqualTo(String value) {
            addCriterion("brand_english <>", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishGreaterThan(String value) {
            addCriterion("brand_english >", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("brand_english >=", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishLessThan(String value) {
            addCriterion("brand_english <", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishLessThanOrEqualTo(String value) {
            addCriterion("brand_english <=", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishLike(String value) {
            addCriterion("brand_english like", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishNotLike(String value) {
            addCriterion("brand_english not like", value, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishIn(List<String> values) {
            addCriterion("brand_english in", values, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishNotIn(List<String> values) {
            addCriterion("brand_english not in", values, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishBetween(String value1, String value2) {
            addCriterion("brand_english between", value1, value2, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandEnglishNotBetween(String value1, String value2) {
            addCriterion("brand_english not between", value1, value2, "brandEnglish");
            return (Criteria) this;
        }

        public Criteria andBrandImageIsNull() {
            addCriterion("brand_image is null");
            return (Criteria) this;
        }

        public Criteria andBrandImageIsNotNull() {
            addCriterion("brand_image is not null");
            return (Criteria) this;
        }

        public Criteria andBrandImageEqualTo(String value) {
            addCriterion("brand_image =", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotEqualTo(String value) {
            addCriterion("brand_image <>", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageGreaterThan(String value) {
            addCriterion("brand_image >", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageGreaterThanOrEqualTo(String value) {
            addCriterion("brand_image >=", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLessThan(String value) {
            addCriterion("brand_image <", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLessThanOrEqualTo(String value) {
            addCriterion("brand_image <=", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLike(String value) {
            addCriterion("brand_image like", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotLike(String value) {
            addCriterion("brand_image not like", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageIn(List<String> values) {
            addCriterion("brand_image in", values, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotIn(List<String> values) {
            addCriterion("brand_image not in", values, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageBetween(String value1, String value2) {
            addCriterion("brand_image between", value1, value2, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotBetween(String value1, String value2) {
            addCriterion("brand_image not between", value1, value2, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandInitialIsNull() {
            addCriterion("brand_initial is null");
            return (Criteria) this;
        }

        public Criteria andBrandInitialIsNotNull() {
            addCriterion("brand_initial is not null");
            return (Criteria) this;
        }

        public Criteria andBrandInitialEqualTo(String value) {
            addCriterion("brand_initial =", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialNotEqualTo(String value) {
            addCriterion("brand_initial <>", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialGreaterThan(String value) {
            addCriterion("brand_initial >", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialGreaterThanOrEqualTo(String value) {
            addCriterion("brand_initial >=", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialLessThan(String value) {
            addCriterion("brand_initial <", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialLessThanOrEqualTo(String value) {
            addCriterion("brand_initial <=", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialLike(String value) {
            addCriterion("brand_initial like", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialNotLike(String value) {
            addCriterion("brand_initial not like", value, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialIn(List<String> values) {
            addCriterion("brand_initial in", values, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialNotIn(List<String> values) {
            addCriterion("brand_initial not in", values, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialBetween(String value1, String value2) {
            addCriterion("brand_initial between", value1, value2, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandInitialNotBetween(String value1, String value2) {
            addCriterion("brand_initial not between", value1, value2, "brandInitial");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNull() {
            addCriterion("brand_sort is null");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNotNull() {
            addCriterion("brand_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBrandSortEqualTo(Integer value) {
            addCriterion("brand_sort =", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotEqualTo(Integer value) {
            addCriterion("brand_sort <>", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThan(Integer value) {
            addCriterion("brand_sort >", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_sort >=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThan(Integer value) {
            addCriterion("brand_sort <", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThanOrEqualTo(Integer value) {
            addCriterion("brand_sort <=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortIn(List<Integer> values) {
            addCriterion("brand_sort in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotIn(List<Integer> values) {
            addCriterion("brand_sort not in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort between", value1, value2, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort not between", value1, value2, "brandSort");
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

        public Criteria andShowTypeIsNull() {
            addCriterion("show_type is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("show_type is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(Integer value) {
            addCriterion("show_type =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(Integer value) {
            addCriterion("show_type <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(Integer value) {
            addCriterion("show_type >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_type >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(Integer value) {
            addCriterion("show_type <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("show_type <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<Integer> values) {
            addCriterion("show_type in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<Integer> values) {
            addCriterion("show_type not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(Integer value1, Integer value2) {
            addCriterion("show_type between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("show_type not between", value1, value2, "showType");
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