-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: dbprojetovendas
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES latin1 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `dbprojetovendas`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `dbprojetovendas` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dbprojetovendas`;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `pk_id_cliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(300) NOT NULL,
  `cli_endereco` varchar(350) NOT NULL,
  `cli_bairro` varchar(300) NOT NULL,
  `cli_cidade` varchar(200) NOT NULL,
  `cli_uf` varchar(2) NOT NULL,
  `cli_cep` varchar(9) NOT NULL,
  `cli_telefone` varchar(15) NOT NULL,
  PRIMARY KEY (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (1,'JEFERSON TOMAS DOS SANTOS','RUA ALFONSO SANCHES SIMON, 181','RECANTO ELIMAR II','FRANCA','SP','14403-306','(16)99301-0049'),(2,'VALDETE TOMAS DA ROSA SANTOS','RUA SAO JOSÉ OPERARIO,  26','N.S. DE FATIMA','SAO JOSE DA BARRA','MG','37945-000','(35)99167-3021'),(3,'NIVALDO MARTINS DOS SANTOS','SITIO AGUA LIMPA, KM236','.','ALPINÓPOLIS','MG','37945-000','(35)33167-3021'),(4,'VALERIA TOMAS','RUA ALFONSO SANCHES SIMON, 181','RECANTO ELIMAR II','FRANCA','SP','14403-306','(16)33978-4215');
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_forma_pagamento`
--

DROP TABLE IF EXISTS `tb_forma_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_forma_pagamento` (
  `pk_id_forma_pagamento` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao_forma_pagamento` varchar(400) NOT NULL,
  `desconto_forma_pagamento` float NOT NULL,
  `parcelas_forma_pagamento` int(11) NOT NULL,
  `situacao` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_forma_pagamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_forma_pagamento`
--

LOCK TABLES `tb_forma_pagamento` WRITE;
/*!40000 ALTER TABLE `tb_forma_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_forma_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_fornecedor`
--

DROP TABLE IF EXISTS `tb_fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_fornecedor` (
  `pk_id_fornecedor` bigint(20) NOT NULL AUTO_INCREMENT,
  `razao_social` varchar(300) NOT NULL,
  `nome_fantasia` varchar(300) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `inscricao_estadual` varchar(15) NOT NULL,
  `for_endereco` varchar(350) NOT NULL,
  `for_bairro` varchar(300) NOT NULL,
  `for_cidade` varchar(200) NOT NULL,
  `for_uf` varchar(2) NOT NULL,
  `for_cep` varchar(9) NOT NULL,
  `for_telefone` varchar(15) NOT NULL,
  `for_email` varchar(200) NOT NULL,
  PRIMARY KEY (`pk_id_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_fornecedor`
--

LOCK TABLES `tb_fornecedor` WRITE;
/*!40000 ALTER TABLE `tb_fornecedor` DISABLE KEYS */;
INSERT INTO `tb_fornecedor` VALUES (1,'INFOSOLUTIONS LTDA','INFO SOLUTIONS','18.412.847/0001-98','02.332.7894-6','RUA ALFONSO SANCHES SIMON, 181','RECANTO ELIMAR II','FRANCA','SP','14403-306','(16)99301-0049','info@solutions.com.br'),(2,'PEREIRA POÇOS LTDA','PEREIRA POÇOS','18.412.847/0001-95','02.332.7894-1','RUA LUZIA GARCIA GOMES, 017','RESIDENCIAL SÃO DOMINGOS','FRANCA','SP','14403-789','(16)99307-8445','pereira@poços.com.br'),(3,'CENTRO UNIVERSITÁRIO MUNICIPAL DE FRANCA','UNI-FACEF','19.819.819/0001-81','78.954.6606-2','AV. DR. ISMAEL ALONSO Y ALONSO, 2300','SÃO JOSÉ','FRANCA','SP','14403-254','(16)97845-6191','contato@unifacef.edu.br');
/*!40000 ALTER TABLE `tb_fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_orcamento`
--

DROP TABLE IF EXISTS `tb_orcamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_orcamento` (
  `pk_id_orcamento` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_cliente` int(11) NOT NULL,
  `data_orcamento` date NOT NULL,
  `valor_liquido_orcamento` double NOT NULL,
  `valor_bruto_orcamento` double NOT NULL,
  `desconto_orcamento` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_orcamento`),
  KEY `FKIDCLIENTE` (`fk_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_orcamento`
--

LOCK TABLES `tb_orcamento` WRITE;
/*!40000 ALTER TABLE `tb_orcamento` DISABLE KEYS */;
INSERT INTO `tb_orcamento` VALUES (1,2,'2020-03-11',4250,4250,0);
/*!40000 ALTER TABLE `tb_orcamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_orcamento_produtos`
--

DROP TABLE IF EXISTS `tb_orcamento_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_orcamento_produtos` (
  `pk_id_orcamento_produto` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_produto` int(11) NOT NULL,
  `fk_orcamento` int(11) NOT NULL,
  `orc_pro_valor` int(11) NOT NULL,
  `orc_pro_qtd` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_orcamento_produto`),
  KEY `FKIDPRODURO` (`fk_produto`),
  KEY `FKIDORCAMENTO` (`fk_orcamento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_orcamento_produtos`
--

LOCK TABLES `tb_orcamento_produtos` WRITE;
/*!40000 ALTER TABLE `tb_orcamento_produtos` DISABLE KEYS */;
INSERT INTO `tb_orcamento_produtos` VALUES (1,3,1,4200,1),(2,4,1,25,2);
/*!40000 ALTER TABLE `tb_orcamento_produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_produto`
--

DROP TABLE IF EXISTS `tb_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_produto` (
  `pk_id_produto` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_fornecedor` int(11) NOT NULL,
  `codigo_barras` varchar(15) NOT NULL,
  `prod_nome` varchar(350) NOT NULL,
  `prod_valor` double NOT NULL,
  `prod_estoque` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_produto`),
  KEY `FKIDFORNECEDOR` (`fk_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_produto`
--

LOCK TABLES `tb_produto` WRITE;
/*!40000 ALTER TABLE `tb_produto` DISABLE KEYS */;
INSERT INTO `tb_produto` VALUES (1,1,'012345678905','SMARTPHONE GALAXY A7',450,100),(2,1,'01234565','NOTEBOOK DELL G3',4700,100),(3,1,'ABxy12$','NOTEBOOK SAMSUNG ODISSEY ',4200,100),(4,1,'AAR000415-B','CABO DE CARREGADOR MICRO USB 3.0',25,100),(5,2,'12345','LUVA PFV 3/4',2.5,200),(6,1,'012345678905','CAIXA DE SOM JBL 150W',500,100),(7,1,'ABC123','CABO DE CARREGADOR TYPE-C',25,100),(8,1,'0123456789','CABO DE CARREGADOR IPHONE',50,100);
/*!40000 ALTER TABLE `tb_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_usuario` (
  `pk_id_usuario` bigint(20) NOT NULL AUTO_INCREMENT,
  `us_nome` varchar(100) NOT NULL,
  `us_login` varchar(100) NOT NULL,
  `us_senha` varchar(10) NOT NULL,
  PRIMARY KEY (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'ADMINISTRADOR','ADMIN','123456'),(2,'JEFERSON','JEFIN','1234'),(3,'VALDETE','VALDETE','1234');
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_vendas`
--

DROP TABLE IF EXISTS `tb_vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_vendas` (
  `pk_id_vendas` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_cliente` int(11) NOT NULL,
  `ven_data_venda` date NOT NULL,
  `ven_valor_liquido` double NOT NULL,
  `ven_valor_bruto` double NOT NULL,
  `ven_desconto` double NOT NULL,
  PRIMARY KEY (`pk_id_vendas`),
  KEY `FKIDCLIENTE` (`fk_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_vendas`
--

LOCK TABLES `tb_vendas` WRITE;
/*!40000 ALTER TABLE `tb_vendas` DISABLE KEYS */;
INSERT INTO `tb_vendas` VALUES (2,3,'2020-03-11',25,25,0),(3,1,'2020-03-11',405,450,10);
/*!40000 ALTER TABLE `tb_vendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_vendas_produtos`
--

DROP TABLE IF EXISTS `tb_vendas_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_vendas_produtos` (
  `pk_id_venda_produto` int(11) NOT NULL AUTO_INCREMENT,
  `fk_produto` int(11) NOT NULL,
  `fk_vendas` int(11) NOT NULL,
  `ven_pro_valor` double NOT NULL,
  `ven_pro_qtd` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_venda_produto`),
  KEY `FKIDPRODUTO` (`fk_produto`),
  KEY `FKIDVENDAS` (`fk_vendas`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_vendas_produtos`
--

LOCK TABLES `tb_vendas_produtos` WRITE;
/*!40000 ALTER TABLE `tb_vendas_produtos` DISABLE KEYS */;
INSERT INTO `tb_vendas_produtos` VALUES (6,1,3,450,1),(7,4,2,25,1);
/*!40000 ALTER TABLE `tb_vendas_produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-19 12:28:36
