package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppArticleExample() {
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

        public Criteria andAppArticleIdIsNull() {
            addCriterion("app_article_id is null");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdIsNotNull() {
            addCriterion("app_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdEqualTo(Integer value) {
            addCriterion("app_article_id =", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdNotEqualTo(Integer value) {
            addCriterion("app_article_id <>", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdGreaterThan(Integer value) {
            addCriterion("app_article_id >", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_article_id >=", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdLessThan(Integer value) {
            addCriterion("app_article_id <", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_article_id <=", value, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdIn(List<Integer> values) {
            addCriterion("app_article_id in", values, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdNotIn(List<Integer> values) {
            addCriterion("app_article_id not in", values, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("app_article_id between", value1, value2, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAppArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_article_id not between", value1, value2, "appArticleId");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteIsNull() {
            addCriterion("allow_delete is null");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteIsNotNull() {
            addCriterion("allow_delete is not null");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteEqualTo(Integer value) {
            addCriterion("allow_delete =", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteNotEqualTo(Integer value) {
            addCriterion("allow_delete <>", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteGreaterThan(Integer value) {
            addCriterion("allow_delete >", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_delete >=", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteLessThan(Integer value) {
            addCriterion("allow_delete <", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("allow_delete <=", value, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteIn(List<Integer> values) {
            addCriterion("allow_delete in", values, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteNotIn(List<Integer> values) {
            addCriterion("allow_delete not in", values, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteBetween(Integer value1, Integer value2) {
            addCriterion("allow_delete between", value1, value2, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andAllowDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_delete not between", value1, value2, "allowDelete");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andSurfacePlotUrlIsNull() {
            addCriterion("surface_plot_url is null");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlIsNotNull() {
            addCriterion("surface_plot_url is not null");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlEqualTo(String value) {
            addCriterion("surface_plot_url =", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlNotEqualTo(String value) {
            addCriterion("surface_plot_url <>", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlGreaterThan(String value) {
            addCriterion("surface_plot_url >", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlGreaterThanOrEqualTo(String value) {
            addCriterion("surface_plot_url >=", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlLessThan(String value) {
            addCriterion("surface_plot_url <", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlLessThanOrEqualTo(String value) {
            addCriterion("surface_plot_url <=", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlLike(String value) {
            addCriterion("surface_plot_url like", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlNotLike(String value) {
            addCriterion("surface_plot_url not like", value, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlIn(List<String> values) {
            addCriterion("surface_plot_url in", values, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlNotIn(List<String> values) {
            addCriterion("surface_plot_url not in", values, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlBetween(String value1, String value2) {
            addCriterion("surface_plot_url between", value1, value2, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andSurfacePlotUrlNotBetween(String value1, String value2) {
            addCriterion("surface_plot_url not between", value1, value2, "surfacePlotUrl");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andIsTimerIsNull() {
            addCriterion("is_timer is null");
            return (Criteria) this;
        }

        public Criteria andIsTimerIsNotNull() {
            addCriterion("is_timer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTimerEqualTo(Integer value) {
            addCriterion("is_timer =", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerNotEqualTo(Integer value) {
            addCriterion("is_timer <>", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerGreaterThan(Integer value) {
            addCriterion("is_timer >", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_timer >=", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerLessThan(Integer value) {
            addCriterion("is_timer <", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerLessThanOrEqualTo(Integer value) {
            addCriterion("is_timer <=", value, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerIn(List<Integer> values) {
            addCriterion("is_timer in", values, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerNotIn(List<Integer> values) {
            addCriterion("is_timer not in", values, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerBetween(Integer value1, Integer value2) {
            addCriterion("is_timer between", value1, value2, "isTimer");
            return (Criteria) this;
        }

        public Criteria andIsTimerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_timer not between", value1, value2, "isTimer");
            return (Criteria) this;
        }

        public Criteria andTimerIsNull() {
            addCriterion("timer is null");
            return (Criteria) this;
        }

        public Criteria andTimerIsNotNull() {
            addCriterion("timer is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEqualTo(Date value) {
            addCriterion("timer =", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotEqualTo(Date value) {
            addCriterion("timer <>", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThan(Date value) {
            addCriterion("timer >", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThanOrEqualTo(Date value) {
            addCriterion("timer >=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThan(Date value) {
            addCriterion("timer <", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThanOrEqualTo(Date value) {
            addCriterion("timer <=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerIn(List<Date> values) {
            addCriterion("timer in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotIn(List<Date> values) {
            addCriterion("timer not in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerBetween(Date value1, Date value2) {
            addCriterion("timer between", value1, value2, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotBetween(Date value1, Date value2) {
            addCriterion("timer not between", value1, value2, "timer");
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