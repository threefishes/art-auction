package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponGiftsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponGiftsExample() {
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

        public Criteria andGiftsIdIsNull() {
            addCriterion("gifts_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIsNotNull() {
            addCriterion("gifts_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdEqualTo(Integer value) {
            addCriterion("gifts_id =", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotEqualTo(Integer value) {
            addCriterion("gifts_id <>", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThan(Integer value) {
            addCriterion("gifts_id >", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_id >=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThan(Integer value) {
            addCriterion("gifts_id <", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_id <=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIn(List<Integer> values) {
            addCriterion("gifts_id in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotIn(List<Integer> values) {
            addCriterion("gifts_id not in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdBetween(Integer value1, Integer value2) {
            addCriterion("gifts_id between", value1, value2, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_id not between", value1, value2, "giftsId");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonIsNull() {
            addCriterion("activity_id_json is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonIsNotNull() {
            addCriterion("activity_id_json is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonEqualTo(String value) {
            addCriterion("activity_id_json =", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonNotEqualTo(String value) {
            addCriterion("activity_id_json <>", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonGreaterThan(String value) {
            addCriterion("activity_id_json >", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id_json >=", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonLessThan(String value) {
            addCriterion("activity_id_json <", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonLessThanOrEqualTo(String value) {
            addCriterion("activity_id_json <=", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonLike(String value) {
            addCriterion("activity_id_json like", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonNotLike(String value) {
            addCriterion("activity_id_json not like", value, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonIn(List<String> values) {
            addCriterion("activity_id_json in", values, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonNotIn(List<String> values) {
            addCriterion("activity_id_json not in", values, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonBetween(String value1, String value2) {
            addCriterion("activity_id_json between", value1, value2, "activityIdJson");
            return (Criteria) this;
        }

        public Criteria andActivityIdJsonNotBetween(String value1, String value2) {
            addCriterion("activity_id_json not between", value1, value2, "activityIdJson");
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppIsNull() {
            addCriterion("banner_img_app is null");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppIsNotNull() {
            addCriterion("banner_img_app is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppEqualTo(String value) {
            addCriterion("banner_img_app =", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppNotEqualTo(String value) {
            addCriterion("banner_img_app <>", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppGreaterThan(String value) {
            addCriterion("banner_img_app >", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppGreaterThanOrEqualTo(String value) {
            addCriterion("banner_img_app >=", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppLessThan(String value) {
            addCriterion("banner_img_app <", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppLessThanOrEqualTo(String value) {
            addCriterion("banner_img_app <=", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppLike(String value) {
            addCriterion("banner_img_app like", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppNotLike(String value) {
            addCriterion("banner_img_app not like", value, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppIn(List<String> values) {
            addCriterion("banner_img_app in", values, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppNotIn(List<String> values) {
            addCriterion("banner_img_app not in", values, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppBetween(String value1, String value2) {
            addCriterion("banner_img_app between", value1, value2, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgAppNotBetween(String value1, String value2) {
            addCriterion("banner_img_app not between", value1, value2, "bannerImgApp");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcIsNull() {
            addCriterion("banner_img_pc is null");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcIsNotNull() {
            addCriterion("banner_img_pc is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcEqualTo(String value) {
            addCriterion("banner_img_pc =", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcNotEqualTo(String value) {
            addCriterion("banner_img_pc <>", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcGreaterThan(String value) {
            addCriterion("banner_img_pc >", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcGreaterThanOrEqualTo(String value) {
            addCriterion("banner_img_pc >=", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcLessThan(String value) {
            addCriterion("banner_img_pc <", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcLessThanOrEqualTo(String value) {
            addCriterion("banner_img_pc <=", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcLike(String value) {
            addCriterion("banner_img_pc like", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcNotLike(String value) {
            addCriterion("banner_img_pc not like", value, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcIn(List<String> values) {
            addCriterion("banner_img_pc in", values, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcNotIn(List<String> values) {
            addCriterion("banner_img_pc not in", values, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcBetween(String value1, String value2) {
            addCriterion("banner_img_pc between", value1, value2, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andBannerImgPcNotBetween(String value1, String value2) {
            addCriterion("banner_img_pc not between", value1, value2, "bannerImgPc");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeIsNull() {
            addCriterion("gifts_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeIsNotNull() {
            addCriterion("gifts_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeEqualTo(Date value) {
            addCriterion("gifts_end_time =", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeNotEqualTo(Date value) {
            addCriterion("gifts_end_time <>", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeGreaterThan(Date value) {
            addCriterion("gifts_end_time >", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gifts_end_time >=", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeLessThan(Date value) {
            addCriterion("gifts_end_time <", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("gifts_end_time <=", value, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeIn(List<Date> values) {
            addCriterion("gifts_end_time in", values, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeNotIn(List<Date> values) {
            addCriterion("gifts_end_time not in", values, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeBetween(Date value1, Date value2) {
            addCriterion("gifts_end_time between", value1, value2, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("gifts_end_time not between", value1, value2, "giftsEndTime");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainIsNull() {
            addCriterion("gifts_explain is null");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainIsNotNull() {
            addCriterion("gifts_explain is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainEqualTo(String value) {
            addCriterion("gifts_explain =", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainNotEqualTo(String value) {
            addCriterion("gifts_explain <>", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainGreaterThan(String value) {
            addCriterion("gifts_explain >", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_explain >=", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainLessThan(String value) {
            addCriterion("gifts_explain <", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainLessThanOrEqualTo(String value) {
            addCriterion("gifts_explain <=", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainLike(String value) {
            addCriterion("gifts_explain like", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainNotLike(String value) {
            addCriterion("gifts_explain not like", value, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainIn(List<String> values) {
            addCriterion("gifts_explain in", values, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainNotIn(List<String> values) {
            addCriterion("gifts_explain not in", values, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainBetween(String value1, String value2) {
            addCriterion("gifts_explain between", value1, value2, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsExplainNotBetween(String value1, String value2) {
            addCriterion("gifts_explain not between", value1, value2, "giftsExplain");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIsNull() {
            addCriterion("gifts_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIsNotNull() {
            addCriterion("gifts_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameEqualTo(String value) {
            addCriterion("gifts_name =", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotEqualTo(String value) {
            addCriterion("gifts_name <>", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThan(String value) {
            addCriterion("gifts_name >", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_name >=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThan(String value) {
            addCriterion("gifts_name <", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThanOrEqualTo(String value) {
            addCriterion("gifts_name <=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLike(String value) {
            addCriterion("gifts_name like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotLike(String value) {
            addCriterion("gifts_name not like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIn(List<String> values) {
            addCriterion("gifts_name in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotIn(List<String> values) {
            addCriterion("gifts_name not in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameBetween(String value1, String value2) {
            addCriterion("gifts_name between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotBetween(String value1, String value2) {
            addCriterion("gifts_name not between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIsNull() {
            addCriterion("gifts_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIsNotNull() {
            addCriterion("gifts_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceEqualTo(BigDecimal value) {
            addCriterion("gifts_price =", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotEqualTo(BigDecimal value) {
            addCriterion("gifts_price <>", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceGreaterThan(BigDecimal value) {
            addCriterion("gifts_price >", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts_price >=", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceLessThan(BigDecimal value) {
            addCriterion("gifts_price <", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts_price <=", value, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceIn(List<BigDecimal> values) {
            addCriterion("gifts_price in", values, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotIn(List<BigDecimal> values) {
            addCriterion("gifts_price not in", values, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts_price between", value1, value2, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts_price not between", value1, value2, "giftsPrice");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeIsNull() {
            addCriterion("gifts_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeIsNotNull() {
            addCriterion("gifts_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeEqualTo(Date value) {
            addCriterion("gifts_start_time =", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeNotEqualTo(Date value) {
            addCriterion("gifts_start_time <>", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeGreaterThan(Date value) {
            addCriterion("gifts_start_time >", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gifts_start_time >=", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeLessThan(Date value) {
            addCriterion("gifts_start_time <", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("gifts_start_time <=", value, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeIn(List<Date> values) {
            addCriterion("gifts_start_time in", values, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeNotIn(List<Date> values) {
            addCriterion("gifts_start_time not in", values, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeBetween(Date value1, Date value2) {
            addCriterion("gifts_start_time between", value1, value2, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("gifts_start_time not between", value1, value2, "giftsStartTime");
            return (Criteria) this;
        }

        public Criteria andGiftsStateIsNull() {
            addCriterion("gifts_state is null");
            return (Criteria) this;
        }

        public Criteria andGiftsStateIsNotNull() {
            addCriterion("gifts_state is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsStateEqualTo(Integer value) {
            addCriterion("gifts_state =", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateNotEqualTo(Integer value) {
            addCriterion("gifts_state <>", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateGreaterThan(Integer value) {
            addCriterion("gifts_state >", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_state >=", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateLessThan(Integer value) {
            addCriterion("gifts_state <", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_state <=", value, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateIn(List<Integer> values) {
            addCriterion("gifts_state in", values, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateNotIn(List<Integer> values) {
            addCriterion("gifts_state not in", values, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateBetween(Integer value1, Integer value2) {
            addCriterion("gifts_state between", value1, value2, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_state not between", value1, value2, "giftsState");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeIsNull() {
            addCriterion("gifts_type is null");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeIsNotNull() {
            addCriterion("gifts_type is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeEqualTo(Integer value) {
            addCriterion("gifts_type =", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeNotEqualTo(Integer value) {
            addCriterion("gifts_type <>", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeGreaterThan(Integer value) {
            addCriterion("gifts_type >", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_type >=", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeLessThan(Integer value) {
            addCriterion("gifts_type <", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_type <=", value, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeIn(List<Integer> values) {
            addCriterion("gifts_type in", values, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeNotIn(List<Integer> values) {
            addCriterion("gifts_type not in", values, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeBetween(Integer value1, Integer value2) {
            addCriterion("gifts_type between", value1, value2, "giftsType");
            return (Criteria) this;
        }

        public Criteria andGiftsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_type not between", value1, value2, "giftsType");
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

        public Criteria andThemeColorIsNull() {
            addCriterion("theme_color is null");
            return (Criteria) this;
        }

        public Criteria andThemeColorIsNotNull() {
            addCriterion("theme_color is not null");
            return (Criteria) this;
        }

        public Criteria andThemeColorEqualTo(String value) {
            addCriterion("theme_color =", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorNotEqualTo(String value) {
            addCriterion("theme_color <>", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorGreaterThan(String value) {
            addCriterion("theme_color >", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorGreaterThanOrEqualTo(String value) {
            addCriterion("theme_color >=", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorLessThan(String value) {
            addCriterion("theme_color <", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorLessThanOrEqualTo(String value) {
            addCriterion("theme_color <=", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorLike(String value) {
            addCriterion("theme_color like", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorNotLike(String value) {
            addCriterion("theme_color not like", value, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorIn(List<String> values) {
            addCriterion("theme_color in", values, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorNotIn(List<String> values) {
            addCriterion("theme_color not in", values, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorBetween(String value1, String value2) {
            addCriterion("theme_color between", value1, value2, "themeColor");
            return (Criteria) this;
        }

        public Criteria andThemeColorNotBetween(String value1, String value2) {
            addCriterion("theme_color not between", value1, value2, "themeColor");
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

        public Criteria andVoucherTemplateIdJsonIsNull() {
            addCriterion("voucher_template_id_json is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonIsNotNull() {
            addCriterion("voucher_template_id_json is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonEqualTo(String value) {
            addCriterion("voucher_template_id_json =", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonNotEqualTo(String value) {
            addCriterion("voucher_template_id_json <>", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonGreaterThan(String value) {
            addCriterion("voucher_template_id_json >", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_template_id_json >=", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonLessThan(String value) {
            addCriterion("voucher_template_id_json <", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonLessThanOrEqualTo(String value) {
            addCriterion("voucher_template_id_json <=", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonLike(String value) {
            addCriterion("voucher_template_id_json like", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonNotLike(String value) {
            addCriterion("voucher_template_id_json not like", value, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonIn(List<String> values) {
            addCriterion("voucher_template_id_json in", values, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonNotIn(List<String> values) {
            addCriterion("voucher_template_id_json not in", values, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonBetween(String value1, String value2) {
            addCriterion("voucher_template_id_json between", value1, value2, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andVoucherTemplateIdJsonNotBetween(String value1, String value2) {
            addCriterion("voucher_template_id_json not between", value1, value2, "voucherTemplateIdJson");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Integer value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Integer value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Integer value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Integer value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Integer> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Integer> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Integer value1, Integer value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
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