/*
 Navicat Premium Data Transfer

 Source Server         : mac本地
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : db03

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 11/10/2020 10:39:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `dname` varchar(255) DEFAULT NULL COMMENT '部门名字',
  `db_source` varchar(255) DEFAULT NULL COMMENT '数据库名字',
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '开发部', 'db03');
INSERT INTO `dept` VALUES (2, '人事部', 'db03');
INSERT INTO `dept` VALUES (3, '财务部', 'db03');
INSERT INTO `dept` VALUES (4, '市场部', 'db03');
INSERT INTO `dept` VALUES (5, '运维部', 'db03');
INSERT INTO `dept` VALUES (6, '游戏部', 'db03');
INSERT INTO `dept` VALUES (7, '培训部', 'db03');
INSERT INTO `dept` VALUES (8, '安保部', 'db03');
INSERT INTO `dept` VALUES (9, '测试部', 'db03');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
