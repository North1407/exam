-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: examdb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anwers`
--

DROP TABLE IF EXISTS `anwers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `anwers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `is_correct` bit(1) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo4e6yvx9isivn9uokvr8be0l6` (`question_id`),
  CONSTRAINT `FKo4e6yvx9isivn9uokvr8be0l6` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anwers`
--

LOCK TABLES `anwers` WRITE;
/*!40000 ALTER TABLE `anwers` DISABLE KEYS */;
INSERT INTO `anwers` VALUES (1,'10',_binary '',1),(2,'12',_binary '\0',1),(3,'15',_binary '\0',1),(4,'8',_binary '\0',1),(5,'3',_binary '\0',2),(6,'5',_binary '\0',2),(7,'6',_binary '',2),(8,'7',_binary '\0',2),(9,'10',_binary '\0',3),(10,'12',_binary '',3),(11,'16',_binary '\0',3),(12,'9',_binary '\0',3),(13,'7',_binary '\0',4),(14,'8',_binary '\0',4),(15,'9',_binary '\0',4),(16,'6',_binary '\0',5),(17,'7',_binary '\0',5),(18,'8',_binary '',5),(19,'9',_binary '\0',5),(20,'1100',_binary '',6),(21,'1001',_binary '\0',6),(22,'1111',_binary '\0',6),(23,'1010',_binary '\0',6),(24,'600',_binary '\0',7),(25,'1000',_binary '\0',7),(26,'60',_binary '\0',7),(27,'3600',_binary '',7),(28,'Không có phép nào được thực hiện trước',_binary '\0',8),(29,'Phép nhân',_binary '',8),(30,'Tùy thuộc vào quy tắc ưu tiên',_binary '\0',8),(31,'Phép cộng',_binary '\0',8),(32,'1001',_binary '',9),(33,'1100',_binary '\0',9),(34,'1111',_binary '\0',9),(35,'1010',_binary '\0',9),(36,'125',_binary '',10),(37,'15',_binary '\0',10),(38,'625',_binary '\0',10),(39,'75',_binary '\0',10),(40,'3',_binary '\0',11),(41,'4',_binary '',11),(42,'5',_binary '\0',11),(43,'6',_binary '\0',11),(44,'60',_binary '\0',12),(45,'50',_binary '',12),(46,'40',_binary '\0',12),(47,'30',_binary '\0',12),(48,'12',_binary '',13),(49,'6',_binary '\0',13),(50,'18',_binary '\0',13),(51,'8',_binary '\0',13),(52,'F = ma',_binary '\0',14),(53,'a = F/m',_binary '\0',14),(54,'v = d/t',_binary '',14),(55,'E = mc^2',_binary '\0',14),(56,'Newton (N)',_binary '\0',15),(57,'Mét (m)',_binary '\0',15),(58,'Giây (s)',_binary '',15),(59,'Kilogram (kg)',_binary '\0',15),(60,'Khối lượng chia cho thể tích',_binary '\0',16),(61,'Tốc độ thay đổi thời gian',_binary '\0',16),(62,'Lực chia cho diện tích',_binary '',16),(63,'Năng lượng chia cho cấp số nhân của ánh sáng',_binary '\0',16),(64,'50,000 m/s',_binary '\0',17),(65,'299,792,458 m/s',_binary '',17),(66,'100 m/s',_binary '\0',17),(67,'1,000,000 m/s',_binary '\0',17),(68,'F = ma',_binary '\0',18),(69,'a = F/m',_binary '\0',18),(70,'K = (1/2)mv^2',_binary '',18),(71,'E = mc^2',_binary '\0',18),(72,'Làm một công bằng không',_binary '\0',19),(73,'Không làm công nào cả',_binary '',19),(74,'System.out.println(\"Hello World\");',_binary '',20),(75,'Console.WriteLine(\"Hello World\");',_binary '\0',20),(76,'Logger.getLogger(\"Hello World\");',_binary '',20),(77,'echo(\"Hello World\");',_binary '\0',20),(78,'True',_binary '\0',21),(79,'False',_binary '',21),(80,'String can be created using new operator.',_binary '\0',22),(81,'String is a primary data type.',_binary '',22),(82,'None of the above.',_binary '\0',22),(83,'String is immutable.',_binary '\0',22),(84,'None of the above.',_binary '\0',23),(85,'Abstraction is a technique to define different methods of the same type.',_binary '\0',23),(86,'It refers to the ability to make a class abstract in OOP.',_binary '\0',23),(87,'Abstraction is the ability of an object to take on many forms.',_binary '',23),(88,'class declared final is a final class.',_binary '\0',24),(89,'Final classes are created so the methods implemented by that class cannot be overridden.',_binary '',24),(90,'It can\'t be inherited.',_binary '',24),(91,'All of the above.',_binary '\0',24),(92,'None of the above.',_binary '\0',25),(93,'A transient variable is a variable that may not be serialized during Serialization.',_binary '',25),(94,'A transient variable is a variable which is serialized during Serialization.',_binary '\0',25),(95,'A transient variable is a variable which is to be marked as serializable.',_binary '\0',25),(96,'StringBuffer',_binary '',26),(97,'Both of the above',_binary '\0',26),(98,'StringBuilder',_binary '\0',26),(99,'None of the above',_binary '\0',26),(120,'Platform independence',_binary '',31),(121,'Automatic memory management (Garbage Collection)',_binary '',31),(122,'Compiled directly to machine code',_binary '\0',31),(123,'Strictly typed language',_binary '\0',31),(124,'Multiple inheritance support',_binary '\0',31),(143,'None of the above.',_binary '\0',37),(144,'public static void main(String[] args)',_binary '',37),(145,'public int main(String[] args)',_binary '\0',37),(146,'public static int main(String[] args)',_binary '\0',37),(147,'/ , %',_binary '',38),(148,'! , -',_binary '\0',38),(149,'* , +',_binary '\0',38),(150,'>>, <<',_binary '\0',38),(151,'Applet is a tool.',_binary '\0',39),(152,'An applet is a Java program that runs in a Web browser.',_binary '',39),(153,'Applet is a run time environment.',_binary '\0',39),(154,'Applet is a standalone java program.',_binary '\0',39),(155,'True',_binary '',40),(156,'False',_binary '\0',40),(157,'0',_binary '',41),(158,'not defined',_binary '\0',41),(159,'0.0',_binary '\0',41),(160,'null',_binary '\0',41);
/*!40000 ALTER TABLE `anwers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams`
--

DROP TABLE IF EXISTS `exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `end_time` datetime(6) DEFAULT NULL,
  `mark` float NOT NULL,
  `start_time` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams`
--

LOCK TABLES `exams` WRITE;
/*!40000 ALTER TABLE `exams` DISABLE KEYS */;
INSERT INTO `exams` VALUES (1,'2023-09-06 10:06:17.086000',3,'2023-09-06 10:05:40.128000'),(2,'2023-09-06 10:08:33.395000',0,'2023-09-06 10:07:32.395000'),(3,'2023-09-06 10:08:41.515000',0,'2023-09-06 10:07:40.515000'),(4,'2023-09-06 10:10:56.472000',0,'2023-09-06 10:09:55.472000'),(5,'2023-09-06 10:13:59.188000',2,'2023-09-06 10:13:46.547000'),(6,'2023-09-06 10:16:39.775000',0,'2023-09-06 10:15:38.775000'),(7,'2023-09-06 10:19:21.619000',0,'2023-09-06 10:18:20.619000'),(8,'2023-09-06 10:19:56.419000',0,'2023-09-06 10:18:55.419000'),(9,'2023-09-06 10:33:55.151000',0,'2023-09-06 10:32:54.151000'),(10,'2023-09-06 10:34:20.894000',0,'2023-09-06 10:33:19.894000'),(11,'2023-09-06 10:35:42.687000',0,'2023-09-06 10:34:41.687000'),(12,'2023-09-06 10:39:40.676000',1,'2023-09-06 10:36:21.674000'),(13,'2023-09-06 10:57:47.197000',0,'2023-09-06 10:56:46.197000'),(14,'2023-09-06 11:36:11.348000',4,'2023-09-06 11:35:55.013000'),(15,'2023-09-06 12:26:16.773000',0,'2023-09-06 12:25:55.925000'),(16,'2023-09-06 13:18:37.642000',2,'2023-09-06 13:18:18.460000'),(17,'2023-09-06 13:33:12.850000',3,'2023-09-06 13:33:06.370000'),(18,'2023-09-06 13:47:51.294000',0,'2023-09-06 13:46:50.294000'),(19,'2023-09-06 14:11:05.461000',2,'2023-09-06 14:10:03.447000'),(20,'2023-09-06 14:13:20.394000',0,'2023-09-06 14:12:19.394000'),(21,'2023-09-06 14:40:30.877000',0,'2023-09-06 14:39:29.877000'),(22,'2023-09-06 14:42:22.085000',0,'2023-09-06 14:41:21.085000'),(23,'2023-09-06 15:08:47.575000',0,'2023-09-06 15:07:46.575000'),(24,'2023-09-06 16:45:28.428000',2,'2023-09-06 16:04:20.877000'),(25,'2023-09-06 16:45:43.210000',1,'2023-09-06 16:45:35.058000'),(26,'2023-09-06 17:00:34.818000',2,'2023-09-06 17:00:29.193000'),(27,'2023-09-07 08:29:45.156000',0,'2023-09-07 08:28:44.156000'),(28,'2023-09-07 09:25:29.634000',1,'2023-09-07 09:24:27.669000'),(29,'2023-09-07 09:29:36.806000',0,'2023-09-07 09:29:30.967000'),(30,'2023-09-07 09:33:13.876000',0,'2023-09-07 09:32:12.876000'),(31,'2023-09-07 09:37:31.607000',0,'2023-09-07 09:36:30.607000'),(32,'2023-09-07 09:39:25.336000',0,'2023-09-07 09:38:24.336000'),(33,'2023-09-07 09:43:07.726000',2,'2023-09-07 09:38:27.527000'),(34,'2023-09-07 09:44:22.000000',0,'2023-09-07 09:43:21.000000'),(35,'2023-09-07 09:50:13.116000',0,'2023-09-07 09:49:12.116000'),(36,'2023-09-07 09:50:57.267000',0,'2023-09-07 09:49:56.267000'),(37,'2023-09-07 10:20:35.282000',3,'2023-09-07 10:15:57.944000'),(38,'2023-09-07 10:30:45.599000',0,'2023-09-07 10:29:44.599000'),(39,'2023-09-07 10:31:33.754000',1,'2023-09-07 10:31:29.384000'),(40,'2023-09-07 10:31:46.470000',1,'2023-09-07 10:31:42.951000'),(41,'2023-09-07 10:35:36.396000',0,'2023-09-07 10:35:32.578000'),(42,'2023-09-07 10:40:22.686000',0,'2023-09-07 10:40:19.828000'),(43,'2023-09-07 10:45:52.008000',0,'2023-09-07 10:44:51.008000'),(44,'2023-09-07 10:46:02.603000',0,'2023-09-07 10:45:59.554000'),(45,'2023-09-07 10:53:11.458000',0,'2023-09-07 10:53:06.990000'),(46,'2023-09-07 11:34:17.720000',0,'2023-09-07 11:33:16.720000'),(47,'2023-09-07 11:34:24.575000',0,'2023-09-07 11:33:23.575000'),(48,'2023-09-07 11:34:41.282000',0,'2023-09-07 11:33:40.282000'),(49,'2023-09-07 11:35:45.541000',0,'2023-09-07 11:34:44.541000'),(50,'2023-09-07 11:40:42.518000',0,'2023-09-07 11:40:35.310000'),(51,'2023-09-07 13:07:52.297000',0,'2023-09-07 13:07:47.887000'),(52,'2023-09-07 13:11:35.450000',0,'2023-09-07 13:09:53.284000'),(53,'2023-09-07 13:12:02.349000',0,'2023-09-07 13:11:57.953000'),(54,'2023-09-07 13:14:57.109000',0,'2023-09-07 13:13:34.392000'),(55,'2023-09-07 13:16:27.528000',2,'2023-09-07 13:15:14.036000'),(56,'2023-09-07 13:16:35.273000',2,'2023-09-07 13:16:31.636000'),(57,'2023-09-07 14:37:25.544000',3,'2023-09-07 14:37:17.777000'),(58,'2023-09-07 14:55:43.937000',1,'2023-09-07 14:55:37.288000'),(59,'2023-09-07 15:26:13.277000',2,'2023-09-07 15:26:07.842000'),(60,'2023-09-07 15:27:36.338000',2,'2023-09-07 15:27:30.299000'),(61,'2023-09-07 15:38:43.384000',3,'2023-09-07 15:38:30.035000'),(62,'2023-09-07 15:41:08.182000',3,'2023-09-07 15:40:26.603000'),(63,'2023-09-07 16:05:05.591000',0,'2023-09-07 16:04:04.547000'),(64,'2023-09-07 16:06:04.180000',1,'2023-09-07 16:06:00.300000'),(65,'2023-09-07 16:09:07.713000',3,'2023-09-07 16:09:03.292000'),(66,'2023-09-07 16:13:54.668000',5,'2023-09-07 16:10:17.504000'),(67,'2023-09-07 16:14:50.186000',5,'2023-09-07 16:14:00.532000'),(68,'2023-09-07 16:15:43.548000',5,'2023-09-07 16:15:39.001000'),(69,'2023-09-07 16:21:15.033000',15,'2023-09-07 16:21:11.025000'),(70,'2023-09-07 16:21:37.100000',5,'2023-09-07 16:21:27.319000'),(71,'2023-09-07 17:23:58.807000',0,'2023-09-07 17:22:37.531000'),(72,'2023-09-07 17:25:32.776000',0,'2023-09-07 17:24:31.643000'),(73,'2023-09-07 17:28:52.549000',0,'2023-09-07 17:27:51.549000'),(74,'2023-09-07 17:29:07.778000',0,'2023-09-07 17:28:02.123000'),(75,'2023-09-07 19:12:54.988000',0,'2023-09-07 19:11:53.672000'),(76,'2023-09-07 19:14:53.988000',0,'2023-09-07 19:13:52.470000'),(77,'2023-09-07 19:17:42.983000',0,'2023-09-07 19:16:41.841000'),(78,'2023-09-07 19:30:39.852000',0,'2023-09-07 19:29:38.852000'),(79,'2023-09-07 19:30:43.112000',0,'2023-09-07 19:29:42.012000'),(80,'2023-09-07 19:36:35.542000',0,'2023-09-07 19:35:34.542000'),(81,'2023-09-07 19:37:32.112000',0,'2023-09-07 19:36:30.619000'),(82,'2023-09-07 19:49:29.151000',0,'2023-09-07 19:48:27.324000'),(83,'2023-09-07 19:52:05.072000',0,'2023-09-07 19:51:54.538000'),(84,'2023-09-07 21:37:48.384000',0,'2023-09-07 21:36:47.204000'),(85,'2023-09-07 21:39:49.198000',0,'2023-09-07 21:39:43.285000'),(86,'2023-09-07 21:47:41.595000',0,'2023-09-07 21:45:41.257000'),(87,'2023-09-07 21:49:07.200000',0,'2023-09-07 21:47:46.610000'),(88,'2023-09-07 21:50:12.547000',0,'2023-09-07 21:49:11.547000'),(89,'2023-09-07 21:52:52.592000',0,'2023-09-07 21:49:15.114000'),(90,'2023-09-07 21:53:13.610000',0,'2023-09-07 21:52:56.242000'),(91,'2023-09-07 21:54:50.732000',0,'2023-09-07 21:54:06.963000'),(92,'2023-09-07 21:55:03.862000',0,'2023-09-07 21:54:59.404000'),(93,'2023-09-07 21:56:06.668000',0,'2023-09-07 21:56:00.926000'),(94,'2023-09-07 21:59:19.093000',0,'2023-09-07 21:57:04.743000'),(95,'2023-09-07 22:01:04.739000',3,'2023-09-07 21:59:32.350000'),(96,'2023-09-07 22:27:48.688000',3,'2023-09-07 22:25:14.766000'),(97,'2023-09-07 22:41:45.561000',7,'2023-09-07 22:40:44.416000'),(98,'2023-09-07 22:44:29.386000',4,'2023-09-07 22:44:00.053000'),(99,'2023-09-08 08:55:20.895000',5,'2023-09-08 08:54:47.950000');
/*!40000 ALTER TABLE `exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams_answers`
--

DROP TABLE IF EXISTS `exams_answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exams_answers` (
  `exam_id` int(11) NOT NULL,
  `answer_id` int(11) NOT NULL,
  PRIMARY KEY (`exam_id`,`answer_id`),
  KEY `FK23205ymlvfuwxtosvxwvjb99l` (`answer_id`),
  CONSTRAINT `FK23205ymlvfuwxtosvxwvjb99l` FOREIGN KEY (`answer_id`) REFERENCES `anwers` (`id`),
  CONSTRAINT `FK2lcsv6ecff8gurvfwfxo1b2xs` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams_answers`
--

LOCK TABLES `exams_answers` WRITE;
/*!40000 ALTER TABLE `exams_answers` DISABLE KEYS */;
INSERT INTO `exams_answers` VALUES (99,2),(99,9),(99,15),(99,21),(99,27),(99,35),(99,36),(99,42),(99,45),(99,48),(98,74),(98,76),(98,79),(98,80),(98,86),(98,94),(98,98),(98,124),(98,148),(98,155),(98,157);
/*!40000 ALTER TABLE `exams_answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams_questions`
--

DROP TABLE IF EXISTS `exams_questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exams_questions` (
  `exam_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  KEY `FKdoj690gn6gdqir2x7pl95bvjm` (`question_id`),
  KEY `FKrn7vrieqs1e8nb1v462b1mjet` (`exam_id`),
  CONSTRAINT `FKdoj690gn6gdqir2x7pl95bvjm` FOREIGN KEY (`question_id`) REFERENCES `questions` (`id`),
  CONSTRAINT `FKrn7vrieqs1e8nb1v462b1mjet` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams_questions`
--

LOCK TABLES `exams_questions` WRITE;
/*!40000 ALTER TABLE `exams_questions` DISABLE KEYS */;
INSERT INTO `exams_questions` VALUES (98,20),(98,22),(98,41),(98,31),(98,25),(98,38),(98,40),(98,23),(98,26),(98,21),(99,9),(99,7),(99,1),(99,4),(99,12),(99,13),(99,11),(99,6),(99,3),(99,10);
/*!40000 ALTER TABLE `exams_questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `level` int(11) NOT NULL,
  `topic_id` int(11) DEFAULT NULL,
  `true_answer` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `FKdb5p6ukb0v76he4pq87cbymhg` (`topic_id`),
  CONSTRAINT `FKdb5p6ukb0v76he4pq87cbymhg` FOREIGN KEY (`topic_id`) REFERENCES `topics` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'5 + 7 bằng bao nhiêu?',1,1,1),(2,'9 - 3 bằng bao nhiêu?',1,1,1),(3,'3 * 4 bằng bao nhiêu?',2,1,1),(4,'18 / 2 bằng bao nhiêu?',2,1,1),(5,'2^3 bằng bao nhiêu?',3,1,1),(6,'Trong hệ thập phân, biểu diễn nhị phân của số 12 là gì?',3,1,1),(7,'Bao nhiêu giây trong 1 giờ?',3,1,1),(8,'Trong phép tính 6 x 7 + 8, phép nào được thực hiện trước?',3,1,1),(9,'Trong hệ thập phân, biểu diễn nhị phân của số 9 là gì?',4,1,1),(10,'5^3 bằng bao nhiêu?',4,1,1),(11,'2 + 2 = ?',1,1,1),(12,'10 * 5 = ?',2,1,1),(13,'Ước chung lớn nhất của 24 và 36 là bao nhiêu?',3,1,1),(14,'Công thức vận tốc là gì?',1,2,1),(15,'Đơn vị nào được sử dụng để đo thời gian?',2,2,1),(16,'Áp suất là gì?',3,2,1),(17,'Ánh sáng di chuyển với tốc độ nào?',1,2,1),(18,'Công thức của động năng là gì?',2,2,1),(19,'Nếu bạn đẩy một đồ vật mà không làm thay đổi vận tốc của nó, thì công bạn đã làm là gì?',3,2,1),(20,'What is a correct syntax to output \"Hello World\" in Java?',3,5,2),(21,'Java is short for \"JavaScript\".',3,5,1),(22,'Which of the following is false about String?',2,5,1),(23,'What is Abstraction?',2,5,1),(24,'What is true about a final class?',2,5,2),(25,'What is a transient variable?',2,5,1),(26,'Which of the following is thread-safe?',2,5,1),(31,'Which of the following are features of the Java programming language?',2,5,2),(37,'What is the correct syntax for the main method of a Java class?',1,5,1),(38,'Which arithmetic operations can result in the throwing of an ArithmeticException?',1,5,1),(39,'What is an applet?',1,5,1),(40,'Can we have multiple classes in the same Java file?',1,5,1),(41,'What is the default value of an int variable?',1,5,1);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(150) NOT NULL,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ofx66keruapi6vyqpv6f2or37` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'can add question, manage user and setting','admin'),(2,'can do exam and see result','user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `topics`
--

DROP TABLE IF EXISTS `topics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `topics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_msdep2s7k6y32gv8c0ifck0oy` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `topics`
--

LOCK TABLES `topics` WRITE;
/*!40000 ALTER TABLE `topics` DISABLE KEYS */;
INSERT INTO `topics` VALUES (3,'Chemistry'),(4,'English'),(1,'Math'),(2,'Physics'),(6,'Science'),(5,'Technology');
/*!40000 ALTER TABLE `topics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`),
  KEY `FKp56c1712k691lhsyewcssf40f` (`role_id`),
  CONSTRAINT `FKp56c1712k691lhsyewcssf40f` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (9,'admin','$2a$10$2SW6X3Li6lMjpPwwkqPLdeXMCu2hIlL6VuCW7NRBgkPyFbtkahSdm',1,_binary '\0'),(11,'user','$2a$10$2SW6X3Li6lMjpPwwkqPLdeXMCu2hIlL6VuCW7NRBgkPyFbtkahSdm',2,_binary '\0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_exams`
--

DROP TABLE IF EXISTS `users_exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users_exams` (
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  KEY `FK5cecpbb9o223nkdrwvm4hx5j` (`exam_id`),
  KEY `FKdaiou0uksmgdshio0m91xg5ih` (`user_id`),
  CONSTRAINT `FK5cecpbb9o223nkdrwvm4hx5j` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`),
  CONSTRAINT `FKdaiou0uksmgdshio0m91xg5ih` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_exams`
--

LOCK TABLES `users_exams` WRITE;
/*!40000 ALTER TABLE `users_exams` DISABLE KEYS */;
INSERT INTO `users_exams` VALUES (11,98),(11,99);
/*!40000 ALTER TABLE `users_exams` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-08  9:37:48
