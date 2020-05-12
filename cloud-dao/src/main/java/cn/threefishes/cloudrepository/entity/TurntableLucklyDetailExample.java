package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TurntableLucklyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TurntableLucklyDetailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIsNull() {
            addCriterion("turntable_id is null");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIsNotNull() {
            addCriterion("turntable_id is not null");
            return (Criteria) this;
        }

        public Criteria andTurntableIdEqualTo(Integer value) {
            addCriterion("turntable_id =", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotEqualTo(Integer value) {
            addCriterion("turntable_id <>", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdGreaterThan(Integer value) {
            addCriterion("turntable_id >", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("turntable_id >=", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdLessThan(Integer value) {
            addCriterion("turntable_id <", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdLessThanOrEqualTo(Integer value) {
            addCriterion("turntable_id <=", value, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdIn(List<Integer> values) {
            addCriterion("turntable_id in", values, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotIn(List<Integer> values) {
            addCriterion("turntable_id not in", values, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdBetween(Integer value1, Integer value2) {
            addCriterion("turntable_id between", value1, value2, "turntableId");
            return (Criteria) this;
        }

        public Criteria andTurntableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("turntable_id not between", value1, value2, "turntableId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNull() {
            addCriterion("prize_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIsNotNull() {
            addCriterion("prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeIdEqualTo(Integer value) {
            addCriterion("prize_id =", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotEqualTo(Integer value) {
            addCriterion("prize_id <>", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThan(Integer value) {
            addCriterion("prize_id >", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_id >=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThan(Integer value) {
            addCriterion("prize_id <", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prize_id <=", value, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdIn(List<Integer> values) {
            addCriterion("prize_id in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotIn(List<Integer> values) {
            addCriterion("prize_id not in", values, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("prize_id between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_id not between", value1, value2, "prizeId");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
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

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIsNull() {
            addCriterion("prize_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIsNotNull() {
            addCriterion("prize_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeEqualTo(Date value) {
            addCriterion("prize_expire_time =", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotEqualTo(Date value) {
            addCriterion("prize_expire_time <>", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeGreaterThan(Date value) {
            addCriterion("prize_expire_time >", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prize_expire_time >=", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeLessThan(Date value) {
            addCriterion("prize_expire_time <", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("prize_expire_time <=", value, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeIn(List<Date> values) {
            addCriterion("prize_expire_time in", values, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotIn(List<Date> values) {
            addCriterion("prize_expire_time not in", values, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeBetween(Date value1, Date value2) {
            addCriterion("prize_expire_time between", value1, value2, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andPrizeExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("prize_expire_time not between", value1, value2, "prizeExpireTime");
            return (Criteria) this;
        }

        public Criteria andCollocationIdIsNull() {
            addCriterion("collocation_id is null");
            return (Criteria) this;
        }

        public Criteria andCollocationIdIsNotNull() {
            addCriterion("collocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationIdEqualTo(Integer value) {
            addCriterion("collocation_id =", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotEqualTo(Integer value) {
            addCriterion("collocation_id <>", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdGreaterThan(Integer value) {
            addCriterion("collocation_id >", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collocation_id >=", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdLessThan(Integer value) {
            addCriterion("collocation_id <", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("collocation_id <=", value, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdIn(List<Integer> values) {
            addCriterion("collocation_id in", values, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotIn(List<Integer> values) {
            addCriterion("collocation_id not in", values, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdBetween(Integer value1, Integer value2) {
            addCriterion("collocation_id between", value1, value2, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collocation_id not between", value1, value2, "collocationId");
            return (Criteria) this;
        }

        public Criteria andCollocationNameIsNull() {
            addCriterion("collocation_name is null");
            return (Criteria) this;
        }

        public Criteria andCollocationNameIsNotNull() {
            addCriterion("collocation_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationNameEqualTo(String value) {
            addCriterion("collocation_name =", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotEqualTo(String value) {
            addCriterion("collocation_name <>", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameGreaterThan(String value) {
            addCriterion("collocation_name >", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("collocation_name >=", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLessThan(String value) {
            addCriterion("collocation_name <", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLessThanOrEqualTo(String value) {
            addCriterion("collocation_name <=", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameLike(String value) {
            addCriterion("collocation_name like", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotLike(String value) {
            addCriterion("collocation_name not like", value, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameIn(List<String> values) {
            addCriterion("collocation_name in", values, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotIn(List<String> values) {
            addCriterion("collocation_name not in", values, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameBetween(String value1, String value2) {
            addCriterion("collocation_name between", value1, value2, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationNameNotBetween(String value1, String value2) {
            addCriterion("collocation_name not between", value1, value2, "collocationName");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIsNull() {
            addCriterion("collocation_content is null");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIsNotNull() {
            addCriterion("collocation_content is not null");
            return (Criteria) this;
        }

        public Criteria andCollocationContentEqualTo(String value) {
            addCriterion("collocation_content =", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotEqualTo(String value) {
            addCriterion("collocation_content <>", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentGreaterThan(String value) {
            addCriterion("collocation_content >", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentGreaterThanOrEqualTo(String value) {
            addCriterion("collocation_content >=", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLessThan(String value) {
            addCriterion("collocation_content <", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLessThanOrEqualTo(String value) {
            addCriterion("collocation_content <=", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentLike(String value) {
            addCriterion("collocation_content like", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotLike(String value) {
            addCriterion("collocation_content not like", value, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentIn(List<String> values) {
            addCriterion("collocation_content in", values, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotIn(List<String> values) {
            addCriterion("collocation_content not in", values, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentBetween(String value1, String value2) {
            addCriterion("collocation_content between", value1, value2, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andCollocationContentNotBetween(String value1, String value2) {
            addCriterion("collocation_content not between", value1, value2, "collocationContent");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNull() {
            addCriterion("prize_type is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNotNull() {
            addCriterion("prize_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeEqualTo(Integer value) {
            addCriterion("prize_type =", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotEqualTo(Integer value) {
            addCriterion("prize_type <>", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThan(Integer value) {
            addCriterion("prize_type >", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_type >=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThan(Integer value) {
            addCriterion("prize_type <", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("prize_type <=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIn(List<Integer> values) {
            addCriterion("prize_type in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotIn(List<Integer> values) {
            addCriterion("prize_type not in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeBetween(Integer value1, Integer value2) {
            addCriterion("prize_type between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_type not between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIsNull() {
            addCriterion("prize_price is null");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIsNotNull() {
            addCriterion("prize_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrizePriceEqualTo(Double value) {
            addCriterion("prize_price =", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotEqualTo(Double value) {
            addCriterion("prize_price <>", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceGreaterThan(Double value) {
            addCriterion("prize_price >", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("prize_price >=", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceLessThan(Double value) {
            addCriterion("prize_price <", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceLessThanOrEqualTo(Double value) {
            addCriterion("prize_price <=", value, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceIn(List<Double> values) {
            addCriterion("prize_price in", values, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotIn(List<Double> values) {
            addCriterion("prize_price not in", values, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceBetween(Double value1, Double value2) {
            addCriterion("prize_price between", value1, value2, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andPrizePriceNotBetween(Double value1, Double value2) {
            addCriterion("prize_price not between", value1, value2, "prizePrice");
            return (Criteria) this;
        }

        public Criteria andTakePointsIsNull() {
            addCriterion("take_points is null");
            return (Criteria) this;
        }

        public Criteria andTakePointsIsNotNull() {
            addCriterion("take_points is not null");
            return (Criteria) this;
        }

        public Criteria andTakePointsEqualTo(Integer value) {
            addCriterion("take_points =", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotEqualTo(Integer value) {
            addCriterion("take_points <>", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsGreaterThan(Integer value) {
            addCriterion("take_points >", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_points >=", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsLessThan(Integer value) {
            addCriterion("take_points <", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsLessThanOrEqualTo(Integer value) {
            addCriterion("take_points <=", value, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsIn(List<Integer> values) {
            addCriterion("take_points in", values, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotIn(List<Integer> values) {
            addCriterion("take_points not in", values, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsBetween(Integer value1, Integer value2) {
            addCriterion("take_points between", value1, value2, "takePoints");
            return (Criteria) this;
        }

        public Criteria andTakePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("take_points not between", value1, value2, "takePoints");
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

        public Criteria andSendPrizeIsNull() {
            addCriterion("send_prize is null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeIsNotNull() {
            addCriterion("send_prize is not null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeEqualTo(Integer value) {
            addCriterion("send_prize =", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeNotEqualTo(Integer value) {
            addCriterion("send_prize <>", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeGreaterThan(Integer value) {
            addCriterion("send_prize >", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_prize >=", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeLessThan(Integer value) {
            addCriterion("send_prize <", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeLessThanOrEqualTo(Integer value) {
            addCriterion("send_prize <=", value, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeIn(List<Integer> values) {
            addCriterion("send_prize in", values, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeNotIn(List<Integer> values) {
            addCriterion("send_prize not in", values, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeBetween(Integer value1, Integer value2) {
            addCriterion("send_prize between", value1, value2, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_prize not between", value1, value2, "sendPrize");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIsNull() {
            addCriterion("send_prize_time is null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIsNotNull() {
            addCriterion("send_prize_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeEqualTo(Date value) {
            addCriterion("send_prize_time =", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotEqualTo(Date value) {
            addCriterion("send_prize_time <>", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeGreaterThan(Date value) {
            addCriterion("send_prize_time >", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_prize_time >=", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeLessThan(Date value) {
            addCriterion("send_prize_time <", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_prize_time <=", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIn(List<Date> values) {
            addCriterion("send_prize_time in", values, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotIn(List<Date> values) {
            addCriterion("send_prize_time not in", values, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeBetween(Date value1, Date value2) {
            addCriterion("send_prize_time between", value1, value2, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_prize_time not between", value1, value2, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimIsNull() {
            addCriterion("claim is null");
            return (Criteria) this;
        }

        public Criteria andClaimIsNotNull() {
            addCriterion("claim is not null");
            return (Criteria) this;
        }

        public Criteria andClaimEqualTo(Integer value) {
            addCriterion("claim =", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimNotEqualTo(Integer value) {
            addCriterion("claim <>", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimGreaterThan(Integer value) {
            addCriterion("claim >", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimGreaterThanOrEqualTo(Integer value) {
            addCriterion("claim >=", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimLessThan(Integer value) {
            addCriterion("claim <", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimLessThanOrEqualTo(Integer value) {
            addCriterion("claim <=", value, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimIn(List<Integer> values) {
            addCriterion("claim in", values, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimNotIn(List<Integer> values) {
            addCriterion("claim not in", values, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimBetween(Integer value1, Integer value2) {
            addCriterion("claim between", value1, value2, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimNotBetween(Integer value1, Integer value2) {
            addCriterion("claim not between", value1, value2, "claim");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeIsNull() {
            addCriterion("claim_prize_time is null");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeIsNotNull() {
            addCriterion("claim_prize_time is not null");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeEqualTo(Date value) {
            addCriterion("claim_prize_time =", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeNotEqualTo(Date value) {
            addCriterion("claim_prize_time <>", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeGreaterThan(Date value) {
            addCriterion("claim_prize_time >", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("claim_prize_time >=", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeLessThan(Date value) {
            addCriterion("claim_prize_time <", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeLessThanOrEqualTo(Date value) {
            addCriterion("claim_prize_time <=", value, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeIn(List<Date> values) {
            addCriterion("claim_prize_time in", values, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeNotIn(List<Date> values) {
            addCriterion("claim_prize_time not in", values, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeBetween(Date value1, Date value2) {
            addCriterion("claim_prize_time between", value1, value2, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andClaimPrizeTimeNotBetween(Date value1, Date value2) {
            addCriterion("claim_prize_time not between", value1, value2, "claimPrizeTime");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNull() {
            addCriterion("receive_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNotNull() {
            addCriterion("receive_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaEqualTo(String value) {
            addCriterion("receive_area =", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotEqualTo(String value) {
            addCriterion("receive_area <>", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThan(String value) {
            addCriterion("receive_area >", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receive_area >=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThan(String value) {
            addCriterion("receive_area <", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThanOrEqualTo(String value) {
            addCriterion("receive_area <=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLike(String value) {
            addCriterion("receive_area like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotLike(String value) {
            addCriterion("receive_area not like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIn(List<String> values) {
            addCriterion("receive_area in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotIn(List<String> values) {
            addCriterion("receive_area not in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaBetween(String value1, String value2) {
            addCriterion("receive_area between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotBetween(String value1, String value2) {
            addCriterion("receive_area not between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receive_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receive_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receive_address =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receive_address <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receive_address >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receive_address <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_address <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receive_address like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receive_address not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receive_address in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receive_address not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receive_address between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receive_address not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNull() {
            addCriterion("ship_sn is null");
            return (Criteria) this;
        }

        public Criteria andShipSnIsNotNull() {
            addCriterion("ship_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShipSnEqualTo(String value) {
            addCriterion("ship_sn =", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotEqualTo(String value) {
            addCriterion("ship_sn <>", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThan(String value) {
            addCriterion("ship_sn >", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnGreaterThanOrEqualTo(String value) {
            addCriterion("ship_sn >=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThan(String value) {
            addCriterion("ship_sn <", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLessThanOrEqualTo(String value) {
            addCriterion("ship_sn <=", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnLike(String value) {
            addCriterion("ship_sn like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotLike(String value) {
            addCriterion("ship_sn not like", value, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnIn(List<String> values) {
            addCriterion("ship_sn in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotIn(List<String> values) {
            addCriterion("ship_sn not in", values, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnBetween(String value1, String value2) {
            addCriterion("ship_sn between", value1, value2, "shipSn");
            return (Criteria) this;
        }

        public Criteria andShipSnNotBetween(String value1, String value2) {
            addCriterion("ship_sn not between", value1, value2, "shipSn");
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