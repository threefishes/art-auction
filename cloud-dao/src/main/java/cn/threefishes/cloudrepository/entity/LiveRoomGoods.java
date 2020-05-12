package cn.threefishes.cloudrepository.entity;

public class LiveRoomGoods {
    private Integer id;

    private Integer liveRoomId;

    private Integer commonId;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLiveRoomId() {
        return liveRoomId;
    }

    public void setLiveRoomId(Integer liveRoomId) {
        this.liveRoomId = liveRoomId;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}