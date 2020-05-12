package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreCertificateInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreCertificateInvoiceExample() {
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

        public Criteria andTaxpayerNameIsNull() {
            addCriterion("taxpayer_name is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameIsNotNull() {
            addCriterion("taxpayer_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameEqualTo(String value) {
            addCriterion("taxpayer_name =", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameNotEqualTo(String value) {
            addCriterion("taxpayer_name <>", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameGreaterThan(String value) {
            addCriterion("taxpayer_name >", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_name >=", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameLessThan(String value) {
            addCriterion("taxpayer_name <", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_name <=", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameLike(String value) {
            addCriterion("taxpayer_name like", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameNotLike(String value) {
            addCriterion("taxpayer_name not like", value, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameIn(List<String> values) {
            addCriterion("taxpayer_name in", values, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameNotIn(List<String> values) {
            addCriterion("taxpayer_name not in", values, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameBetween(String value1, String value2) {
            addCriterion("taxpayer_name between", value1, value2, "taxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNameNotBetween(String value1, String value2) {
            addCriterion("taxpayer_name not between", value1, value2, "taxpayerName");
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

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIsNull() {
            addCriterion("is_register is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIsNotNull() {
            addCriterion("is_register is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterEqualTo(Integer value) {
            addCriterion("is_register =", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotEqualTo(Integer value) {
            addCriterion("is_register <>", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterGreaterThan(Integer value) {
            addCriterion("is_register >", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_register >=", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterLessThan(Integer value) {
            addCriterion("is_register <", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterLessThanOrEqualTo(Integer value) {
            addCriterion("is_register <=", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIn(List<Integer> values) {
            addCriterion("is_register in", values, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotIn(List<Integer> values) {
            addCriterion("is_register not in", values, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterBetween(Integer value1, Integer value2) {
            addCriterion("is_register between", value1, value2, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_register not between", value1, value2, "isRegister");
            return (Criteria) this;
        }

        public Criteria andPushJsonIsNull() {
            addCriterion("push_json is null");
            return (Criteria) this;
        }

        public Criteria andPushJsonIsNotNull() {
            addCriterion("push_json is not null");
            return (Criteria) this;
        }

        public Criteria andPushJsonEqualTo(String value) {
            addCriterion("push_json =", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotEqualTo(String value) {
            addCriterion("push_json <>", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonGreaterThan(String value) {
            addCriterion("push_json >", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonGreaterThanOrEqualTo(String value) {
            addCriterion("push_json >=", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLessThan(String value) {
            addCriterion("push_json <", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLessThanOrEqualTo(String value) {
            addCriterion("push_json <=", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonLike(String value) {
            addCriterion("push_json like", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotLike(String value) {
            addCriterion("push_json not like", value, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonIn(List<String> values) {
            addCriterion("push_json in", values, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotIn(List<String> values) {
            addCriterion("push_json not in", values, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonBetween(String value1, String value2) {
            addCriterion("push_json between", value1, value2, "pushJson");
            return (Criteria) this;
        }

        public Criteria andPushJsonNotBetween(String value1, String value2) {
            addCriterion("push_json not between", value1, value2, "pushJson");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceIsNull() {
            addCriterion("is_paper_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceIsNotNull() {
            addCriterion("is_paper_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceEqualTo(Integer value) {
            addCriterion("is_paper_invoice =", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceNotEqualTo(Integer value) {
            addCriterion("is_paper_invoice <>", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceGreaterThan(Integer value) {
            addCriterion("is_paper_invoice >", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_paper_invoice >=", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceLessThan(Integer value) {
            addCriterion("is_paper_invoice <", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_paper_invoice <=", value, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceIn(List<Integer> values) {
            addCriterion("is_paper_invoice in", values, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceNotIn(List<Integer> values) {
            addCriterion("is_paper_invoice not in", values, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("is_paper_invoice between", value1, value2, "isPaperInvoice");
            return (Criteria) this;
        }

        public Criteria andIsPaperInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_paper_invoice not between", value1, value2, "isPaperInvoice");
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