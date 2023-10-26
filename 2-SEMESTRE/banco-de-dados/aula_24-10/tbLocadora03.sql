-- MySQL dump 10.13  Distrib 8.0.34, for Linux (x86_64)
--
-- Host: localhost    Database: dbLocadora
-- ------------------------------------------------------
-- Server version	8.0.34-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbCategoria`
--

DROP TABLE IF EXISTS `tbCategoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbCategoria` (
  `codigo_categoria` int NOT NULL,
  `nome_categoria` varchar(20) NOT NULL,
  PRIMARY KEY (`codigo_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbCategoria`
--

LOCK TABLES `tbCategoria` WRITE;
/*!40000 ALTER TABLE `tbCategoria` DISABLE KEYS */;
INSERT INTO `tbCategoria` VALUES (1,'Terror'),(2,'Suspense'),(3,'Comedia');
/*!40000 ALTER TABLE `tbCategoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbClasse`
--

DROP TABLE IF EXISTS `tbClasse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbClasse` (
  `codigo_classe` int NOT NULL,
  `nome_classe` varchar(20) NOT NULL,
  `preco_classe` decimal(4,2) NOT NULL,
  PRIMARY KEY (`codigo_classe`),
  CONSTRAINT `ck_NomeClasse` CHECK ((`nome_classe` in (_utf8mb4'Lançamento',_utf8mb4'Catálogo')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbClasse`
--

LOCK TABLES `tbClasse` WRITE;
/*!40000 ALTER TABLE `tbClasse` DISABLE KEYS */;
INSERT INTO `tbClasse` VALUES (1,'Lancamento',5.00),(2,'Catálogo',2.50);
/*!40000 ALTER TABLE `tbClasse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbCliente`
--

DROP TABLE IF EXISTS `tbCliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbCliente` (
  `codigo_cli` int NOT NULL,
  `CPF_cli` char(11) DEFAULT NULL,
  `nome_cli` varchar(20) NOT NULL,
  `data_cadastro` date DEFAULT NULL,
  `cidade_cli` varchar(20) DEFAULT NULL,
  `UF_cli` char(2) DEFAULT 'PR',
  PRIMARY KEY (`codigo_cli`),
  UNIQUE KEY `un_CPFcli` (`CPF_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbCliente`
--

LOCK TABLES `tbCliente` WRITE;
/*!40000 ALTER TABLE `tbCliente` DISABLE KEYS */;
INSERT INTO `tbCliente` VALUES (1,'00100100100','joao saldanha','2023-10-05','foz do iguacu','PR'),(2,'00200200202','maria silva','2023-09-15','foz do iguacu','PR'),(3,'00300300303','vanessa da mota','2023-05-02','foz do iguacu','PR');
/*!40000 ALTER TABLE `tbCliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbEmprestimoDevolucao`
--

DROP TABLE IF EXISTS `tbEmprestimoDevolucao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbEmprestimoDevolucao` (
  `codigo_cli` int NOT NULL,
  `codigo_filme` int NOT NULL,
  `data_emprestimo` date NOT NULL,
  `data_devolucao_prevista` date NOT NULL,
  `data_devolucao_efetiva` date DEFAULT NULL,
  `valor_multa` decimal(4,2) DEFAULT '0.00',
  PRIMARY KEY (`codigo_cli`,`codigo_filme`,`data_emprestimo`),
  KEY `fk_tbEmpDev_tbFilme` (`codigo_filme`),
  CONSTRAINT `fk_tbEmpDev_tbCliente` FOREIGN KEY (`codigo_cli`) REFERENCES `tbCliente` (`codigo_cli`),
  CONSTRAINT `fk_tbEmpDev_tbFilme` FOREIGN KEY (`codigo_filme`) REFERENCES `tbFilme` (`codigo_filme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbEmprestimoDevolucao`
--

LOCK TABLES `tbEmprestimoDevolucao` WRITE;
/*!40000 ALTER TABLE `tbEmprestimoDevolucao` DISABLE KEYS */;
INSERT INTO `tbEmprestimoDevolucao` VALUES (1,1,'2023-10-15','2023-10-18','2023-10-15',0.00),(1,2,'2023-10-15','2023-10-18','2023-10-15',0.00),(1,3,'2023-10-15','2023-10-18','2023-10-15',0.00),(2,1,'2023-10-18','2023-10-21','2023-10-22',5.00),(2,2,'2023-10-18','2023-10-21','2023-10-22',5.00),(2,3,'2023-10-18','2023-10-21','2023-10-22',5.00),(3,1,'2023-10-20','2023-10-23','2023-10-25',10.00),(3,1,'2023-10-25','2023-10-28','2023-10-28',0.00),(3,2,'2023-10-20','2023-10-23','2023-10-25',10.00),(3,3,'2023-10-20','2023-10-23','2023-10-25',10.00);
/*!40000 ALTER TABLE `tbEmprestimoDevolucao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbFilme`
--

DROP TABLE IF EXISTS `tbFilme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbFilme` (
  `codigo_filme` int NOT NULL,
  `codigo_titulo` int DEFAULT NULL,
  `nome_distribuidor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo_filme`),
  KEY `fk_tbFilme_tbTitulo` (`codigo_titulo`),
  CONSTRAINT `fk_tbFilme_tbTitulo` FOREIGN KEY (`codigo_titulo`) REFERENCES `tbTitulo` (`codigo_titulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbFilme`
--

LOCK TABLES `tbFilme` WRITE;
/*!40000 ALTER TABLE `tbFilme` DISABLE KEYS */;
INSERT INTO `tbFilme` VALUES (1,1,'Warner Bros'),(2,2,'Screem Gens'),(3,3,'Warner Bros');
/*!40000 ALTER TABLE `tbFilme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbTitulo`
--

DROP TABLE IF EXISTS `tbTitulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbTitulo` (
  `codigo_titulo` int NOT NULL,
  `nome_titulo` varchar(50) NOT NULL,
  `ano` decimal(4,0) DEFAULT NULL,
  `codigo_categoria` int DEFAULT NULL,
  `codigo_classe` int DEFAULT NULL,
  PRIMARY KEY (`codigo_titulo`),
  KEY `fk_tbTitulo_tbCategoria` (`codigo_categoria`),
  KEY `fk_tbTitulo_tbClasse` (`codigo_classe`),
  CONSTRAINT `fk_tbTitulo_tbCategoria` FOREIGN KEY (`codigo_categoria`) REFERENCES `tbCategoria` (`codigo_categoria`),
  CONSTRAINT `fk_tbTitulo_tbClasse` FOREIGN KEY (`codigo_classe`) REFERENCES `tbClasse` (`codigo_classe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbTitulo`
--

LOCK TABLES `tbTitulo` WRITE;
/*!40000 ALTER TABLE `tbTitulo` DISABLE KEYS */;
INSERT INTO `tbTitulo` VALUES (1,'A Freira 2',2023,2,1),(2,'O Exorcista do Papa',2023,2,1),(3,'A Barbie',2023,3,1);
/*!40000 ALTER TABLE `tbTitulo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-26 15:56:51
