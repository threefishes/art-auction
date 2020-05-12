package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsRecommondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsRecommondExample() {
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

        public Criteria andRecommondIdIsNull() {
            addCriterion("recommond_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommondIdIsNotNull() {
            addCriterion("recommond_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommondIdEqualTo(Integer value) {
            addCriterion("recommond_id =", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdNotEqualTo(Integer value) {
            addCriterion("recommond_id <>", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdGreaterThan(Integer value) {
            addCriterion("recommond_id >", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommond_id >=", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdLessThan(Integer value) {
            addCriterion("recommond_id <", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdLessThanOrEqualTo(Integer value) {
            addCriterion("recommond_id <=", value, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdIn(List<Integer> values) {
            addCriterion("recommond_id in", values, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdNotIn(List<Integer> values) {
            addCriterion("recommond_id not in", values, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdBetween(Integer value1, Integer value2) {
            addCriterion("recommond_id between", value1, value2, "recommondId");
            return (Criteria) this;
        }

        public Criteria andRecommondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recommond_id not between", value1, value2, "recommondId");
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

        public Criteria andCategoryTextIsNull() {
            addCriterion("category_text is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTextIsNotNull() {
            addCriterion("category_text is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTextEqualTo(String value) {
            addCriterion("category_text =", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextNotEqualTo(String value) {
            addCriterion("category_text <>", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextGreaterThan(String value) {
            addCriterion("category_text >", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextGreaterThanOrEqualTo(String value) {
            addCriterion("category_text >=", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextLessThan(String value) {
            addCriterion("category_text <", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextLessThanOrEqualTo(String value) {
            addCriterion("category_text <=", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextLike(String value) {
            addCriterion("category_text like", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextNotLike(String value) {
            addCriterion("category_text not like", value, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextIn(List<String> values) {
            addCriterion("category_text in", values, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextNotIn(List<String> values) {
            addCriterion("category_text not in", values, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextBetween(String value1, String value2) {
            addCriterion("category_text between", value1, value2, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCategoryTextNotBetween(String value1, String value2) {
            addCriterion("category_text not between", value1, value2, "categoryText");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIsNull() {
            addCriterion("goods_category_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIsNotNull() {
            addCriterion("goods_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdEqualTo(Integer value) {
            addCriterion("goods_category_id =", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotEqualTo(Integer value) {
            addCriterion("goods_category_id <>", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThan(Integer value) {
            addCriterion("goods_category_id >", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id >=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThan(Integer value) {
            addCriterion("goods_category_id <", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id <=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIn(List<Integer> values) {
            addCriterion("goods_category_id in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotIn(List<Integer> values) {
            addCriterion("goods_category_id not in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id not between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1IsNull() {
            addCriterion("goods_category_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1IsNotNull() {
            addCriterion("goods_category_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1EqualTo(Integer value) {
            addCriterion("goods_category_id_1 =", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1NotEqualTo(Integer value) {
            addCriterion("goods_category_id_1 <>", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1GreaterThan(Integer value) {
            addCriterion("goods_category_id_1 >", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_1 >=", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1LessThan(Integer value) {
            addCriterion("goods_category_id_1 <", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1LessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_1 <=", value, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1In(List<Integer> values) {
            addCriterion("goods_category_id_1 in", values, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1NotIn(List<Integer> values) {
            addCriterion("goods_category_id_1 not in", values, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1Between(Integer value1, Integer value2) {
            addCriterion("goods_category_id_1 between", value1, value2, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId1NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id_1 not between", value1, value2, "goodsCategoryId1");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2IsNull() {
            addCriterion("goods_category_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2IsNotNull() {
            addCriterion("goods_category_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2EqualTo(Integer value) {
            addCriterion("goods_category_id_2 =", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2NotEqualTo(Integer value) {
            addCriterion("goods_category_id_2 <>", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2GreaterThan(Integer value) {
            addCriterion("goods_category_id_2 >", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_2 >=", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2LessThan(Integer value) {
            addCriterion("goods_category_id_2 <", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2LessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_2 <=", value, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2In(List<Integer> values) {
            addCriterion("goods_category_id_2 in", values, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2NotIn(List<Integer> values) {
            addCriterion("goods_category_id_2 not in", values, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2Between(Integer value1, Integer value2) {
            addCriterion("goods_category_id_2 between", value1, value2, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId2NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id_2 not between", value1, value2, "goodsCategoryId2");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3IsNull() {
            addCriterion("goods_category_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3IsNotNull() {
            addCriterion("goods_category_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3EqualTo(Integer value) {
            addCriterion("goods_category_id_3 =", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3NotEqualTo(Integer value) {
            addCriterion("goods_category_id_3 <>", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3GreaterThan(Integer value) {
            addCriterion("goods_category_id_3 >", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_3 >=", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3LessThan(Integer value) {
            addCriterion("goods_category_id_3 <", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3LessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id_3 <=", value, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3In(List<Integer> values) {
            addCriterion("goods_category_id_3 in", values, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3NotIn(List<Integer> values) {
            addCriterion("goods_category_id_3 not in", values, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3Between(Integer value1, Integer value2) {
            addCriterion("goods_category_id_3 between", value1, value2, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryId3NotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id_3 not between", value1, value2, "goodsCategoryId3");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameIsNull() {
            addCriterion("goods_image_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameIsNotNull() {
            addCriterion("goods_image_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameEqualTo(String value) {
            addCriterion("goods_image_name =", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameNotEqualTo(String value) {
            addCriterion("goods_image_name <>", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameGreaterThan(String value) {
            addCriterion("goods_image_name >", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image_name >=", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameLessThan(String value) {
            addCriterion("goods_image_name <", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameLessThanOrEqualTo(String value) {
            addCriterion("goods_image_name <=", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameLike(String value) {
            addCriterion("goods_image_name like", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameNotLike(String value) {
            addCriterion("goods_image_name not like", value, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameIn(List<String> values) {
            addCriterion("goods_image_name in", values, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameNotIn(List<String> values) {
            addCriterion("goods_image_name not in", values, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameBetween(String value1, String value2) {
            addCriterion("goods_image_name between", value1, value2, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNameNotBetween(String value1, String value2) {
            addCriterion("goods_image_name not between", value1, value2, "goodsImageName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
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