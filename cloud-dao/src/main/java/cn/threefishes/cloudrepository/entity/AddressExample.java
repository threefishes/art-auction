package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNull() {
            addCriterion("area_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNotNull() {
            addCriterion("area_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId1EqualTo(Integer value) {
            addCriterion("area_id_1 =", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotEqualTo(Integer value) {
            addCriterion("area_id_1 <>", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThan(Integer value) {
            addCriterion("area_id_1 >", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_1 >=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThan(Integer value) {
            addCriterion("area_id_1 <", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_1 <=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1In(List<Integer> values) {
            addCriterion("area_id_1 in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotIn(List<Integer> values) {
            addCriterion("area_id_1 not in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1Between(Integer value1, Integer value2) {
            addCriterion("area_id_1 between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_1 not between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNull() {
            addCriterion("area_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNotNull() {
            addCriterion("area_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId2EqualTo(Integer value) {
            addCriterion("area_id_2 =", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotEqualTo(Integer value) {
            addCriterion("area_id_2 <>", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThan(Integer value) {
            addCriterion("area_id_2 >", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_2 >=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThan(Integer value) {
            addCriterion("area_id_2 <", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_2 <=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2In(List<Integer> values) {
            addCriterion("area_id_2 in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotIn(List<Integer> values) {
            addCriterion("area_id_2 not in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2Between(Integer value1, Integer value2) {
            addCriterion("area_id_2 between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_2 not between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId3IsNull() {
            addCriterion("area_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId3IsNotNull() {
            addCriterion("area_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId3EqualTo(Integer value) {
            addCriterion("area_id_3 =", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotEqualTo(Integer value) {
            addCriterion("area_id_3 <>", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3GreaterThan(Integer value) {
            addCriterion("area_id_3 >", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_3 >=", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3LessThan(Integer value) {
            addCriterion("area_id_3 <", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_3 <=", value, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3In(List<Integer> values) {
            addCriterion("area_id_3 in", values, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotIn(List<Integer> values) {
            addCriterion("area_id_3 not in", values, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3Between(Integer value1, Integer value2) {
            addCriterion("area_id_3 between", value1, value2, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId3NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_3 not between", value1, value2, "areaId3");
            return (Criteria) this;
        }

        public Criteria andAreaId4IsNull() {
            addCriterion("area_id_4 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId4IsNotNull() {
            addCriterion("area_id_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId4EqualTo(Integer value) {
            addCriterion("area_id_4 =", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotEqualTo(Integer value) {
            addCriterion("area_id_4 <>", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4GreaterThan(Integer value) {
            addCriterion("area_id_4 >", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id_4 >=", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4LessThan(Integer value) {
            addCriterion("area_id_4 <", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4LessThanOrEqualTo(Integer value) {
            addCriterion("area_id_4 <=", value, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4In(List<Integer> values) {
            addCriterion("area_id_4 in", values, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotIn(List<Integer> values) {
            addCriterion("area_id_4 not in", values, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4Between(Integer value1, Integer value2) {
            addCriterion("area_id_4 between", value1, value2, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaId4NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id_4 not between", value1, value2, "areaId4");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNull() {
            addCriterion("area_info is null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIsNotNull() {
            addCriterion("area_info is not null");
            return (Criteria) this;
        }

        public Criteria andAreaInfoEqualTo(String value) {
            addCriterion("area_info =", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotEqualTo(String value) {
            addCriterion("area_info <>", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThan(String value) {
            addCriterion("area_info >", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("area_info >=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThan(String value) {
            addCriterion("area_info <", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLessThanOrEqualTo(String value) {
            addCriterion("area_info <=", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoLike(String value) {
            addCriterion("area_info like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotLike(String value) {
            addCriterion("area_info not like", value, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoIn(List<String> values) {
            addCriterion("area_info in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotIn(List<String> values) {
            addCriterion("area_info not in", values, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoBetween(String value1, String value2) {
            addCriterion("area_info between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andAreaInfoNotBetween(String value1, String value2) {
            addCriterion("area_info not between", value1, value2, "areaInfo");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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

        public Criteria andMobphoneIsNull() {
            addCriterion("mobphone is null");
            return (Criteria) this;
        }

        public Criteria andMobphoneIsNotNull() {
            addCriterion("mobphone is not null");
            return (Criteria) this;
        }

        public Criteria andMobphoneEqualTo(String value) {
            addCriterion("mobphone =", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneNotEqualTo(String value) {
            addCriterion("mobphone <>", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneGreaterThan(String value) {
            addCriterion("mobphone >", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobphone >=", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneLessThan(String value) {
            addCriterion("mobphone <", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneLessThanOrEqualTo(String value) {
            addCriterion("mobphone <=", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneLike(String value) {
            addCriterion("mobphone like", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneNotLike(String value) {
            addCriterion("mobphone not like", value, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneIn(List<String> values) {
            addCriterion("mobphone in", values, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneNotIn(List<String> values) {
            addCriterion("mobphone not in", values, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneBetween(String value1, String value2) {
            addCriterion("mobphone between", value1, value2, "mobphone");
            return (Criteria) this;
        }

        public Criteria andMobphoneNotBetween(String value1, String value2) {
            addCriterion("mobphone not between", value1, value2, "mobphone");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
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