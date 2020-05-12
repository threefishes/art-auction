package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreCertificateExample() {
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

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNull() {
            addCriterion("bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNotNull() {
            addCriterion("bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberEqualTo(String value) {
            addCriterion("bank_account_number =", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotEqualTo(String value) {
            addCriterion("bank_account_number <>", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThan(String value) {
            addCriterion("bank_account_number >", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_number >=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThan(String value) {
            addCriterion("bank_account_number <", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_account_number <=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLike(String value) {
            addCriterion("bank_account_number like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotLike(String value) {
            addCriterion("bank_account_number not like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIn(List<String> values) {
            addCriterion("bank_account_number in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotIn(List<String> values) {
            addCriterion("bank_account_number not in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberBetween(String value1, String value2) {
            addCriterion("bank_account_number between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("bank_account_number not between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageIsNull() {
            addCriterion("bank_licence_image is null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageIsNotNull() {
            addCriterion("bank_licence_image is not null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageEqualTo(String value) {
            addCriterion("bank_licence_image =", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageNotEqualTo(String value) {
            addCriterion("bank_licence_image <>", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageGreaterThan(String value) {
            addCriterion("bank_licence_image >", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageGreaterThanOrEqualTo(String value) {
            addCriterion("bank_licence_image >=", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageLessThan(String value) {
            addCriterion("bank_licence_image <", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageLessThanOrEqualTo(String value) {
            addCriterion("bank_licence_image <=", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageLike(String value) {
            addCriterion("bank_licence_image like", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageNotLike(String value) {
            addCriterion("bank_licence_image not like", value, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageIn(List<String> values) {
            addCriterion("bank_licence_image in", values, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageNotIn(List<String> values) {
            addCriterion("bank_licence_image not in", values, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageBetween(String value1, String value2) {
            addCriterion("bank_licence_image between", value1, value2, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankLicenceImageNotBetween(String value1, String value2) {
            addCriterion("bank_licence_image not between", value1, value2, "bankLicenceImage");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
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

        public Criteria andBusinessLicenceNumberIsNull() {
            addCriterion("business_licence_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIsNotNull() {
            addCriterion("business_licence_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberEqualTo(String value) {
            addCriterion("business_licence_number =", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotEqualTo(String value) {
            addCriterion("business_licence_number <>", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThan(String value) {
            addCriterion("business_licence_number >", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_number >=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThan(String value) {
            addCriterion("business_licence_number <", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThanOrEqualTo(String value) {
            addCriterion("business_licence_number <=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLike(String value) {
            addCriterion("business_licence_number like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotLike(String value) {
            addCriterion("business_licence_number not like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIn(List<String> values) {
            addCriterion("business_licence_number in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotIn(List<String> values) {
            addCriterion("business_licence_number not in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberBetween(String value1, String value2) {
            addCriterion("business_licence_number between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotBetween(String value1, String value2) {
            addCriterion("business_licence_number not between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNull() {
            addCriterion("business_sphere is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNotNull() {
            addCriterion("business_sphere is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereEqualTo(String value) {
            addCriterion("business_sphere =", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotEqualTo(String value) {
            addCriterion("business_sphere <>", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThan(String value) {
            addCriterion("business_sphere >", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThanOrEqualTo(String value) {
            addCriterion("business_sphere >=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThan(String value) {
            addCriterion("business_sphere <", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThanOrEqualTo(String value) {
            addCriterion("business_sphere <=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLike(String value) {
            addCriterion("business_sphere like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotLike(String value) {
            addCriterion("business_sphere not like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIn(List<String> values) {
            addCriterion("business_sphere in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotIn(List<String> values) {
            addCriterion("business_sphere not in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereBetween(String value1, String value2) {
            addCriterion("business_sphere between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotBetween(String value1, String value2) {
            addCriterion("business_sphere not between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNull() {
            addCriterion("company_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNotNull() {
            addCriterion("company_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailEqualTo(String value) {
            addCriterion("company_address_detail =", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotEqualTo(String value) {
            addCriterion("company_address_detail <>", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThan(String value) {
            addCriterion("company_address_detail >", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_detail >=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThan(String value) {
            addCriterion("company_address_detail <", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("company_address_detail <=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLike(String value) {
            addCriterion("company_address_detail like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotLike(String value) {
            addCriterion("company_address_detail not like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIn(List<String> values) {
            addCriterion("company_address_detail in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotIn(List<String> values) {
            addCriterion("company_address_detail not in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailBetween(String value1, String value2) {
            addCriterion("company_address_detail between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotBetween(String value1, String value2) {
            addCriterion("company_address_detail not between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIsNull() {
            addCriterion("company_address_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIsNotNull() {
            addCriterion("company_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdEqualTo(Integer value) {
            addCriterion("company_address_id =", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotEqualTo(Integer value) {
            addCriterion("company_address_id <>", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdGreaterThan(Integer value) {
            addCriterion("company_address_id >", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_address_id >=", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdLessThan(Integer value) {
            addCriterion("company_address_id <", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_address_id <=", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIn(List<Integer> values) {
            addCriterion("company_address_id in", values, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotIn(List<Integer> values) {
            addCriterion("company_address_id not in", values, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("company_address_id between", value1, value2, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_address_id not between", value1, value2, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNull() {
            addCriterion("company_employee_count is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNotNull() {
            addCriterion("company_employee_count is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountEqualTo(Integer value) {
            addCriterion("company_employee_count =", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotEqualTo(Integer value) {
            addCriterion("company_employee_count <>", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThan(Integer value) {
            addCriterion("company_employee_count >", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count >=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThan(Integer value) {
            addCriterion("company_employee_count <", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count <=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIn(List<Integer> values) {
            addCriterion("company_employee_count in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotIn(List<Integer> values) {
            addCriterion("company_employee_count not in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count between", value1, value2, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count not between", value1, value2, "companyEmployeeCount");
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

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNull() {
            addCriterion("company_registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNotNull() {
            addCriterion("company_registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalEqualTo(Integer value) {
            addCriterion("company_registered_capital =", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotEqualTo(Integer value) {
            addCriterion("company_registered_capital <>", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThan(Integer value) {
            addCriterion("company_registered_capital >", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital >=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThan(Integer value) {
            addCriterion("company_registered_capital <", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital <=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIn(List<Integer> values) {
            addCriterion("company_registered_capital in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotIn(List<Integer> values) {
            addCriterion("company_registered_capital not in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital not between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNull() {
            addCriterion("contacts_email is null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNotNull() {
            addCriterion("contacts_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailEqualTo(String value) {
            addCriterion("contacts_email =", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotEqualTo(String value) {
            addCriterion("contacts_email <>", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThan(String value) {
            addCriterion("contacts_email >", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_email >=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThan(String value) {
            addCriterion("contacts_email <", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThanOrEqualTo(String value) {
            addCriterion("contacts_email <=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLike(String value) {
            addCriterion("contacts_email like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotLike(String value) {
            addCriterion("contacts_email not like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIn(List<String> values) {
            addCriterion("contacts_email in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotIn(List<String> values) {
            addCriterion("contacts_email not in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailBetween(String value1, String value2) {
            addCriterion("contacts_email between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotBetween(String value1, String value2) {
            addCriterion("contacts_email not between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legal_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legal_name =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legal_name <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legal_name >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_name >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legal_name <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legal_name <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legal_name like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legal_name not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legal_name in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legal_name not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legal_name between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legal_name not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalCodeIsNull() {
            addCriterion("legal_code is null");
            return (Criteria) this;
        }

        public Criteria andLegalCodeIsNotNull() {
            addCriterion("legal_code is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCodeEqualTo(String value) {
            addCriterion("legal_code =", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeNotEqualTo(String value) {
            addCriterion("legal_code <>", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeGreaterThan(String value) {
            addCriterion("legal_code >", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_code >=", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeLessThan(String value) {
            addCriterion("legal_code <", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeLessThanOrEqualTo(String value) {
            addCriterion("legal_code <=", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeLike(String value) {
            addCriterion("legal_code like", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeNotLike(String value) {
            addCriterion("legal_code not like", value, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeIn(List<String> values) {
            addCriterion("legal_code in", values, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeNotIn(List<String> values) {
            addCriterion("legal_code not in", values, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeBetween(String value1, String value2) {
            addCriterion("legal_code between", value1, value2, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalCodeNotBetween(String value1, String value2) {
            addCriterion("legal_code not between", value1, value2, "legalCode");
            return (Criteria) this;
        }

        public Criteria andLegalImageIsNull() {
            addCriterion("legal_image is null");
            return (Criteria) this;
        }

        public Criteria andLegalImageIsNotNull() {
            addCriterion("legal_image is not null");
            return (Criteria) this;
        }

        public Criteria andLegalImageEqualTo(String value) {
            addCriterion("legal_image =", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageNotEqualTo(String value) {
            addCriterion("legal_image <>", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageGreaterThan(String value) {
            addCriterion("legal_image >", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageGreaterThanOrEqualTo(String value) {
            addCriterion("legal_image >=", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageLessThan(String value) {
            addCriterion("legal_image <", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageLessThanOrEqualTo(String value) {
            addCriterion("legal_image <=", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageLike(String value) {
            addCriterion("legal_image like", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageNotLike(String value) {
            addCriterion("legal_image not like", value, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageIn(List<String> values) {
            addCriterion("legal_image in", values, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageNotIn(List<String> values) {
            addCriterion("legal_image not in", values, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageBetween(String value1, String value2) {
            addCriterion("legal_image between", value1, value2, "legalImage");
            return (Criteria) this;
        }

        public Criteria andLegalImageNotBetween(String value1, String value2) {
            addCriterion("legal_image not between", value1, value2, "legalImage");
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

        public Criteria andSettlementBankAccountNameIsNull() {
            addCriterion("settlement_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIsNotNull() {
            addCriterion("settlement_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameEqualTo(String value) {
            addCriterion("settlement_bank_account_name =", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotEqualTo(String value) {
            addCriterion("settlement_bank_account_name <>", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThan(String value) {
            addCriterion("settlement_bank_account_name >", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name >=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThan(String value) {
            addCriterion("settlement_bank_account_name <", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name <=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLike(String value) {
            addCriterion("settlement_bank_account_name like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotLike(String value) {
            addCriterion("settlement_bank_account_name not like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIn(List<String> values) {
            addCriterion("settlement_bank_account_name in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotIn(List<String> values) {
            addCriterion("settlement_bank_account_name not in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name not between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNull() {
            addCriterion("settlement_bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNotNull() {
            addCriterion("settlement_bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberEqualTo(String value) {
            addCriterion("settlement_bank_account_number =", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotEqualTo(String value) {
            addCriterion("settlement_bank_account_number <>", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThan(String value) {
            addCriterion("settlement_bank_account_number >", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number >=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThan(String value) {
            addCriterion("settlement_bank_account_number <", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number <=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLike(String value) {
            addCriterion("settlement_bank_account_number like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotLike(String value) {
            addCriterion("settlement_bank_account_number not like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIn(List<String> values) {
            addCriterion("settlement_bank_account_number in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotIn(List<String> values) {
            addCriterion("settlement_bank_account_number not in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number not between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNull() {
            addCriterion("settlement_bank_address is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNotNull() {
            addCriterion("settlement_bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressEqualTo(String value) {
            addCriterion("settlement_bank_address =", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotEqualTo(String value) {
            addCriterion("settlement_bank_address <>", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThan(String value) {
            addCriterion("settlement_bank_address >", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address >=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThan(String value) {
            addCriterion("settlement_bank_address <", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address <=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLike(String value) {
            addCriterion("settlement_bank_address like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotLike(String value) {
            addCriterion("settlement_bank_address not like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIn(List<String> values) {
            addCriterion("settlement_bank_address in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotIn(List<String> values) {
            addCriterion("settlement_bank_address not in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressBetween(String value1, String value2) {
            addCriterion("settlement_bank_address between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_address not between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNull() {
            addCriterion("settlement_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNotNull() {
            addCriterion("settlement_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeEqualTo(String value) {
            addCriterion("settlement_bank_code =", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotEqualTo(String value) {
            addCriterion("settlement_bank_code <>", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThan(String value) {
            addCriterion("settlement_bank_code >", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code >=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThan(String value) {
            addCriterion("settlement_bank_code <", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code <=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLike(String value) {
            addCriterion("settlement_bank_code like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotLike(String value) {
            addCriterion("settlement_bank_code not like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIn(List<String> values) {
            addCriterion("settlement_bank_code in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotIn(List<String> values) {
            addCriterion("settlement_bank_code not in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeBetween(String value1, String value2) {
            addCriterion("settlement_bank_code between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_code not between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNull() {
            addCriterion("settlement_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNotNull() {
            addCriterion("settlement_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameEqualTo(String value) {
            addCriterion("settlement_bank_name =", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotEqualTo(String value) {
            addCriterion("settlement_bank_name <>", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThan(String value) {
            addCriterion("settlement_bank_name >", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name >=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThan(String value) {
            addCriterion("settlement_bank_name <", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name <=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLike(String value) {
            addCriterion("settlement_bank_name like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotLike(String value) {
            addCriterion("settlement_bank_name not like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIn(List<String> values) {
            addCriterion("settlement_bank_name in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotIn(List<String> values) {
            addCriterion("settlement_bank_name not in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_name between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_name not between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNull() {
            addCriterion("tax_registration_certificate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNotNull() {
            addCriterion("tax_registration_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateEqualTo(String value) {
            addCriterion("tax_registration_certificate =", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotEqualTo(String value) {
            addCriterion("tax_registration_certificate <>", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThan(String value) {
            addCriterion("tax_registration_certificate >", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate >=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThan(String value) {
            addCriterion("tax_registration_certificate <", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate <=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLike(String value) {
            addCriterion("tax_registration_certificate like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotLike(String value) {
            addCriterion("tax_registration_certificate not like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIn(List<String> values) {
            addCriterion("tax_registration_certificate in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotIn(List<String> values) {
            addCriterion("tax_registration_certificate not in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate not between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageIsNull() {
            addCriterion("tax_registration_image is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageIsNotNull() {
            addCriterion("tax_registration_image is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageEqualTo(String value) {
            addCriterion("tax_registration_image =", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageNotEqualTo(String value) {
            addCriterion("tax_registration_image <>", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageGreaterThan(String value) {
            addCriterion("tax_registration_image >", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_image >=", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageLessThan(String value) {
            addCriterion("tax_registration_image <", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_image <=", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageLike(String value) {
            addCriterion("tax_registration_image like", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageNotLike(String value) {
            addCriterion("tax_registration_image not like", value, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageIn(List<String> values) {
            addCriterion("tax_registration_image in", values, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageNotIn(List<String> values) {
            addCriterion("tax_registration_image not in", values, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageBetween(String value1, String value2) {
            addCriterion("tax_registration_image between", value1, value2, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationImageNotBetween(String value1, String value2) {
            addCriterion("tax_registration_image not between", value1, value2, "taxRegistrationImage");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNull() {
            addCriterion("taxpayer_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNotNull() {
            addCriterion("taxpayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdEqualTo(String value) {
            addCriterion("taxpayer_id =", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotEqualTo(String value) {
            addCriterion("taxpayer_id <>", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThan(String value) {
            addCriterion("taxpayer_id >", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_id >=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThan(String value) {
            addCriterion("taxpayer_id <", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_id <=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLike(String value) {
            addCriterion("taxpayer_id like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotLike(String value) {
            addCriterion("taxpayer_id not like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIn(List<String> values) {
            addCriterion("taxpayer_id in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotIn(List<String> values) {
            addCriterion("taxpayer_id not in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdBetween(String value1, String value2) {
            addCriterion("taxpayer_id between", value1, value2, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotBetween(String value1, String value2) {
            addCriterion("taxpayer_id not between", value1, value2, "taxpayerId");
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