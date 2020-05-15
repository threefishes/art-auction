#database art_auction

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `art_auction`
-- ----------------------------
DROP TABLE IF EXISTS `art_auction`;
CREATE TABLE `art_auction` (
	  `auction_id` int(11) NOT NULL AUTO_INCREMENT,
	  `product_id` int(11) NOT NULL COMMENT '商品ID',
	  `product_name` varchar(128) not null COMMENT '商品名称',
	  `init_price` decimal(19,2) not null COMMENT '起拍价',
	  `add_price` decimal(19,2) not null COMMENT '加价',
	  `auction_json` longtext NOT NULL COMMENT '文字项目描述',
	  `auction_desc` longtext NOT NULL COMMENT '文字和图片描述',
	  `auction_state` smallint(1) DEFAULT NULL COMMENT '商品拍卖状态 0-上拍，1-下拍',
	  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
	  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
	  `auction_type` int(11) DEFAULT NULL COMMENT '拍卖类型 0-加价拍，1-降价拍，2-一口价',
	  `create_time` datetime DEFAULT NULL,
	  `update_time` datetime DEFAULT NULL,
	  PRIMARY KEY (`auction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


