-- MySQL dump 10.13  Distrib 5.7.13, for osx10.11 (x86_64)
--
-- Host: localhost    Database: veterinaria
-- ------------------------------------------------------
-- Server version	5.7.13

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
-- Table structure for table `animal`
--

DROP TABLE IF EXISTS `animal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `animal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_bin NOT NULL,
  `peso` int(11) DEFAULT NULL,
  `cor` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal`
--

LOCK TABLES `animal` WRITE;
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
INSERT INTO `animal` VALUES (1,'Pepeu',5,'amerelo'),(2,'Pepeu',5,'amerelo'),(3,'Pepeu',5,'amerelo'),(4,'Pepeu',5,'amerelo'),(5,'Pepeu',5,'amerelo'),(6,'Pet',5,'azul'),(7,'Pet',5,'azul'),(8,'Pet',5,'azul');
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `cpf` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `sexo` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `endereco` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'cassio','12341234','1982-09-09','Masculino',NULL),(2,'Cassio','3223343239',NULL,'Masculino','Rua A'),(3,'YCassio','3223343239',NULL,'Masculino','Rua b'),(4,'YCassio','3223343239',NULL,'Masculino','Rua b'),(5,'YCassio','3223343239',NULL,'Masculino','Rua b'),(6,'YCassio','3223343239',NULL,'Masculino','Rua b'),(7,'YCassio','3223343239',NULL,'Masculino','Rua b'),(8,'YCassio','3223343239',NULL,'Masculino','Rua b'),(9,'YCassio','3223343239',NULL,'Masculino','Rua b'),(10,'YCassio','3223343239',NULL,'Masculino','Rua b'),(11,'YCassio','3223343239',NULL,'Masculino','Rua b'),(12,'YCassio','3223343239',NULL,'Masculino','Rua b'),(13,'YCassio','3223343239',NULL,'Masculino','Rua b'),(14,'YCassio','3223343239',NULL,'Masculino','Rua b'),(15,'YCassio','3223343239',NULL,'Masculino','Rua b'),(16,'YCassio','3223343239',NULL,'Masculino','Rua b'),(17,'YCassio','3223343239',NULL,'Masculino','Rua b'),(18,'YCassio','3223343239',NULL,'Masculino','Rua b'),(19,'YCassio','3223343239',NULL,'Masculino','Rua b'),(20,'YCassio','3223343239',NULL,'Masculino','Rua b'),(21,'YCassio','3223343239',NULL,'Masculino','Rua b'),(22,'Jose','3223343239',NULL,'Masculino','Rua C');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-28 10:55:42
