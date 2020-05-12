package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class WechatQrcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatQrcardExample() {
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

        public Criteria andQrcardImgIsNull() {
            addCriterion("qrcard_img is null");
            return (Criteria) this;
        }

        public Criteria andQrcardImgIsNotNull() {
            addCriterion("qrcard_img is not null");
            return (Criteria) this;
        }

        public Criteria andQrcardImgEqualTo(String value) {
            addCriterion("qrcard_img =", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgNotEqualTo(String value) {
            addCriterion("qrcard_img <>", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgGreaterThan(String value) {
            addCriterion("qrcard_img >", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgGreaterThanOrEqualTo(String value) {
            addCriterion("qrcard_img >=", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgLessThan(String value) {
            addCriterion("qrcard_img <", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgLessThanOrEqualTo(String value) {
            addCriterion("qrcard_img <=", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgLike(String value) {
            addCriterion("qrcard_img like", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgNotLike(String value) {
            addCriterion("qrcard_img not like", value, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgIn(List<String> values) {
            addCriterion("qrcard_img in", values, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgNotIn(List<String> values) {
            addCriterion("qrcard_img not in", values, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgBetween(String value1, String value2) {
            addCriterion("qrcard_img between", value1, value2, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andQrcardImgNotBetween(String value1, String value2) {
            addCriterion("qrcard_img not between", value1, value2, "qrcardImg");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNull() {
            addCriterion("img_width is null");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNotNull() {
            addCriterion("img_width is not null");
            return (Criteria) this;
        }

        public Criteria andImgWidthEqualTo(Integer value) {
            addCriterion("img_width =", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotEqualTo(Integer value) {
            addCriterion("img_width <>", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThan(Integer value) {
            addCriterion("img_width >", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_width >=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThan(Integer value) {
            addCriterion("img_width <", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThanOrEqualTo(Integer value) {
            addCriterion("img_width <=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthIn(List<Integer> values) {
            addCriterion("img_width in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotIn(List<Integer> values) {
            addCriterion("img_width not in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthBetween(Integer value1, Integer value2) {
            addCriterion("img_width between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("img_width not between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNull() {
            addCriterion("img_height is null");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNotNull() {
            addCriterion("img_height is not null");
            return (Criteria) this;
        }

        public Criteria andImgHeightEqualTo(Integer value) {
            addCriterion("img_height =", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotEqualTo(Integer value) {
            addCriterion("img_height <>", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThan(Integer value) {
            addCriterion("img_height >", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_height >=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThan(Integer value) {
            addCriterion("img_height <", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThanOrEqualTo(Integer value) {
            addCriterion("img_height <=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightIn(List<Integer> values) {
            addCriterion("img_height in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotIn(List<Integer> values) {
            addCriterion("img_height not in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightBetween(Integer value1, Integer value2) {
            addCriterion("img_height between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("img_height not between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowIsNull() {
            addCriterion("super_is_show is null");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowIsNotNull() {
            addCriterion("super_is_show is not null");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowEqualTo(Integer value) {
            addCriterion("super_is_show =", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowNotEqualTo(Integer value) {
            addCriterion("super_is_show <>", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowGreaterThan(Integer value) {
            addCriterion("super_is_show >", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_is_show >=", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowLessThan(Integer value) {
            addCriterion("super_is_show <", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("super_is_show <=", value, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowIn(List<Integer> values) {
            addCriterion("super_is_show in", values, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowNotIn(List<Integer> values) {
            addCriterion("super_is_show not in", values, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowBetween(Integer value1, Integer value2) {
            addCriterion("super_is_show between", value1, value2, "superIsShow");
            return (Criteria) this;
        }

        public Criteria andSuperIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("super_is_show not between", value1, value2, "superIsShow");
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