package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.List;

public class ImLinkManExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImLinkManExample() {
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

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(Integer value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(Integer value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(Integer value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(Integer value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<Integer> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<Integer> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(Integer value1, Integer value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
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

        public Criteria andLinkManAvatarIsNull() {
            addCriterion("link_man_avatar is null");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarIsNotNull() {
            addCriterion("link_man_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarEqualTo(String value) {
            addCriterion("link_man_avatar =", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarNotEqualTo(String value) {
            addCriterion("link_man_avatar <>", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarGreaterThan(String value) {
            addCriterion("link_man_avatar >", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("link_man_avatar >=", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarLessThan(String value) {
            addCriterion("link_man_avatar <", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarLessThanOrEqualTo(String value) {
            addCriterion("link_man_avatar <=", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarLike(String value) {
            addCriterion("link_man_avatar like", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarNotLike(String value) {
            addCriterion("link_man_avatar not like", value, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarIn(List<String> values) {
            addCriterion("link_man_avatar in", values, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarNotIn(List<String> values) {
            addCriterion("link_man_avatar not in", values, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarBetween(String value1, String value2) {
            addCriterion("link_man_avatar between", value1, value2, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManAvatarNotBetween(String value1, String value2) {
            addCriterion("link_man_avatar not between", value1, value2, "linkManAvatar");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIsNull() {
            addCriterion("link_man_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIsNotNull() {
            addCriterion("link_man_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManIdEqualTo(Integer value) {
            addCriterion("link_man_id =", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotEqualTo(Integer value) {
            addCriterion("link_man_id <>", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdGreaterThan(Integer value) {
            addCriterion("link_man_id >", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_man_id >=", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdLessThan(Integer value) {
            addCriterion("link_man_id <", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdLessThanOrEqualTo(Integer value) {
            addCriterion("link_man_id <=", value, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdIn(List<Integer> values) {
            addCriterion("link_man_id in", values, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotIn(List<Integer> values) {
            addCriterion("link_man_id not in", values, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdBetween(Integer value1, Integer value2) {
            addCriterion("link_man_id between", value1, value2, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("link_man_id not between", value1, value2, "linkManId");
            return (Criteria) this;
        }

        public Criteria andLinkManNameIsNull() {
            addCriterion("link_man_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkManNameIsNotNull() {
            addCriterion("link_man_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManNameEqualTo(String value) {
            addCriterion("link_man_name =", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameNotEqualTo(String value) {
            addCriterion("link_man_name <>", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameGreaterThan(String value) {
            addCriterion("link_man_name >", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_man_name >=", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameLessThan(String value) {
            addCriterion("link_man_name <", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameLessThanOrEqualTo(String value) {
            addCriterion("link_man_name <=", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameLike(String value) {
            addCriterion("link_man_name like", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameNotLike(String value) {
            addCriterion("link_man_name not like", value, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameIn(List<String> values) {
            addCriterion("link_man_name in", values, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameNotIn(List<String> values) {
            addCriterion("link_man_name not in", values, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameBetween(String value1, String value2) {
            addCriterion("link_man_name between", value1, value2, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManNameNotBetween(String value1, String value2) {
            addCriterion("link_man_name not between", value1, value2, "linkManName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdIsNull() {
            addCriterion("link_man_store_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdIsNotNull() {
            addCriterion("link_man_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdEqualTo(Integer value) {
            addCriterion("link_man_store_id =", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdNotEqualTo(Integer value) {
            addCriterion("link_man_store_id <>", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdGreaterThan(Integer value) {
            addCriterion("link_man_store_id >", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_man_store_id >=", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdLessThan(Integer value) {
            addCriterion("link_man_store_id <", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("link_man_store_id <=", value, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdIn(List<Integer> values) {
            addCriterion("link_man_store_id in", values, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdNotIn(List<Integer> values) {
            addCriterion("link_man_store_id not in", values, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("link_man_store_id between", value1, value2, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("link_man_store_id not between", value1, value2, "linkManStoreId");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameIsNull() {
            addCriterion("link_man_store_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameIsNotNull() {
            addCriterion("link_man_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameEqualTo(String value) {
            addCriterion("link_man_store_name =", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameNotEqualTo(String value) {
            addCriterion("link_man_store_name <>", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameGreaterThan(String value) {
            addCriterion("link_man_store_name >", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_man_store_name >=", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameLessThan(String value) {
            addCriterion("link_man_store_name <", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameLessThanOrEqualTo(String value) {
            addCriterion("link_man_store_name <=", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameLike(String value) {
            addCriterion("link_man_store_name like", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameNotLike(String value) {
            addCriterion("link_man_store_name not like", value, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameIn(List<String> values) {
            addCriterion("link_man_store_name in", values, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameNotIn(List<String> values) {
            addCriterion("link_man_store_name not in", values, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameBetween(String value1, String value2) {
            addCriterion("link_man_store_name between", value1, value2, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkManStoreNameNotBetween(String value1, String value2) {
            addCriterion("link_man_store_name not between", value1, value2, "linkManStoreName");
            return (Criteria) this;
        }

        public Criteria andLinkStateIsNull() {
            addCriterion("link_state is null");
            return (Criteria) this;
        }

        public Criteria andLinkStateIsNotNull() {
            addCriterion("link_state is not null");
            return (Criteria) this;
        }

        public Criteria andLinkStateEqualTo(Integer value) {
            addCriterion("link_state =", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateNotEqualTo(Integer value) {
            addCriterion("link_state <>", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateGreaterThan(Integer value) {
            addCriterion("link_state >", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_state >=", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateLessThan(Integer value) {
            addCriterion("link_state <", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateLessThanOrEqualTo(Integer value) {
            addCriterion("link_state <=", value, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateIn(List<Integer> values) {
            addCriterion("link_state in", values, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateNotIn(List<Integer> values) {
            addCriterion("link_state not in", values, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateBetween(Integer value1, Integer value2) {
            addCriterion("link_state between", value1, value2, "linkState");
            return (Criteria) this;
        }

        public Criteria andLinkStateNotBetween(Integer value1, Integer value2) {
            addCriterion("link_state not between", value1, value2, "linkState");
            return (Criteria) this;
        }

        public Criteria andMemberDelIsNull() {
            addCriterion("member_del is null");
            return (Criteria) this;
        }

        public Criteria andMemberDelIsNotNull() {
            addCriterion("member_del is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDelEqualTo(Integer value) {
            addCriterion("member_del =", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelNotEqualTo(Integer value) {
            addCriterion("member_del <>", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelGreaterThan(Integer value) {
            addCriterion("member_del >", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_del >=", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelLessThan(Integer value) {
            addCriterion("member_del <", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelLessThanOrEqualTo(Integer value) {
            addCriterion("member_del <=", value, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelIn(List<Integer> values) {
            addCriterion("member_del in", values, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelNotIn(List<Integer> values) {
            addCriterion("member_del not in", values, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelBetween(Integer value1, Integer value2) {
            addCriterion("member_del between", value1, value2, "memberDel");
            return (Criteria) this;
        }

        public Criteria andMemberDelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_del not between", value1, value2, "memberDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelIsNull() {
            addCriterion("seller_del is null");
            return (Criteria) this;
        }

        public Criteria andSellerDelIsNotNull() {
            addCriterion("seller_del is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDelEqualTo(Integer value) {
            addCriterion("seller_del =", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelNotEqualTo(Integer value) {
            addCriterion("seller_del <>", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelGreaterThan(Integer value) {
            addCriterion("seller_del >", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_del >=", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelLessThan(Integer value) {
            addCriterion("seller_del <", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelLessThanOrEqualTo(Integer value) {
            addCriterion("seller_del <=", value, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelIn(List<Integer> values) {
            addCriterion("seller_del in", values, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelNotIn(List<Integer> values) {
            addCriterion("seller_del not in", values, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelBetween(Integer value1, Integer value2) {
            addCriterion("seller_del between", value1, value2, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andSellerDelNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_del not between", value1, value2, "sellerDel");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNull() {
            addCriterion("user_avatar is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNotNull() {
            addCriterion("user_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarEqualTo(String value) {
            addCriterion("user_avatar =", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotEqualTo(String value) {
            addCriterion("user_avatar <>", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThan(String value) {
            addCriterion("user_avatar >", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatar >=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThan(String value) {
            addCriterion("user_avatar <", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThanOrEqualTo(String value) {
            addCriterion("user_avatar <=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLike(String value) {
            addCriterion("user_avatar like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotLike(String value) {
            addCriterion("user_avatar not like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIn(List<String> values) {
            addCriterion("user_avatar in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotIn(List<String> values) {
            addCriterion("user_avatar not in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarBetween(String value1, String value2) {
            addCriterion("user_avatar between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotBetween(String value1, String value2) {
            addCriterion("user_avatar not between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
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