/*
 Navicat MySQL Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : 192.168.6.56:3306
 Source Schema         : mybatisgenerator

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 02/03/2020 15:02:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_member
-- ----------------------------
DROP TABLE IF EXISTS `db_member`;
CREATE TABLE `db_member`  (
  `m_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `u_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `m_username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `r_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE,
  INDEX `FKl6wp8e0b9oxr4rlgtbc2kt05h`(`r_id`) USING BTREE,
  CONSTRAINT `FKl6wp8e0b9oxr4rlgtbc2kt05h` FOREIGN KEY (`r_id`) REFERENCES `db_role` (`r_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for db_permission
-- ----------------------------
DROP TABLE IF EXISTS `db_permission`;
CREATE TABLE `db_permission`  (
  `p_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `p_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `p_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `p_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for db_role
-- ----------------------------
DROP TABLE IF EXISTS `db_role`;
CREATE TABLE `db_role`  (
  `r_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for db_role_to_permission
-- ----------------------------
DROP TABLE IF EXISTS `db_role_to_permission`;
CREATE TABLE `db_role_to_permission`  (
  `r_id` bigint(20) NOT NULL,
  `p_id` bigint(20) NOT NULL,
  INDEX `FKg40vk3n8ausqy31krinmn8eup`(`p_id`) USING BTREE,
  INDEX `FK84d5uo2dnyao4lsj7kdeksjw2`(`r_id`) USING BTREE,
  CONSTRAINT `FK84d5uo2dnyao4lsj7kdeksjw2` FOREIGN KEY (`r_id`) REFERENCES `db_role` (`r_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKg40vk3n8ausqy31krinmn8eup` FOREIGN KEY (`p_id`) REFERENCES `db_permission` (`p_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
