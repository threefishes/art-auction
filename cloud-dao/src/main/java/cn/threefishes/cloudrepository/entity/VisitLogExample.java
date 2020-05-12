package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitLogExample() {
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

        public Criteria andCommonIdIsNull() {
            addCriterion("common_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonIdIsNotNull() {
            addCriterion("common_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonIdEqualTo(Integer value) {
            addCriterion("common_id =", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotEqualTo(Integer value) {
            addCriterion("common_id <>", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThan(Integer value) {
            addCriterion("common_id >", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_id >=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThan(Integer value) {
            addCriterion("common_id <", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_id <=", value, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdIn(List<Integer> values) {
            addCriterion("common_id in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotIn(List<Integer> values) {
            addCriterion("common_id not in", values, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("common_id between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_id not between", value1, value2, "commonId");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNull() {
            addCriterion("visit_type is null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNotNull() {
            addCriterion("visit_type is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeEqualTo(String value) {
            addCriterion("visit_type =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(String value) {
            addCriterion("visit_type <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(String value) {
            addCriterion("visit_type >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_type >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(String value) {
            addCriterion("visit_type <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(String value) {
            addCriterion("visit_type <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLike(String value) {
            addCriterion("visit_type like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotLike(String value) {
            addCriterion("visit_type not like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<String> values) {
            addCriterion("visit_type in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<String> values) {
            addCriterion("visit_type not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(String value1, String value2) {
            addCriterion("visit_type between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(String value1, String value2) {
            addCriterion("visit_type not between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitModuleIsNull() {
            addCriterion("visit_module is null");
            return (Criteria) this;
        }

        public Criteria andVisitModuleIsNotNull() {
            addCriterion("visit_module is not null");
            return (Criteria) this;
        }

        public Criteria andVisitModuleEqualTo(String value) {
            addCriterion("visit_module =", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNotEqualTo(String value) {
            addCriterion("visit_module <>", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleGreaterThan(String value) {
            addCriterion("visit_module >", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleGreaterThanOrEqualTo(String value) {
            addCriterion("visit_module >=", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleLessThan(String value) {
            addCriterion("visit_module <", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleLessThanOrEqualTo(String value) {
            addCriterion("visit_module <=", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleLike(String value) {
            addCriterion("visit_module like", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNotLike(String value) {
            addCriterion("visit_module not like", value, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleIn(List<String> values) {
            addCriterion("visit_module in", values, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNotIn(List<String> values) {
            addCriterion("visit_module not in", values, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleBetween(String value1, String value2) {
            addCriterion("visit_module between", value1, value2, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNotBetween(String value1, String value2) {
            addCriterion("visit_module not between", value1, value2, "visitModule");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameIsNull() {
            addCriterion("visit_module_name is null");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameIsNotNull() {
            addCriterion("visit_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameEqualTo(String value) {
            addCriterion("visit_module_name =", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameNotEqualTo(String value) {
            addCriterion("visit_module_name <>", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameGreaterThan(String value) {
            addCriterion("visit_module_name >", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("visit_module_name >=", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameLessThan(String value) {
            addCriterion("visit_module_name <", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameLessThanOrEqualTo(String value) {
            addCriterion("visit_module_name <=", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameLike(String value) {
            addCriterion("visit_module_name like", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameNotLike(String value) {
            addCriterion("visit_module_name not like", value, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameIn(List<String> values) {
            addCriterion("visit_module_name in", values, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameNotIn(List<String> values) {
            addCriterion("visit_module_name not in", values, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameBetween(String value1, String value2) {
            addCriterion("visit_module_name between", value1, value2, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitModuleNameNotBetween(String value1, String value2) {
            addCriterion("visit_module_name not between", value1, value2, "visitModuleName");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNull() {
            addCriterion("visit_url is null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNotNull() {
            addCriterion("visit_url is not null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlEqualTo(String value) {
            addCriterion("visit_url =", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotEqualTo(String value) {
            addCriterion("visit_url <>", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThan(String value) {
            addCriterion("visit_url >", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("visit_url >=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThan(String value) {
            addCriterion("visit_url <", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("visit_url <=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLike(String value) {
            addCriterion("visit_url like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotLike(String value) {
            addCriterion("visit_url not like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIn(List<String> values) {
            addCriterion("visit_url in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotIn(List<String> values) {
            addCriterion("visit_url not in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlBetween(String value1, String value2) {
            addCriterion("visit_url between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotBetween(String value1, String value2) {
            addCriterion("visit_url not between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitPageIsNull() {
            addCriterion("visit_page is null");
            return (Criteria) this;
        }

        public Criteria andVisitPageIsNotNull() {
            addCriterion("visit_page is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPageEqualTo(String value) {
            addCriterion("visit_page =", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotEqualTo(String value) {
            addCriterion("visit_page <>", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageGreaterThan(String value) {
            addCriterion("visit_page >", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageGreaterThanOrEqualTo(String value) {
            addCriterion("visit_page >=", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLessThan(String value) {
            addCriterion("visit_page <", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLessThanOrEqualTo(String value) {
            addCriterion("visit_page <=", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLike(String value) {
            addCriterion("visit_page like", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotLike(String value) {
            addCriterion("visit_page not like", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageIn(List<String> values) {
            addCriterion("visit_page in", values, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotIn(List<String> values) {
            addCriterion("visit_page not in", values, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageBetween(String value1, String value2) {
            addCriterion("visit_page between", value1, value2, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotBetween(String value1, String value2) {
            addCriterion("visit_page not between", value1, value2, "visitPage");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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