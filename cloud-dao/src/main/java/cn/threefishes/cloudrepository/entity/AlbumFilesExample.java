package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumFilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumFilesExample() {
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

        public Criteria andFilesIdIsNull() {
            addCriterion("files_id is null");
            return (Criteria) this;
        }

        public Criteria andFilesIdIsNotNull() {
            addCriterion("files_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilesIdEqualTo(Integer value) {
            addCriterion("files_id =", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotEqualTo(Integer value) {
            addCriterion("files_id <>", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdGreaterThan(Integer value) {
            addCriterion("files_id >", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("files_id >=", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdLessThan(Integer value) {
            addCriterion("files_id <", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdLessThanOrEqualTo(Integer value) {
            addCriterion("files_id <=", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdIn(List<Integer> values) {
            addCriterion("files_id in", values, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotIn(List<Integer> values) {
            addCriterion("files_id not in", values, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdBetween(Integer value1, Integer value2) {
            addCriterion("files_id between", value1, value2, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("files_id not between", value1, value2, "filesId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNull() {
            addCriterion("album_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNotNull() {
            addCriterion("album_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdEqualTo(Integer value) {
            addCriterion("album_id =", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotEqualTo(Integer value) {
            addCriterion("album_id <>", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThan(Integer value) {
            addCriterion("album_id >", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_id >=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThan(Integer value) {
            addCriterion("album_id <", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThanOrEqualTo(Integer value) {
            addCriterion("album_id <=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIn(List<Integer> values) {
            addCriterion("album_id in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotIn(List<Integer> values) {
            addCriterion("album_id not in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdBetween(Integer value1, Integer value2) {
            addCriterion("album_id between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("album_id not between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andFilesHeightIsNull() {
            addCriterion("files_height is null");
            return (Criteria) this;
        }

        public Criteria andFilesHeightIsNotNull() {
            addCriterion("files_height is not null");
            return (Criteria) this;
        }

        public Criteria andFilesHeightEqualTo(Integer value) {
            addCriterion("files_height =", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightNotEqualTo(Integer value) {
            addCriterion("files_height <>", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightGreaterThan(Integer value) {
            addCriterion("files_height >", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("files_height >=", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightLessThan(Integer value) {
            addCriterion("files_height <", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightLessThanOrEqualTo(Integer value) {
            addCriterion("files_height <=", value, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightIn(List<Integer> values) {
            addCriterion("files_height in", values, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightNotIn(List<Integer> values) {
            addCriterion("files_height not in", values, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightBetween(Integer value1, Integer value2) {
            addCriterion("files_height between", value1, value2, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("files_height not between", value1, value2, "filesHeight");
            return (Criteria) this;
        }

        public Criteria andFilesNameIsNull() {
            addCriterion("files_name is null");
            return (Criteria) this;
        }

        public Criteria andFilesNameIsNotNull() {
            addCriterion("files_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilesNameEqualTo(String value) {
            addCriterion("files_name =", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameNotEqualTo(String value) {
            addCriterion("files_name <>", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameGreaterThan(String value) {
            addCriterion("files_name >", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameGreaterThanOrEqualTo(String value) {
            addCriterion("files_name >=", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameLessThan(String value) {
            addCriterion("files_name <", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameLessThanOrEqualTo(String value) {
            addCriterion("files_name <=", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameLike(String value) {
            addCriterion("files_name like", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameNotLike(String value) {
            addCriterion("files_name not like", value, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameIn(List<String> values) {
            addCriterion("files_name in", values, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameNotIn(List<String> values) {
            addCriterion("files_name not in", values, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameBetween(String value1, String value2) {
            addCriterion("files_name between", value1, value2, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesNameNotBetween(String value1, String value2) {
            addCriterion("files_name not between", value1, value2, "filesName");
            return (Criteria) this;
        }

        public Criteria andFilesSizeIsNull() {
            addCriterion("files_size is null");
            return (Criteria) this;
        }

        public Criteria andFilesSizeIsNotNull() {
            addCriterion("files_size is not null");
            return (Criteria) this;
        }

        public Criteria andFilesSizeEqualTo(Long value) {
            addCriterion("files_size =", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeNotEqualTo(Long value) {
            addCriterion("files_size <>", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeGreaterThan(Long value) {
            addCriterion("files_size >", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("files_size >=", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeLessThan(Long value) {
            addCriterion("files_size <", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeLessThanOrEqualTo(Long value) {
            addCriterion("files_size <=", value, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeIn(List<Long> values) {
            addCriterion("files_size in", values, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeNotIn(List<Long> values) {
            addCriterion("files_size not in", values, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeBetween(Long value1, Long value2) {
            addCriterion("files_size between", value1, value2, "filesSize");
            return (Criteria) this;
        }

        public Criteria andFilesSizeNotBetween(Long value1, Long value2) {
            addCriterion("files_size not between", value1, value2, "filesSize");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIsNull() {
            addCriterion("album_type is null");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIsNotNull() {
            addCriterion("album_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeEqualTo(Integer value) {
            addCriterion("album_type =", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotEqualTo(Integer value) {
            addCriterion("album_type <>", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeGreaterThan(Integer value) {
            addCriterion("album_type >", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_type >=", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeLessThan(Integer value) {
            addCriterion("album_type <", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeLessThanOrEqualTo(Integer value) {
            addCriterion("album_type <=", value, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeIn(List<Integer> values) {
            addCriterion("album_type in", values, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotIn(List<Integer> values) {
            addCriterion("album_type not in", values, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeBetween(Integer value1, Integer value2) {
            addCriterion("album_type between", value1, value2, "albumType");
            return (Criteria) this;
        }

        public Criteria andAlbumTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("album_type not between", value1, value2, "albumType");
            return (Criteria) this;
        }

        public Criteria andFilesWidthIsNull() {
            addCriterion("files_width is null");
            return (Criteria) this;
        }

        public Criteria andFilesWidthIsNotNull() {
            addCriterion("files_width is not null");
            return (Criteria) this;
        }

        public Criteria andFilesWidthEqualTo(Integer value) {
            addCriterion("files_width =", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthNotEqualTo(Integer value) {
            addCriterion("files_width <>", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthGreaterThan(Integer value) {
            addCriterion("files_width >", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("files_width >=", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthLessThan(Integer value) {
            addCriterion("files_width <", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthLessThanOrEqualTo(Integer value) {
            addCriterion("files_width <=", value, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthIn(List<Integer> values) {
            addCriterion("files_width in", values, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthNotIn(List<Integer> values) {
            addCriterion("files_width not in", values, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthBetween(Integer value1, Integer value2) {
            addCriterion("files_width between", value1, value2, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andFilesWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("files_width not between", value1, value2, "filesWidth");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNull() {
            addCriterion("original_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNotNull() {
            addCriterion("original_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameEqualTo(String value) {
            addCriterion("original_name =", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotEqualTo(String value) {
            addCriterion("original_name <>", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThan(String value) {
            addCriterion("original_name >", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_name >=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThan(String value) {
            addCriterion("original_name <", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("original_name <=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLike(String value) {
            addCriterion("original_name like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotLike(String value) {
            addCriterion("original_name not like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIn(List<String> values) {
            addCriterion("original_name in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotIn(List<String> values) {
            addCriterion("original_name not in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameBetween(String value1, String value2) {
            addCriterion("original_name between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotBetween(String value1, String value2) {
            addCriterion("original_name not between", value1, value2, "originalName");
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

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
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