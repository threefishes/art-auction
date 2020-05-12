package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainExample() {
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

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Integer value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Integer value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Integer value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Integer value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Integer> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Integer> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andAccusedContentIsNull() {
            addCriterion("accused_content is null");
            return (Criteria) this;
        }

        public Criteria andAccusedContentIsNotNull() {
            addCriterion("accused_content is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedContentEqualTo(String value) {
            addCriterion("accused_content =", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentNotEqualTo(String value) {
            addCriterion("accused_content <>", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentGreaterThan(String value) {
            addCriterion("accused_content >", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentGreaterThanOrEqualTo(String value) {
            addCriterion("accused_content >=", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentLessThan(String value) {
            addCriterion("accused_content <", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentLessThanOrEqualTo(String value) {
            addCriterion("accused_content <=", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentLike(String value) {
            addCriterion("accused_content like", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentNotLike(String value) {
            addCriterion("accused_content not like", value, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentIn(List<String> values) {
            addCriterion("accused_content in", values, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentNotIn(List<String> values) {
            addCriterion("accused_content not in", values, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentBetween(String value1, String value2) {
            addCriterion("accused_content between", value1, value2, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedContentNotBetween(String value1, String value2) {
            addCriterion("accused_content not between", value1, value2, "accusedContent");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIsNull() {
            addCriterion("accused_id is null");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIsNotNull() {
            addCriterion("accused_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedIdEqualTo(Integer value) {
            addCriterion("accused_id =", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotEqualTo(Integer value) {
            addCriterion("accused_id <>", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdGreaterThan(Integer value) {
            addCriterion("accused_id >", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accused_id >=", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdLessThan(Integer value) {
            addCriterion("accused_id <", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdLessThanOrEqualTo(Integer value) {
            addCriterion("accused_id <=", value, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdIn(List<Integer> values) {
            addCriterion("accused_id in", values, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotIn(List<Integer> values) {
            addCriterion("accused_id not in", values, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdBetween(Integer value1, Integer value2) {
            addCriterion("accused_id between", value1, value2, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accused_id not between", value1, value2, "accusedId");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesIsNull() {
            addCriterion("accused_images is null");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesIsNotNull() {
            addCriterion("accused_images is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesEqualTo(String value) {
            addCriterion("accused_images =", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesNotEqualTo(String value) {
            addCriterion("accused_images <>", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesGreaterThan(String value) {
            addCriterion("accused_images >", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesGreaterThanOrEqualTo(String value) {
            addCriterion("accused_images >=", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesLessThan(String value) {
            addCriterion("accused_images <", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesLessThanOrEqualTo(String value) {
            addCriterion("accused_images <=", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesLike(String value) {
            addCriterion("accused_images like", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesNotLike(String value) {
            addCriterion("accused_images not like", value, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesIn(List<String> values) {
            addCriterion("accused_images in", values, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesNotIn(List<String> values) {
            addCriterion("accused_images not in", values, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesBetween(String value1, String value2) {
            addCriterion("accused_images between", value1, value2, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedImagesNotBetween(String value1, String value2) {
            addCriterion("accused_images not between", value1, value2, "accusedImages");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIsNull() {
            addCriterion("accused_name is null");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIsNotNull() {
            addCriterion("accused_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedNameEqualTo(String value) {
            addCriterion("accused_name =", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotEqualTo(String value) {
            addCriterion("accused_name <>", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameGreaterThan(String value) {
            addCriterion("accused_name >", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameGreaterThanOrEqualTo(String value) {
            addCriterion("accused_name >=", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLessThan(String value) {
            addCriterion("accused_name <", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLessThanOrEqualTo(String value) {
            addCriterion("accused_name <=", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameLike(String value) {
            addCriterion("accused_name like", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotLike(String value) {
            addCriterion("accused_name not like", value, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameIn(List<String> values) {
            addCriterion("accused_name in", values, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotIn(List<String> values) {
            addCriterion("accused_name not in", values, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameBetween(String value1, String value2) {
            addCriterion("accused_name between", value1, value2, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedNameNotBetween(String value1, String value2) {
            addCriterion("accused_name not between", value1, value2, "accusedName");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdIsNull() {
            addCriterion("accused_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdIsNotNull() {
            addCriterion("accused_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdEqualTo(Integer value) {
            addCriterion("accused_seller_id =", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdNotEqualTo(Integer value) {
            addCriterion("accused_seller_id <>", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdGreaterThan(Integer value) {
            addCriterion("accused_seller_id >", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accused_seller_id >=", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdLessThan(Integer value) {
            addCriterion("accused_seller_id <", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("accused_seller_id <=", value, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdIn(List<Integer> values) {
            addCriterion("accused_seller_id in", values, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdNotIn(List<Integer> values) {
            addCriterion("accused_seller_id not in", values, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("accused_seller_id between", value1, value2, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accused_seller_id not between", value1, value2, "accusedSellerId");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeIsNull() {
            addCriterion("accused_time is null");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeIsNotNull() {
            addCriterion("accused_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeEqualTo(Date value) {
            addCriterion("accused_time =", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeNotEqualTo(Date value) {
            addCriterion("accused_time <>", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeGreaterThan(Date value) {
            addCriterion("accused_time >", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accused_time >=", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeLessThan(Date value) {
            addCriterion("accused_time <", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeLessThanOrEqualTo(Date value) {
            addCriterion("accused_time <=", value, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeIn(List<Date> values) {
            addCriterion("accused_time in", values, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeNotIn(List<Date> values) {
            addCriterion("accused_time not in", values, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeBetween(Date value1, Date value2) {
            addCriterion("accused_time between", value1, value2, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccusedTimeNotBetween(Date value1, Date value2) {
            addCriterion("accused_time not between", value1, value2, "accusedTime");
            return (Criteria) this;
        }

        public Criteria andAccuserContentIsNull() {
            addCriterion("accuser_content is null");
            return (Criteria) this;
        }

        public Criteria andAccuserContentIsNotNull() {
            addCriterion("accuser_content is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserContentEqualTo(String value) {
            addCriterion("accuser_content =", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentNotEqualTo(String value) {
            addCriterion("accuser_content <>", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentGreaterThan(String value) {
            addCriterion("accuser_content >", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentGreaterThanOrEqualTo(String value) {
            addCriterion("accuser_content >=", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentLessThan(String value) {
            addCriterion("accuser_content <", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentLessThanOrEqualTo(String value) {
            addCriterion("accuser_content <=", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentLike(String value) {
            addCriterion("accuser_content like", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentNotLike(String value) {
            addCriterion("accuser_content not like", value, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentIn(List<String> values) {
            addCriterion("accuser_content in", values, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentNotIn(List<String> values) {
            addCriterion("accuser_content not in", values, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentBetween(String value1, String value2) {
            addCriterion("accuser_content between", value1, value2, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserContentNotBetween(String value1, String value2) {
            addCriterion("accuser_content not between", value1, value2, "accuserContent");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIsNull() {
            addCriterion("accuser_id is null");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIsNotNull() {
            addCriterion("accuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserIdEqualTo(Integer value) {
            addCriterion("accuser_id =", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotEqualTo(Integer value) {
            addCriterion("accuser_id <>", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdGreaterThan(Integer value) {
            addCriterion("accuser_id >", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accuser_id >=", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdLessThan(Integer value) {
            addCriterion("accuser_id <", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("accuser_id <=", value, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdIn(List<Integer> values) {
            addCriterion("accuser_id in", values, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotIn(List<Integer> values) {
            addCriterion("accuser_id not in", values, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdBetween(Integer value1, Integer value2) {
            addCriterion("accuser_id between", value1, value2, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accuser_id not between", value1, value2, "accuserId");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesIsNull() {
            addCriterion("accuser_images is null");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesIsNotNull() {
            addCriterion("accuser_images is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesEqualTo(String value) {
            addCriterion("accuser_images =", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesNotEqualTo(String value) {
            addCriterion("accuser_images <>", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesGreaterThan(String value) {
            addCriterion("accuser_images >", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesGreaterThanOrEqualTo(String value) {
            addCriterion("accuser_images >=", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesLessThan(String value) {
            addCriterion("accuser_images <", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesLessThanOrEqualTo(String value) {
            addCriterion("accuser_images <=", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesLike(String value) {
            addCriterion("accuser_images like", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesNotLike(String value) {
            addCriterion("accuser_images not like", value, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesIn(List<String> values) {
            addCriterion("accuser_images in", values, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesNotIn(List<String> values) {
            addCriterion("accuser_images not in", values, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesBetween(String value1, String value2) {
            addCriterion("accuser_images between", value1, value2, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserImagesNotBetween(String value1, String value2) {
            addCriterion("accuser_images not between", value1, value2, "accuserImages");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIsNull() {
            addCriterion("accuser_name is null");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIsNotNull() {
            addCriterion("accuser_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserNameEqualTo(String value) {
            addCriterion("accuser_name =", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotEqualTo(String value) {
            addCriterion("accuser_name <>", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameGreaterThan(String value) {
            addCriterion("accuser_name >", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameGreaterThanOrEqualTo(String value) {
            addCriterion("accuser_name >=", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLessThan(String value) {
            addCriterion("accuser_name <", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLessThanOrEqualTo(String value) {
            addCriterion("accuser_name <=", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameLike(String value) {
            addCriterion("accuser_name like", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotLike(String value) {
            addCriterion("accuser_name not like", value, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameIn(List<String> values) {
            addCriterion("accuser_name in", values, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotIn(List<String> values) {
            addCriterion("accuser_name not in", values, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameBetween(String value1, String value2) {
            addCriterion("accuser_name between", value1, value2, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserNameNotBetween(String value1, String value2) {
            addCriterion("accuser_name not between", value1, value2, "accuserName");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeIsNull() {
            addCriterion("accuser_time is null");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeIsNotNull() {
            addCriterion("accuser_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeEqualTo(Date value) {
            addCriterion("accuser_time =", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeNotEqualTo(Date value) {
            addCriterion("accuser_time <>", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeGreaterThan(Date value) {
            addCriterion("accuser_time >", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accuser_time >=", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeLessThan(Date value) {
            addCriterion("accuser_time <", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeLessThanOrEqualTo(Date value) {
            addCriterion("accuser_time <=", value, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeIn(List<Date> values) {
            addCriterion("accuser_time in", values, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeNotIn(List<Date> values) {
            addCriterion("accuser_time not in", values, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeBetween(Date value1, Date value2) {
            addCriterion("accuser_time between", value1, value2, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAccuserTimeNotBetween(Date value1, Date value2) {
            addCriterion("accuser_time not between", value1, value2, "accuserTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentIsNull() {
            addCriterion("admin_check_content is null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentIsNotNull() {
            addCriterion("admin_check_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentEqualTo(String value) {
            addCriterion("admin_check_content =", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentNotEqualTo(String value) {
            addCriterion("admin_check_content <>", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentGreaterThan(String value) {
            addCriterion("admin_check_content >", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentGreaterThanOrEqualTo(String value) {
            addCriterion("admin_check_content >=", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentLessThan(String value) {
            addCriterion("admin_check_content <", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentLessThanOrEqualTo(String value) {
            addCriterion("admin_check_content <=", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentLike(String value) {
            addCriterion("admin_check_content like", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentNotLike(String value) {
            addCriterion("admin_check_content not like", value, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentIn(List<String> values) {
            addCriterion("admin_check_content in", values, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentNotIn(List<String> values) {
            addCriterion("admin_check_content not in", values, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentBetween(String value1, String value2) {
            addCriterion("admin_check_content between", value1, value2, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckContentNotBetween(String value1, String value2) {
            addCriterion("admin_check_content not between", value1, value2, "adminCheckContent");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameIsNull() {
            addCriterion("admin_check_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameIsNotNull() {
            addCriterion("admin_check_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameEqualTo(String value) {
            addCriterion("admin_check_name =", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameNotEqualTo(String value) {
            addCriterion("admin_check_name <>", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameGreaterThan(String value) {
            addCriterion("admin_check_name >", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_check_name >=", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameLessThan(String value) {
            addCriterion("admin_check_name <", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameLessThanOrEqualTo(String value) {
            addCriterion("admin_check_name <=", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameLike(String value) {
            addCriterion("admin_check_name like", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameNotLike(String value) {
            addCriterion("admin_check_name not like", value, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameIn(List<String> values) {
            addCriterion("admin_check_name in", values, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameNotIn(List<String> values) {
            addCriterion("admin_check_name not in", values, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameBetween(String value1, String value2) {
            addCriterion("admin_check_name between", value1, value2, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckNameNotBetween(String value1, String value2) {
            addCriterion("admin_check_name not between", value1, value2, "adminCheckName");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeIsNull() {
            addCriterion("admin_check_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeIsNotNull() {
            addCriterion("admin_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeEqualTo(Date value) {
            addCriterion("admin_check_time =", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeNotEqualTo(Date value) {
            addCriterion("admin_check_time <>", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeGreaterThan(Date value) {
            addCriterion("admin_check_time >", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_check_time >=", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeLessThan(Date value) {
            addCriterion("admin_check_time <", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_check_time <=", value, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeIn(List<Date> values) {
            addCriterion("admin_check_time in", values, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeNotIn(List<Date> values) {
            addCriterion("admin_check_time not in", values, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeBetween(Date value1, Date value2) {
            addCriterion("admin_check_time between", value1, value2, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_check_time not between", value1, value2, "adminCheckTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentIsNull() {
            addCriterion("admin_confirm_content is null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentIsNotNull() {
            addCriterion("admin_confirm_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentEqualTo(String value) {
            addCriterion("admin_confirm_content =", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentNotEqualTo(String value) {
            addCriterion("admin_confirm_content <>", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentGreaterThan(String value) {
            addCriterion("admin_confirm_content >", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentGreaterThanOrEqualTo(String value) {
            addCriterion("admin_confirm_content >=", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentLessThan(String value) {
            addCriterion("admin_confirm_content <", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentLessThanOrEqualTo(String value) {
            addCriterion("admin_confirm_content <=", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentLike(String value) {
            addCriterion("admin_confirm_content like", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentNotLike(String value) {
            addCriterion("admin_confirm_content not like", value, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentIn(List<String> values) {
            addCriterion("admin_confirm_content in", values, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentNotIn(List<String> values) {
            addCriterion("admin_confirm_content not in", values, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentBetween(String value1, String value2) {
            addCriterion("admin_confirm_content between", value1, value2, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmContentNotBetween(String value1, String value2) {
            addCriterion("admin_confirm_content not between", value1, value2, "adminConfirmContent");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameIsNull() {
            addCriterion("admin_confirm_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameIsNotNull() {
            addCriterion("admin_confirm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameEqualTo(String value) {
            addCriterion("admin_confirm_name =", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameNotEqualTo(String value) {
            addCriterion("admin_confirm_name <>", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameGreaterThan(String value) {
            addCriterion("admin_confirm_name >", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_confirm_name >=", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameLessThan(String value) {
            addCriterion("admin_confirm_name <", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameLessThanOrEqualTo(String value) {
            addCriterion("admin_confirm_name <=", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameLike(String value) {
            addCriterion("admin_confirm_name like", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameNotLike(String value) {
            addCriterion("admin_confirm_name not like", value, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameIn(List<String> values) {
            addCriterion("admin_confirm_name in", values, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameNotIn(List<String> values) {
            addCriterion("admin_confirm_name not in", values, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameBetween(String value1, String value2) {
            addCriterion("admin_confirm_name between", value1, value2, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmNameNotBetween(String value1, String value2) {
            addCriterion("admin_confirm_name not between", value1, value2, "adminConfirmName");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeIsNull() {
            addCriterion("admin_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeIsNotNull() {
            addCriterion("admin_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeEqualTo(Date value) {
            addCriterion("admin_confirm_time =", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeNotEqualTo(Date value) {
            addCriterion("admin_confirm_time <>", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeGreaterThan(Date value) {
            addCriterion("admin_confirm_time >", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_confirm_time >=", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeLessThan(Date value) {
            addCriterion("admin_confirm_time <", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_confirm_time <=", value, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeIn(List<Date> values) {
            addCriterion("admin_confirm_time in", values, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeNotIn(List<Date> values) {
            addCriterion("admin_confirm_time not in", values, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("admin_confirm_time between", value1, value2, "adminConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAdminConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_confirm_time not between", value1, value2, "adminConfirmTime");
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

        public Criteria andComplainStateIsNull() {
            addCriterion("complain_state is null");
            return (Criteria) this;
        }

        public Criteria andComplainStateIsNotNull() {
            addCriterion("complain_state is not null");
            return (Criteria) this;
        }

        public Criteria andComplainStateEqualTo(Integer value) {
            addCriterion("complain_state =", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotEqualTo(Integer value) {
            addCriterion("complain_state <>", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateGreaterThan(Integer value) {
            addCriterion("complain_state >", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_state >=", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateLessThan(Integer value) {
            addCriterion("complain_state <", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateLessThanOrEqualTo(Integer value) {
            addCriterion("complain_state <=", value, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateIn(List<Integer> values) {
            addCriterion("complain_state in", values, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotIn(List<Integer> values) {
            addCriterion("complain_state not in", values, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateBetween(Integer value1, Integer value2) {
            addCriterion("complain_state between", value1, value2, "complainState");
            return (Criteria) this;
        }

        public Criteria andComplainStateNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_state not between", value1, value2, "complainState");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNull() {
            addCriterion("goods_full_specs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIsNotNull() {
            addCriterion("goods_full_specs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsEqualTo(String value) {
            addCriterion("goods_full_specs =", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotEqualTo(String value) {
            addCriterion("goods_full_specs <>", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThan(String value) {
            addCriterion("goods_full_specs >", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_full_specs >=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThan(String value) {
            addCriterion("goods_full_specs <", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLessThanOrEqualTo(String value) {
            addCriterion("goods_full_specs <=", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsLike(String value) {
            addCriterion("goods_full_specs like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotLike(String value) {
            addCriterion("goods_full_specs not like", value, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsIn(List<String> values) {
            addCriterion("goods_full_specs in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotIn(List<String> values) {
            addCriterion("goods_full_specs not in", values, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsBetween(String value1, String value2) {
            addCriterion("goods_full_specs between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsFullSpecsNotBetween(String value1, String value2) {
            addCriterion("goods_full_specs not between", value1, value2, "goodsFullSpecs");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
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

        public Criteria andOrdersGoodsIdIsNull() {
            addCriterion("orders_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIsNotNull() {
            addCriterion("orders_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdEqualTo(Integer value) {
            addCriterion("orders_goods_id =", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotEqualTo(Integer value) {
            addCriterion("orders_goods_id <>", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThan(Integer value) {
            addCriterion("orders_goods_id >", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id >=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThan(Integer value) {
            addCriterion("orders_goods_id <", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_goods_id <=", value, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdIn(List<Integer> values) {
            addCriterion("orders_goods_id in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotIn(List<Integer> values) {
            addCriterion("orders_goods_id not in", values, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id between", value1, value2, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_goods_id not between", value1, value2, "ordersGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNull() {
            addCriterion("orders_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIsNotNull() {
            addCriterion("orders_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSnEqualTo(String value) {
            addCriterion("orders_sn =", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotEqualTo(String value) {
            addCriterion("orders_sn <>", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThan(String value) {
            addCriterion("orders_sn >", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnGreaterThanOrEqualTo(String value) {
            addCriterion("orders_sn >=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThan(String value) {
            addCriterion("orders_sn <", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLessThanOrEqualTo(String value) {
            addCriterion("orders_sn <=", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnLike(String value) {
            addCriterion("orders_sn like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotLike(String value) {
            addCriterion("orders_sn not like", value, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnIn(List<String> values) {
            addCriterion("orders_sn in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotIn(List<String> values) {
            addCriterion("orders_sn not in", values, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnBetween(String value1, String value2) {
            addCriterion("orders_sn between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andOrdersSnNotBetween(String value1, String value2) {
            addCriterion("orders_sn not between", value1, value2, "ordersSn");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleIsNull() {
            addCriterion("subject_title is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleIsNotNull() {
            addCriterion("subject_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleEqualTo(String value) {
            addCriterion("subject_title =", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleNotEqualTo(String value) {
            addCriterion("subject_title <>", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleGreaterThan(String value) {
            addCriterion("subject_title >", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleGreaterThanOrEqualTo(String value) {
            addCriterion("subject_title >=", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleLessThan(String value) {
            addCriterion("subject_title <", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleLessThanOrEqualTo(String value) {
            addCriterion("subject_title <=", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleLike(String value) {
            addCriterion("subject_title like", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleNotLike(String value) {
            addCriterion("subject_title not like", value, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleIn(List<String> values) {
            addCriterion("subject_title in", values, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleNotIn(List<String> values) {
            addCriterion("subject_title not in", values, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleBetween(String value1, String value2) {
            addCriterion("subject_title between", value1, value2, "subjectTitle");
            return (Criteria) this;
        }

        public Criteria andSubjectTitleNotBetween(String value1, String value2) {
            addCriterion("subject_title not between", value1, value2, "subjectTitle");
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