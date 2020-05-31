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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `tb_produto`
--

DROP TABLE IF EXISTS `tb_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_produto` (
  `pk_id_produto` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_fornecedor` int(11) NOT NULL,
  `codigo_barras` varchar(20) NOT NULL,
  `prod_nome` varchar(350) NOT NULL,
  `prod_valor` double NOT NULL,
  `prod_estoque` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_produto`),
  KEY `FKIDFORNECEDOR` (`fk_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
INSERT INTO `tb_usuario` VALUES (1,'ADMINISTRADOR','ADMIN','123456');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-11 16:49:11
