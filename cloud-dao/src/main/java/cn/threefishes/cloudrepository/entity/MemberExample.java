package cn.threefishes.cloudrepository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andAddressAreaidIsNull() {
            addCriterion("address_areaid is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidIsNotNull() {
            addCriterion("address_areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidEqualTo(Integer value) {
            addCriterion("address_areaid =", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotEqualTo(Integer value) {
            addCriterion("address_areaid <>", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidGreaterThan(Integer value) {
            addCriterion("address_areaid >", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_areaid >=", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidLessThan(Integer value) {
            addCriterion("address_areaid <", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("address_areaid <=", value, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidIn(List<Integer> values) {
            addCriterion("address_areaid in", values, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotIn(List<Integer> values) {
            addCriterion("address_areaid not in", values, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidBetween(Integer value1, Integer value2) {
            addCriterion("address_areaid between", value1, value2, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("address_areaid not between", value1, value2, "addressAreaid");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoIsNull() {
            addCriterion("address_areainfo is null");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoIsNotNull() {
            addCriterion("address_areainfo is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoEqualTo(String value) {
            addCriterion("address_areainfo =", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoNotEqualTo(String value) {
            addCriterion("address_areainfo <>", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoGreaterThan(String value) {
            addCriterion("address_areainfo >", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoGreaterThanOrEqualTo(String value) {
            addCriterion("address_areainfo >=", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoLessThan(String value) {
            addCriterion("address_areainfo <", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoLessThanOrEqualTo(String value) {
            addCriterion("address_areainfo <=", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoLike(String value) {
            addCriterion("address_areainfo like", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoNotLike(String value) {
            addCriterion("address_areainfo not like", value, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoIn(List<String> values) {
            addCriterion("address_areainfo in", values, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoNotIn(List<String> values) {
            addCriterion("address_areainfo not in", values, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoBetween(String value1, String value2) {
            addCriterion("address_areainfo between", value1, value2, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressAreainfoNotBetween(String value1, String value2) {
            addCriterion("address_areainfo not between", value1, value2, "addressAreainfo");
            return (Criteria) this;
        }

        public Criteria andAddressCityidIsNull() {
            addCriterion("address_cityid is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityidIsNotNull() {
            addCriterion("address_cityid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityidEqualTo(Integer value) {
            addCriterion("address_cityid =", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidNotEqualTo(Integer value) {
            addCriterion("address_cityid <>", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidGreaterThan(Integer value) {
            addCriterion("address_cityid >", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_cityid >=", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidLessThan(Integer value) {
            addCriterion("address_cityid <", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidLessThanOrEqualTo(Integer value) {
            addCriterion("address_cityid <=", value, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidIn(List<Integer> values) {
            addCriterion("address_cityid in", values, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidNotIn(List<Integer> values) {
            addCriterion("address_cityid not in", values, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidBetween(Integer value1, Integer value2) {
            addCriterion("address_cityid between", value1, value2, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("address_cityid not between", value1, value2, "addressCityid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidIsNull() {
            addCriterion("address_provinceid is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidIsNotNull() {
            addCriterion("address_provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidEqualTo(Integer value) {
            addCriterion("address_provinceid =", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidNotEqualTo(Integer value) {
            addCriterion("address_provinceid <>", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidGreaterThan(Integer value) {
            addCriterion("address_provinceid >", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_provinceid >=", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidLessThan(Integer value) {
            addCriterion("address_provinceid <", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("address_provinceid <=", value, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidIn(List<Integer> values) {
            addCriterion("address_provinceid in", values, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidNotIn(List<Integer> values) {
            addCriterion("address_provinceid not in", values, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("address_provinceid between", value1, value2, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("address_provinceid not between", value1, value2, "addressProvinceid");
            return (Criteria) this;
        }

        public Criteria andAllowBuyIsNull() {
            addCriterion("allow_buy is null");
            return (Criteria) this;
        }

        public Criteria andAllowBuyIsNotNull() {
            addCriterion("allow_buy is not null");
            return (Criteria) this;
        }

        public Criteria andAllowBuyEqualTo(Integer value) {
            addCriterion("allow_buy =", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyNotEqualTo(Integer value) {
            addCriterion("allow_buy <>", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyGreaterThan(Integer value) {
            addCriterion("allow_buy >", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_buy >=", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyLessThan(Integer value) {
            addCriterion("allow_buy <", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyLessThanOrEqualTo(Integer value) {
            addCriterion("allow_buy <=", value, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyIn(List<Integer> values) {
            addCriterion("allow_buy in", values, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyNotIn(List<Integer> values) {
            addCriterion("allow_buy not in", values, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyBetween(Integer value1, Integer value2) {
            addCriterion("allow_buy between", value1, value2, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowBuyNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_buy not between", value1, value2, "allowBuy");
            return (Criteria) this;
        }

        public Criteria andAllowTalkIsNull() {
            addCriterion("allow_talk is null");
            return (Criteria) this;
        }

        public Criteria andAllowTalkIsNotNull() {
            addCriterion("allow_talk is not null");
            return (Criteria) this;
        }

        public Criteria andAllowTalkEqualTo(Integer value) {
            addCriterion("allow_talk =", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkNotEqualTo(Integer value) {
            addCriterion("allow_talk <>", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkGreaterThan(Integer value) {
            addCriterion("allow_talk >", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_talk >=", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkLessThan(Integer value) {
            addCriterion("allow_talk <", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkLessThanOrEqualTo(Integer value) {
            addCriterion("allow_talk <=", value, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkIn(List<Integer> values) {
            addCriterion("allow_talk in", values, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkNotIn(List<Integer> values) {
            addCriterion("allow_talk not in", values, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkBetween(Integer value1, Integer value2) {
            addCriterion("allow_talk between", value1, value2, "allowTalk");
            return (Criteria) this;
        }

        public Criteria andAllowTalkNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_talk not between", value1, value2, "allowTalk");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindIsNull() {
            addCriterion("email_isbind is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindIsNotNull() {
            addCriterion("email_isbind is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindEqualTo(Integer value) {
            addCriterion("email_isbind =", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindNotEqualTo(Integer value) {
            addCriterion("email_isbind <>", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindGreaterThan(Integer value) {
            addCriterion("email_isbind >", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_isbind >=", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindLessThan(Integer value) {
            addCriterion("email_isbind <", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindLessThanOrEqualTo(Integer value) {
            addCriterion("email_isbind <=", value, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindIn(List<Integer> values) {
            addCriterion("email_isbind in", values, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindNotIn(List<Integer> values) {
            addCriterion("email_isbind not in", values, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindBetween(Integer value1, Integer value2) {
            addCriterion("email_isbind between", value1, value2, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andEmailIsbindNotBetween(Integer value1, Integer value2) {
            addCriterion("email_isbind not between", value1, value2, "emailIsbind");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsIsNull() {
            addCriterion("experience_points is null");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsIsNotNull() {
            addCriterion("experience_points is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsEqualTo(Integer value) {
            addCriterion("experience_points =", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsNotEqualTo(Integer value) {
            addCriterion("experience_points <>", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsGreaterThan(Integer value) {
            addCriterion("experience_points >", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_points >=", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsLessThan(Integer value) {
            addCriterion("experience_points <", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsLessThanOrEqualTo(Integer value) {
            addCriterion("experience_points <=", value, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsIn(List<Integer> values) {
            addCriterion("experience_points in", values, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsNotIn(List<Integer> values) {
            addCriterion("experience_points not in", values, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsBetween(Integer value1, Integer value2) {
            addCriterion("experience_points between", value1, value2, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andExperiencePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_points not between", value1, value2, "experiencePoints");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIsDistributorIsNull() {
            addCriterion("is_distributor is null");
            return (Criteria) this;
        }

        public Criteria andIsDistributorIsNotNull() {
            addCriterion("is_distributor is not null");
            return (Criteria) this;
        }

        public Criteria andIsDistributorEqualTo(Integer value) {
            addCriterion("is_distributor =", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorNotEqualTo(Integer value) {
            addCriterion("is_distributor <>", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorGreaterThan(Integer value) {
            addCriterion("is_distributor >", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_distributor >=", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorLessThan(Integer value) {
            addCriterion("is_distributor <", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorLessThanOrEqualTo(Integer value) {
            addCriterion("is_distributor <=", value, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorIn(List<Integer> values) {
            addCriterion("is_distributor in", values, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorNotIn(List<Integer> values) {
            addCriterion("is_distributor not in", values, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorBetween(Integer value1, Integer value2) {
            addCriterion("is_distributor between", value1, value2, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andIsDistributorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_distributor not between", value1, value2, "isDistributor");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
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

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("login_num is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("login_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Integer value) {
            addCriterion("login_num =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Integer value) {
            addCriterion("login_num <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Integer value) {
            addCriterion("login_num >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_num >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Integer value) {
            addCriterion("login_num <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("login_num <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Integer> values) {
            addCriterion("login_num in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Integer> values) {
            addCriterion("login_num not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("login_num between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("login_num not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
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

        public Criteria andMemberPointsIsNull() {
            addCriterion("member_points is null");
            return (Criteria) this;
        }

        public Criteria andMemberPointsIsNotNull() {
            addCriterion("member_points is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPointsEqualTo(Integer value) {
            addCriterion("member_points =", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotEqualTo(Integer value) {
            addCriterion("member_points <>", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsGreaterThan(Integer value) {
            addCriterion("member_points >", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_points >=", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsLessThan(Integer value) {
            addCriterion("member_points <", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsLessThanOrEqualTo(Integer value) {
            addCriterion("member_points <=", value, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsIn(List<Integer> values) {
            addCriterion("member_points in", values, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotIn(List<Integer> values) {
            addCriterion("member_points not in", values, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsBetween(Integer value1, Integer value2) {
            addCriterion("member_points between", value1, value2, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("member_points not between", value1, value2, "memberPoints");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIsNull() {
            addCriterion("member_pwd is null");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIsNotNull() {
            addCriterion("member_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPwdEqualTo(String value) {
            addCriterion("member_pwd =", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotEqualTo(String value) {
            addCriterion("member_pwd <>", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdGreaterThan(String value) {
            addCriterion("member_pwd >", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdGreaterThanOrEqualTo(String value) {
            addCriterion("member_pwd >=", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLessThan(String value) {
            addCriterion("member_pwd <", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLessThanOrEqualTo(String value) {
            addCriterion("member_pwd <=", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLike(String value) {
            addCriterion("member_pwd like", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotLike(String value) {
            addCriterion("member_pwd not like", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIn(List<String> values) {
            addCriterion("member_pwd in", values, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotIn(List<String> values) {
            addCriterion("member_pwd not in", values, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdBetween(String value1, String value2) {
            addCriterion("member_pwd between", value1, value2, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotBetween(String value1, String value2) {
            addCriterion("member_pwd not between", value1, value2, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(Integer value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(Integer value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(Integer value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(Integer value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(Integer value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<Integer> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<Integer> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(Integer value1, Integer value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(Integer value1, Integer value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindIsNull() {
            addCriterion("mobile_isbind is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindIsNotNull() {
            addCriterion("mobile_isbind is not null");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindEqualTo(Integer value) {
            addCriterion("mobile_isbind =", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindNotEqualTo(Integer value) {
            addCriterion("mobile_isbind <>", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindGreaterThan(Integer value) {
            addCriterion("mobile_isbind >", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_isbind >=", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindLessThan(Integer value) {
            addCriterion("mobile_isbind <", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_isbind <=", value, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindIn(List<Integer> values) {
            addCriterion("mobile_isbind in", values, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindNotIn(List<Integer> values) {
            addCriterion("mobile_isbind not in", values, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindBetween(Integer value1, Integer value2) {
            addCriterion("mobile_isbind between", value1, value2, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andMobileIsbindNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_isbind not between", value1, value2, "mobileIsbind");
            return (Criteria) this;
        }

        public Criteria andModifyNumIsNull() {
            addCriterion("modify_num is null");
            return (Criteria) this;
        }

        public Criteria andModifyNumIsNotNull() {
            addCriterion("modify_num is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNumEqualTo(Integer value) {
            addCriterion("modify_num =", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotEqualTo(Integer value) {
            addCriterion("modify_num <>", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumGreaterThan(Integer value) {
            addCriterion("modify_num >", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_num >=", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumLessThan(Integer value) {
            addCriterion("modify_num <", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumLessThanOrEqualTo(Integer value) {
            addCriterion("modify_num <=", value, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumIn(List<Integer> values) {
            addCriterion("modify_num in", values, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotIn(List<Integer> values) {
            addCriterion("modify_num not in", values, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumBetween(Integer value1, Integer value2) {
            addCriterion("modify_num between", value1, value2, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andModifyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_num not between", value1, value2, "modifyNum");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("pay_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("pay_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("pay_pwd =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("pay_pwd <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("pay_pwd >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pwd >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("pay_pwd <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("pay_pwd <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("pay_pwd like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("pay_pwd not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("pay_pwd in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("pay_pwd not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("pay_pwd between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("pay_pwd not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableIsNull() {
            addCriterion("predeposit_available is null");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableIsNotNull() {
            addCriterion("predeposit_available is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableEqualTo(BigDecimal value) {
            addCriterion("predeposit_available =", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_available <>", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableGreaterThan(BigDecimal value) {
            addCriterion("predeposit_available >", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_available >=", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableLessThan(BigDecimal value) {
            addCriterion("predeposit_available <", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_available <=", value, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableIn(List<BigDecimal> values) {
            addCriterion("predeposit_available in", values, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_available not in", values, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_available between", value1, value2, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositAvailableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_available not between", value1, value2, "predepositAvailable");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeIsNull() {
            addCriterion("predeposit_freeze is null");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeIsNotNull() {
            addCriterion("predeposit_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeEqualTo(BigDecimal value) {
            addCriterion("predeposit_freeze =", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeNotEqualTo(BigDecimal value) {
            addCriterion("predeposit_freeze <>", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeGreaterThan(BigDecimal value) {
            addCriterion("predeposit_freeze >", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_freeze >=", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeLessThan(BigDecimal value) {
            addCriterion("predeposit_freeze <", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("predeposit_freeze <=", value, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeIn(List<BigDecimal> values) {
            addCriterion("predeposit_freeze in", values, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeNotIn(List<BigDecimal> values) {
            addCriterion("predeposit_freeze not in", values, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_freeze between", value1, value2, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andPredepositFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("predeposit_freeze not between", value1, value2, "predepositFreeze");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIsNull() {
            addCriterion("qq_openid is null");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIsNotNull() {
            addCriterion("qq_openid is not null");
            return (Criteria) this;
        }

        public Criteria andQqOpenidEqualTo(String value) {
            addCriterion("qq_openid =", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotEqualTo(String value) {
            addCriterion("qq_openid <>", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidGreaterThan(String value) {
            addCriterion("qq_openid >", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("qq_openid >=", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLessThan(String value) {
            addCriterion("qq_openid <", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLessThanOrEqualTo(String value) {
            addCriterion("qq_openid <=", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLike(String value) {
            addCriterion("qq_openid like", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotLike(String value) {
            addCriterion("qq_openid not like", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIn(List<String> values) {
            addCriterion("qq_openid in", values, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotIn(List<String> values) {
            addCriterion("qq_openid not in", values, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidBetween(String value1, String value2) {
            addCriterion("qq_openid between", value1, value2, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotBetween(String value1, String value2) {
            addCriterion("qq_openid not between", value1, value2, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoIsNull() {
            addCriterion("qq_userinfo is null");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoIsNotNull() {
            addCriterion("qq_userinfo is not null");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoEqualTo(String value) {
            addCriterion("qq_userinfo =", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoNotEqualTo(String value) {
            addCriterion("qq_userinfo <>", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoGreaterThan(String value) {
            addCriterion("qq_userinfo >", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoGreaterThanOrEqualTo(String value) {
            addCriterion("qq_userinfo >=", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoLessThan(String value) {
            addCriterion("qq_userinfo <", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoLessThanOrEqualTo(String value) {
            addCriterion("qq_userinfo <=", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoLike(String value) {
            addCriterion("qq_userinfo like", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoNotLike(String value) {
            addCriterion("qq_userinfo not like", value, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoIn(List<String> values) {
            addCriterion("qq_userinfo in", values, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoNotIn(List<String> values) {
            addCriterion("qq_userinfo not in", values, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoBetween(String value1, String value2) {
            addCriterion("qq_userinfo between", value1, value2, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andQqUserinfoNotBetween(String value1, String value2) {
            addCriterion("qq_userinfo not between", value1, value2, "qqUserinfo");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
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

        public Criteria andTrueNameIsNull() {
            addCriterion("true_name is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("true_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("true_name =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("true_name <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("true_name >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("true_name >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("true_name <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("true_name <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("true_name like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("true_name not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("true_name in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("true_name not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("true_name between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("true_name not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidIsNull() {
            addCriterion("weixin_mp_openid is null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidIsNotNull() {
            addCriterion("weixin_mp_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidEqualTo(String value) {
            addCriterion("weixin_mp_openid =", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidNotEqualTo(String value) {
            addCriterion("weixin_mp_openid <>", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidGreaterThan(String value) {
            addCriterion("weixin_mp_openid >", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_mp_openid >=", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidLessThan(String value) {
            addCriterion("weixin_mp_openid <", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidLessThanOrEqualTo(String value) {
            addCriterion("weixin_mp_openid <=", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidLike(String value) {
            addCriterion("weixin_mp_openid like", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidNotLike(String value) {
            addCriterion("weixin_mp_openid not like", value, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidIn(List<String> values) {
            addCriterion("weixin_mp_openid in", values, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidNotIn(List<String> values) {
            addCriterion("weixin_mp_openid not in", values, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidBetween(String value1, String value2) {
            addCriterion("weixin_mp_openid between", value1, value2, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinMpOpenidNotBetween(String value1, String value2) {
            addCriterion("weixin_mp_openid not between", value1, value2, "weixinMpOpenid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidIsNull() {
            addCriterion("weixin_unionid is null");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidIsNotNull() {
            addCriterion("weixin_unionid is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidEqualTo(String value) {
            addCriterion("weixin_unionid =", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidNotEqualTo(String value) {
            addCriterion("weixin_unionid <>", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidGreaterThan(String value) {
            addCriterion("weixin_unionid >", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_unionid >=", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidLessThan(String value) {
            addCriterion("weixin_unionid <", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidLessThanOrEqualTo(String value) {
            addCriterion("weixin_unionid <=", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidLike(String value) {
            addCriterion("weixin_unionid like", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidNotLike(String value) {
            addCriterion("weixin_unionid not like", value, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidIn(List<String> values) {
            addCriterion("weixin_unionid in", values, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidNotIn(List<String> values) {
            addCriterion("weixin_unionid not in", values, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidBetween(String value1, String value2) {
            addCriterion("weixin_unionid between", value1, value2, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUnionidNotBetween(String value1, String value2) {
            addCriterion("weixin_unionid not between", value1, value2, "weixinUnionid");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoIsNull() {
            addCriterion("weixin_userinfo is null");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoIsNotNull() {
            addCriterion("weixin_userinfo is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoEqualTo(String value) {
            addCriterion("weixin_userinfo =", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoNotEqualTo(String value) {
            addCriterion("weixin_userinfo <>", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoGreaterThan(String value) {
            addCriterion("weixin_userinfo >", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_userinfo >=", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoLessThan(String value) {
            addCriterion("weixin_userinfo <", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoLessThanOrEqualTo(String value) {
            addCriterion("weixin_userinfo <=", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoLike(String value) {
            addCriterion("weixin_userinfo like", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoNotLike(String value) {
            addCriterion("weixin_userinfo not like", value, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoIn(List<String> values) {
            addCriterion("weixin_userinfo in", values, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoNotIn(List<String> values) {
            addCriterion("weixin_userinfo not in", values, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoBetween(String value1, String value2) {
            addCriterion("weixin_userinfo between", value1, value2, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andWeixinUserinfoNotBetween(String value1, String value2) {
            addCriterion("weixin_userinfo not between", value1, value2, "weixinUserinfo");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNull() {
            addCriterion("dw_id is null");
            return (Criteria) this;
        }

        public Criteria andDwIdIsNotNull() {
            addCriterion("dw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDwIdEqualTo(String value) {
            addCriterion("dw_id =", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotEqualTo(String value) {
            addCriterion("dw_id <>", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThan(String value) {
            addCriterion("dw_id >", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdGreaterThanOrEqualTo(String value) {
            addCriterion("dw_id >=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThan(String value) {
            addCriterion("dw_id <", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLessThanOrEqualTo(String value) {
            addCriterion("dw_id <=", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdLike(String value) {
            addCriterion("dw_id like", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotLike(String value) {
            addCriterion("dw_id not like", value, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdIn(List<String> values) {
            addCriterion("dw_id in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotIn(List<String> values) {
            addCriterion("dw_id not in", values, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdBetween(String value1, String value2) {
            addCriterion("dw_id between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andDwIdNotBetween(String value1, String value2) {
            addCriterion("dw_id not between", value1, value2, "dwId");
            return (Criteria) this;
        }

        public Criteria andIsStaffIsNull() {
            addCriterion("is_staff is null");
            return (Criteria) this;
        }

        public Criteria andIsStaffIsNotNull() {
            addCriterion("is_staff is not null");
            return (Criteria) this;
        }

        public Criteria andIsStaffEqualTo(Integer value) {
            addCriterion("is_staff =", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffNotEqualTo(Integer value) {
            addCriterion("is_staff <>", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffGreaterThan(Integer value) {
            addCriterion("is_staff >", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_staff >=", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffLessThan(Integer value) {
            addCriterion("is_staff <", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffLessThanOrEqualTo(Integer value) {
            addCriterion("is_staff <=", value, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffIn(List<Integer> values) {
            addCriterion("is_staff in", values, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffNotIn(List<Integer> values) {
            addCriterion("is_staff not in", values, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffBetween(Integer value1, Integer value2) {
            addCriterion("is_staff between", value1, value2, "isStaff");
            return (Criteria) this;
        }

        public Criteria andIsStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("is_staff not between", value1, value2, "isStaff");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNull() {
            addCriterion("superior_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNotNull() {
            addCriterion("superior_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdEqualTo(Integer value) {
            addCriterion("superior_id =", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotEqualTo(Integer value) {
            addCriterion("superior_id <>", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThan(Integer value) {
            addCriterion("superior_id >", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("superior_id >=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThan(Integer value) {
            addCriterion("superior_id <", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThanOrEqualTo(Integer value) {
            addCriterion("superior_id <=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIn(List<Integer> values) {
            addCriterion("superior_id in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotIn(List<Integer> values) {
            addCriterion("superior_id not in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdBetween(Integer value1, Integer value2) {
            addCriterion("superior_id between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("superior_id not between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Integer value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Integer value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Integer value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Integer value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Integer> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Integer> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andMonthAmountIsNull() {
            addCriterion("month_amount is null");
            return (Criteria) this;
        }

        public Criteria andMonthAmountIsNotNull() {
            addCriterion("month_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthAmountEqualTo(BigDecimal value) {
            addCriterion("month_amount =", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountNotEqualTo(BigDecimal value) {
            addCriterion("month_amount <>", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountGreaterThan(BigDecimal value) {
            addCriterion("month_amount >", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("month_amount >=", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountLessThan(BigDecimal value) {
            addCriterion("month_amount <", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("month_amount <=", value, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountIn(List<BigDecimal> values) {
            addCriterion("month_amount in", values, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountNotIn(List<BigDecimal> values) {
            addCriterion("month_amount not in", values, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_amount between", value1, value2, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andMonthAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_amount not between", value1, value2, "monthAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountIsNull() {
            addCriterion("half_year_amount is null");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountIsNotNull() {
            addCriterion("half_year_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountEqualTo(BigDecimal value) {
            addCriterion("half_year_amount =", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountNotEqualTo(BigDecimal value) {
            addCriterion("half_year_amount <>", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountGreaterThan(BigDecimal value) {
            addCriterion("half_year_amount >", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("half_year_amount >=", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountLessThan(BigDecimal value) {
            addCriterion("half_year_amount <", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("half_year_amount <=", value, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountIn(List<BigDecimal> values) {
            addCriterion("half_year_amount in", values, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountNotIn(List<BigDecimal> values) {
            addCriterion("half_year_amount not in", values, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("half_year_amount between", value1, value2, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andHalfYearAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("half_year_amount not between", value1, value2, "halfYearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountIsNull() {
            addCriterion("year_amount is null");
            return (Criteria) this;
        }

        public Criteria andYearAmountIsNotNull() {
            addCriterion("year_amount is not null");
            return (Criteria) this;
        }

        public Criteria andYearAmountEqualTo(BigDecimal value) {
            addCriterion("year_amount =", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountNotEqualTo(BigDecimal value) {
            addCriterion("year_amount <>", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountGreaterThan(BigDecimal value) {
            addCriterion("year_amount >", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_amount >=", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountLessThan(BigDecimal value) {
            addCriterion("year_amount <", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_amount <=", value, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountIn(List<BigDecimal> values) {
            addCriterion("year_amount in", values, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountNotIn(List<BigDecimal> values) {
            addCriterion("year_amount not in", values, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_amount between", value1, value2, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andYearAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_amount not between", value1, value2, "yearAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountIsNull() {
            addCriterion("all_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllAmountIsNotNull() {
            addCriterion("all_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllAmountEqualTo(BigDecimal value) {
            addCriterion("all_amount =", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_amount <>", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountGreaterThan(BigDecimal value) {
            addCriterion("all_amount >", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_amount >=", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountLessThan(BigDecimal value) {
            addCriterion("all_amount <", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_amount <=", value, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountIn(List<BigDecimal> values) {
            addCriterion("all_amount in", values, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_amount not in", values, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_amount between", value1, value2, "allAmount");
            return (Criteria) this;
        }

        public Criteria andAllAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_amount not between", value1, value2, "allAmount");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIsNull() {
            addCriterion("team_number is null");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIsNotNull() {
            addCriterion("team_number is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNumberEqualTo(Integer value) {
            addCriterion("team_number =", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotEqualTo(Integer value) {
            addCriterion("team_number <>", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberGreaterThan(Integer value) {
            addCriterion("team_number >", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_number >=", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberLessThan(Integer value) {
            addCriterion("team_number <", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberLessThanOrEqualTo(Integer value) {
            addCriterion("team_number <=", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIn(List<Integer> values) {
            addCriterion("team_number in", values, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotIn(List<Integer> values) {
            addCriterion("team_number not in", values, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberBetween(Integer value1, Integer value2) {
            addCriterion("team_number between", value1, value2, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("team_number not between", value1, value2, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNull() {
            addCriterion("charge_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNotNull() {
            addCriterion("charge_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNameEqualTo(String value) {
            addCriterion("charge_name =", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotEqualTo(String value) {
            addCriterion("charge_name <>", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThan(String value) {
            addCriterion("charge_name >", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_name >=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThan(String value) {
            addCriterion("charge_name <", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThanOrEqualTo(String value) {
            addCriterion("charge_name <=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLike(String value) {
            addCriterion("charge_name like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotLike(String value) {
            addCriterion("charge_name not like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameIn(List<String> values) {
            addCriterion("charge_name in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotIn(List<String> values) {
            addCriterion("charge_name not in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameBetween(String value1, String value2) {
            addCriterion("charge_name between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotBetween(String value1, String value2) {
            addCriterion("charge_name not between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIsNull() {
            addCriterion("superior_name is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIsNotNull() {
            addCriterion("superior_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameEqualTo(String value) {
            addCriterion("superior_name =", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotEqualTo(String value) {
            addCriterion("superior_name <>", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameGreaterThan(String value) {
            addCriterion("superior_name >", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameGreaterThanOrEqualTo(String value) {
            addCriterion("superior_name >=", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLessThan(String value) {
            addCriterion("superior_name <", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLessThanOrEqualTo(String value) {
            addCriterion("superior_name <=", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLike(String value) {
            addCriterion("superior_name like", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotLike(String value) {
            addCriterion("superior_name not like", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIn(List<String> values) {
            addCriterion("superior_name in", values, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotIn(List<String> values) {
            addCriterion("superior_name not in", values, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameBetween(String value1, String value2) {
            addCriterion("superior_name between", value1, value2, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotBetween(String value1, String value2) {
            addCriterion("superior_name not between", value1, value2, "superiorName");
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

        public Criteria andIsNoviceIsNull() {
            addCriterion("is_novice is null");
            return (Criteria) this;
        }

        public Criteria andIsNoviceIsNotNull() {
            addCriterion("is_novice is not null");
            return (Criteria) this;
        }

        public Criteria andIsNoviceEqualTo(Integer value) {
            addCriterion("is_novice =", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceNotEqualTo(Integer value) {
            addCriterion("is_novice <>", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceGreaterThan(Integer value) {
            addCriterion("is_novice >", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_novice >=", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceLessThan(Integer value) {
            addCriterion("is_novice <", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceLessThanOrEqualTo(Integer value) {
            addCriterion("is_novice <=", value, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceIn(List<Integer> values) {
            addCriterion("is_novice in", values, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceNotIn(List<Integer> values) {
            addCriterion("is_novice not in", values, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceBetween(Integer value1, Integer value2) {
            addCriterion("is_novice between", value1, value2, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsNoviceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_novice not between", value1, value2, "isNovice");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomIsNull() {
            addCriterion("is_register_chatroom is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomIsNotNull() {
            addCriterion("is_register_chatroom is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomEqualTo(Integer value) {
            addCriterion("is_register_chatroom =", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomNotEqualTo(Integer value) {
            addCriterion("is_register_chatroom <>", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomGreaterThan(Integer value) {
            addCriterion("is_register_chatroom >", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_register_chatroom >=", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomLessThan(Integer value) {
            addCriterion("is_register_chatroom <", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomLessThanOrEqualTo(Integer value) {
            addCriterion("is_register_chatroom <=", value, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomIn(List<Integer> values) {
            addCriterion("is_register_chatroom in", values, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomNotIn(List<Integer> values) {
            addCriterion("is_register_chatroom not in", values, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomBetween(Integer value1, Integer value2) {
            addCriterion("is_register_chatroom between", value1, value2, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsRegisterChatroomNotBetween(Integer value1, Integer value2) {
            addCriterion("is_register_chatroom not between", value1, value2, "isRegisterChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomIsNull() {
            addCriterion("is_silence_chatroom is null");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomIsNotNull() {
            addCriterion("is_silence_chatroom is not null");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomEqualTo(Integer value) {
            addCriterion("is_silence_chatroom =", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomNotEqualTo(Integer value) {
            addCriterion("is_silence_chatroom <>", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomGreaterThan(Integer value) {
            addCriterion("is_silence_chatroom >", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_silence_chatroom >=", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomLessThan(Integer value) {
            addCriterion("is_silence_chatroom <", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomLessThanOrEqualTo(Integer value) {
            addCriterion("is_silence_chatroom <=", value, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomIn(List<Integer> values) {
            addCriterion("is_silence_chatroom in", values, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomNotIn(List<Integer> values) {
            addCriterion("is_silence_chatroom not in", values, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomBetween(Integer value1, Integer value2) {
            addCriterion("is_silence_chatroom between", value1, value2, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceChatroomNotBetween(Integer value1, Integer value2) {
            addCriterion("is_silence_chatroom not between", value1, value2, "isSilenceChatroom");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountIsNull() {
            addCriterion("is_silence_count is null");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountIsNotNull() {
            addCriterion("is_silence_count is not null");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountEqualTo(Integer value) {
            addCriterion("is_silence_count =", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountNotEqualTo(Integer value) {
            addCriterion("is_silence_count <>", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountGreaterThan(Integer value) {
            addCriterion("is_silence_count >", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_silence_count >=", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountLessThan(Integer value) {
            addCriterion("is_silence_count <", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountLessThanOrEqualTo(Integer value) {
            addCriterion("is_silence_count <=", value, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountIn(List<Integer> values) {
            addCriterion("is_silence_count in", values, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountNotIn(List<Integer> values) {
            addCriterion("is_silence_count not in", values, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountBetween(Integer value1, Integer value2) {
            addCriterion("is_silence_count between", value1, value2, "isSilenceCount");
            return (Criteria) this;
        }

        public Criteria andIsSilenceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("is_silence_count not between", value1, value2, "isSilenceCount");
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