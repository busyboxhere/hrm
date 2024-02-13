-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hrm
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `id` int NOT NULL AUTO_INCREMENT,
  `in` datetime NOT NULL,
  `out` datetime NOT NULL,
  `overtimeHours` int NOT NULL,
  `employeeID` int NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `employeeID` (`employeeID`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companyrolesentity`
--

DROP TABLE IF EXISTS `companyrolesentity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `companyrolesentity` (
  `roleId` int NOT NULL AUTO_INCREMENT,
  `roleName` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companyrolesentity`
--

LOCK TABLES `companyrolesentity` WRITE;
/*!40000 ALTER TABLE `companyrolesentity` DISABLE KEYS */;
INSERT INTO `companyrolesentity` VALUES (1,'Chief Executive Officer','Executive Leadership','The CEO is responsible for the overall strategic direction and success of the company.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(2,'Chief Operating Officer','Executive Leadership','Responsible for the day-to-day operations and performance of the company.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(3,'Chief Financial Officer','Executive Leadership','Oversees the financial operations and strategy of the organization.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(4,'Chief Technology Officer','Executive Leadership','Leads the development and implementation of the company\'s technology strategy.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(5,'Chief Marketing Officer','Executive Leadership','Develops and executes marketing strategies to promote the company\'s products or services.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(6,'Chief Human Resources Officer','Executive Leadership','Manages the human resources function, including recruitment, training, and employee relations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(7,'Chief Information Officer','Executive Leadership','Oversees the company\'s information technology strategy and implementation.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(8,'Chief Information Security Officer','Executive Leadership','Responsible for the overall security of the company\'s information systems.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(9,'Operations Manager','Operations','Manages day-to-day operations to ensure efficiency and effectiveness.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(10,'Project Manager','Operations','Coordinates and manages projects to achieve organizational goals.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(11,'Supply Chain Manager','Operations','Oversees the management of the supply chain and logistics processes.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(12,'Logistics Coordinator','Operations','Coordinates and facilitates the logistical aspects of the company\'s operations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(13,'Facilities Manager','Operations','Manages the facilities and ensures a safe and efficient working environment.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(14,'Accountant','Finance','Responsible for financial record-keeping, analysis, and reporting.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(15,'Financial Analyst','Finance','Analyzes financial data and provides insights to support decision-making.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(16,'Treasurer','Finance','Manages the organization\'s finances, investments, and cash flow.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(17,'Controller','Finance','Oversees the financial reporting and compliance of the organization.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(18,'Budget Analyst','Finance','Assists in the development and management of the company\'s budget.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(19,'Human Resources Manager','Human Resources','Manages human resources functions, including staffing, employee relations, and policy implementation.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(20,'Recruiter','Human Resources','Identifies and recruits qualified candidates for open positions within the organization.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(21,'Training and Development Specialist','Human Resources','Designs and implements training programs to enhance employee skills and knowledge.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(22,'Compensation and Benefits Specialist','Human Resources','Develops and administers compensation and benefits programs for employees.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(23,'Employee Relations Specialist','Human Resources','Handles employee relations matters and fosters a positive work environment.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(24,'Sales Representative','Sales and Marketing','Engages with potential customers to promote and sell the company\'s products or services.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(25,'Marketing Manager','Sales and Marketing','Plans and oversees marketing strategies to promote the company\'s products or services.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(26,'Product Manager','Sales and Marketing','Manages the development and lifecycle of a product, from ideation to market launch.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(27,'Public Relations Specialist','Sales and Marketing','Cultivates a positive public image for the company through media relations and communications.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(28,'Social Media Manager','Sales and Marketing','Manages the company\'s presence on social media platforms, creating and curating content to engage the audience.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(29,'IT Manager','Information Technology','Oversees the company\'s information technology infrastructure and systems.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(30,'Network Administrator','Information Technology','Manages and maintains the organization\'s computer networks and systems.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(31,'Systems Analyst','Information Technology','Analyzes and designs information systems to meet the company\'s business needs.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(32,'Software Developer','Information Technology','Designs, develops, and maintains software applications for the company.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(33,'Database Administrator','Information Technology','Manages and maintains the company\'s databases, ensuring data integrity and availability.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(34,'Customer Service Representative','Customer Support','Assists customers with inquiries, resolves issues, and ensures overall customer satisfaction.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(35,'Customer Success Manager','Customer Support','Manages customer relationships, ensuring they derive maximum value from the company\'s products or services.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(36,'Technical Support Specialist','Customer Support','Provides technical assistance and support to customers experiencing software or hardware issues.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(37,'Research Scientist','Research and Development','Conducts scientific research to contribute to the development of new products or technologies.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(38,'Product Development Engineer','Research and Development','Designs and develops new products, ensuring they meet quality and performance standards.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(39,'Research and Development Manager','Research and Development','Manages the overall research and development activities of the company.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(40,'General Counsel','Legal','Provides legal advice, manages legal affairs, and ensures compliance with laws and regulations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(41,'Legal Counsel','Legal','Assists in legal matters, drafts contracts, and provides legal support to the organization.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(42,'Paralegal','Legal','Assists lawyers in legal research, document preparation, and general legal support.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(43,'Administrative Assistant','Administration','Provides administrative support, including scheduling, correspondence, and office organization.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(44,'Office Manager','Administration','Manages administrative tasks, office operations, and supports overall organizational efficiency.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(45,'Executive Assistant','Administration','Provides high-level administrative support to executives, handling tasks and ensuring smooth operations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(46,'Quality Assurance Analyst','Quality Assurance','Tests and ensures the quality of software or products before release.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(47,'Quality Control Inspector','Quality Assurance','Inspects and tests products to ensure they meet quality standards.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(48,'Health and Safety Officer','Health and Safety','Ensures compliance with health and safety regulations, creating and implementing safety programs.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(49,'Environmental Health and Safety Specialist','Health and Safety','Focuses on environmental health and safety issues, ensuring compliance with regulations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(50,'Graphic Designer','Creative and Design','Creates visual concepts and designs for various marketing materials.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(51,'UX/UI Designer','Creative and Design','Designs user interfaces and experiences to enhance product usability.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(52,'Creative Director','Creative and Design','Oversees the creative direction and visual identity of the company.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(53,'Production Manager','Manufacturing/Production','Manages the production process, ensuring efficiency and quality.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(54,'Manufacturing Engineer','Manufacturing/Production','Designs and improves manufacturing processes for efficiency and quality.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(55,'Assembly Line Worker','Manufacturing/Production','Performs tasks in the assembly line to produce goods.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(56,'Data Analyst','Business Support','Analyzes and interprets complex data sets to provide insights for decision-making.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(57,'Business Analyst','Business Support','Analyzes business processes and systems to recommend improvements.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(58,'Compliance Officer','Business Support','Ensures the company complies with relevant laws and regulations.','2024-02-13 08:47:35','2024-02-13 08:47:35'),(59,'Communications Specialist','Business Support','Manages internal and external communications to promote the company\'s image.','2024-02-13 08:47:35','2024-02-13 08:47:35');
/*!40000 ALTER TABLE `companyrolesentity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empID` varchar(255) NOT NULL,
  `avatar` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `gender` varchar(255) NOT NULL,
  `isMarried` tinyint(1) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phoneNumber1` varchar(255) NOT NULL,
  `phoneNumber2` varchar(255) DEFAULT '0',
  `emailAddress` varchar(255) NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeeauth`
--

DROP TABLE IF EXISTS `employeeauth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeeauth` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employeeID` int NOT NULL,
  `salt` varchar(255) NOT NULL,
  `passwordHash` varchar(255) NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `employeeID` (`employeeID`),
  CONSTRAINT `employeeauth_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeeauth`
--

LOCK TABLES `employeeauth` WRITE;
/*!40000 ALTER TABLE `employeeauth` DISABLE KEYS */;
/*!40000 ALTER TABLE `employeeauth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employmenthistory`
--

DROP TABLE IF EXISTS `employmenthistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employmenthistory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `prevEmployerName` varchar(255) NOT NULL,
  `prevEmploymentStartDate` datetime NOT NULL,
  `prevEmploymentEndDate` datetime NOT NULL,
  `remarks` varchar(255) NOT NULL,
  `joiningDate` datetime NOT NULL,
  `currentPosition` int NOT NULL,
  `department` int NOT NULL,
  `employeeID` int NOT NULL,
  `reportingManager` int NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `currentPosition` (`currentPosition`),
  KEY `department` (`department`),
  KEY `employeeID` (`employeeID`),
  KEY `reportingManager` (`reportingManager`),
  CONSTRAINT `employmenthistory_ibfk_1` FOREIGN KEY (`currentPosition`) REFERENCES `companyrolesentity` (`roleId`) ON UPDATE CASCADE,
  CONSTRAINT `employmenthistory_ibfk_2` FOREIGN KEY (`department`) REFERENCES `companyrolesentity` (`roleId`) ON UPDATE CASCADE,
  CONSTRAINT `employmenthistory_ibfk_3` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `employmenthistory_ibfk_4` FOREIGN KEY (`reportingManager`) REFERENCES `employee` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employmenthistory`
--

LOCK TABLES `employmenthistory` WRITE;
/*!40000 ALTER TABLE `employmenthistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `employmenthistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leavecategory`
--

DROP TABLE IF EXISTS `leavecategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leavecategory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `leaveType` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leavecategory`
--

LOCK TABLES `leavecategory` WRITE;
/*!40000 ALTER TABLE `leavecategory` DISABLE KEYS */;
INSERT INTO `leavecategory` VALUES (1,'Vacation Leave','Time off for planned vacations and holidays','2024-02-13 08:47:36','2024-02-13 08:47:36'),(2,'Sick Leave','Time off due to illness or medical conditions','2024-02-13 08:47:36','2024-02-13 08:47:36'),(3,'Personal Leave','Non-medical time off for personal reasons','2024-02-13 08:47:36','2024-02-13 08:47:36'),(4,'Vacation Leave','Time off for planned vacations and holidays','2024-02-13 08:47:36','2024-02-13 08:47:36'),(5,'Sick Leave','Time off due to illness or medical conditions','2024-02-13 08:47:36','2024-02-13 08:47:36'),(6,'Personal Leave','Non-medical time off for personal reasons','2024-02-13 08:47:36','2024-02-13 08:47:36'),(7,'Public Holidays','Automatically allocated time off for recognized public holidays','2024-02-13 08:47:36','2024-02-13 08:47:36'),(8,'Maternity Leave','Time off for expectant mothers before and after childbirth','2024-02-13 08:47:36','2024-02-13 08:47:36'),(9,'Paternity Leave','Time off for new fathers to support their partner and bond with the newborn','2024-02-13 08:47:36','2024-02-13 08:47:36'),(10,'Parental Leave','Time off for parents to care for a newborn or adopted child','2024-02-13 08:47:36','2024-02-13 08:47:36'),(11,'Bereavement Leave','Time off due to the death of a family member or close friend','2024-02-13 08:47:36','2024-02-13 08:47:36'),(12,'Jury Duty Leave','Time off to fulfill civic duty by serving on a jury','2024-02-13 08:47:36','2024-02-13 08:47:36'),(13,'Compensatory Time Off','Time off granted in lieu of overtime pay','2024-02-13 08:47:36','2024-02-13 08:47:36'),(14,'Unpaid Leave','Extended time off without pay for specific reasons','2024-02-13 08:47:36','2024-02-13 08:47:36'),(15,'Educational Leave','Time off for employees to pursue educational opportunities','2024-02-13 08:47:36','2024-02-13 08:47:36'),(16,'Volunteer Time Off','Time off for employees to engage in volunteer or community service activities','2024-02-13 08:47:36','2024-02-13 08:47:36'),(17,'Administrative Leave','Time off for administrative reasons, such as office closures','2024-02-13 08:47:36','2024-02-13 08:47:36'),(18,'Work from Home (WFH)','Time spent working remotely or from home','2024-02-13 08:47:36','2024-02-13 08:47:36'),(19,'Half-Day Leave','A partial day off for specific situations','2024-02-13 08:47:36','2024-02-13 08:47:36'),(20,'Sabbatical Leave','Extended leave granted for personal or professional development','2024-02-13 08:47:36','2024-02-13 08:47:36'),(21,'Leave Without Pay (LWOP)','Extended time off without receiving salary or wages','2024-02-13 08:47:36','2024-02-13 08:47:36');
/*!40000 ALTER TABLE `leavecategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaverecordentity`
--

DROP TABLE IF EXISTS `leaverecordentity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leaverecordentity` (
  `leaveId` int NOT NULL AUTO_INCREMENT,
  `employeeId` int NOT NULL,
  `leaveType` int NOT NULL,
  `reason` varchar(255) NOT NULL,
  `startDate` datetime NOT NULL,
  `endDate` datetime NOT NULL,
  `status` enum('Pending','Accepted','Rejected') NOT NULL DEFAULT 'Pending',
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL,
  PRIMARY KEY (`leaveId`),
  KEY `employeeId` (`employeeId`),
  KEY `leaveType` (`leaveType`),
  CONSTRAINT `leaverecordentity_ibfk_1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `leaverecordentity_ibfk_2` FOREIGN KEY (`leaveType`) REFERENCES `leavecategory` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaverecordentity`
--

LOCK TABLES `leaverecordentity` WRITE;
/*!40000 ALTER TABLE `leaverecordentity` DISABLE KEYS */;
/*!40000 ALTER TABLE `leaverecordentity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-13 14:17:40
