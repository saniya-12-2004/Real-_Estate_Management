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
-- Table structure for table `tbl_add_property`
--

DROP TABLE IF EXISTS `tbl_add_property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_add_property` (
  `pid` int(9) NOT NULL AUTO_INCREMENT,
  `property_name` varchar(50) DEFAULT NULL,
  `property_image` varchar(45) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `pstatus` varchar(50) DEFAULT NULL,
  `age` int(9) DEFAULT NULL,
  `owner_name` varchar(50) DEFAULT NULL,
  `owner_contact` bigint(10) DEFAULT NULL,
  `owner_address` varchar(200) DEFAULT NULL,
  `documentation` varchar(50) DEFAULT NULL,
  `vid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_add_property`
--

LOCK TABLES `tbl_add_property` WRITE;
/*!40000 ALTER TABLE `tbl_add_property` DISABLE KEYS */;
INSERT INTO `tbl_add_property` VALUES (1,'Elite Office Spaces','Image/company.jpg','Premium,modern and fully-equipped offices designed for success.Enjoy state-of-the-art amenities,secure environment and flexible spaces tailored to your business needs.','Commercial','Mumbai',5000000,'On Market',25,'Priyanka Kesarkar',9921904883,'123,Elite BuildingMain Street,Near City Center Mumbai,Maharashtra 400001','Image/Company Documents.pdf',NULL),(3,'Rahul Industries','Image/industrial.jpg','Rahul wearhouse is a modern industrial wearhouse located in the industrial area of mumbai .This 5000 sq.ft.wearhouse feature a racking system,parking space,water/electricity facilities,security system and fire safety system.','Industrial','Mumbai',50000000,'Available for sale',5,'Rahul Sharma',9821012345,'Plot No. 123, Industrial Estate, Mumbai - 400093','Image/WearHuseDocuments.pdf',NULL),(4,'Green Valley Estate','Image/land.jpg','5000 sq.ft.commercial plot,with water and electricity facilities.','Land','Gurugram',500000,'Available for Rent',7,'Karan singh',9812345678,'122, Industrial Area, Sector 4,Gurugram,Haryana 122001','Image/Land Documents.pdf',NULL),(5,'Sunshine Room','Image/Room.jpg','1 BHK,fully furnished,attached bathroom,balcony with city view.','Residential','New Delhi',9000000,'Available',2,'Priya Gupta',9876543210,'789, Sector 9, Dwarka, New Delhi 110075','Image/Room Documents.pdf',NULL),(10,'Dream Home','Image/Home.jpg','Stunning independant house with many bedrooms,bathrooms and modern amenities.Prime location,peaceful atmosphere and easy access to nearby landmarks,perfect for families and professionals.','Residential','Gadhinglaj',800000,'Available',10,'Saniya Mulik',8767653587,'Kadgav Road, Sambhaji Nagar,\r\nGadhinglaj','Image/Property Documents.pdf','7');
/*!40000 ALTER TABLE `tbl_add_property` ENABLE KEYS */;
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
