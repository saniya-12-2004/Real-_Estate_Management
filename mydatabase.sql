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
-- Table structure for table `tbl_add_category`
--

DROP TABLE IF EXISTS `tbl_add_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_add_category` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `image` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_add_category`
--

LOCK TABLES `tbl_add_category` WRITE;
/*!40000 ALTER TABLE `tbl_add_category` DISABLE KEYS */;
INSERT INTO `tbl_add_category` VALUES (1,'Residential','Dwelling Place','Image/category1.jpg'),(2,'Commercial','Business Space','Image/category2.jpg'),(4,'Land','Plot of earth','Image/category4.jpg'),(8,'Industrial','Industrial spaces for rent/sale.','Image/category3.jpg'),(9,'asas','jhjhjhjjh','Image/category1.jpg'),(10,'Residential','lll','Image/category2.jpg'),(11,'Residential','hhjj','Image/category1.jpg'),(12,'Residential','nn','Image/credit.jpg'),(13,'dream house','it is better for living','Image/category1.jpg'),(14,'as','sd','Image/cat-and-dog.jpg'),(15,'Residential','aserert','Image/category1.jpg');
/*!40000 ALTER TABLE `tbl_add_category` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `tbl_admin_signup`
--

DROP TABLE IF EXISTS `tbl_admin_signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_admin_signup` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `passwd` varchar(10) DEFAULT NULL,
  `cpasswd` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `contact` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_admin_signup`
--

LOCK TABLES `tbl_admin_signup` WRITE;
/*!40000 ALTER TABLE `tbl_admin_signup` DISABLE KEYS */;
INSERT INTO `tbl_admin_signup` VALUES (1,'Aarav Rao','aarav.rao@email.com','Aarav@12','Aarav@12','Male','456,Koregaon Park,Pune','Pune',9423567890),(2,'Suraj Kadam','surajkadam@gmail.com','4545','4545','Male','Shri Swami Samarth Nagar,Near Ganesh Temple,416505','Ajara',8010050721),(3,'abcd xyz','abcd1234@gmail.com','1234','1234','Female','abcd','hhhh',8799999999);
/*!40000 ALTER TABLE `tbl_admin_signup` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `tbl_complaint`
--

DROP TABLE IF EXISTS `tbl_complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_complaint` (
  `complaint_id` int(9) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `sub` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `complaint_date` date DEFAULT NULL,
  PRIMARY KEY (`complaint_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_complaint`
--

LOCK TABLES `tbl_complaint` WRITE;
/*!40000 ALTER TABLE `tbl_complaint` DISABLE KEYS */;
INSERT INTO `tbl_complaint` VALUES (1,'Rupali Sen','Complaint regarding Dream Home booking','Delayed construction, no updates, and unresponsive team. Unhappy with Dream Home services.','2025-02-25'),(2,'Rajesh Patil','Defective Sunshine room','Purchased Sunshine room has poor quality & defective amenities.Requesting immediate resolution.','2025-02-26'),(4,'Vihaan Jain','Complaint regarding Dream Home booking','Delayed construction, no updates, and unresponsive team. Unhappy with DreamÂ HomeÂ services.','2025-03-02');
/*!40000 ALTER TABLE `tbl_complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_credit_card`
--

DROP TABLE IF EXISTS `tbl_credit_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_credit_card` (
  `id` bigint(20) DEFAULT NULL,
  `cardholder_name` varchar(50) DEFAULT NULL,
  `expiry_date` date DEFAULT NULL,
  `cvv` varchar(100) DEFAULT NULL,
  `amount` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_credit_card`
--

LOCK TABLES `tbl_credit_card` WRITE;
/*!40000 ALTER TABLE `tbl_credit_card` DISABLE KEYS */;
INSERT INTO `tbl_credit_card` VALUES (4532015112830366,'Vihaan Jain','2027-08-25','123',1000000),(6011514433546201,'Rupali Sen','2028-10-25','456',100000),(4532816543210981,'Saisha Gupta','2028-11-16','786',200000),(4532114587653210,'Rajesh Patil','2030-07-17','582',1000000);
/*!40000 ALTER TABLE `tbl_credit_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_feedback`
--

DROP TABLE IF EXISTS `tbl_feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_feedback` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `rating` varchar(50) DEFAULT NULL,
  `comments` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_feedback`
--

LOCK TABLES `tbl_feedback` WRITE;
/*!40000 ALTER TABLE `tbl_feedback` DISABLE KEYS */;
INSERT INTO `tbl_feedback` VALUES (1,'Good','Thank you, Elite Company, for making my dream a reality'),(2,'Excellent','Warehouse space is perfect for my business needs! Booking process was smooth and staff was very cooperative. Looking forward to a long-term association!'),(3,'Excellent','The land is well-maintained  and perfect for farming');
/*!40000 ALTER TABLE `tbl_feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_payment_methods`
--

DROP TABLE IF EXISTS `tbl_payment_methods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_payment_methods` (
  `Payments_Mehods` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_payment_methods`
--

LOCK TABLES `tbl_payment_methods` WRITE;
/*!40000 ALTER TABLE `tbl_payment_methods` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_payment_methods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_upi`
--

DROP TABLE IF EXISTS `tbl_upi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_upi` (
  `id` varchar(100) DEFAULT NULL,
  `amount` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_upi`
--

LOCK TABLES `tbl_upi` WRITE;
/*!40000 ALTER TABLE `tbl_upi` DISABLE KEYS */;
INSERT INTO `tbl_upi` VALUES ('vihaan@paytm',50000);
/*!40000 ALTER TABLE `tbl_upi` ENABLE KEYS */;
UNLOCK TABLES;

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

-- Dump completed on 2025-08-26 15:36:21
