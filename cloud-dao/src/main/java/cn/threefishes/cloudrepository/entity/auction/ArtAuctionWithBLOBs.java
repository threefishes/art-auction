package cn.threefishes.cloudrepository.entity.auction;

public class ArtAuctionWithBLOBs extends ArtAuction {
    private String auctionJson;

    private String auctionDesc;

    public String getAuctionJson() {
        return auctionJson;
    }

    public void setAuctionJson(String auctionJson) {
        this.auctionJson = auctionJson == null ? null : auctionJson.trim();
    }

    public String getAuctionDesc() {
        return auctionDesc;
    }

    public void setAuctionDesc(String auctionDesc) {
        this.auctionDesc = auctionDesc == null ? null : auctionDesc.trim();
    }
}