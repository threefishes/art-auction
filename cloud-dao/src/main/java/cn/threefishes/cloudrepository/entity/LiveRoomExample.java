package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveRoomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomTitleIsNull() {
            addCriterion("room_title is null");
            return (Criteria) this;
        }

        public Criteria andRoomTitleIsNotNull() {
            addCriterion("room_title is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTitleEqualTo(String value) {
            addCriterion("room_title =", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleNotEqualTo(String value) {
            addCriterion("room_title <>", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleGreaterThan(String value) {
            addCriterion("room_title >", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleGreaterThanOrEqualTo(String value) {
            addCriterion("room_title >=", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleLessThan(String value) {
            addCriterion("room_title <", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleLessThanOrEqualTo(String value) {
            addCriterion("room_title <=", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleLike(String value) {
            addCriterion("room_title like", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleNotLike(String value) {
            addCriterion("room_title not like", value, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleIn(List<String> values) {
            addCriterion("room_title in", values, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleNotIn(List<String> values) {
            addCriterion("room_title not in", values, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleBetween(String value1, String value2) {
            addCriterion("room_title between", value1, value2, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomTitleNotBetween(String value1, String value2) {
            addCriterion("room_title not between", value1, value2, "roomTitle");
            return (Criteria) this;
        }

        public Criteria andRoomDescIsNull() {
            addCriterion("room_desc is null");
            return (Criteria) this;
        }

        public Criteria andRoomDescIsNotNull() {
            addCriterion("room_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDescEqualTo(String value) {
            addCriterion("room_desc =", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotEqualTo(String value) {
            addCriterion("room_desc <>", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescGreaterThan(String value) {
            addCriterion("room_desc >", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescGreaterThanOrEqualTo(String value) {
            addCriterion("room_desc >=", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLessThan(String value) {
            addCriterion("room_desc <", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLessThanOrEqualTo(String value) {
            addCriterion("room_desc <=", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLike(String value) {
            addCriterion("room_desc like", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotLike(String value) {
            addCriterion("room_desc not like", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescIn(List<String> values) {
            addCriterion("room_desc in", values, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotIn(List<String> values) {
            addCriterion("room_desc not in", values, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescBetween(String value1, String value2) {
            addCriterion("room_desc between", value1, value2, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotBetween(String value1, String value2) {
            addCriterion("room_desc not between", value1, value2, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andLiveImageIsNull() {
            addCriterion("live_image is null");
            return (Criteria) this;
        }

        public Criteria andLiveImageIsNotNull() {
            addCriterion("live_image is not null");
            return (Criteria) this;
        }

        public Criteria andLiveImageEqualTo(String value) {
            addCriterion("live_image =", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageNotEqualTo(String value) {
            addCriterion("live_image <>", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageGreaterThan(String value) {
            addCriterion("live_image >", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageGreaterThanOrEqualTo(String value) {
            addCriterion("live_image >=", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageLessThan(String value) {
            addCriterion("live_image <", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageLessThanOrEqualTo(String value) {
            addCriterion("live_image <=", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageLike(String value) {
            addCriterion("live_image like", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageNotLike(String value) {
            addCriterion("live_image not like", value, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageIn(List<String> values) {
            addCriterion("live_image in", values, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageNotIn(List<String> values) {
            addCriterion("live_image not in", values, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageBetween(String value1, String value2) {
            addCriterion("live_image between", value1, value2, "liveImage");
            return (Criteria) this;
        }

        public Criteria andLiveImageNotBetween(String value1, String value2) {
            addCriterion("live_image not between", value1, value2, "liveImage");
            return (Criteria) this;
        }

        public Criteria andChatroomIdIsNull() {
            addCriterion("chatroom_id is null");
            return (Criteria) this;
        }

        public Criteria andChatroomIdIsNotNull() {
            addCriterion("chatroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatroomIdEqualTo(String value) {
            addCriterion("chatroom_id =", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdNotEqualTo(String value) {
            addCriterion("chatroom_id <>", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdGreaterThan(String value) {
            addCriterion("chatroom_id >", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdGreaterThanOrEqualTo(String value) {
            addCriterion("chatroom_id >=", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdLessThan(String value) {
            addCriterion("chatroom_id <", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdLessThanOrEqualTo(String value) {
            addCriterion("chatroom_id <=", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdLike(String value) {
            addCriterion("chatroom_id like", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdNotLike(String value) {
            addCriterion("chatroom_id not like", value, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdIn(List<String> values) {
            addCriterion("chatroom_id in", values, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdNotIn(List<String> values) {
            addCriterion("chatroom_id not in", values, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdBetween(String value1, String value2) {
            addCriterion("chatroom_id between", value1, value2, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andChatroomIdNotBetween(String value1, String value2) {
            addCriterion("chatroom_id not between", value1, value2, "chatroomId");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNull() {
            addCriterion("push_url is null");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNotNull() {
            addCriterion("push_url is not null");
            return (Criteria) this;
        }

        public Criteria andPushUrlEqualTo(String value) {
            addCriterion("push_url =", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotEqualTo(String value) {
            addCriterion("push_url <>", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThan(String value) {
            addCriterion("push_url >", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThanOrEqualTo(String value) {
            addCriterion("push_url >=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThan(String value) {
            addCriterion("push_url <", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThanOrEqualTo(String value) {
            addCriterion("push_url <=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLike(String value) {
            addCriterion("push_url like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotLike(String value) {
            addCriterion("push_url not like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlIn(List<String> values) {
            addCriterion("push_url in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotIn(List<String> values) {
            addCriterion("push_url not in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlBetween(String value1, String value2) {
            addCriterion("push_url between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotBetween(String value1, String value2) {
            addCriterion("push_url not between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlIsNull() {
            addCriterion("pull_url is null");
            return (Criteria) this;
        }

        public Criteria andPullUrlIsNotNull() {
            addCriterion("pull_url is not null");
            return (Criteria) this;
        }

        public Criteria andPullUrlEqualTo(String value) {
            addCriterion("pull_url =", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlNotEqualTo(String value) {
            addCriterion("pull_url <>", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlGreaterThan(String value) {
            addCriterion("pull_url >", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pull_url >=", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlLessThan(String value) {
            addCriterion("pull_url <", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlLessThanOrEqualTo(String value) {
            addCriterion("pull_url <=", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlLike(String value) {
            addCriterion("pull_url like", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlNotLike(String value) {
            addCriterion("pull_url not like", value, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlIn(List<String> values) {
            addCriterion("pull_url in", values, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlNotIn(List<String> values) {
            addCriterion("pull_url not in", values, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlBetween(String value1, String value2) {
            addCriterion("pull_url between", value1, value2, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrlNotBetween(String value1, String value2) {
            addCriterion("pull_url not between", value1, value2, "pullUrl");
            return (Criteria) this;
        }

        public Criteria andPullUrl2IsNull() {
            addCriterion("pull_url2 is null");
            return (Criteria) this;
        }

        public Criteria andPullUrl2IsNotNull() {
            addCriterion("pull_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andPullUrl2EqualTo(String value) {
            addCriterion("pull_url2 =", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2NotEqualTo(String value) {
            addCriterion("pull_url2 <>", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2GreaterThan(String value) {
            addCriterion("pull_url2 >", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("pull_url2 >=", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2LessThan(String value) {
            addCriterion("pull_url2 <", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2LessThanOrEqualTo(String value) {
            addCriterion("pull_url2 <=", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2Like(String value) {
            addCriterion("pull_url2 like", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2NotLike(String value) {
            addCriterion("pull_url2 not like", value, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2In(List<String> values) {
            addCriterion("pull_url2 in", values, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2NotIn(List<String> values) {
            addCriterion("pull_url2 not in", values, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2Between(String value1, String value2) {
            addCriterion("pull_url2 between", value1, value2, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullUrl2NotBetween(String value1, String value2) {
            addCriterion("pull_url2 not between", value1, value2, "pullUrl2");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlIsNull() {
            addCriterion("pull_rtmp_url is null");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlIsNotNull() {
            addCriterion("pull_rtmp_url is not null");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlEqualTo(String value) {
            addCriterion("pull_rtmp_url =", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlNotEqualTo(String value) {
            addCriterion("pull_rtmp_url <>", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlGreaterThan(String value) {
            addCriterion("pull_rtmp_url >", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pull_rtmp_url >=", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlLessThan(String value) {
            addCriterion("pull_rtmp_url <", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlLessThanOrEqualTo(String value) {
            addCriterion("pull_rtmp_url <=", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlLike(String value) {
            addCriterion("pull_rtmp_url like", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlNotLike(String value) {
            addCriterion("pull_rtmp_url not like", value, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlIn(List<String> values) {
            addCriterion("pull_rtmp_url in", values, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlNotIn(List<String> values) {
            addCriterion("pull_rtmp_url not in", values, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlBetween(String value1, String value2) {
            addCriterion("pull_rtmp_url between", value1, value2, "pullRtmpUrl");
            return (Criteria) this;
        }

        public Criteria andPullRtmpUrlNotBetween(String value1, String value2) {
            addCriterion("pull_rtmp_url not between", value1, value2, "pullRtmpUrl");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLiveTypeIsNull() {
            addCriterion("live_type is null");
            return (Criteria) this;
        }

        public Criteria andLiveTypeIsNotNull() {
            addCriterion("live_type is not null");
            return (Criteria) this;
        }

        public Criteria andLiveTypeEqualTo(Byte value) {
            addCriterion("live_type =", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeNotEqualTo(Byte value) {
            addCriterion("live_type <>", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeGreaterThan(Byte value) {
            addCriterion("live_type >", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("live_type >=", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeLessThan(Byte value) {
            addCriterion("live_type <", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeLessThanOrEqualTo(Byte value) {
            addCriterion("live_type <=", value, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeIn(List<Byte> values) {
            addCriterion("live_type in", values, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeNotIn(List<Byte> values) {
            addCriterion("live_type not in", values, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeBetween(Byte value1, Byte value2) {
            addCriterion("live_type between", value1, value2, "liveType");
            return (Criteria) this;
        }

        public Criteria andLiveTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("live_type not between", value1, value2, "liveType");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andWatchNumIsNull() {
            addCriterion("watch_num is null");
            return (Criteria) this;
        }

        public Criteria andWatchNumIsNotNull() {
            addCriterion("watch_num is not null");
            return (Criteria) this;
        }

        public Criteria andWatchNumEqualTo(Integer value) {
            addCriterion("watch_num =", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotEqualTo(Integer value) {
            addCriterion("watch_num <>", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumGreaterThan(Integer value) {
            addCriterion("watch_num >", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("watch_num >=", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumLessThan(Integer value) {
            addCriterion("watch_num <", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumLessThanOrEqualTo(Integer value) {
            addCriterion("watch_num <=", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumIn(List<Integer> values) {
            addCriterion("watch_num in", values, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotIn(List<Integer> values) {
            addCriterion("watch_num not in", values, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumBetween(Integer value1, Integer value2) {
            addCriterion("watch_num between", value1, value2, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("watch_num not between", value1, value2, "watchNum");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusIsNull() {
            addCriterion("chatroom_status is null");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusIsNotNull() {
            addCriterion("chatroom_status is not null");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusEqualTo(Integer value) {
            addCriterion("chatroom_status =", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusNotEqualTo(Integer value) {
            addCriterion("chatroom_status <>", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusGreaterThan(Integer value) {
            addCriterion("chatroom_status >", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("chatroom_status >=", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusLessThan(Integer value) {
            addCriterion("chatroom_status <", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusLessThanOrEqualTo(Integer value) {
            addCriterion("chatroom_status <=", value, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusIn(List<Integer> values) {
            addCriterion("chatroom_status in", values, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusNotIn(List<Integer> values) {
            addCriterion("chatroom_status not in", values, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusBetween(Integer value1, Integer value2) {
            addCriterion("chatroom_status between", value1, value2, "chatroomStatus");
            return (Criteria) this;
        }

        public Criteria andChatroomStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("chatroom_status not between", value1, value2, "chatroomStatus");
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