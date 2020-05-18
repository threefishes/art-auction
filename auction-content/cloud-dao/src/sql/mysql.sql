#database art_auction

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
	`article_id` int(11) NOT NULL AUTO_INCREMENT,
	`article_type` int(11) DEFAULT NULL COMMENT '文章类型 0-普通文章，1-帮助中心，2-专题',
	`allow_delete` int(11) DEFAULT NULL COMMENT '是否可以删除，帮助中心的文章是不能删除的',
  	`category_id` SMALLINT NOT NULL COMMENT '文章分类',
  	`content` longtext COMMENT COMMENT '文章内容', 
	`sort` int(11) DEFAULT NULL COMMENT '排序 数字越小越靠前',
    `title` varchar(30) DEFAULT NULL COMMENT '标题',
    `url` varchar(255) DEFAULT NULL COMMENT '文章地址',
	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`update_time` datetime DEFAULT NULL COMMENT '修改时间',
	PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- ----------------------------
--  Table structure for `article_category`
-- ----------------------------
DROP TABLE IF EXISTS `article_category`;
CREATE TABLE `article_category` (
  `category_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `position_id` int(11) DEFAULT NULL,
  `sort` SMALLINT DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `article_position`
-- ----------------------------
DROP TABLE IF EXISTS `article_position`;
CREATE TABLE `article_position` (
  `position_id` int(11) NOT NULL AUTO_INCREMENT,
  `allow_add_category` int(11) DEFAULT NULL,
  `position_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
