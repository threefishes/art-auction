package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class RealStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RealStoreExample() {
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

        public Criteria andRealStoreIdIsNull() {
            addCriterion("real_store_id is null");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdIsNotNull() {
            addCriterion("real_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdEqualTo(Integer value) {
            addCriterion("real_store_id =", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdNotEqualTo(Integer value) {
            addCriterion("real_store_id <>", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdGreaterThan(Integer value) {
            addCriterion("real_store_id >", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_store_id >=", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdLessThan(Integer value) {
            addCriterion("real_store_id <", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("real_store_id <=", value, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdIn(List<Integer> values) {
            addCriterion("real_store_id in", values, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdNotIn(List<Integer> values) {
            addCriterion("real_store_id not in", values, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("real_store_id between", value1, value2, "realStoreId");
            return (Criteria) this;
        }

        public Criteria andRealStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("real_store_id not between", value1, value2, "realStoreId");
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

        public Criteria andAreaId1IsNull() {
            addCriterion("area_id1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId1IsNotNull() {
            addCriterion("area_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId1EqualTo(Integer value) {
            addCriterion("area_id1 =", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotEqualTo(Integer value) {
            addCriterion("area_id1 <>", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThan(Integer value) {
            addCriterion("area_id1 >", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id1 >=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThan(Integer value) {
            addCriterion("area_id1 <", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1LessThanOrEqualTo(Integer value) {
            addCriterion("area_id1 <=", value, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1In(List<Integer> values) {
            addCriterion("area_id1 in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotIn(List<Integer> values) {
            addCriterion("area_id1 not in", values, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1Between(Integer value1, Integer value2) {
            addCriterion("area_id1 between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId1NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id1 not between", value1, value2, "areaId1");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNull() {
            addCriterion("area_id2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaId2IsNotNull() {
            addCriterion("area_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaId2EqualTo(Integer value) {
            addCriterion("area_id2 =", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotEqualTo(Integer value) {
            addCriterion("area_id2 <>", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThan(Integer value) {
            addCriterion("area_id2 >", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id2 >=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThan(Integer value) {
            addCriterion("area_id2 <", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2LessThanOrEqualTo(Integer value) {
            addCriterion("area_id2 <=", value, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2In(List<Integer> values) {
            addCriterion("area_id2 in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotIn(List<Integer> values) {
            addCriterion("area_id2 not in", values, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2Between(Integer value1, Integer value2) {
            addCriterion("area_id2 between", value1, value2, "areaId2");
            return (Criteria) this;
        }

        public Criteria andAreaId2NotBetween(Integer value1, Integer value2) {
            addCriterion("area_id2 not between", value1, value2, "areaId2");
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

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Float value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Float value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Float value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Float value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Float value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Float value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Float> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Float> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Float value1, Float value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Float value1, Float value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Float value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Float value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Float value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Float value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Float value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Float value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Float> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Float> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Float value1, Float value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Float value1, Float value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameIsNull() {
            addCriterion("real_store_name is null");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameIsNotNull() {
            addCriterion("real_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameEqualTo(String value) {
            addCriterion("real_store_name =", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameNotEqualTo(String value) {
            addCriterion("real_store_name <>", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameGreaterThan(String value) {
            addCriterion("real_store_name >", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_store_name >=", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameLessThan(String value) {
            addCriterion("real_store_name <", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameLessThanOrEqualTo(String value) {
            addCriterion("real_store_name <=", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameLike(String value) {
            addCriterion("real_store_name like", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameNotLike(String value) {
            addCriterion("real_store_name not like", value, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameIn(List<String> values) {
            addCriterion("real_store_name in", values, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameNotIn(List<String> values) {
            addCriterion("real_store_name not in", values, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameBetween(String value1, String value2) {
            addCriterion("real_store_name between", value1, value2, "realStoreName");
            return (Criteria) this;
        }

        public Criteria andRealStoreNameNotBetween(String value1, String value2) {
            addCriterion("real_store_name not between", value1, value2, "realStoreName");
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

        public Criteria andTrafficLineIsNull() {
            addCriterion("traffic_line is null");
            return (Criteria) this;
        }

        public Criteria andTrafficLineIsNotNull() {
            addCriterion("traffic_line is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficLineEqualTo(String value) {
            addCriterion("traffic_line =", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineNotEqualTo(String value) {
            addCriterion("traffic_line <>", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineGreaterThan(String value) {
            addCriterion("traffic_line >", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_line >=", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineLessThan(String value) {
            addCriterion("traffic_line <", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineLessThanOrEqualTo(String value) {
            addCriterion("traffic_line <=", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineLike(String value) {
            addCriterion("traffic_line like", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineNotLike(String value) {
            addCriterion("traffic_line not like", value, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineIn(List<String> values) {
            addCriterion("traffic_line in", values, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineNotIn(List<String> values) {
            addCriterion("traffic_line not in", values, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineBetween(String value1, String value2) {
            addCriterion("traffic_line between", value1, value2, "trafficLine");
            return (Criteria) this;
        }

        public Criteria andTrafficLineNotBetween(String value1, String value2) {
            addCriterion("traffic_line not between", value1, value2, "trafficLine");
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