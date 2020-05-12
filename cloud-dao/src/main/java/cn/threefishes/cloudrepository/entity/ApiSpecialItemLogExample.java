package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiSpecialItemLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiSpecialItemLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNull() {
            addCriterion("android is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNotNull() {
            addCriterion("android is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidEqualTo(Integer value) {
            addCriterion("android =", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotEqualTo(Integer value) {
            addCriterion("android <>", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThan(Integer value) {
            addCriterion("android >", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("android >=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThan(Integer value) {
            addCriterion("android <", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThanOrEqualTo(Integer value) {
            addCriterion("android <=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidIn(List<Integer> values) {
            addCriterion("android in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotIn(List<Integer> values) {
            addCriterion("android not in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidBetween(Integer value1, Integer value2) {
            addCriterion("android between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotBetween(Integer value1, Integer value2) {
            addCriterion("android not between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andIosIsNull() {
            addCriterion("ios is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("ios is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(Integer value) {
            addCriterion("ios =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(Integer value) {
            addCriterion("ios <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(Integer value) {
            addCriterion("ios >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(Integer value) {
            addCriterion("ios >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(Integer value) {
            addCriterion("ios <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(Integer value) {
            addCriterion("ios <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<Integer> values) {
            addCriterion("ios in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<Integer> values) {
            addCriterion("ios not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(Integer value1, Integer value2) {
            addCriterion("ios between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(Integer value1, Integer value2) {
            addCriterion("ios not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andItemSortIsNull() {
            addCriterion("item_sort is null");
            return (Criteria) this;
        }

        public Criteria andItemSortIsNotNull() {
            addCriterion("item_sort is not null");
            return (Criteria) this;
        }

        public Criteria andItemSortEqualTo(Integer value) {
            addCriterion("item_sort =", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotEqualTo(Integer value) {
            addCriterion("item_sort <>", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortGreaterThan(Integer value) {
            addCriterion("item_sort >", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_sort >=", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortLessThan(Integer value) {
            addCriterion("item_sort <", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortLessThanOrEqualTo(Integer value) {
            addCriterion("item_sort <=", value, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortIn(List<Integer> values) {
            addCriterion("item_sort in", values, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotIn(List<Integer> values) {
            addCriterion("item_sort not in", values, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortBetween(Integer value1, Integer value2) {
            addCriterion("item_sort between", value1, value2, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemSortNotBetween(Integer value1, Integer value2) {
            addCriterion("item_sort not between", value1, value2, "itemSort");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("item_type like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("item_type not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(Integer value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(Integer value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(Integer value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(Integer value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(Integer value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<Integer> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<Integer> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(Integer value1, Integer value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andWapIsNull() {
            addCriterion("wap is null");
            return (Criteria) this;
        }

        public Criteria andWapIsNotNull() {
            addCriterion("wap is not null");
            return (Criteria) this;
        }

        public Criteria andWapEqualTo(Integer value) {
            addCriterion("wap =", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapNotEqualTo(Integer value) {
            addCriterion("wap <>", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapGreaterThan(Integer value) {
            addCriterion("wap >", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapGreaterThanOrEqualTo(Integer value) {
            addCriterion("wap >=", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapLessThan(Integer value) {
            addCriterion("wap <", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapLessThanOrEqualTo(Integer value) {
            addCriterion("wap <=", value, "wap");
            return (Criteria) this;
        }

        public Criteria andWapIn(List<Integer> values) {
            addCriterion("wap in", values, "wap");
            return (Criteria) this;
        }

        public Criteria andWapNotIn(List<Integer> values) {
            addCriterion("wap not in", values, "wap");
            return (Criteria) this;
        }

        public Criteria andWapBetween(Integer value1, Integer value2) {
            addCriterion("wap between", value1, value2, "wap");
            return (Criteria) this;
        }

        public Criteria andWapNotBetween(Integer value1, Integer value2) {
            addCriterion("wap not between", value1, value2, "wap");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(Integer value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(Integer value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(Integer value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(Integer value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(Integer value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<Integer> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<Integer> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(Integer value1, Integer value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleIsNull() {
            addCriterion("right_or_circle is null");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleIsNotNull() {
            addCriterion("right_or_circle is not null");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleEqualTo(Integer value) {
            addCriterion("right_or_circle =", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleNotEqualTo(Integer value) {
            addCriterion("right_or_circle <>", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleGreaterThan(Integer value) {
            addCriterion("right_or_circle >", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_or_circle >=", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleLessThan(Integer value) {
            addCriterion("right_or_circle <", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleLessThanOrEqualTo(Integer value) {
            addCriterion("right_or_circle <=", value, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleIn(List<Integer> values) {
            addCriterion("right_or_circle in", values, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleNotIn(List<Integer> values) {
            addCriterion("right_or_circle not in", values, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleBetween(Integer value1, Integer value2) {
            addCriterion("right_or_circle between", value1, value2, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andRightOrCircleNotBetween(Integer value1, Integer value2) {
            addCriterion("right_or_circle not between", value1, value2, "rightOrCircle");
            return (Criteria) this;
        }

        public Criteria andBgColorIsNull() {
            addCriterion("bg_color is null");
            return (Criteria) this;
        }

        public Criteria andBgColorIsNotNull() {
            addCriterion("bg_color is not null");
            return (Criteria) this;
        }

        public Criteria andBgColorEqualTo(String value) {
            addCriterion("bg_color =", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorNotEqualTo(String value) {
            addCriterion("bg_color <>", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorGreaterThan(String value) {
            addCriterion("bg_color >", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorGreaterThanOrEqualTo(String value) {
            addCriterion("bg_color >=", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorLessThan(String value) {
            addCriterion("bg_color <", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorLessThanOrEqualTo(String value) {
            addCriterion("bg_color <=", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorLike(String value) {
            addCriterion("bg_color like", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorNotLike(String value) {
            addCriterion("bg_color not like", value, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorIn(List<String> values) {
            addCriterion("bg_color in", values, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorNotIn(List<String> values) {
            addCriterion("bg_color not in", values, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorBetween(String value1, String value2) {
            addCriterion("bg_color between", value1, value2, "bgColor");
            return (Criteria) this;
        }

        public Criteria andBgColorNotBetween(String value1, String value2) {
            addCriterion("bg_color not between", value1, value2, "bgColor");
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

        public Criteria andUpdateTypeIsNull() {
            addCriterion("update_type is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNotNull() {
            addCriterion("update_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeEqualTo(Integer value) {
            addCriterion("update_type =", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotEqualTo(Integer value) {
            addCriterion("update_type <>", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThan(Integer value) {
            addCriterion("update_type >", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_type >=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThan(Integer value) {
            addCriterion("update_type <", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("update_type <=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIn(List<Integer> values) {
            addCriterion("update_type in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotIn(List<Integer> values) {
            addCriterion("update_type not in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeBetween(Integer value1, Integer value2) {
            addCriterion("update_type between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_type not between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andBackupTimeIsNull() {
            addCriterion("backup_time is null");
            return (Criteria) this;
        }

        public Criteria andBackupTimeIsNotNull() {
            addCriterion("backup_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackupTimeEqualTo(Date value) {
            addCriterion("backup_time =", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotEqualTo(Date value) {
            addCriterion("backup_time <>", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeGreaterThan(Date value) {
            addCriterion("backup_time >", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("backup_time >=", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeLessThan(Date value) {
            addCriterion("backup_time <", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeLessThanOrEqualTo(Date value) {
            addCriterion("backup_time <=", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeIn(List<Date> values) {
            addCriterion("backup_time in", values, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotIn(List<Date> values) {
            addCriterion("backup_time not in", values, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeBetween(Date value1, Date value2) {
            addCriterion("backup_time between", value1, value2, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotBetween(Date value1, Date value2) {
            addCriterion("backup_time not between", value1, value2, "backupTime");
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