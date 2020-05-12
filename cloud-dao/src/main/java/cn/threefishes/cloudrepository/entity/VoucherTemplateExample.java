package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoucherTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoucherTemplateExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
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

        public Criteria andAppUsableIsNull() {
            addCriterion("app_usable is null");
            return (Criteria) this;
        }

        public Criteria andAppUsableIsNotNull() {
            addCriterion("app_usable is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsableEqualTo(Integer value) {
            addCriterion("app_usable =", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotEqualTo(Integer value) {
            addCriterion("app_usable <>", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThan(Integer value) {
            addCriterion("app_usable >", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_usable >=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThan(Integer value) {
            addCriterion("app_usable <", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableLessThanOrEqualTo(Integer value) {
            addCriterion("app_usable <=", value, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableIn(List<Integer> values) {
            addCriterion("app_usable in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotIn(List<Integer> values) {
            addCriterion("app_usable not in", values, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableBetween(Integer value1, Integer value2) {
            addCriterion("app_usable between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andAppUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("app_usable not between", value1, value2, "appUsable");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIsNull() {
            addCriterion("giveout_num is null");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIsNotNull() {
            addCriterion("giveout_num is not null");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumEqualTo(Integer value) {
            addCriterion("giveout_num =", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotEqualTo(Integer value) {
            addCriterion("giveout_num <>", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumGreaterThan(Integer value) {
            addCriterion("giveout_num >", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveout_num >=", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumLessThan(Integer value) {
            addCriterion("giveout_num <", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumLessThanOrEqualTo(Integer value) {
            addCriterion("giveout_num <=", value, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumIn(List<Integer> values) {
            addCriterion("giveout_num in", values, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotIn(List<Integer> values) {
            addCriterion("giveout_num not in", values, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumBetween(Integer value1, Integer value2) {
            addCriterion("giveout_num between", value1, value2, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andGiveoutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("giveout_num not between", value1, value2, "giveoutNum");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIsNull() {
            addCriterion("have_created is null");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIsNotNull() {
            addCriterion("have_created is not null");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedEqualTo(Integer value) {
            addCriterion("have_created =", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotEqualTo(Integer value) {
            addCriterion("have_created <>", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedGreaterThan(Integer value) {
            addCriterion("have_created >", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_created >=", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedLessThan(Integer value) {
            addCriterion("have_created <", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("have_created <=", value, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedIn(List<Integer> values) {
            addCriterion("have_created in", values, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotIn(List<Integer> values) {
            addCriterion("have_created not in", values, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedBetween(Integer value1, Integer value2) {
            addCriterion("have_created between", value1, value2, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andHaveCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("have_created not between", value1, value2, "haveCreated");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelIsNull() {
            addCriterion("limit_membergradelevel is null");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelIsNotNull() {
            addCriterion("limit_membergradelevel is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelEqualTo(Integer value) {
            addCriterion("limit_membergradelevel =", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelNotEqualTo(Integer value) {
            addCriterion("limit_membergradelevel <>", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelGreaterThan(Integer value) {
            addCriterion("limit_membergradelevel >", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_membergradelevel >=", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelLessThan(Integer value) {
            addCriterion("limit_membergradelevel <", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelLessThanOrEqualTo(Integer value) {
            addCriterion("limit_membergradelevel <=", value, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelIn(List<Integer> values) {
            addCriterion("limit_membergradelevel in", values, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelNotIn(List<Integer> values) {
            addCriterion("limit_membergradelevel not in", values, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelBetween(Integer value1, Integer value2) {
            addCriterion("limit_membergradelevel between", value1, value2, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_membergradelevel not between", value1, value2, "limitMembergradelevel");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameIsNull() {
            addCriterion("limit_membergradename is null");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameIsNotNull() {
            addCriterion("limit_membergradename is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameEqualTo(String value) {
            addCriterion("limit_membergradename =", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameNotEqualTo(String value) {
            addCriterion("limit_membergradename <>", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameGreaterThan(String value) {
            addCriterion("limit_membergradename >", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameGreaterThanOrEqualTo(String value) {
            addCriterion("limit_membergradename >=", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameLessThan(String value) {
            addCriterion("limit_membergradename <", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameLessThanOrEqualTo(String value) {
            addCriterion("limit_membergradename <=", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameLike(String value) {
            addCriterion("limit_membergradename like", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameNotLike(String value) {
            addCriterion("limit_membergradename not like", value, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameIn(List<String> values) {
            addCriterion("limit_membergradename in", values, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameNotIn(List<String> values) {
            addCriterion("limit_membergradename not in", values, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameBetween(String value1, String value2) {
            addCriterion("limit_membergradename between", value1, value2, "limitMembergradename");
            return (Criteria) this;
        }

        public Criteria andLimitMembergradenameNotBetween(String value1, String value2) {
            addCriterion("limit_membergradename not between", value1, value2, "limitMembergradename");
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

        public Criteria andStateAdminIdIsNull() {
            addCriterion("state_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdIsNotNull() {
            addCriterion("state_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdEqualTo(Integer value) {
            addCriterion("state_admin_id =", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdNotEqualTo(Integer value) {
            addCriterion("state_admin_id <>", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdGreaterThan(Integer value) {
            addCriterion("state_admin_id >", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_admin_id >=", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdLessThan(Integer value) {
            addCriterion("state_admin_id <", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("state_admin_id <=", value, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdIn(List<Integer> values) {
            addCriterion("state_admin_id in", values, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdNotIn(List<Integer> values) {
            addCriterion("state_admin_id not in", values, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("state_admin_id between", value1, value2, "stateAdminId");
            return (Criteria) this;
        }

        public Criteria andStateAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("state_admin_id not between", value1, value2, "stateAdminId");
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

        public Criteria andTemplateDescribeIsNull() {
            addCriterion("template_describe is null");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeIsNotNull() {
            addCriterion("template_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeEqualTo(String value) {
            addCriterion("template_describe =", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeNotEqualTo(String value) {
            addCriterion("template_describe <>", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeGreaterThan(String value) {
            addCriterion("template_describe >", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("template_describe >=", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeLessThan(String value) {
            addCriterion("template_describe <", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeLessThanOrEqualTo(String value) {
            addCriterion("template_describe <=", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeLike(String value) {
            addCriterion("template_describe like", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeNotLike(String value) {
            addCriterion("template_describe not like", value, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeIn(List<String> values) {
            addCriterion("template_describe in", values, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeNotIn(List<String> values) {
            addCriterion("template_describe not in", values, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeBetween(String value1, String value2) {
            addCriterion("template_describe between", value1, value2, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplateDescribeNotBetween(String value1, String value2) {
            addCriterion("template_describe not between", value1, value2, "templateDescribe");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIsNull() {
            addCriterion("template_price is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIsNotNull() {
            addCriterion("template_price is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceEqualTo(BigDecimal value) {
            addCriterion("template_price =", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotEqualTo(BigDecimal value) {
            addCriterion("template_price <>", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceGreaterThan(BigDecimal value) {
            addCriterion("template_price >", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("template_price >=", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceLessThan(BigDecimal value) {
            addCriterion("template_price <", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("template_price <=", value, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceIn(List<BigDecimal> values) {
            addCriterion("template_price in", values, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotIn(List<BigDecimal> values) {
            addCriterion("template_price not in", values, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("template_price between", value1, value2, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplatePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("template_price not between", value1, value2, "templatePrice");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeIsNull() {
            addCriterion("template_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeIsNotNull() {
            addCriterion("template_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeEqualTo(Date value) {
            addCriterion("template_start_time =", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeNotEqualTo(Date value) {
            addCriterion("template_start_time <>", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeGreaterThan(Date value) {
            addCriterion("template_start_time >", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("template_start_time >=", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeLessThan(Date value) {
            addCriterion("template_start_time <", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("template_start_time <=", value, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeIn(List<Date> values) {
            addCriterion("template_start_time in", values, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeNotIn(List<Date> values) {
            addCriterion("template_start_time not in", values, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeBetween(Date value1, Date value2) {
            addCriterion("template_start_time between", value1, value2, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("template_start_time not between", value1, value2, "templateStartTime");
            return (Criteria) this;
        }

        public Criteria andTemplateStateIsNull() {
            addCriterion("template_state is null");
            return (Criteria) this;
        }

        public Criteria andTemplateStateIsNotNull() {
            addCriterion("template_state is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateStateEqualTo(Integer value) {
            addCriterion("template_state =", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateNotEqualTo(Integer value) {
            addCriterion("template_state <>", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateGreaterThan(Integer value) {
            addCriterion("template_state >", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_state >=", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateLessThan(Integer value) {
            addCriterion("template_state <", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateLessThanOrEqualTo(Integer value) {
            addCriterion("template_state <=", value, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateIn(List<Integer> values) {
            addCriterion("template_state in", values, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateNotIn(List<Integer> values) {
            addCriterion("template_state not in", values, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateBetween(Integer value1, Integer value2) {
            addCriterion("template_state between", value1, value2, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateStateNotBetween(Integer value1, Integer value2) {
            addCriterion("template_state not between", value1, value2, "templateState");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNull() {
            addCriterion("template_title is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNotNull() {
            addCriterion("template_title is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleEqualTo(String value) {
            addCriterion("template_title =", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotEqualTo(String value) {
            addCriterion("template_title <>", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThan(String value) {
            addCriterion("template_title >", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("template_title >=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThan(String value) {
            addCriterion("template_title <", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThanOrEqualTo(String value) {
            addCriterion("template_title <=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLike(String value) {
            addCriterion("template_title like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotLike(String value) {
            addCriterion("template_title not like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIn(List<String> values) {
            addCriterion("template_title in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotIn(List<String> values) {
            addCriterion("template_title not in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleBetween(String value1, String value2) {
            addCriterion("template_title between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotBetween(String value1, String value2) {
            addCriterion("template_title not between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNull() {
            addCriterion("template_type is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("template_type is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeEqualTo(Integer value) {
            addCriterion("template_type =", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotEqualTo(Integer value) {
            addCriterion("template_type <>", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThan(Integer value) {
            addCriterion("template_type >", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_type >=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThan(Integer value) {
            addCriterion("template_type <", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("template_type <=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIn(List<Integer> values) {
            addCriterion("template_type in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotIn(List<Integer> values) {
            addCriterion("template_type not in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("template_type between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("template_type not between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
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

        public Criteria andUseEndTimeIsNull() {
            addCriterion("use_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNotNull() {
            addCriterion("use_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeEqualTo(Date value) {
            addCriterion("use_end_time =", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotEqualTo(Date value) {
            addCriterion("use_end_time <>", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThan(Date value) {
            addCriterion("use_end_time >", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_end_time >=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThan(Date value) {
            addCriterion("use_end_time <", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("use_end_time <=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIn(List<Date> values) {
            addCriterion("use_end_time in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotIn(List<Date> values) {
            addCriterion("use_end_time not in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeBetween(Date value1, Date value2) {
            addCriterion("use_end_time between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("use_end_time not between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNull() {
            addCriterion("use_start_time is null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNotNull() {
            addCriterion("use_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeEqualTo(Date value) {
            addCriterion("use_start_time =", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotEqualTo(Date value) {
            addCriterion("use_start_time <>", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThan(Date value) {
            addCriterion("use_start_time >", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_start_time >=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThan(Date value) {
            addCriterion("use_start_time <", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("use_start_time <=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIn(List<Date> values) {
            addCriterion("use_start_time in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotIn(List<Date> values) {
            addCriterion("use_start_time not in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeBetween(Date value1, Date value2) {
            addCriterion("use_start_time between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("use_start_time not between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNull() {
            addCriterion("used_num is null");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNotNull() {
            addCriterion("used_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNumEqualTo(Integer value) {
            addCriterion("used_num =", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotEqualTo(Integer value) {
            addCriterion("used_num <>", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThan(Integer value) {
            addCriterion("used_num >", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_num >=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThan(Integer value) {
            addCriterion("used_num <", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThanOrEqualTo(Integer value) {
            addCriterion("used_num <=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumIn(List<Integer> values) {
            addCriterion("used_num in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotIn(List<Integer> values) {
            addCriterion("used_num not in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumBetween(Integer value1, Integer value2) {
            addCriterion("used_num between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("used_num not between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("valid_days is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("valid_days is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(Integer value) {
            addCriterion("valid_days =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(Integer value) {
            addCriterion("valid_days <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(Integer value) {
            addCriterion("valid_days >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_days >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(Integer value) {
            addCriterion("valid_days <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(Integer value) {
            addCriterion("valid_days <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<Integer> values) {
            addCriterion("valid_days in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<Integer> values) {
            addCriterion("valid_days not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(Integer value1, Integer value2) {
            addCriterion("valid_days between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_days not between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendIsNull() {
            addCriterion("voucher_center_recommend is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendIsNotNull() {
            addCriterion("voucher_center_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendEqualTo(Integer value) {
            addCriterion("voucher_center_recommend =", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendNotEqualTo(Integer value) {
            addCriterion("voucher_center_recommend <>", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendGreaterThan(Integer value) {
            addCriterion("voucher_center_recommend >", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_center_recommend >=", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendLessThan(Integer value) {
            addCriterion("voucher_center_recommend <", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_center_recommend <=", value, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendIn(List<Integer> values) {
            addCriterion("voucher_center_recommend in", values, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendNotIn(List<Integer> values) {
            addCriterion("voucher_center_recommend not in", values, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendBetween(Integer value1, Integer value2) {
            addCriterion("voucher_center_recommend between", value1, value2, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andVoucherCenterRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_center_recommend not between", value1, value2, "voucherCenterRecommend");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNull() {
            addCriterion("web_usable is null");
            return (Criteria) this;
        }

        public Criteria andWebUsableIsNotNull() {
            addCriterion("web_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWebUsableEqualTo(Integer value) {
            addCriterion("web_usable =", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotEqualTo(Integer value) {
            addCriterion("web_usable <>", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThan(Integer value) {
            addCriterion("web_usable >", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_usable >=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThan(Integer value) {
            addCriterion("web_usable <", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableLessThanOrEqualTo(Integer value) {
            addCriterion("web_usable <=", value, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableIn(List<Integer> values) {
            addCriterion("web_usable in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotIn(List<Integer> values) {
            addCriterion("web_usable not in", values, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableBetween(Integer value1, Integer value2) {
            addCriterion("web_usable between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWebUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("web_usable not between", value1, value2, "webUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNull() {
            addCriterion("wechat_usable is null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIsNotNull() {
            addCriterion("wechat_usable is not null");
            return (Criteria) this;
        }

        public Criteria andWechatUsableEqualTo(Integer value) {
            addCriterion("wechat_usable =", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotEqualTo(Integer value) {
            addCriterion("wechat_usable <>", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThan(Integer value) {
            addCriterion("wechat_usable >", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable >=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThan(Integer value) {
            addCriterion("wechat_usable <", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_usable <=", value, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableIn(List<Integer> values) {
            addCriterion("wechat_usable in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotIn(List<Integer> values) {
            addCriterion("wechat_usable not in", values, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andWechatUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_usable not between", value1, value2, "wechatUsable");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialIsNull() {
            addCriterion("check_material is null");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialIsNotNull() {
            addCriterion("check_material is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialEqualTo(Integer value) {
            addCriterion("check_material =", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialNotEqualTo(Integer value) {
            addCriterion("check_material <>", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialGreaterThan(Integer value) {
            addCriterion("check_material >", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_material >=", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialLessThan(Integer value) {
            addCriterion("check_material <", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("check_material <=", value, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialIn(List<Integer> values) {
            addCriterion("check_material in", values, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialNotIn(List<Integer> values) {
            addCriterion("check_material not in", values, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialBetween(Integer value1, Integer value2) {
            addCriterion("check_material between", value1, value2, "checkMaterial");
            return (Criteria) this;
        }

        public Criteria andCheckMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("check_material not between", value1, value2, "checkMaterial");
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