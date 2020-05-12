package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfWeixinParamQrcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfWeixinParamQrcodeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeParamIsNull() {
            addCriterion("code_param is null");
            return (Criteria) this;
        }

        public Criteria andCodeParamIsNotNull() {
            addCriterion("code_param is not null");
            return (Criteria) this;
        }

        public Criteria andCodeParamEqualTo(Integer value) {
            addCriterion("code_param =", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamNotEqualTo(Integer value) {
            addCriterion("code_param <>", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamGreaterThan(Integer value) {
            addCriterion("code_param >", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_param >=", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamLessThan(Integer value) {
            addCriterion("code_param <", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamLessThanOrEqualTo(Integer value) {
            addCriterion("code_param <=", value, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamIn(List<Integer> values) {
            addCriterion("code_param in", values, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamNotIn(List<Integer> values) {
            addCriterion("code_param not in", values, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamBetween(Integer value1, Integer value2) {
            addCriterion("code_param between", value1, value2, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeParamNotBetween(Integer value1, Integer value2) {
            addCriterion("code_param not between", value1, value2, "codeParam");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIsNull() {
            addCriterion("code_title is null");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIsNotNull() {
            addCriterion("code_title is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTitleEqualTo(String value) {
            addCriterion("code_title =", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotEqualTo(String value) {
            addCriterion("code_title <>", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleGreaterThan(String value) {
            addCriterion("code_title >", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("code_title >=", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLessThan(String value) {
            addCriterion("code_title <", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLessThanOrEqualTo(String value) {
            addCriterion("code_title <=", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLike(String value) {
            addCriterion("code_title like", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotLike(String value) {
            addCriterion("code_title not like", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIn(List<String> values) {
            addCriterion("code_title in", values, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotIn(List<String> values) {
            addCriterion("code_title not in", values, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleBetween(String value1, String value2) {
            addCriterion("code_title between", value1, value2, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotBetween(String value1, String value2) {
            addCriterion("code_title not between", value1, value2, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeExplainIsNull() {
            addCriterion("code_explain is null");
            return (Criteria) this;
        }

        public Criteria andCodeExplainIsNotNull() {
            addCriterion("code_explain is not null");
            return (Criteria) this;
        }

        public Criteria andCodeExplainEqualTo(String value) {
            addCriterion("code_explain =", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainNotEqualTo(String value) {
            addCriterion("code_explain <>", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainGreaterThan(String value) {
            addCriterion("code_explain >", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainGreaterThanOrEqualTo(String value) {
            addCriterion("code_explain >=", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainLessThan(String value) {
            addCriterion("code_explain <", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainLessThanOrEqualTo(String value) {
            addCriterion("code_explain <=", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainLike(String value) {
            addCriterion("code_explain like", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainNotLike(String value) {
            addCriterion("code_explain not like", value, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainIn(List<String> values) {
            addCriterion("code_explain in", values, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainNotIn(List<String> values) {
            addCriterion("code_explain not in", values, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainBetween(String value1, String value2) {
            addCriterion("code_explain between", value1, value2, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andCodeExplainNotBetween(String value1, String value2) {
            addCriterion("code_explain not between", value1, value2, "codeExplain");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketIsNull() {
            addCriterion("qrcode_ticket is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketIsNotNull() {
            addCriterion("qrcode_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketEqualTo(String value) {
            addCriterion("qrcode_ticket =", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketNotEqualTo(String value) {
            addCriterion("qrcode_ticket <>", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketGreaterThan(String value) {
            addCriterion("qrcode_ticket >", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_ticket >=", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketLessThan(String value) {
            addCriterion("qrcode_ticket <", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketLessThanOrEqualTo(String value) {
            addCriterion("qrcode_ticket <=", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketLike(String value) {
            addCriterion("qrcode_ticket like", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketNotLike(String value) {
            addCriterion("qrcode_ticket not like", value, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketIn(List<String> values) {
            addCriterion("qrcode_ticket in", values, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketNotIn(List<String> values) {
            addCriterion("qrcode_ticket not in", values, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketBetween(String value1, String value2) {
            addCriterion("qrcode_ticket between", value1, value2, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeTicketNotBetween(String value1, String value2) {
            addCriterion("qrcode_ticket not between", value1, value2, "qrcodeTicket");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("qrcode_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("qrcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("qrcode_url =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("qrcode_url <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("qrcode_url >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_url >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("qrcode_url <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_url <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("qrcode_url like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("qrcode_url not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("qrcode_url in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("qrcode_url not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
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