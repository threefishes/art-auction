package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class MessageTemplateCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageTemplateCommonExample() {
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

        public Criteria andTemplateCommonIdIsNull() {
            addCriterion("template_common_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdIsNotNull() {
            addCriterion("template_common_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdEqualTo(Integer value) {
            addCriterion("template_common_id =", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdNotEqualTo(Integer value) {
            addCriterion("template_common_id <>", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdGreaterThan(Integer value) {
            addCriterion("template_common_id >", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_common_id >=", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdLessThan(Integer value) {
            addCriterion("template_common_id <", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_common_id <=", value, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdIn(List<Integer> values) {
            addCriterion("template_common_id in", values, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdNotIn(List<Integer> values) {
            addCriterion("template_common_id not in", values, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdBetween(Integer value1, Integer value2) {
            addCriterion("template_common_id between", value1, value2, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTemplateCommonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_common_id not between", value1, value2, "templateCommonId");
            return (Criteria) this;
        }

        public Criteria andTplCodeIsNull() {
            addCriterion("tpl_code is null");
            return (Criteria) this;
        }

        public Criteria andTplCodeIsNotNull() {
            addCriterion("tpl_code is not null");
            return (Criteria) this;
        }

        public Criteria andTplCodeEqualTo(String value) {
            addCriterion("tpl_code =", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotEqualTo(String value) {
            addCriterion("tpl_code <>", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeGreaterThan(String value) {
            addCriterion("tpl_code >", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_code >=", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLessThan(String value) {
            addCriterion("tpl_code <", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLessThanOrEqualTo(String value) {
            addCriterion("tpl_code <=", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeLike(String value) {
            addCriterion("tpl_code like", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotLike(String value) {
            addCriterion("tpl_code not like", value, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeIn(List<String> values) {
            addCriterion("tpl_code in", values, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotIn(List<String> values) {
            addCriterion("tpl_code not in", values, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeBetween(String value1, String value2) {
            addCriterion("tpl_code between", value1, value2, "tplCode");
            return (Criteria) this;
        }

        public Criteria andTplCodeNotBetween(String value1, String value2) {
            addCriterion("tpl_code not between", value1, value2, "tplCode");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNull() {
            addCriterion("email_state is null");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNotNull() {
            addCriterion("email_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStateEqualTo(Integer value) {
            addCriterion("email_state =", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotEqualTo(Integer value) {
            addCriterion("email_state <>", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThan(Integer value) {
            addCriterion("email_state >", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_state >=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThan(Integer value) {
            addCriterion("email_state <", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThanOrEqualTo(Integer value) {
            addCriterion("email_state <=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateIn(List<Integer> values) {
            addCriterion("email_state in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotIn(List<Integer> values) {
            addCriterion("email_state not in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateBetween(Integer value1, Integer value2) {
            addCriterion("email_state between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotBetween(Integer value1, Integer value2) {
            addCriterion("email_state not between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNull() {
            addCriterion("email_title is null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNotNull() {
            addCriterion("email_title is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleEqualTo(String value) {
            addCriterion("email_title =", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotEqualTo(String value) {
            addCriterion("email_title <>", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThan(String value) {
            addCriterion("email_title >", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("email_title >=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThan(String value) {
            addCriterion("email_title <", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("email_title <=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLike(String value) {
            addCriterion("email_title like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotLike(String value) {
            addCriterion("email_title not like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIn(List<String> values) {
            addCriterion("email_title in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotIn(List<String> values) {
            addCriterion("email_title not in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleBetween(String value1, String value2) {
            addCriterion("email_title between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotBetween(String value1, String value2) {
            addCriterion("email_title not between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNull() {
            addCriterion("sms_content is null");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNotNull() {
            addCriterion("sms_content is not null");
            return (Criteria) this;
        }

        public Criteria andSmsContentEqualTo(String value) {
            addCriterion("sms_content =", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotEqualTo(String value) {
            addCriterion("sms_content <>", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThan(String value) {
            addCriterion("sms_content >", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
            addCriterion("sms_content >=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThan(String value) {
            addCriterion("sms_content <", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThanOrEqualTo(String value) {
            addCriterion("sms_content <=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLike(String value) {
            addCriterion("sms_content like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotLike(String value) {
            addCriterion("sms_content not like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentIn(List<String> values) {
            addCriterion("sms_content in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotIn(List<String> values) {
            addCriterion("sms_content not in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentBetween(String value1, String value2) {
            addCriterion("sms_content between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotBetween(String value1, String value2) {
            addCriterion("sms_content not between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsStateIsNull() {
            addCriterion("sms_state is null");
            return (Criteria) this;
        }

        public Criteria andSmsStateIsNotNull() {
            addCriterion("sms_state is not null");
            return (Criteria) this;
        }

        public Criteria andSmsStateEqualTo(Integer value) {
            addCriterion("sms_state =", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotEqualTo(Integer value) {
            addCriterion("sms_state <>", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateGreaterThan(Integer value) {
            addCriterion("sms_state >", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sms_state >=", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateLessThan(Integer value) {
            addCriterion("sms_state <", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateLessThanOrEqualTo(Integer value) {
            addCriterion("sms_state <=", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateIn(List<Integer> values) {
            addCriterion("sms_state in", values, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotIn(List<Integer> values) {
            addCriterion("sms_state not in", values, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateBetween(Integer value1, Integer value2) {
            addCriterion("sms_state between", value1, value2, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sms_state not between", value1, value2, "smsState");
            return (Criteria) this;
        }

        public Criteria andTplClassIsNull() {
            addCriterion("tpl_class is null");
            return (Criteria) this;
        }

        public Criteria andTplClassIsNotNull() {
            addCriterion("tpl_class is not null");
            return (Criteria) this;
        }

        public Criteria andTplClassEqualTo(Integer value) {
            addCriterion("tpl_class =", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassNotEqualTo(Integer value) {
            addCriterion("tpl_class <>", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassGreaterThan(Integer value) {
            addCriterion("tpl_class >", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpl_class >=", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassLessThan(Integer value) {
            addCriterion("tpl_class <", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassLessThanOrEqualTo(Integer value) {
            addCriterion("tpl_class <=", value, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassIn(List<Integer> values) {
            addCriterion("tpl_class in", values, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassNotIn(List<Integer> values) {
            addCriterion("tpl_class not in", values, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassBetween(Integer value1, Integer value2) {
            addCriterion("tpl_class between", value1, value2, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplClassNotBetween(Integer value1, Integer value2) {
            addCriterion("tpl_class not between", value1, value2, "tplClass");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNull() {
            addCriterion("tpl_name is null");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNotNull() {
            addCriterion("tpl_name is not null");
            return (Criteria) this;
        }

        public Criteria andTplNameEqualTo(String value) {
            addCriterion("tpl_name =", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotEqualTo(String value) {
            addCriterion("tpl_name <>", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThan(String value) {
            addCriterion("tpl_name >", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_name >=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThan(String value) {
            addCriterion("tpl_name <", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThanOrEqualTo(String value) {
            addCriterion("tpl_name <=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLike(String value) {
            addCriterion("tpl_name like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotLike(String value) {
            addCriterion("tpl_name not like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameIn(List<String> values) {
            addCriterion("tpl_name in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotIn(List<String> values) {
            addCriterion("tpl_name not in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameBetween(String value1, String value2) {
            addCriterion("tpl_name between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotBetween(String value1, String value2) {
            addCriterion("tpl_name not between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplTypeIsNull() {
            addCriterion("tpl_type is null");
            return (Criteria) this;
        }

        public Criteria andTplTypeIsNotNull() {
            addCriterion("tpl_type is not null");
            return (Criteria) this;
        }

        public Criteria andTplTypeEqualTo(Integer value) {
            addCriterion("tpl_type =", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeNotEqualTo(Integer value) {
            addCriterion("tpl_type <>", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeGreaterThan(Integer value) {
            addCriterion("tpl_type >", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpl_type >=", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeLessThan(Integer value) {
            addCriterion("tpl_type <", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tpl_type <=", value, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeIn(List<Integer> values) {
            addCriterion("tpl_type in", values, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeNotIn(List<Integer> values) {
            addCriterion("tpl_type not in", values, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeBetween(Integer value1, Integer value2) {
            addCriterion("tpl_type between", value1, value2, "tplType");
            return (Criteria) this;
        }

        public Criteria andTplTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tpl_type not between", value1, value2, "tplType");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdIsNull() {
            addCriterion("weixin_mp_template_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdIsNotNull() {
            addCriterion("weixin_mp_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdEqualTo(String value) {
            addCriterion("weixin_mp_template_id =", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdNotEqualTo(String value) {
            addCriterion("weixin_mp_template_id <>", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdGreaterThan(String value) {
            addCriterion("weixin_mp_template_id >", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_id >=", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdLessThan(String value) {
            addCriterion("weixin_mp_template_id <", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_id <=", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdLike(String value) {
            addCriterion("weixin_mp_template_id like", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdNotLike(String value) {
            addCriterion("weixin_mp_template_id not like", value, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdIn(List<String> values) {
            addCriterion("weixin_mp_template_id in", values, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdNotIn(List<String> values) {
            addCriterion("weixin_mp_template_id not in", values, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_id between", value1, value2, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateIdNotBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_id not between", value1, value2, "weixinMpTemplateId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdIsNull() {
            addCriterion("weixin_mp_template_store_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdIsNotNull() {
            addCriterion("weixin_mp_template_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdEqualTo(String value) {
            addCriterion("weixin_mp_template_store_id =", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdNotEqualTo(String value) {
            addCriterion("weixin_mp_template_store_id <>", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdGreaterThan(String value) {
            addCriterion("weixin_mp_template_store_id >", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_store_id >=", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdLessThan(String value) {
            addCriterion("weixin_mp_template_store_id <", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_store_id <=", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdLike(String value) {
            addCriterion("weixin_mp_template_store_id like", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdNotLike(String value) {
            addCriterion("weixin_mp_template_store_id not like", value, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdIn(List<String> values) {
            addCriterion("weixin_mp_template_store_id in", values, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdNotIn(List<String> values) {
            addCriterion("weixin_mp_template_store_id not in", values, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_store_id between", value1, value2, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreIdNotBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_store_id not between", value1, value2, "weixinMpTemplateStoreId");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleIsNull() {
            addCriterion("weixin_mp_template_store_title is null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleIsNotNull() {
            addCriterion("weixin_mp_template_store_title is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleEqualTo(String value) {
            addCriterion("weixin_mp_template_store_title =", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleNotEqualTo(String value) {
            addCriterion("weixin_mp_template_store_title <>", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleGreaterThan(String value) {
            addCriterion("weixin_mp_template_store_title >", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_store_title >=", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleLessThan(String value) {
            addCriterion("weixin_mp_template_store_title <", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleLessThanOrEqualTo(String value) {
            addCriterion("weixin_mp_template_store_title <=", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleLike(String value) {
            addCriterion("weixin_mp_template_store_title like", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleNotLike(String value) {
            addCriterion("weixin_mp_template_store_title not like", value, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleIn(List<String> values) {
            addCriterion("weixin_mp_template_store_title in", values, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleNotIn(List<String> values) {
            addCriterion("weixin_mp_template_store_title not in", values, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_store_title between", value1, value2, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinMpTemplateStoreTitleNotBetween(String value1, String value2) {
            addCriterion("weixin_mp_template_store_title not between", value1, value2, "weixinMpTemplateStoreTitle");
            return (Criteria) this;
        }

        public Criteria andWeixinStateIsNull() {
            addCriterion("weixin_state is null");
            return (Criteria) this;
        }

        public Criteria andWeixinStateIsNotNull() {
            addCriterion("weixin_state is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinStateEqualTo(Integer value) {
            addCriterion("weixin_state =", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateNotEqualTo(Integer value) {
            addCriterion("weixin_state <>", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateGreaterThan(Integer value) {
            addCriterion("weixin_state >", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("weixin_state >=", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateLessThan(Integer value) {
            addCriterion("weixin_state <", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateLessThanOrEqualTo(Integer value) {
            addCriterion("weixin_state <=", value, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateIn(List<Integer> values) {
            addCriterion("weixin_state in", values, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateNotIn(List<Integer> values) {
            addCriterion("weixin_state not in", values, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateBetween(Integer value1, Integer value2) {
            addCriterion("weixin_state between", value1, value2, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinStateNotBetween(Integer value1, Integer value2) {
            addCriterion("weixin_state not between", value1, value2, "weixinState");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlIsNull() {
            addCriterion("weixin_template_url is null");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlIsNotNull() {
            addCriterion("weixin_template_url is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlEqualTo(String value) {
            addCriterion("weixin_template_url =", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlNotEqualTo(String value) {
            addCriterion("weixin_template_url <>", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlGreaterThan(String value) {
            addCriterion("weixin_template_url >", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_template_url >=", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlLessThan(String value) {
            addCriterion("weixin_template_url <", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlLessThanOrEqualTo(String value) {
            addCriterion("weixin_template_url <=", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlLike(String value) {
            addCriterion("weixin_template_url like", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlNotLike(String value) {
            addCriterion("weixin_template_url not like", value, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlIn(List<String> values) {
            addCriterion("weixin_template_url in", values, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlNotIn(List<String> values) {
            addCriterion("weixin_template_url not in", values, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlBetween(String value1, String value2) {
            addCriterion("weixin_template_url between", value1, value2, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinTemplateUrlNotBetween(String value1, String value2) {
            addCriterion("weixin_template_url not between", value1, value2, "weixinTemplateUrl");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeIsNull() {
            addCriterion("huawei_tpl_code is null");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeIsNotNull() {
            addCriterion("huawei_tpl_code is not null");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeEqualTo(String value) {
            addCriterion("huawei_tpl_code =", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeNotEqualTo(String value) {
            addCriterion("huawei_tpl_code <>", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeGreaterThan(String value) {
            addCriterion("huawei_tpl_code >", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("huawei_tpl_code >=", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeLessThan(String value) {
            addCriterion("huawei_tpl_code <", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeLessThanOrEqualTo(String value) {
            addCriterion("huawei_tpl_code <=", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeLike(String value) {
            addCriterion("huawei_tpl_code like", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeNotLike(String value) {
            addCriterion("huawei_tpl_code not like", value, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeIn(List<String> values) {
            addCriterion("huawei_tpl_code in", values, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeNotIn(List<String> values) {
            addCriterion("huawei_tpl_code not in", values, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeBetween(String value1, String value2) {
            addCriterion("huawei_tpl_code between", value1, value2, "huaweiTplCode");
            return (Criteria) this;
        }

        public Criteria andHuaweiTplCodeNotBetween(String value1, String value2) {
            addCriterion("huawei_tpl_code not between", value1, value2, "huaweiTplCode");
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