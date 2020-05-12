package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistributorExample() {
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

        public Criteria andDistributorIdIsNull() {
            addCriterion("distributor_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIsNotNull() {
            addCriterion("distributor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorIdEqualTo(Integer value) {
            addCriterion("distributor_id =", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotEqualTo(Integer value) {
            addCriterion("distributor_id <>", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThan(Integer value) {
            addCriterion("distributor_id >", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributor_id >=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThan(Integer value) {
            addCriterion("distributor_id <", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdLessThanOrEqualTo(Integer value) {
            addCriterion("distributor_id <=", value, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdIn(List<Integer> values) {
            addCriterion("distributor_id in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotIn(List<Integer> values) {
            addCriterion("distributor_id not in", values, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andDistributorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distributor_id not between", value1, value2, "distributorId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
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

        public Criteria andBindEmailIsNull() {
            addCriterion("bind_email is null");
            return (Criteria) this;
        }

        public Criteria andBindEmailIsNotNull() {
            addCriterion("bind_email is not null");
            return (Criteria) this;
        }

        public Criteria andBindEmailEqualTo(String value) {
            addCriterion("bind_email =", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotEqualTo(String value) {
            addCriterion("bind_email <>", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailGreaterThan(String value) {
            addCriterion("bind_email >", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bind_email >=", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLessThan(String value) {
            addCriterion("bind_email <", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLessThanOrEqualTo(String value) {
            addCriterion("bind_email <=", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLike(String value) {
            addCriterion("bind_email like", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotLike(String value) {
            addCriterion("bind_email not like", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailIn(List<String> values) {
            addCriterion("bind_email in", values, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotIn(List<String> values) {
            addCriterion("bind_email not in", values, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailBetween(String value1, String value2) {
            addCriterion("bind_email between", value1, value2, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotBetween(String value1, String value2) {
            addCriterion("bind_email not between", value1, value2, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIsNull() {
            addCriterion("bind_phone is null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIsNotNull() {
            addCriterion("bind_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneEqualTo(String value) {
            addCriterion("bind_phone =", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotEqualTo(String value) {
            addCriterion("bind_phone <>", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneGreaterThan(String value) {
            addCriterion("bind_phone >", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bind_phone >=", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLessThan(String value) {
            addCriterion("bind_phone <", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLessThanOrEqualTo(String value) {
            addCriterion("bind_phone <=", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLike(String value) {
            addCriterion("bind_phone like", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotLike(String value) {
            addCriterion("bind_phone not like", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIn(List<String> values) {
            addCriterion("bind_phone in", values, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotIn(List<String> values) {
            addCriterion("bind_phone not in", values, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneBetween(String value1, String value2) {
            addCriterion("bind_phone between", value1, value2, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotBetween(String value1, String value2) {
            addCriterion("bind_phone not between", value1, value2, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableIsNull() {
            addCriterion("commission_available is null");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableIsNotNull() {
            addCriterion("commission_available is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableEqualTo(BigDecimal value) {
            addCriterion("commission_available =", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableNotEqualTo(BigDecimal value) {
            addCriterion("commission_available <>", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableGreaterThan(BigDecimal value) {
            addCriterion("commission_available >", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_available >=", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableLessThan(BigDecimal value) {
            addCriterion("commission_available <", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_available <=", value, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableIn(List<BigDecimal> values) {
            addCriterion("commission_available in", values, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableNotIn(List<BigDecimal> values) {
            addCriterion("commission_available not in", values, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_available between", value1, value2, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionAvailableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_available not between", value1, value2, "commissionAvailable");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeIsNull() {
            addCriterion("commission_freeze is null");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeIsNotNull() {
            addCriterion("commission_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeEqualTo(BigDecimal value) {
            addCriterion("commission_freeze =", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeNotEqualTo(BigDecimal value) {
            addCriterion("commission_freeze <>", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeGreaterThan(BigDecimal value) {
            addCriterion("commission_freeze >", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_freeze >=", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeLessThan(BigDecimal value) {
            addCriterion("commission_freeze <", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_freeze <=", value, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeIn(List<BigDecimal> values) {
            addCriterion("commission_freeze in", values, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeNotIn(List<BigDecimal> values) {
            addCriterion("commission_freeze not in", values, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_freeze between", value1, value2, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andCommissionFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_freeze not between", value1, value2, "commissionFreeze");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdIsNull() {
            addCriterion("default_favorites_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdIsNotNull() {
            addCriterion("default_favorites_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdEqualTo(Integer value) {
            addCriterion("default_favorites_id =", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdNotEqualTo(Integer value) {
            addCriterion("default_favorites_id <>", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdGreaterThan(Integer value) {
            addCriterion("default_favorites_id >", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_favorites_id >=", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdLessThan(Integer value) {
            addCriterion("default_favorites_id <", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdLessThanOrEqualTo(Integer value) {
            addCriterion("default_favorites_id <=", value, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdIn(List<Integer> values) {
            addCriterion("default_favorites_id in", values, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdNotIn(List<Integer> values) {
            addCriterion("default_favorites_id not in", values, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdBetween(Integer value1, Integer value2) {
            addCriterion("default_favorites_id between", value1, value2, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDefaultFavoritesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("default_favorites_id not between", value1, value2, "defaultFavoritesId");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNull() {
            addCriterion("distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNotNull() {
            addCriterion("distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountEqualTo(BigDecimal value) {
            addCriterion("distribution_amount =", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotEqualTo(BigDecimal value) {
            addCriterion("distribution_amount <>", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThan(BigDecimal value) {
            addCriterion("distribution_amount >", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_amount >=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThan(BigDecimal value) {
            addCriterion("distribution_amount <", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distribution_amount <=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIn(List<BigDecimal> values) {
            addCriterion("distribution_amount in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotIn(List<BigDecimal> values) {
            addCriterion("distribution_amount not in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_amount between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distribution_amount not between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountIsNull() {
            addCriterion("distribution_orders_count is null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountIsNotNull() {
            addCriterion("distribution_orders_count is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountEqualTo(Integer value) {
            addCriterion("distribution_orders_count =", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountNotEqualTo(Integer value) {
            addCriterion("distribution_orders_count <>", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountGreaterThan(Integer value) {
            addCriterion("distribution_orders_count >", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_count >=", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountLessThan(Integer value) {
            addCriterion("distribution_orders_count <", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_orders_count <=", value, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountIn(List<Integer> values) {
            addCriterion("distribution_orders_count in", values, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountNotIn(List<Integer> values) {
            addCriterion("distribution_orders_count not in", values, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_count between", value1, value2, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andDistributionOrdersCountNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_orders_count not between", value1, value2, "distributionOrdersCount");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNull() {
            addCriterion("Id_cart_back_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIsNotNull() {
            addCriterion("Id_cart_back_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageEqualTo(String value) {
            addCriterion("Id_cart_back_image =", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotEqualTo(String value) {
            addCriterion("Id_cart_back_image <>", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThan(String value) {
            addCriterion("Id_cart_back_image >", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_back_image >=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThan(String value) {
            addCriterion("Id_cart_back_image <", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_back_image <=", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageLike(String value) {
            addCriterion("Id_cart_back_image like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotLike(String value) {
            addCriterion("Id_cart_back_image not like", value, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageIn(List<String> values) {
            addCriterion("Id_cart_back_image in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotIn(List<String> values) {
            addCriterion("Id_cart_back_image not in", values, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageBetween(String value1, String value2) {
            addCriterion("Id_cart_back_image between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartBackImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_back_image not between", value1, value2, "idCartBackImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNull() {
            addCriterion("Id_cart_front_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIsNotNull() {
            addCriterion("Id_cart_front_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageEqualTo(String value) {
            addCriterion("Id_cart_front_image =", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotEqualTo(String value) {
            addCriterion("Id_cart_front_image <>", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThan(String value) {
            addCriterion("Id_cart_front_image >", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_front_image >=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThan(String value) {
            addCriterion("Id_cart_front_image <", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_front_image <=", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageLike(String value) {
            addCriterion("Id_cart_front_image like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotLike(String value) {
            addCriterion("Id_cart_front_image not like", value, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageIn(List<String> values) {
            addCriterion("Id_cart_front_image in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotIn(List<String> values) {
            addCriterion("Id_cart_front_image not in", values, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageBetween(String value1, String value2) {
            addCriterion("Id_cart_front_image between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartFrontImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_front_image not between", value1, value2, "idCartFrontImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNull() {
            addCriterion("Id_cart_hand_image is null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIsNotNull() {
            addCriterion("Id_cart_hand_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageEqualTo(String value) {
            addCriterion("Id_cart_hand_image =", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotEqualTo(String value) {
            addCriterion("Id_cart_hand_image <>", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThan(String value) {
            addCriterion("Id_cart_hand_image >", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageGreaterThanOrEqualTo(String value) {
            addCriterion("Id_cart_hand_image >=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThan(String value) {
            addCriterion("Id_cart_hand_image <", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLessThanOrEqualTo(String value) {
            addCriterion("Id_cart_hand_image <=", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageLike(String value) {
            addCriterion("Id_cart_hand_image like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotLike(String value) {
            addCriterion("Id_cart_hand_image not like", value, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageIn(List<String> values) {
            addCriterion("Id_cart_hand_image in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotIn(List<String> values) {
            addCriterion("Id_cart_hand_image not in", values, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageBetween(String value1, String value2) {
            addCriterion("Id_cart_hand_image between", value1, value2, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartHandImageNotBetween(String value1, String value2) {
            addCriterion("Id_cart_hand_image not between", value1, value2, "idCartHandImage");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIsNull() {
            addCriterion("id_cart_number is null");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIsNotNull() {
            addCriterion("id_cart_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberEqualTo(String value) {
            addCriterion("id_cart_number =", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotEqualTo(String value) {
            addCriterion("id_cart_number <>", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberGreaterThan(String value) {
            addCriterion("id_cart_number >", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart_number >=", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLessThan(String value) {
            addCriterion("id_cart_number <", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLessThanOrEqualTo(String value) {
            addCriterion("id_cart_number <=", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberLike(String value) {
            addCriterion("id_cart_number like", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotLike(String value) {
            addCriterion("id_cart_number not like", value, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberIn(List<String> values) {
            addCriterion("id_cart_number in", values, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotIn(List<String> values) {
            addCriterion("id_cart_number not in", values, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberBetween(String value1, String value2) {
            addCriterion("id_cart_number between", value1, value2, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andIdCartNumberNotBetween(String value1, String value2) {
            addCriterion("id_cart_number not between", value1, value2, "idCartNumber");
            return (Criteria) this;
        }

        public Criteria andJoininTimeIsNull() {
            addCriterion("joinin_time is null");
            return (Criteria) this;
        }

        public Criteria andJoininTimeIsNotNull() {
            addCriterion("joinin_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoininTimeEqualTo(Date value) {
            addCriterion("joinin_time =", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeNotEqualTo(Date value) {
            addCriterion("joinin_time <>", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeGreaterThan(Date value) {
            addCriterion("joinin_time >", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joinin_time >=", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeLessThan(Date value) {
            addCriterion("joinin_time <", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeLessThanOrEqualTo(Date value) {
            addCriterion("joinin_time <=", value, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeIn(List<Date> values) {
            addCriterion("joinin_time in", values, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeNotIn(List<Date> values) {
            addCriterion("joinin_time not in", values, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeBetween(Date value1, Date value2) {
            addCriterion("joinin_time between", value1, value2, "joininTime");
            return (Criteria) this;
        }

        public Criteria andJoininTimeNotBetween(Date value1, Date value2) {
            addCriterion("joinin_time not between", value1, value2, "joininTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIsNull() {
            addCriterion("pay_commission is null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIsNotNull() {
            addCriterion("pay_commission is not null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionEqualTo(BigDecimal value) {
            addCriterion("pay_commission =", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotEqualTo(BigDecimal value) {
            addCriterion("pay_commission <>", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionGreaterThan(BigDecimal value) {
            addCriterion("pay_commission >", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_commission >=", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionLessThan(BigDecimal value) {
            addCriterion("pay_commission <", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_commission <=", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIn(List<BigDecimal> values) {
            addCriterion("pay_commission in", values, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotIn(List<BigDecimal> values) {
            addCriterion("pay_commission not in", values, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_commission between", value1, value2, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_commission not between", value1, value2, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayPersonIsNull() {
            addCriterion("pay_person is null");
            return (Criteria) this;
        }

        public Criteria andPayPersonIsNotNull() {
            addCriterion("pay_person is not null");
            return (Criteria) this;
        }

        public Criteria andPayPersonEqualTo(String value) {
            addCriterion("pay_person =", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonNotEqualTo(String value) {
            addCriterion("pay_person <>", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonGreaterThan(String value) {
            addCriterion("pay_person >", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonGreaterThanOrEqualTo(String value) {
            addCriterion("pay_person >=", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonLessThan(String value) {
            addCriterion("pay_person <", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonLessThanOrEqualTo(String value) {
            addCriterion("pay_person <=", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonLike(String value) {
            addCriterion("pay_person like", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonNotLike(String value) {
            addCriterion("pay_person not like", value, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonIn(List<String> values) {
            addCriterion("pay_person in", values, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonNotIn(List<String> values) {
            addCriterion("pay_person not in", values, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonBetween(String value1, String value2) {
            addCriterion("pay_person between", value1, value2, "payPerson");
            return (Criteria) this;
        }

        public Criteria andPayPersonNotBetween(String value1, String value2) {
            addCriterion("pay_person not between", value1, value2, "payPerson");
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

        public Criteria andUnpayCommissionIsNull() {
            addCriterion("unpay_commission is null");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionIsNotNull() {
            addCriterion("unpay_commission is not null");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionEqualTo(BigDecimal value) {
            addCriterion("unpay_commission =", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionNotEqualTo(BigDecimal value) {
            addCriterion("unpay_commission <>", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionGreaterThan(BigDecimal value) {
            addCriterion("unpay_commission >", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unpay_commission >=", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionLessThan(BigDecimal value) {
            addCriterion("unpay_commission <", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unpay_commission <=", value, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionIn(List<BigDecimal> values) {
            addCriterion("unpay_commission in", values, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionNotIn(List<BigDecimal> values) {
            addCriterion("unpay_commission not in", values, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpay_commission between", value1, value2, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andUnpayCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpay_commission not between", value1, value2, "unpayCommission");
            return (Criteria) this;
        }

        public Criteria andBackImgIsNull() {
            addCriterion("back_img is null");
            return (Criteria) this;
        }

        public Criteria andBackImgIsNotNull() {
            addCriterion("back_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackImgEqualTo(String value) {
            addCriterion("back_img =", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgNotEqualTo(String value) {
            addCriterion("back_img <>", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgGreaterThan(String value) {
            addCriterion("back_img >", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_img >=", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgLessThan(String value) {
            addCriterion("back_img <", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgLessThanOrEqualTo(String value) {
            addCriterion("back_img <=", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgLike(String value) {
            addCriterion("back_img like", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgNotLike(String value) {
            addCriterion("back_img not like", value, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgIn(List<String> values) {
            addCriterion("back_img in", values, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgNotIn(List<String> values) {
            addCriterion("back_img not in", values, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgBetween(String value1, String value2) {
            addCriterion("back_img between", value1, value2, "backImg");
            return (Criteria) this;
        }

        public Criteria andBackImgNotBetween(String value1, String value2) {
            addCriterion("back_img not between", value1, value2, "backImg");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberIsNull() {
            addCriterion("weixin_number is null");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberIsNotNull() {
            addCriterion("weixin_number is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberEqualTo(String value) {
            addCriterion("weixin_number =", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberNotEqualTo(String value) {
            addCriterion("weixin_number <>", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberGreaterThan(String value) {
            addCriterion("weixin_number >", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_number >=", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberLessThan(String value) {
            addCriterion("weixin_number <", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberLessThanOrEqualTo(String value) {
            addCriterion("weixin_number <=", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberLike(String value) {
            addCriterion("weixin_number like", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberNotLike(String value) {
            addCriterion("weixin_number not like", value, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberIn(List<String> values) {
            addCriterion("weixin_number in", values, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberNotIn(List<String> values) {
            addCriterion("weixin_number not in", values, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberBetween(String value1, String value2) {
            addCriterion("weixin_number between", value1, value2, "weixinNumber");
            return (Criteria) this;
        }

        public Criteria andWeixinNumberNotBetween(String value1, String value2) {
            addCriterion("weixin_number not between", value1, value2, "weixinNumber");
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