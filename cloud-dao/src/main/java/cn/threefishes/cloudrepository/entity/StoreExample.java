package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andAllowForeignGoodsIsNull() {
            addCriterion("allow_foreign_goods is null");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsIsNotNull() {
            addCriterion("allow_foreign_goods is not null");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsEqualTo(Integer value) {
            addCriterion("allow_foreign_goods =", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotEqualTo(Integer value) {
            addCriterion("allow_foreign_goods <>", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsGreaterThan(Integer value) {
            addCriterion("allow_foreign_goods >", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_foreign_goods >=", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsLessThan(Integer value) {
            addCriterion("allow_foreign_goods <", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("allow_foreign_goods <=", value, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsIn(List<Integer> values) {
            addCriterion("allow_foreign_goods in", values, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotIn(List<Integer> values) {
            addCriterion("allow_foreign_goods not in", values, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsBetween(Integer value1, Integer value2) {
            addCriterion("allow_foreign_goods between", value1, value2, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andAllowForeignGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_foreign_goods not between", value1, value2, "allowForeignGoods");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNull() {
            addCriterion("bill_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNotNull() {
            addCriterion("bill_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleEqualTo(Integer value) {
            addCriterion("bill_cycle =", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotEqualTo(Integer value) {
            addCriterion("bill_cycle <>", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThan(Integer value) {
            addCriterion("bill_cycle >", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_cycle >=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThan(Integer value) {
            addCriterion("bill_cycle <", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThanOrEqualTo(Integer value) {
            addCriterion("bill_cycle <=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleIn(List<Integer> values) {
            addCriterion("bill_cycle in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotIn(List<Integer> values) {
            addCriterion("bill_cycle not in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleBetween(Integer value1, Integer value2) {
            addCriterion("bill_cycle between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_cycle not between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeIsNull() {
            addCriterion("bill_cycle_type is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeIsNotNull() {
            addCriterion("bill_cycle_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeEqualTo(Integer value) {
            addCriterion("bill_cycle_type =", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeNotEqualTo(Integer value) {
            addCriterion("bill_cycle_type <>", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeGreaterThan(Integer value) {
            addCriterion("bill_cycle_type >", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_cycle_type >=", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeLessThan(Integer value) {
            addCriterion("bill_cycle_type <", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_cycle_type <=", value, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeIn(List<Integer> values) {
            addCriterion("bill_cycle_type in", values, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeNotIn(List<Integer> values) {
            addCriterion("bill_cycle_type not in", values, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_cycle_type between", value1, value2, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBillCycleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_cycle_type not between", value1, value2, "billCycleType");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageIsNull() {
            addCriterion("business_licence_image is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageIsNotNull() {
            addCriterion("business_licence_image is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageEqualTo(String value) {
            addCriterion("business_licence_image =", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageNotEqualTo(String value) {
            addCriterion("business_licence_image <>", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageGreaterThan(String value) {
            addCriterion("business_licence_image >", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_image >=", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageLessThan(String value) {
            addCriterion("business_licence_image <", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageLessThanOrEqualTo(String value) {
            addCriterion("business_licence_image <=", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageLike(String value) {
            addCriterion("business_licence_image like", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageNotLike(String value) {
            addCriterion("business_licence_image not like", value, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageIn(List<String> values) {
            addCriterion("business_licence_image in", values, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageNotIn(List<String> values) {
            addCriterion("business_licence_image not in", values, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageBetween(String value1, String value2) {
            addCriterion("business_licence_image between", value1, value2, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceImageNotBetween(String value1, String value2) {
            addCriterion("business_licence_image not between", value1, value2, "businessLicenceImage");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNull() {
            addCriterion("company_area is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNotNull() {
            addCriterion("company_area is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaEqualTo(String value) {
            addCriterion("company_area =", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotEqualTo(String value) {
            addCriterion("company_area <>", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThan(String value) {
            addCriterion("company_area >", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("company_area >=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThan(String value) {
            addCriterion("company_area <", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThanOrEqualTo(String value) {
            addCriterion("company_area <=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLike(String value) {
            addCriterion("company_area like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotLike(String value) {
            addCriterion("company_area not like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIn(List<String> values) {
            addCriterion("company_area in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotIn(List<String> values) {
            addCriterion("company_area not in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaBetween(String value1, String value2) {
            addCriterion("company_area between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotBetween(String value1, String value2) {
            addCriterion("company_area not between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIsNull() {
            addCriterion("company_area_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIsNotNull() {
            addCriterion("company_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdEqualTo(Integer value) {
            addCriterion("company_area_id =", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotEqualTo(Integer value) {
            addCriterion("company_area_id <>", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdGreaterThan(Integer value) {
            addCriterion("company_area_id >", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_area_id >=", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdLessThan(Integer value) {
            addCriterion("company_area_id <", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_area_id <=", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIn(List<Integer> values) {
            addCriterion("company_area_id in", values, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotIn(List<Integer> values) {
            addCriterion("company_area_id not in", values, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("company_area_id between", value1, value2, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_area_id not between", value1, value2, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andDecorationColorIsNull() {
            addCriterion("decoration_color is null");
            return (Criteria) this;
        }

        public Criteria andDecorationColorIsNotNull() {
            addCriterion("decoration_color is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationColorEqualTo(String value) {
            addCriterion("decoration_color =", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorNotEqualTo(String value) {
            addCriterion("decoration_color <>", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorGreaterThan(String value) {
            addCriterion("decoration_color >", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorGreaterThanOrEqualTo(String value) {
            addCriterion("decoration_color >=", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorLessThan(String value) {
            addCriterion("decoration_color <", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorLessThanOrEqualTo(String value) {
            addCriterion("decoration_color <=", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorLike(String value) {
            addCriterion("decoration_color like", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorNotLike(String value) {
            addCriterion("decoration_color not like", value, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorIn(List<String> values) {
            addCriterion("decoration_color in", values, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorNotIn(List<String> values) {
            addCriterion("decoration_color not in", values, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorBetween(String value1, String value2) {
            addCriterion("decoration_color between", value1, value2, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationColorNotBetween(String value1, String value2) {
            addCriterion("decoration_color not between", value1, value2, "decorationColor");
            return (Criteria) this;
        }

        public Criteria andDecorationIdIsNull() {
            addCriterion("decoration_id is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIdIsNotNull() {
            addCriterion("decoration_id is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationIdEqualTo(Integer value) {
            addCriterion("decoration_id =", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdNotEqualTo(Integer value) {
            addCriterion("decoration_id <>", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdGreaterThan(Integer value) {
            addCriterion("decoration_id >", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("decoration_id >=", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdLessThan(Integer value) {
            addCriterion("decoration_id <", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdLessThanOrEqualTo(Integer value) {
            addCriterion("decoration_id <=", value, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdIn(List<Integer> values) {
            addCriterion("decoration_id in", values, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdNotIn(List<Integer> values) {
            addCriterion("decoration_id not in", values, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdBetween(Integer value1, Integer value2) {
            addCriterion("decoration_id between", value1, value2, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("decoration_id not between", value1, value2, "decorationId");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyIsNull() {
            addCriterion("decoration_only is null");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyIsNotNull() {
            addCriterion("decoration_only is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyEqualTo(Integer value) {
            addCriterion("decoration_only =", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyNotEqualTo(Integer value) {
            addCriterion("decoration_only <>", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyGreaterThan(Integer value) {
            addCriterion("decoration_only >", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("decoration_only >=", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyLessThan(Integer value) {
            addCriterion("decoration_only <", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyLessThanOrEqualTo(Integer value) {
            addCriterion("decoration_only <=", value, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyIn(List<Integer> values) {
            addCriterion("decoration_only in", values, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyNotIn(List<Integer> values) {
            addCriterion("decoration_only not in", values, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyBetween(Integer value1, Integer value2) {
            addCriterion("decoration_only between", value1, value2, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationOnlyNotBetween(Integer value1, Integer value2) {
            addCriterion("decoration_only not between", value1, value2, "decorationOnly");
            return (Criteria) this;
        }

        public Criteria andDecorationStateIsNull() {
            addCriterion("decoration_state is null");
            return (Criteria) this;
        }

        public Criteria andDecorationStateIsNotNull() {
            addCriterion("decoration_state is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationStateEqualTo(Integer value) {
            addCriterion("decoration_state =", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateNotEqualTo(Integer value) {
            addCriterion("decoration_state <>", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateGreaterThan(Integer value) {
            addCriterion("decoration_state >", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("decoration_state >=", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateLessThan(Integer value) {
            addCriterion("decoration_state <", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateLessThanOrEqualTo(Integer value) {
            addCriterion("decoration_state <=", value, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateIn(List<Integer> values) {
            addCriterion("decoration_state in", values, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateNotIn(List<Integer> values) {
            addCriterion("decoration_state not in", values, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateBetween(Integer value1, Integer value2) {
            addCriterion("decoration_state between", value1, value2, "decorationState");
            return (Criteria) this;
        }

        public Criteria andDecorationStateNotBetween(Integer value1, Integer value2) {
            addCriterion("decoration_state not between", value1, value2, "decorationState");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageIsNull() {
            addCriterion("food_circulation_permit_image is null");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageIsNotNull() {
            addCriterion("food_circulation_permit_image is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageEqualTo(String value) {
            addCriterion("food_circulation_permit_image =", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageNotEqualTo(String value) {
            addCriterion("food_circulation_permit_image <>", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageGreaterThan(String value) {
            addCriterion("food_circulation_permit_image >", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageGreaterThanOrEqualTo(String value) {
            addCriterion("food_circulation_permit_image >=", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageLessThan(String value) {
            addCriterion("food_circulation_permit_image <", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageLessThanOrEqualTo(String value) {
            addCriterion("food_circulation_permit_image <=", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageLike(String value) {
            addCriterion("food_circulation_permit_image like", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageNotLike(String value) {
            addCriterion("food_circulation_permit_image not like", value, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageIn(List<String> values) {
            addCriterion("food_circulation_permit_image in", values, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageNotIn(List<String> values) {
            addCriterion("food_circulation_permit_image not in", values, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageBetween(String value1, String value2) {
            addCriterion("food_circulation_permit_image between", value1, value2, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andFoodCirculationPermitImageNotBetween(String value1, String value2) {
            addCriterion("food_circulation_permit_image not between", value1, value2, "foodCirculationPermitImage");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIsNull() {
            addCriterion("is_own_shop is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIsNotNull() {
            addCriterion("is_own_shop is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopEqualTo(Integer value) {
            addCriterion("is_own_shop =", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotEqualTo(Integer value) {
            addCriterion("is_own_shop <>", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopGreaterThan(Integer value) {
            addCriterion("is_own_shop >", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_own_shop >=", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopLessThan(Integer value) {
            addCriterion("is_own_shop <", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopLessThanOrEqualTo(Integer value) {
            addCriterion("is_own_shop <=", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIn(List<Integer> values) {
            addCriterion("is_own_shop in", values, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotIn(List<Integer> values) {
            addCriterion("is_own_shop not in", values, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopBetween(Integer value1, Integer value2) {
            addCriterion("is_own_shop between", value1, value2, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotBetween(Integer value1, Integer value2) {
            addCriterion("is_own_shop not between", value1, value2, "isOwnShop");
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andShipCompanyIsNull() {
            addCriterion("ship_company is null");
            return (Criteria) this;
        }

        public Criteria andShipCompanyIsNotNull() {
            addCriterion("ship_company is not null");
            return (Criteria) this;
        }

        public Criteria andShipCompanyEqualTo(String value) {
            addCriterion("ship_company =", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyNotEqualTo(String value) {
            addCriterion("ship_company <>", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyGreaterThan(String value) {
            addCriterion("ship_company >", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ship_company >=", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyLessThan(String value) {
            addCriterion("ship_company <", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyLessThanOrEqualTo(String value) {
            addCriterion("ship_company <=", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyLike(String value) {
            addCriterion("ship_company like", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyNotLike(String value) {
            addCriterion("ship_company not like", value, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyIn(List<String> values) {
            addCriterion("ship_company in", values, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyNotIn(List<String> values) {
            addCriterion("ship_company not in", values, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyBetween(String value1, String value2) {
            addCriterion("ship_company between", value1, value2, "shipCompany");
            return (Criteria) this;
        }

        public Criteria andShipCompanyNotBetween(String value1, String value2) {
            addCriterion("ship_company not between", value1, value2, "shipCompany");
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

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIsNull() {
            addCriterion("store_avatar is null");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIsNotNull() {
            addCriterion("store_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarEqualTo(String value) {
            addCriterion("store_avatar =", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotEqualTo(String value) {
            addCriterion("store_avatar <>", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarGreaterThan(String value) {
            addCriterion("store_avatar >", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("store_avatar >=", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLessThan(String value) {
            addCriterion("store_avatar <", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLessThanOrEqualTo(String value) {
            addCriterion("store_avatar <=", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLike(String value) {
            addCriterion("store_avatar like", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotLike(String value) {
            addCriterion("store_avatar not like", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIn(List<String> values) {
            addCriterion("store_avatar in", values, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotIn(List<String> values) {
            addCriterion("store_avatar not in", values, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarBetween(String value1, String value2) {
            addCriterion("store_avatar between", value1, value2, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotBetween(String value1, String value2) {
            addCriterion("store_avatar not between", value1, value2, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNull() {
            addCriterion("store_banner is null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNotNull() {
            addCriterion("store_banner is not null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerEqualTo(String value) {
            addCriterion("store_banner =", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotEqualTo(String value) {
            addCriterion("store_banner <>", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThan(String value) {
            addCriterion("store_banner >", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThanOrEqualTo(String value) {
            addCriterion("store_banner >=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThan(String value) {
            addCriterion("store_banner <", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThanOrEqualTo(String value) {
            addCriterion("store_banner <=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLike(String value) {
            addCriterion("store_banner like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotLike(String value) {
            addCriterion("store_banner not like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIn(List<String> values) {
            addCriterion("store_banner in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotIn(List<String> values) {
            addCriterion("store_banner not in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerBetween(String value1, String value2) {
            addCriterion("store_banner between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotBetween(String value1, String value2) {
            addCriterion("store_banner not between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIsNull() {
            addCriterion("store_collect is null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIsNotNull() {
            addCriterion("store_collect is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectEqualTo(Integer value) {
            addCriterion("store_collect =", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotEqualTo(Integer value) {
            addCriterion("store_collect <>", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectGreaterThan(Integer value) {
            addCriterion("store_collect >", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_collect >=", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectLessThan(Integer value) {
            addCriterion("store_collect <", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectLessThanOrEqualTo(Integer value) {
            addCriterion("store_collect <=", value, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectIn(List<Integer> values) {
            addCriterion("store_collect in", values, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotIn(List<Integer> values) {
            addCriterion("store_collect not in", values, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectBetween(Integer value1, Integer value2) {
            addCriterion("store_collect between", value1, value2, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("store_collect not between", value1, value2, "storeCollect");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentIsNull() {
            addCriterion("store_commitment is null");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentIsNotNull() {
            addCriterion("store_commitment is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentEqualTo(String value) {
            addCriterion("store_commitment =", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentNotEqualTo(String value) {
            addCriterion("store_commitment <>", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentGreaterThan(String value) {
            addCriterion("store_commitment >", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentGreaterThanOrEqualTo(String value) {
            addCriterion("store_commitment >=", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentLessThan(String value) {
            addCriterion("store_commitment <", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentLessThanOrEqualTo(String value) {
            addCriterion("store_commitment <=", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentLike(String value) {
            addCriterion("store_commitment like", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentNotLike(String value) {
            addCriterion("store_commitment not like", value, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentIn(List<String> values) {
            addCriterion("store_commitment in", values, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentNotIn(List<String> values) {
            addCriterion("store_commitment not in", values, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentBetween(String value1, String value2) {
            addCriterion("store_commitment between", value1, value2, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCommitmentNotBetween(String value1, String value2) {
            addCriterion("store_commitment not between", value1, value2, "storeCommitment");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNull() {
            addCriterion("store_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNotNull() {
            addCriterion("store_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeEqualTo(Date value) {
            addCriterion("store_create_time =", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotEqualTo(Date value) {
            addCriterion("store_create_time <>", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThan(Date value) {
            addCriterion("store_create_time >", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_create_time >=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThan(Date value) {
            addCriterion("store_create_time <", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_create_time <=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIn(List<Date> values) {
            addCriterion("store_create_time in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotIn(List<Date> values) {
            addCriterion("store_create_time not in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeBetween(Date value1, Date value2) {
            addCriterion("store_create_time between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_create_time not between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIsNull() {
            addCriterion("store_deliverycredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIsNotNull() {
            addCriterion("store_deliverycredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditEqualTo(Double value) {
            addCriterion("store_deliverycredit =", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotEqualTo(Double value) {
            addCriterion("store_deliverycredit <>", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditGreaterThan(Double value) {
            addCriterion("store_deliverycredit >", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditGreaterThanOrEqualTo(Double value) {
            addCriterion("store_deliverycredit >=", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditLessThan(Double value) {
            addCriterion("store_deliverycredit <", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditLessThanOrEqualTo(Double value) {
            addCriterion("store_deliverycredit <=", value, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditIn(List<Double> values) {
            addCriterion("store_deliverycredit in", values, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotIn(List<Double> values) {
            addCriterion("store_deliverycredit not in", values, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditBetween(Double value1, Double value2) {
            addCriterion("store_deliverycredit between", value1, value2, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverycreditNotBetween(Double value1, Double value2) {
            addCriterion("store_deliverycredit not between", value1, value2, "storeDeliverycredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIsNull() {
            addCriterion("store_desccredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIsNotNull() {
            addCriterion("store_desccredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditEqualTo(Double value) {
            addCriterion("store_desccredit =", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotEqualTo(Double value) {
            addCriterion("store_desccredit <>", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditGreaterThan(Double value) {
            addCriterion("store_desccredit >", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditGreaterThanOrEqualTo(Double value) {
            addCriterion("store_desccredit >=", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditLessThan(Double value) {
            addCriterion("store_desccredit <", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditLessThanOrEqualTo(Double value) {
            addCriterion("store_desccredit <=", value, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditIn(List<Double> values) {
            addCriterion("store_desccredit in", values, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotIn(List<Double> values) {
            addCriterion("store_desccredit not in", values, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditBetween(Double value1, Double value2) {
            addCriterion("store_desccredit between", value1, value2, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreDesccreditNotBetween(Double value1, Double value2) {
            addCriterion("store_desccredit not between", value1, value2, "storeDesccredit");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNull() {
            addCriterion("store_end_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNotNull() {
            addCriterion("store_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeEqualTo(Date value) {
            addCriterion("store_end_time =", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotEqualTo(Date value) {
            addCriterion("store_end_time <>", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThan(Date value) {
            addCriterion("store_end_time >", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_end_time >=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThan(Date value) {
            addCriterion("store_end_time <", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_end_time <=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIn(List<Date> values) {
            addCriterion("store_end_time in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotIn(List<Date> values) {
            addCriterion("store_end_time not in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeBetween(Date value1, Date value2) {
            addCriterion("store_end_time between", value1, value2, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_end_time not between", value1, value2, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIsNull() {
            addCriterion("store_logo is null");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIsNotNull() {
            addCriterion("store_logo is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLogoEqualTo(String value) {
            addCriterion("store_logo =", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotEqualTo(String value) {
            addCriterion("store_logo <>", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoGreaterThan(String value) {
            addCriterion("store_logo >", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoGreaterThanOrEqualTo(String value) {
            addCriterion("store_logo >=", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLessThan(String value) {
            addCriterion("store_logo <", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLessThanOrEqualTo(String value) {
            addCriterion("store_logo <=", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLike(String value) {
            addCriterion("store_logo like", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotLike(String value) {
            addCriterion("store_logo not like", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIn(List<String> values) {
            addCriterion("store_logo in", values, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotIn(List<String> values) {
            addCriterion("store_logo not in", values, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoBetween(String value1, String value2) {
            addCriterion("store_logo between", value1, value2, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotBetween(String value1, String value2) {
            addCriterion("store_logo not between", value1, value2, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIsNull() {
            addCriterion("store_sales is null");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIsNotNull() {
            addCriterion("store_sales is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSalesEqualTo(Integer value) {
            addCriterion("store_sales =", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotEqualTo(Integer value) {
            addCriterion("store_sales <>", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesGreaterThan(Integer value) {
            addCriterion("store_sales >", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sales >=", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesLessThan(Integer value) {
            addCriterion("store_sales <", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesLessThanOrEqualTo(Integer value) {
            addCriterion("store_sales <=", value, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesIn(List<Integer> values) {
            addCriterion("store_sales in", values, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotIn(List<Integer> values) {
            addCriterion("store_sales not in", values, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesBetween(Integer value1, Integer value2) {
            addCriterion("store_sales between", value1, value2, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sales not between", value1, value2, "storeSales");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionIsNull() {
            addCriterion("store_seo_description is null");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionIsNotNull() {
            addCriterion("store_seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionEqualTo(String value) {
            addCriterion("store_seo_description =", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionNotEqualTo(String value) {
            addCriterion("store_seo_description <>", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionGreaterThan(String value) {
            addCriterion("store_seo_description >", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("store_seo_description >=", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionLessThan(String value) {
            addCriterion("store_seo_description <", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("store_seo_description <=", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionLike(String value) {
            addCriterion("store_seo_description like", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionNotLike(String value) {
            addCriterion("store_seo_description not like", value, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionIn(List<String> values) {
            addCriterion("store_seo_description in", values, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionNotIn(List<String> values) {
            addCriterion("store_seo_description not in", values, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionBetween(String value1, String value2) {
            addCriterion("store_seo_description between", value1, value2, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("store_seo_description not between", value1, value2, "storeSeoDescription");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsIsNull() {
            addCriterion("store_seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsIsNotNull() {
            addCriterion("store_seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsEqualTo(String value) {
            addCriterion("store_seo_keywords =", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsNotEqualTo(String value) {
            addCriterion("store_seo_keywords <>", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsGreaterThan(String value) {
            addCriterion("store_seo_keywords >", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("store_seo_keywords >=", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsLessThan(String value) {
            addCriterion("store_seo_keywords <", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("store_seo_keywords <=", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsLike(String value) {
            addCriterion("store_seo_keywords like", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsNotLike(String value) {
            addCriterion("store_seo_keywords not like", value, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsIn(List<String> values) {
            addCriterion("store_seo_keywords in", values, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsNotIn(List<String> values) {
            addCriterion("store_seo_keywords not in", values, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsBetween(String value1, String value2) {
            addCriterion("store_seo_keywords between", value1, value2, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("store_seo_keywords not between", value1, value2, "storeSeoKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIsNull() {
            addCriterion("store_servicecredit is null");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIsNotNull() {
            addCriterion("store_servicecredit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditEqualTo(Double value) {
            addCriterion("store_servicecredit =", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotEqualTo(Double value) {
            addCriterion("store_servicecredit <>", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditGreaterThan(Double value) {
            addCriterion("store_servicecredit >", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditGreaterThanOrEqualTo(Double value) {
            addCriterion("store_servicecredit >=", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditLessThan(Double value) {
            addCriterion("store_servicecredit <", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditLessThanOrEqualTo(Double value) {
            addCriterion("store_servicecredit <=", value, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditIn(List<Double> values) {
            addCriterion("store_servicecredit in", values, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotIn(List<Double> values) {
            addCriterion("store_servicecredit not in", values, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditBetween(Double value1, Double value2) {
            addCriterion("store_servicecredit between", value1, value2, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreServicecreditNotBetween(Double value1, Double value2) {
            addCriterion("store_servicecredit not between", value1, value2, "storeServicecredit");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNull() {
            addCriterion("store_theme is null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNotNull() {
            addCriterion("store_theme is not null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeEqualTo(String value) {
            addCriterion("store_theme =", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotEqualTo(String value) {
            addCriterion("store_theme <>", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThan(String value) {
            addCriterion("store_theme >", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThanOrEqualTo(String value) {
            addCriterion("store_theme >=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThan(String value) {
            addCriterion("store_theme <", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThanOrEqualTo(String value) {
            addCriterion("store_theme <=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLike(String value) {
            addCriterion("store_theme like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotLike(String value) {
            addCriterion("store_theme not like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIn(List<String> values) {
            addCriterion("store_theme in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotIn(List<String> values) {
            addCriterion("store_theme not in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeBetween(String value1, String value2) {
            addCriterion("store_theme between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotBetween(String value1, String value2) {
            addCriterion("store_theme not between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIsNull() {
            addCriterion("store_workingtime is null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIsNotNull() {
            addCriterion("store_workingtime is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeEqualTo(String value) {
            addCriterion("store_workingtime =", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotEqualTo(String value) {
            addCriterion("store_workingtime <>", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeGreaterThan(String value) {
            addCriterion("store_workingtime >", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_workingtime >=", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLessThan(String value) {
            addCriterion("store_workingtime <", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLessThanOrEqualTo(String value) {
            addCriterion("store_workingtime <=", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeLike(String value) {
            addCriterion("store_workingtime like", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotLike(String value) {
            addCriterion("store_workingtime not like", value, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeIn(List<String> values) {
            addCriterion("store_workingtime in", values, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotIn(List<String> values) {
            addCriterion("store_workingtime not in", values, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeBetween(String value1, String value2) {
            addCriterion("store_workingtime between", value1, value2, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingtimeNotBetween(String value1, String value2) {
            addCriterion("store_workingtime not between", value1, value2, "storeWorkingtime");
            return (Criteria) this;
        }

        public Criteria andStoreZyIsNull() {
            addCriterion("store_zy is null");
            return (Criteria) this;
        }

        public Criteria andStoreZyIsNotNull() {
            addCriterion("store_zy is not null");
            return (Criteria) this;
        }

        public Criteria andStoreZyEqualTo(String value) {
            addCriterion("store_zy =", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyNotEqualTo(String value) {
            addCriterion("store_zy <>", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyGreaterThan(String value) {
            addCriterion("store_zy >", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyGreaterThanOrEqualTo(String value) {
            addCriterion("store_zy >=", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyLessThan(String value) {
            addCriterion("store_zy <", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyLessThanOrEqualTo(String value) {
            addCriterion("store_zy <=", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyLike(String value) {
            addCriterion("store_zy like", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyNotLike(String value) {
            addCriterion("store_zy not like", value, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyIn(List<String> values) {
            addCriterion("store_zy in", values, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyNotIn(List<String> values) {
            addCriterion("store_zy not in", values, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyBetween(String value1, String value2) {
            addCriterion("store_zy between", value1, value2, "storeZy");
            return (Criteria) this;
        }

        public Criteria andStoreZyNotBetween(String value1, String value2) {
            addCriterion("store_zy not between", value1, value2, "storeZy");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdIsNull() {
            addCriterion("qiyu_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdIsNotNull() {
            addCriterion("qiyu_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdEqualTo(String value) {
            addCriterion("qiyu_merchant_id =", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdNotEqualTo(String value) {
            addCriterion("qiyu_merchant_id <>", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdGreaterThan(String value) {
            addCriterion("qiyu_merchant_id >", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("qiyu_merchant_id >=", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdLessThan(String value) {
            addCriterion("qiyu_merchant_id <", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("qiyu_merchant_id <=", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdLike(String value) {
            addCriterion("qiyu_merchant_id like", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdNotLike(String value) {
            addCriterion("qiyu_merchant_id not like", value, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdIn(List<String> values) {
            addCriterion("qiyu_merchant_id in", values, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdNotIn(List<String> values) {
            addCriterion("qiyu_merchant_id not in", values, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdBetween(String value1, String value2) {
            addCriterion("qiyu_merchant_id between", value1, value2, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuMerchantIdNotBetween(String value1, String value2) {
            addCriterion("qiyu_merchant_id not between", value1, value2, "qiyuMerchantId");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyIsNull() {
            addCriterion("qiyu_app_key is null");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyIsNotNull() {
            addCriterion("qiyu_app_key is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyEqualTo(String value) {
            addCriterion("qiyu_app_key =", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyNotEqualTo(String value) {
            addCriterion("qiyu_app_key <>", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyGreaterThan(String value) {
            addCriterion("qiyu_app_key >", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("qiyu_app_key >=", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyLessThan(String value) {
            addCriterion("qiyu_app_key <", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyLessThanOrEqualTo(String value) {
            addCriterion("qiyu_app_key <=", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyLike(String value) {
            addCriterion("qiyu_app_key like", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyNotLike(String value) {
            addCriterion("qiyu_app_key not like", value, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyIn(List<String> values) {
            addCriterion("qiyu_app_key in", values, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyNotIn(List<String> values) {
            addCriterion("qiyu_app_key not in", values, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyBetween(String value1, String value2) {
            addCriterion("qiyu_app_key between", value1, value2, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAppKeyNotBetween(String value1, String value2) {
            addCriterion("qiyu_app_key not between", value1, value2, "qiyuAppKey");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountIsNull() {
            addCriterion("qiyu_account is null");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountIsNotNull() {
            addCriterion("qiyu_account is not null");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountEqualTo(String value) {
            addCriterion("qiyu_account =", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountNotEqualTo(String value) {
            addCriterion("qiyu_account <>", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountGreaterThan(String value) {
            addCriterion("qiyu_account >", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountGreaterThanOrEqualTo(String value) {
            addCriterion("qiyu_account >=", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountLessThan(String value) {
            addCriterion("qiyu_account <", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountLessThanOrEqualTo(String value) {
            addCriterion("qiyu_account <=", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountLike(String value) {
            addCriterion("qiyu_account like", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountNotLike(String value) {
            addCriterion("qiyu_account not like", value, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountIn(List<String> values) {
            addCriterion("qiyu_account in", values, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountNotIn(List<String> values) {
            addCriterion("qiyu_account not in", values, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountBetween(String value1, String value2) {
            addCriterion("qiyu_account between", value1, value2, "qiyuAccount");
            return (Criteria) this;
        }

        public Criteria andQiyuAccountNotBetween(String value1, String value2) {
            addCriterion("qiyu_account not between", value1, value2, "qiyuAccount");
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