package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopicalityFlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicalityFlagExample() {
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

        public Criteria andFlagSnIsNull() {
            addCriterion("flag_sn is null");
            return (Criteria) this;
        }

        public Criteria andFlagSnIsNotNull() {
            addCriterion("flag_sn is not null");
            return (Criteria) this;
        }

        public Criteria andFlagSnEqualTo(String value) {
            addCriterion("flag_sn =", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnNotEqualTo(String value) {
            addCriterion("flag_sn <>", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnGreaterThan(String value) {
            addCriterion("flag_sn >", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnGreaterThanOrEqualTo(String value) {
            addCriterion("flag_sn >=", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnLessThan(String value) {
            addCriterion("flag_sn <", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnLessThanOrEqualTo(String value) {
            addCriterion("flag_sn <=", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnLike(String value) {
            addCriterion("flag_sn like", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnNotLike(String value) {
            addCriterion("flag_sn not like", value, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnIn(List<String> values) {
            addCriterion("flag_sn in", values, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnNotIn(List<String> values) {
            addCriterion("flag_sn not in", values, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnBetween(String value1, String value2) {
            addCriterion("flag_sn between", value1, value2, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagSnNotBetween(String value1, String value2) {
            addCriterion("flag_sn not between", value1, value2, "flagSn");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNull() {
            addCriterion("flag_name is null");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNotNull() {
            addCriterion("flag_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlagNameEqualTo(String value) {
            addCriterion("flag_name =", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotEqualTo(String value) {
            addCriterion("flag_name <>", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThan(String value) {
            addCriterion("flag_name >", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThanOrEqualTo(String value) {
            addCriterion("flag_name >=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThan(String value) {
            addCriterion("flag_name <", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThanOrEqualTo(String value) {
            addCriterion("flag_name <=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLike(String value) {
            addCriterion("flag_name like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotLike(String value) {
            addCriterion("flag_name not like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameIn(List<String> values) {
            addCriterion("flag_name in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotIn(List<String> values) {
            addCriterion("flag_name not in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameBetween(String value1, String value2) {
            addCriterion("flag_name between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotBetween(String value1, String value2) {
            addCriterion("flag_name not between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagImageIsNull() {
            addCriterion("flag_image is null");
            return (Criteria) this;
        }

        public Criteria andFlagImageIsNotNull() {
            addCriterion("flag_image is not null");
            return (Criteria) this;
        }

        public Criteria andFlagImageEqualTo(String value) {
            addCriterion("flag_image =", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageNotEqualTo(String value) {
            addCriterion("flag_image <>", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageGreaterThan(String value) {
            addCriterion("flag_image >", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageGreaterThanOrEqualTo(String value) {
            addCriterion("flag_image >=", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageLessThan(String value) {
            addCriterion("flag_image <", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageLessThanOrEqualTo(String value) {
            addCriterion("flag_image <=", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageLike(String value) {
            addCriterion("flag_image like", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageNotLike(String value) {
            addCriterion("flag_image not like", value, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageIn(List<String> values) {
            addCriterion("flag_image in", values, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageNotIn(List<String> values) {
            addCriterion("flag_image not in", values, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageBetween(String value1, String value2) {
            addCriterion("flag_image between", value1, value2, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagImageNotBetween(String value1, String value2) {
            addCriterion("flag_image not between", value1, value2, "flagImage");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionIsNull() {
            addCriterion("flag_description is null");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionIsNotNull() {
            addCriterion("flag_description is not null");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionEqualTo(String value) {
            addCriterion("flag_description =", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionNotEqualTo(String value) {
            addCriterion("flag_description <>", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionGreaterThan(String value) {
            addCriterion("flag_description >", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("flag_description >=", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionLessThan(String value) {
            addCriterion("flag_description <", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionLessThanOrEqualTo(String value) {
            addCriterion("flag_description <=", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionLike(String value) {
            addCriterion("flag_description like", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionNotLike(String value) {
            addCriterion("flag_description not like", value, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionIn(List<String> values) {
            addCriterion("flag_description in", values, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionNotIn(List<String> values) {
            addCriterion("flag_description not in", values, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionBetween(String value1, String value2) {
            addCriterion("flag_description between", value1, value2, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagDescriptionNotBetween(String value1, String value2) {
            addCriterion("flag_description not between", value1, value2, "flagDescription");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIsNull() {
            addCriterion("flag_type is null");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIsNotNull() {
            addCriterion("flag_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlagTypeEqualTo(String value) {
            addCriterion("flag_type =", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotEqualTo(String value) {
            addCriterion("flag_type <>", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeGreaterThan(String value) {
            addCriterion("flag_type >", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeGreaterThanOrEqualTo(String value) {
            addCriterion("flag_type >=", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeLessThan(String value) {
            addCriterion("flag_type <", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeLessThanOrEqualTo(String value) {
            addCriterion("flag_type <=", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeLike(String value) {
            addCriterion("flag_type like", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotLike(String value) {
            addCriterion("flag_type not like", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIn(List<String> values) {
            addCriterion("flag_type in", values, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotIn(List<String> values) {
            addCriterion("flag_type not in", values, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeBetween(String value1, String value2) {
            addCriterion("flag_type between", value1, value2, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotBetween(String value1, String value2) {
            addCriterion("flag_type not between", value1, value2, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagSourceIsNull() {
            addCriterion("flag_source is null");
            return (Criteria) this;
        }

        public Criteria andFlagSourceIsNotNull() {
            addCriterion("flag_source is not null");
            return (Criteria) this;
        }

        public Criteria andFlagSourceEqualTo(String value) {
            addCriterion("flag_source =", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceNotEqualTo(String value) {
            addCriterion("flag_source <>", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceGreaterThan(String value) {
            addCriterion("flag_source >", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceGreaterThanOrEqualTo(String value) {
            addCriterion("flag_source >=", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceLessThan(String value) {
            addCriterion("flag_source <", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceLessThanOrEqualTo(String value) {
            addCriterion("flag_source <=", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceLike(String value) {
            addCriterion("flag_source like", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceNotLike(String value) {
            addCriterion("flag_source not like", value, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceIn(List<String> values) {
            addCriterion("flag_source in", values, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceNotIn(List<String> values) {
            addCriterion("flag_source not in", values, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceBetween(String value1, String value2) {
            addCriterion("flag_source between", value1, value2, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagSourceNotBetween(String value1, String value2) {
            addCriterion("flag_source not between", value1, value2, "flagSource");
            return (Criteria) this;
        }

        public Criteria andFlagStateIsNull() {
            addCriterion("flag_state is null");
            return (Criteria) this;
        }

        public Criteria andFlagStateIsNotNull() {
            addCriterion("flag_state is not null");
            return (Criteria) this;
        }

        public Criteria andFlagStateEqualTo(Integer value) {
            addCriterion("flag_state =", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateNotEqualTo(Integer value) {
            addCriterion("flag_state <>", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateGreaterThan(Integer value) {
            addCriterion("flag_state >", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_state >=", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateLessThan(Integer value) {
            addCriterion("flag_state <", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateLessThanOrEqualTo(Integer value) {
            addCriterion("flag_state <=", value, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateIn(List<Integer> values) {
            addCriterion("flag_state in", values, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateNotIn(List<Integer> values) {
            addCriterion("flag_state not in", values, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateBetween(Integer value1, Integer value2) {
            addCriterion("flag_state between", value1, value2, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagStateNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_state not between", value1, value2, "flagState");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceIsNull() {
            addCriterion("flag_choice is null");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceIsNotNull() {
            addCriterion("flag_choice is not null");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceEqualTo(Integer value) {
            addCriterion("flag_choice =", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceNotEqualTo(Integer value) {
            addCriterion("flag_choice <>", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceGreaterThan(Integer value) {
            addCriterion("flag_choice >", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_choice >=", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceLessThan(Integer value) {
            addCriterion("flag_choice <", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceLessThanOrEqualTo(Integer value) {
            addCriterion("flag_choice <=", value, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceIn(List<Integer> values) {
            addCriterion("flag_choice in", values, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceNotIn(List<Integer> values) {
            addCriterion("flag_choice not in", values, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceBetween(Integer value1, Integer value2) {
            addCriterion("flag_choice between", value1, value2, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andFlagChoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_choice not between", value1, value2, "flagChoice");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNull() {
            addCriterion("use_num is null");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNotNull() {
            addCriterion("use_num is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumEqualTo(Integer value) {
            addCriterion("use_num =", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotEqualTo(Integer value) {
            addCriterion("use_num <>", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThan(Integer value) {
            addCriterion("use_num >", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_num >=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThan(Integer value) {
            addCriterion("use_num <", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThanOrEqualTo(Integer value) {
            addCriterion("use_num <=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumIn(List<Integer> values) {
            addCriterion("use_num in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotIn(List<Integer> values) {
            addCriterion("use_num not in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumBetween(Integer value1, Integer value2) {
            addCriterion("use_num between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("use_num not between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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