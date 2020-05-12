package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertorialArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertorialArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
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

        public Criteria andAuthorAvatarIsNull() {
            addCriterion("author_avatar is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarIsNotNull() {
            addCriterion("author_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarEqualTo(String value) {
            addCriterion("author_avatar =", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotEqualTo(String value) {
            addCriterion("author_avatar <>", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarGreaterThan(String value) {
            addCriterion("author_avatar >", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("author_avatar >=", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLessThan(String value) {
            addCriterion("author_avatar <", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLessThanOrEqualTo(String value) {
            addCriterion("author_avatar <=", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarLike(String value) {
            addCriterion("author_avatar like", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotLike(String value) {
            addCriterion("author_avatar not like", value, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarIn(List<String> values) {
            addCriterion("author_avatar in", values, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotIn(List<String> values) {
            addCriterion("author_avatar not in", values, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarBetween(String value1, String value2) {
            addCriterion("author_avatar between", value1, value2, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorAvatarNotBetween(String value1, String value2) {
            addCriterion("author_avatar not between", value1, value2, "authorAvatar");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andBannerImageIsNull() {
            addCriterion("banner_image is null");
            return (Criteria) this;
        }

        public Criteria andBannerImageIsNotNull() {
            addCriterion("banner_image is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImageEqualTo(String value) {
            addCriterion("banner_image =", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageNotEqualTo(String value) {
            addCriterion("banner_image <>", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageGreaterThan(String value) {
            addCriterion("banner_image >", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageGreaterThanOrEqualTo(String value) {
            addCriterion("banner_image >=", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageLessThan(String value) {
            addCriterion("banner_image <", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageLessThanOrEqualTo(String value) {
            addCriterion("banner_image <=", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageLike(String value) {
            addCriterion("banner_image like", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageNotLike(String value) {
            addCriterion("banner_image not like", value, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageIn(List<String> values) {
            addCriterion("banner_image in", values, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageNotIn(List<String> values) {
            addCriterion("banner_image not in", values, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageBetween(String value1, String value2) {
            addCriterion("banner_image between", value1, value2, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageNotBetween(String value1, String value2) {
            addCriterion("banner_image not between", value1, value2, "bannerImage");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthIsNull() {
            addCriterion("banner_image_width is null");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthIsNotNull() {
            addCriterion("banner_image_width is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthEqualTo(Integer value) {
            addCriterion("banner_image_width =", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthNotEqualTo(Integer value) {
            addCriterion("banner_image_width <>", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthGreaterThan(Integer value) {
            addCriterion("banner_image_width >", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_image_width >=", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthLessThan(Integer value) {
            addCriterion("banner_image_width <", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthLessThanOrEqualTo(Integer value) {
            addCriterion("banner_image_width <=", value, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthIn(List<Integer> values) {
            addCriterion("banner_image_width in", values, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthNotIn(List<Integer> values) {
            addCriterion("banner_image_width not in", values, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthBetween(Integer value1, Integer value2) {
            addCriterion("banner_image_width between", value1, value2, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_image_width not between", value1, value2, "bannerImageWidth");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightIsNull() {
            addCriterion("banner_image_height is null");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightIsNotNull() {
            addCriterion("banner_image_height is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightEqualTo(Integer value) {
            addCriterion("banner_image_height =", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightNotEqualTo(Integer value) {
            addCriterion("banner_image_height <>", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightGreaterThan(Integer value) {
            addCriterion("banner_image_height >", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_image_height >=", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightLessThan(Integer value) {
            addCriterion("banner_image_height <", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightLessThanOrEqualTo(Integer value) {
            addCriterion("banner_image_height <=", value, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightIn(List<Integer> values) {
            addCriterion("banner_image_height in", values, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightNotIn(List<Integer> values) {
            addCriterion("banner_image_height not in", values, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightBetween(Integer value1, Integer value2) {
            addCriterion("banner_image_height between", value1, value2, "bannerImageHeight");
            return (Criteria) this;
        }

        public Criteria andBannerImageHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_image_height not between", value1, value2, "bannerImageHeight");
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

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIsNull() {
            addCriterion("enter_detail_page_view is null");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIsNotNull() {
            addCriterion("enter_detail_page_view is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewEqualTo(Integer value) {
            addCriterion("enter_detail_page_view =", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotEqualTo(Integer value) {
            addCriterion("enter_detail_page_view <>", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewGreaterThan(Integer value) {
            addCriterion("enter_detail_page_view >", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_detail_page_view >=", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewLessThan(Integer value) {
            addCriterion("enter_detail_page_view <", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("enter_detail_page_view <=", value, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewIn(List<Integer> values) {
            addCriterion("enter_detail_page_view in", values, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotIn(List<Integer> values) {
            addCriterion("enter_detail_page_view not in", values, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewBetween(Integer value1, Integer value2) {
            addCriterion("enter_detail_page_view between", value1, value2, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andEnterDetailPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_detail_page_view not between", value1, value2, "enterDetailPageView");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNull() {
            addCriterion("follow_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNotNull() {
            addCriterion("follow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowNumEqualTo(Integer value) {
            addCriterion("follow_num =", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotEqualTo(Integer value) {
            addCriterion("follow_num <>", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThan(Integer value) {
            addCriterion("follow_num >", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_num >=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThan(Integer value) {
            addCriterion("follow_num <", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_num <=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIn(List<Integer> values) {
            addCriterion("follow_num in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotIn(List<Integer> values) {
            addCriterion("follow_num not in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_num between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_num not between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNull() {
            addCriterion("good_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNotNull() {
            addCriterion("good_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCountEqualTo(Integer value) {
            addCriterion("good_count =", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotEqualTo(Integer value) {
            addCriterion("good_count <>", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThan(Integer value) {
            addCriterion("good_count >", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_count >=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThan(Integer value) {
            addCriterion("good_count <", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("good_count <=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountIn(List<Integer> values) {
            addCriterion("good_count in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotIn(List<Integer> values) {
            addCriterion("good_count not in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("good_count between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("good_count not between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andLinkNumIsNull() {
            addCriterion("link_num is null");
            return (Criteria) this;
        }

        public Criteria andLinkNumIsNotNull() {
            addCriterion("link_num is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNumEqualTo(Integer value) {
            addCriterion("link_num =", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotEqualTo(Integer value) {
            addCriterion("link_num <>", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumGreaterThan(Integer value) {
            addCriterion("link_num >", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_num >=", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumLessThan(Integer value) {
            addCriterion("link_num <", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumLessThanOrEqualTo(Integer value) {
            addCriterion("link_num <=", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumIn(List<Integer> values) {
            addCriterion("link_num in", values, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotIn(List<Integer> values) {
            addCriterion("link_num not in", values, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumBetween(Integer value1, Integer value2) {
            addCriterion("link_num between", value1, value2, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("link_num not between", value1, value2, "linkNum");
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

        public Criteria andPageViewIsNull() {
            addCriterion("page_view is null");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNotNull() {
            addCriterion("page_view is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewEqualTo(Integer value) {
            addCriterion("page_view =", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotEqualTo(Integer value) {
            addCriterion("page_view <>", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThan(Integer value) {
            addCriterion("page_view >", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_view >=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThan(Integer value) {
            addCriterion("page_view <", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("page_view <=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewIn(List<Integer> values) {
            addCriterion("page_view in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotIn(List<Integer> values) {
            addCriterion("page_view not in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewBetween(Integer value1, Integer value2) {
            addCriterion("page_view between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("page_view not between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Integer value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Integer value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Integer value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Integer value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Integer> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Integer> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Integer value1, Integer value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andShareNumIsNull() {
            addCriterion("share_num is null");
            return (Criteria) this;
        }

        public Criteria andShareNumIsNotNull() {
            addCriterion("share_num is not null");
            return (Criteria) this;
        }

        public Criteria andShareNumEqualTo(Integer value) {
            addCriterion("share_num =", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotEqualTo(Integer value) {
            addCriterion("share_num <>", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThan(Integer value) {
            addCriterion("share_num >", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_num >=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThan(Integer value) {
            addCriterion("share_num <", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThanOrEqualTo(Integer value) {
            addCriterion("share_num <=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumIn(List<Integer> values) {
            addCriterion("share_num in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotIn(List<Integer> values) {
            addCriterion("share_num not in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumBetween(Integer value1, Integer value2) {
            addCriterion("share_num between", value1, value2, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotBetween(Integer value1, Integer value2) {
            addCriterion("share_num not between", value1, value2, "shareNum");
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

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoImageIsNull() {
            addCriterion("video_image is null");
            return (Criteria) this;
        }

        public Criteria andVideoImageIsNotNull() {
            addCriterion("video_image is not null");
            return (Criteria) this;
        }

        public Criteria andVideoImageEqualTo(String value) {
            addCriterion("video_image =", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotEqualTo(String value) {
            addCriterion("video_image <>", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageGreaterThan(String value) {
            addCriterion("video_image >", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageGreaterThanOrEqualTo(String value) {
            addCriterion("video_image >=", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLessThan(String value) {
            addCriterion("video_image <", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLessThanOrEqualTo(String value) {
            addCriterion("video_image <=", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLike(String value) {
            addCriterion("video_image like", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotLike(String value) {
            addCriterion("video_image not like", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageIn(List<String> values) {
            addCriterion("video_image in", values, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotIn(List<String> values) {
            addCriterion("video_image not in", values, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageBetween(String value1, String value2) {
            addCriterion("video_image between", value1, value2, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotBetween(String value1, String value2) {
            addCriterion("video_image not between", value1, value2, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdIsNull() {
            addCriterion("vod_files_id is null");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdIsNotNull() {
            addCriterion("vod_files_id is not null");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdEqualTo(String value) {
            addCriterion("vod_files_id =", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdNotEqualTo(String value) {
            addCriterion("vod_files_id <>", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdGreaterThan(String value) {
            addCriterion("vod_files_id >", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdGreaterThanOrEqualTo(String value) {
            addCriterion("vod_files_id >=", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdLessThan(String value) {
            addCriterion("vod_files_id <", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdLessThanOrEqualTo(String value) {
            addCriterion("vod_files_id <=", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdLike(String value) {
            addCriterion("vod_files_id like", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdNotLike(String value) {
            addCriterion("vod_files_id not like", value, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdIn(List<String> values) {
            addCriterion("vod_files_id in", values, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdNotIn(List<String> values) {
            addCriterion("vod_files_id not in", values, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdBetween(String value1, String value2) {
            addCriterion("vod_files_id between", value1, value2, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andVodFilesIdNotBetween(String value1, String value2) {
            addCriterion("vod_files_id not between", value1, value2, "vodFilesId");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIsNull() {
            addCriterion("flag_type is null");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIsNotNull() {
            addCriterion("flag_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlagTypeEqualTo(Integer value) {
            addCriterion("flag_type =", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotEqualTo(Integer value) {
            addCriterion("flag_type <>", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeGreaterThan(Integer value) {
            addCriterion("flag_type >", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_type >=", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeLessThan(Integer value) {
            addCriterion("flag_type <", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeLessThanOrEqualTo(Integer value) {
            addCriterion("flag_type <=", value, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeIn(List<Integer> values) {
            addCriterion("flag_type in", values, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotIn(List<Integer> values) {
            addCriterion("flag_type not in", values, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeBetween(Integer value1, Integer value2) {
            addCriterion("flag_type between", value1, value2, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_type not between", value1, value2, "flagType");
            return (Criteria) this;
        }

        public Criteria andFlagIdIsNull() {
            addCriterion("flag_id is null");
            return (Criteria) this;
        }

        public Criteria andFlagIdIsNotNull() {
            addCriterion("flag_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlagIdEqualTo(Integer value) {
            addCriterion("flag_id =", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotEqualTo(Integer value) {
            addCriterion("flag_id <>", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThan(Integer value) {
            addCriterion("flag_id >", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_id >=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThan(Integer value) {
            addCriterion("flag_id <", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThanOrEqualTo(Integer value) {
            addCriterion("flag_id <=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdIn(List<Integer> values) {
            addCriterion("flag_id in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotIn(List<Integer> values) {
            addCriterion("flag_id not in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdBetween(Integer value1, Integer value2) {
            addCriterion("flag_id between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_id not between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNull() {
            addCriterion("flag_name is null");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNotNull() {
            addCriterion("flag_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlagNameEqualTo(String value) {
            addCriterion("flag_name =", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotEqualTo(String value) {
            addCriterion("flag_name <>", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThan(String value) {
            addCriterion("flag_name >", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThanOrEqualTo(String value) {
            addCriterion("flag_name >=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThan(String value) {
            addCriterion("flag_name <", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThanOrEqualTo(String value) {
            addCriterion("flag_name <=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLike(String value) {
            addCriterion("flag_name like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotLike(String value) {
            addCriterion("flag_name not like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameIn(List<String> values) {
            addCriterion("flag_name in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotIn(List<String> values) {
            addCriterion("flag_name not in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameBetween(String value1, String value2) {
            addCriterion("flag_name between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotBetween(String value1, String value2) {
            addCriterion("flag_name not between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNull() {
            addCriterion("download_num is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNotNull() {
            addCriterion("download_num is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumEqualTo(Integer value) {
            addCriterion("download_num =", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotEqualTo(Integer value) {
            addCriterion("download_num <>", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThan(Integer value) {
            addCriterion("download_num >", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_num >=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThan(Integer value) {
            addCriterion("download_num <", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("download_num <=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIn(List<Integer> values) {
            addCriterion("download_num in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotIn(List<Integer> values) {
            addCriterion("download_num not in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumBetween(Integer value1, Integer value2) {
            addCriterion("download_num between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("download_num not between", value1, value2, "downloadNum");
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