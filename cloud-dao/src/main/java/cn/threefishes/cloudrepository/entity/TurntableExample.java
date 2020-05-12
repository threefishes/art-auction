package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TurntableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TurntableExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andRuleIsNull() {
            addCriterion("rule is null");
            return (Criteria) this;
        }

        public Criteria andRuleIsNotNull() {
            addCriterion("rule is not null");
            return (Criteria) this;
        }

        public Criteria andRuleEqualTo(String value) {
            addCriterion("rule =", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(String value) {
            addCriterion("rule <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(String value) {
            addCriterion("rule >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(String value) {
            addCriterion("rule >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(String value) {
            addCriterion("rule <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(String value) {
            addCriterion("rule <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLike(String value) {
            addCriterion("rule like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotLike(String value) {
            addCriterion("rule not like", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleIn(List<String> values) {
            addCriterion("rule in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotIn(List<String> values) {
            addCriterion("rule not in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleBetween(String value1, String value2) {
            addCriterion("rule between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotBetween(String value1, String value2) {
            addCriterion("rule not between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNull() {
            addCriterion("background is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNotNull() {
            addCriterion("background is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEqualTo(String value) {
            addCriterion("background =", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotEqualTo(String value) {
            addCriterion("background <>", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThan(String value) {
            addCriterion("background >", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("background >=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThan(String value) {
            addCriterion("background <", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThanOrEqualTo(String value) {
            addCriterion("background <=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLike(String value) {
            addCriterion("background like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotLike(String value) {
            addCriterion("background not like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundIn(List<String> values) {
            addCriterion("background in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotIn(List<String> values) {
            addCriterion("background not in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundBetween(String value1, String value2) {
            addCriterion("background between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotBetween(String value1, String value2) {
            addCriterion("background not between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andShowWinnersIsNull() {
            addCriterion("show_winners is null");
            return (Criteria) this;
        }

        public Criteria andShowWinnersIsNotNull() {
            addCriterion("show_winners is not null");
            return (Criteria) this;
        }

        public Criteria andShowWinnersEqualTo(Integer value) {
            addCriterion("show_winners =", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersNotEqualTo(Integer value) {
            addCriterion("show_winners <>", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersGreaterThan(Integer value) {
            addCriterion("show_winners >", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_winners >=", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersLessThan(Integer value) {
            addCriterion("show_winners <", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersLessThanOrEqualTo(Integer value) {
            addCriterion("show_winners <=", value, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersIn(List<Integer> values) {
            addCriterion("show_winners in", values, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersNotIn(List<Integer> values) {
            addCriterion("show_winners not in", values, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersBetween(Integer value1, Integer value2) {
            addCriterion("show_winners between", value1, value2, "showWinners");
            return (Criteria) this;
        }

        public Criteria andShowWinnersNotBetween(Integer value1, Integer value2) {
            addCriterion("show_winners not between", value1, value2, "showWinners");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountIsNull() {
            addCriterion("luckily_count is null");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountIsNotNull() {
            addCriterion("luckily_count is not null");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountEqualTo(Integer value) {
            addCriterion("luckily_count =", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountNotEqualTo(Integer value) {
            addCriterion("luckily_count <>", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountGreaterThan(Integer value) {
            addCriterion("luckily_count >", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckily_count >=", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountLessThan(Integer value) {
            addCriterion("luckily_count <", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountLessThanOrEqualTo(Integer value) {
            addCriterion("luckily_count <=", value, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountIn(List<Integer> values) {
            addCriterion("luckily_count in", values, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountNotIn(List<Integer> values) {
            addCriterion("luckily_count not in", values, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountBetween(Integer value1, Integer value2) {
            addCriterion("luckily_count between", value1, value2, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("luckily_count not between", value1, value2, "luckilyCount");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeIsNull() {
            addCriterion("luckily_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeIsNotNull() {
            addCriterion("luckily_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeEqualTo(Integer value) {
            addCriterion("luckily_limit_type =", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeNotEqualTo(Integer value) {
            addCriterion("luckily_limit_type <>", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeGreaterThan(Integer value) {
            addCriterion("luckily_limit_type >", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckily_limit_type >=", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeLessThan(Integer value) {
            addCriterion("luckily_limit_type <", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("luckily_limit_type <=", value, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeIn(List<Integer> values) {
            addCriterion("luckily_limit_type in", values, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeNotIn(List<Integer> values) {
            addCriterion("luckily_limit_type not in", values, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeBetween(Integer value1, Integer value2) {
            addCriterion("luckily_limit_type between", value1, value2, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andLuckilyLimitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("luckily_limit_type not between", value1, value2, "luckilyLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinCountIsNull() {
            addCriterion("join_count is null");
            return (Criteria) this;
        }

        public Criteria andJoinCountIsNotNull() {
            addCriterion("join_count is not null");
            return (Criteria) this;
        }

        public Criteria andJoinCountEqualTo(Integer value) {
            addCriterion("join_count =", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountNotEqualTo(Integer value) {
            addCriterion("join_count <>", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountGreaterThan(Integer value) {
            addCriterion("join_count >", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_count >=", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountLessThan(Integer value) {
            addCriterion("join_count <", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountLessThanOrEqualTo(Integer value) {
            addCriterion("join_count <=", value, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountIn(List<Integer> values) {
            addCriterion("join_count in", values, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountNotIn(List<Integer> values) {
            addCriterion("join_count not in", values, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountBetween(Integer value1, Integer value2) {
            addCriterion("join_count between", value1, value2, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinCountNotBetween(Integer value1, Integer value2) {
            addCriterion("join_count not between", value1, value2, "joinCount");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeIsNull() {
            addCriterion("join_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeIsNotNull() {
            addCriterion("join_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeEqualTo(Integer value) {
            addCriterion("join_limit_type =", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeNotEqualTo(Integer value) {
            addCriterion("join_limit_type <>", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeGreaterThan(Integer value) {
            addCriterion("join_limit_type >", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_limit_type >=", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeLessThan(Integer value) {
            addCriterion("join_limit_type <", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("join_limit_type <=", value, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeIn(List<Integer> values) {
            addCriterion("join_limit_type in", values, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeNotIn(List<Integer> values) {
            addCriterion("join_limit_type not in", values, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeBetween(Integer value1, Integer value2) {
            addCriterion("join_limit_type between", value1, value2, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andJoinLimitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("join_limit_type not between", value1, value2, "joinLimitType");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleIsNull() {
            addCriterion("unaward_title is null");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleIsNotNull() {
            addCriterion("unaward_title is not null");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleEqualTo(String value) {
            addCriterion("unaward_title =", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleNotEqualTo(String value) {
            addCriterion("unaward_title <>", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleGreaterThan(String value) {
            addCriterion("unaward_title >", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleGreaterThanOrEqualTo(String value) {
            addCriterion("unaward_title >=", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleLessThan(String value) {
            addCriterion("unaward_title <", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleLessThanOrEqualTo(String value) {
            addCriterion("unaward_title <=", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleLike(String value) {
            addCriterion("unaward_title like", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleNotLike(String value) {
            addCriterion("unaward_title not like", value, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleIn(List<String> values) {
            addCriterion("unaward_title in", values, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleNotIn(List<String> values) {
            addCriterion("unaward_title not in", values, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleBetween(String value1, String value2) {
            addCriterion("unaward_title between", value1, value2, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardTitleNotBetween(String value1, String value2) {
            addCriterion("unaward_title not between", value1, value2, "unawardTitle");
            return (Criteria) this;
        }

        public Criteria andUnawardContentIsNull() {
            addCriterion("unaward_content is null");
            return (Criteria) this;
        }

        public Criteria andUnawardContentIsNotNull() {
            addCriterion("unaward_content is not null");
            return (Criteria) this;
        }

        public Criteria andUnawardContentEqualTo(String value) {
            addCriterion("unaward_content =", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentNotEqualTo(String value) {
            addCriterion("unaward_content <>", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentGreaterThan(String value) {
            addCriterion("unaward_content >", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentGreaterThanOrEqualTo(String value) {
            addCriterion("unaward_content >=", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentLessThan(String value) {
            addCriterion("unaward_content <", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentLessThanOrEqualTo(String value) {
            addCriterion("unaward_content <=", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentLike(String value) {
            addCriterion("unaward_content like", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentNotLike(String value) {
            addCriterion("unaward_content not like", value, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentIn(List<String> values) {
            addCriterion("unaward_content in", values, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentNotIn(List<String> values) {
            addCriterion("unaward_content not in", values, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentBetween(String value1, String value2) {
            addCriterion("unaward_content between", value1, value2, "unawardContent");
            return (Criteria) this;
        }

        public Criteria andUnawardContentNotBetween(String value1, String value2) {
            addCriterion("unaward_content not between", value1, value2, "unawardContent");
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