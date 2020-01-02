/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 02/01/2020 11:28:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `uID` int(4) NOT NULL AUTO_INCREMENT,
  `uName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPwd` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uSex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPhone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uRegTime` datetime(6) NOT NULL,
  PRIMARY KEY (`uID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Price` decimal(7, 2) UNSIGNED NULL DEFAULT NULL,
  `Num` int(11) NULL DEFAULT 0,
  `Add_time` date NULL DEFAULT NULL,
  `Photo` blob NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `Name`(`Name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (1, '学习用品', '钢笔', 1.00, 1, '2020-01-01', NULL);
INSERT INTO `commodity` VALUES (2, '生活用品', '盆子', 2.00, 3, '2020-01-01', NULL);
INSERT INTO `commodity` VALUES (3, '贴纸', '灌篮高手', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (5, '贴纸', '灌篮高手2', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (6, '贴纸', '灌篮高手23', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (7, '贴纸', '灌篮高手2311', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (9, '贴纸', '灌篮高手23111', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (11, '贴纸', '灌篮高手2311111', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);
INSERT INTO `commodity` VALUES (12, '贴纸', 'appp', 1.00, 1, '2018-12-04', 0x2F50686F746F2F2B66696C654E616D65);

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback`  (
  `f_id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `uName` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `information` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES (00000000001, 'test', '拜托拜托');
INSERT INTO `feedback` VALUES (00000000005, 'test12111', '商品应该介绍更加详细');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `Oid` int(11) NOT NULL,
  `Name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Num` int(11) NULL DEFAULT 0,
  `Price` decimal(7, 2) UNSIGNED NULL DEFAULT NULL,
  `Order_time` datetime(6) NOT NULL,
  `uName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPhone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Oid`) USING BTREE,
  UNIQUE INDEX `Name`(`Name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uID` int(4) NOT NULL AUTO_INCREMENT,
  `uName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uSex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPhone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uRegTime` date NULL DEFAULT NULL,
  PRIMARY KEY (`uID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '12', 'tes112121t', '男', '12312', '2020-01-02');
INSERT INTO `user` VALUES (3, 'test1', 'tes112121t', '男', '12132131', NULL);
INSERT INTO `user` VALUES (5, 'test121', 'test', '男', '12132131', NULL);
INSERT INTO `user` VALUES (6, 'test12111', 'test', '男', '12132131', NULL);
INSERT INTO `user` VALUES (9, 'testhi', 'test', '男', '12132131', NULL);

SET FOREIGN_KEY_CHECKS = 1;
