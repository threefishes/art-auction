package cn.threefishes.cloudrepository.dao.auction;

import cn.threefishes.cloudrepository.entity.auction.ArtAuction;
import cn.threefishes.cloudrepository.entity.auction.ArtAuctionExample;
import cn.threefishes.cloudrepository.entity.auction.ArtAuctionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArtAuctionMapper {
    long countByExample(ArtAuctionExample example);

    int deleteByExample(ArtAuctionExample example);

    int deleteByPrimaryKey(Integer auctionId);

    int insert(ArtAuctionWithBLOBs record);

    int insertSelective(ArtAuctionWithBLOBs record);

    List<ArtAuctionWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ArtAuctionExample example, RowBounds rowBounds);

    List<ArtAuctionWithBLOBs> selectByExampleWithBLOBs(ArtAuctionExample example);

    List<ArtAuction> selectByExampleWithRowbounds(ArtAuctionExample example, RowBounds rowBounds);

    List<ArtAuction> selectByExample(ArtAuctionExample example);

    ArtAuctionWithBLOBs selectByPrimaryKey(Integer auctionId);

    int updateByExampleSelective(@Param("record") ArtAuctionWithBLOBs record, @Param("example") ArtAuctionExample example);

    int updateByExampleWithBLOBs(@Param("record") ArtAuctionWithBLOBs record, @Param("example") ArtAuctionExample example);

    int updateByExample(@Param("record") ArtAuction record, @Param("example") ArtAuctionExample example);

    int updateByPrimaryKeySelective(ArtAuctionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArtAuctionWithBLOBs record);

    int updateByPrimaryKey(ArtAuction record);
}