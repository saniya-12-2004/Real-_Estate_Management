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
-- Table structure for table `tbl_vendor_signup`
--

DROP TABLE IF EXISTS `tbl_vendor_signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_vendor_signup` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `passwd` varchar(10) DEFAULT NULL,
  `cpasswd` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `contact` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendor_signup`
--

LOCK TABLES `tbl_vendor_signup` WRITE;
/*!40000 ALTER TABLE `tbl_vendor_signup` DISABLE KEYS */;
INSERT INTO `tbl_vendor_signup` VALUES (2,'Priyanka Kesarkar','priyanka@gmail.com','piyu','piyu','Female','123,Elite Building\r\nMain Street,Near City Center Mumbai,Maharashtra 400001','Mumbai',9921904883),(3,'Rhaul Sharma','rahul.sharma@rohanindustries.com','R@hul123$','R@hul123$','Male',' Plot No. 123, Industrial Estate, Mumbai - 400093\r\n','Mumbai',9821012345),(4,'Karan singh','karansingh123@email.com','karan@67','karan@67','Male',' 122, Industrial Area, Sector 4,\r Gurugram,Haryana 122001','Gurugram',9812345678),(5,'Priya Gupta','priya.gupta@email.com','Priya@789','Priya@789','Female','789, Sector 9, Dwarka, New Delhi 110075\r\n','New Delhi',9876543210),(7,'Saniya Mulik','muliksaniya6@gmail.com','sanu','sanu','Female','Kadgav Road, Sambhaji Nagar,\r\nGadhinglaj','Gadhinglaj',8767653587);
/*!40000 ALTER TABLE `tbl_vendor_signup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-22 12:18:53
