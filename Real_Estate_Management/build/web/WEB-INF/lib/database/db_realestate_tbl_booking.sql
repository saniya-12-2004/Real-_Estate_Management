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
-- Table structure for table `tbl_booking`
--

DROP TABLE IF EXISTS `tbl_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_booking` (
  `pid` int(9) NOT NULL AUTO_INCREMENT,
  `property_name` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `owner_name` varchar(50) DEFAULT NULL,
  `owner_contact` varchar(45) DEFAULT NULL,
  `owner_address` varchar(200) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `documentation` varchar(50) DEFAULT NULL,
  `vid` varchar(45) DEFAULT NULL,
  `uid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_booking`
--

LOCK TABLES `tbl_booking` WRITE;
/*!40000 ALTER TABLE `tbl_booking` DISABLE KEYS */;
INSERT INTO `tbl_booking` VALUES (1,'Elite Office Spaces','Looking to purchase Elite Company office space,a 1000a sqft.','Commercial','Mumbai',5000000,'Priyanka Kesarkar','9921904883','123,Elite Building\r\nMain Street,Near City Center Mumbai,Maharashtra 400001','2025-02-25','Image/Vihaan.pdf',NULL,NULL),(2,'Dream Home','Looking to purchase my Dream Home, a 3BHK luxury apartmentain Gadhinglaj.','Residential','Gadhinglaj',800000,'Saniya Mulik','8767653587','Kadgav Road, Sambhaji Nagar,Gadhinglaj','2025-02-25','Image/Personal Details.pdf',NULL,NULL),(3,'Rahul Industries','Looking to purchase a warehouse for storage and logistics purposes, seeking a secure and accessible  location.','Industrial','Mumbai',50000000,'Rahul Sharma','9821012345','Plot No. 123, Industrial Estate, Mumbai - 400093','2025-02-26','Image/Saisha.pdf',NULL,NULL),(4,'Sunshine Room','Booking sunshine room for ownership.','Residential','New Delhi',9000000,'Priya Gupta','9876543210','789, Sector 9, Dwarka, New Delhi 110075','2025-02-26','Image/Rajesh patl.pdf',NULL,NULL),(5,'Green Valley Estate','I am interested in booking a residential plot in Gurugram,Haryana.','Land','Gurugram',500000,'Karan singh','9812345678','122, Industrial Area, Sector 4,\r Gurugram, Haryana 122001','2025-02-26','Image/Aaru.pdf',NULL,NULL);
/*!40000 ALTER TABLE `tbl_booking` ENABLE KEYS */;
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
