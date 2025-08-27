-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: db_realestate
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_user_signup`
--

DROP TABLE IF EXISTS `tbl_user_signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user_signup` (
  `uid` int(9) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `passwd` varchar(10) DEFAULT NULL,
  `cpasswd` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `contact` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user_signup`
--

LOCK TABLES `tbl_user_signup` WRITE;
/*!40000 ALTER TABLE `tbl_user_signup` DISABLE KEYS */;
INSERT INTO `tbl_user_signup` VALUES (1,'Vihaan Jain','vihaan.jain@gmail.com','vih123','vih123','Male',' 123, Koregaon Park, Pune','Pune',9456789012),(2,'Rupali Sen','senrupali@34gmail.com','ru','ru','Female','1234, Rajarampuri, Near Rankala Lake, Kolhapur - 416008, Maharashtra.\r\n\r\n','Kolhapur',9321456789),(3,'Saisha Gupta','saisha.gupta@gmail.com','sai@78$sha','sai@78$sha','Female','202, Main Street, Lucknow, India - 226001\r\n','Lucknow',9011927306),(4,'Rajesh Patil','patilrajesh@gmail.com','raju67','raju67','Male','Ganesh Nagar,near bus stand,Ajara,Dist.Kolhapur,Maharashtra 416505','Aajara',7483998470),(5,'Aarya Mulik','aaryamulik@gmail.com','aru22','aru22','Female','Desai Hospital,Main Road,Gadhinglaj,416502','Gadhinglaj',9130369490),(8,'aaaaaa bbbbb','abcd1234@gmail.com','1234','1234','Female','fdwfdwfe444','dfdf',7846664666);
/*!40000 ALTER TABLE `tbl_user_signup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-22 12:18:52
