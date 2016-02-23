-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db_city_planning
--

CREATE DATABASE IF NOT EXISTS db_city_planning;
USE db_city_planning;

--
-- Definition of table `provinces`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `region_id` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinces`
--

/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (1,2,'Agusan del Norte','Butuan City'),
 (2,2,'Agusan del Norte','Cabadbaran City'),
 (3,3,'Agusan del Sur','Bayugan '),
 (4,5,'Albay','Ligao City'),
 (5,5,'Albay','Tabaco City'),
 (6,9,'Basilan', 'Luzon REGION II (Cagayan Valley)','3', 'Isabela City'),
 (7,9,'Basilan','Lamitan City '),
 (8,82,'Bataan', 'Luzon REGION III (Central Luzon)','4', 'Balanga City'),
 (9,11,'Batangas', 'Luzon REGION IV-A (CALABARZON)','5', 'Batangas City'),
 (10,11,'Batangas','Luzon REGION IV-A (CALABARZON)','5', 'Lipa City'),
 (11,11,'Batangas', 'Luzon REGION IV-A (CALABARZON)','5','Tanauan City '),
 (12,12,'Benguet','Baguio City'),
 (13,14,'Bohol','Tagbilaran City'),
 (14,15,'Bukidnon','Malaybalay City'),
 (15,15,'Bukidnon','Valencia City '),
 (16,16,'Bulacan', 'Luzon REGION III (Central Luzon)','4', 'Malolos City'),
 (17,16,'Bulacan', 'Luzon REGION III (Central Luzon)','4', 'Meycauayan City'),
 (18,16,'Bulacan', 'Luzon REGION III (Central Luzon)','4', 'San Jose del Monte City'),
 (19,17,'Cagayan', 'Luzon REGION II (Cagayan Valley)','3','Tuguegarao City'),
 (20,19,'Camarines Sur','Iriga City'),
 (21,19,'Camarines Sur','Naga City '),
 (22,21,'Capiz','Roxas City '),
 (23,23,'Cavite', 'Luzon REGION IV-A (CALABARZON)','5', 'Cavite City'),
 (24,23,'Cavite', 'Luzon REGION IV-A (CALABARZON)','5', 'Tagaytay City'),
 (25,23,'Cavite', 'Luzon REGION IV-A (CALABARZON)','5', 'Trece Martires City'),
 (26,24,'Cebu','Argao City'),
 (27,24,'Cebu','Bogo City');
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (28,24,'Cebu','Carcar City'),
 (29,24,'Cebu','Cebu City'),
 (30,24,'Cebu','Danao City'),
 (31,24,'Cebu','Lapu-Lapu City'),
 (32,24,'Cebu','Mandaue City'),
 (33,24,'Cebu','Talisay City'),
 (34,24,'Cebu','Toledo City'),
 (35,24,'Cebu','Naga City '),
 (36,26,'Cotabato','Kidapawan City'),
 (37,27,'Davao del Norte','Island Garden City of Samal'),
 (38,27,'Davao del Norte','Panabo City'),
 (39,27,'Davao del Norte','Tagum City'),
 (40,28,'Davao del Sur','Davao City'),
 (41,28,'Davao del Sur','Digos City '),
 (42,30,'Davao Oriental','Mati City'),
 (43,32,'Eastern Samar','Borongan City '),
 (44,35,'Ilocos Norte', 'Luzon REGION I (Ilocos Region)','2', 'Laoag City'),
 (45,35,'Ilocos Norte', 'Luzon REGION I (Ilocos Region)','2','Batac City '),
 (46,36,'Ilocos Sur', 'Luzon REGION I (Ilocos Region)','2', 'Candon City'),
 (47,36,'Ilocos Sur', 'Luzon REGION I (Ilocos Region)','2','Vigan City '),
 (48,37,'Ilo-Ilo','Passi City'),
 (49,37,'Ilo-Ilo','Iloilo City '),
 (50,38,'Isabella','Cauayan City'),
 (51,38,'Isabella','Santiago City'),
 (52,39,'Kalinga','Tabuk City'),
 (53,40,'La Union', 'Luzon REGION I (Ilocos Region)','2','San Fernando City'),
 (54,41,'Laguna', 'Luzon REGION IV-A (CALABARZON)','5', 'Calamba City');
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (55,41,'Laguna', 'Luzon REGION IV-A (CALABARZON)','5', 'San Pablo City'),
 (56,41,'Laguna', 'Luzon REGION IV-A (CALABARZON)','5', 'Santa Rosa City '),
 (57,42,'Lanao del Norte','Iligan City'),
 (58,43,'Lanao del Sur','Marawi City '),
 (59,44,'Leyte','Baybay City'),
 (60,44,'Leyte','Ormoc City'),
 (61,44,'Leyte','Tacloban City'),
 (62,45,'Maguindanao','Cotabato City'),
 (63,46,'Marinduque','Boac'),
 (64,46,'Marinduque','Buenavista'),
 (65,46,'Marinduque','Gasan'),
 (66,46,'Marinduque','Mogpog'),
 (67,46,'Marinduque','Santa Cruz'),
 (68,46,'Marinduque','Torrijos '),
 (69,47,'Masbate','Masbate City'),
 (70,81,'Metro Manila','Caloocan'),
 (71,81,'Metro Manila','Las Pi¤as'),
 (72,81,'Metro Manila','Makati'),
 (73,81,'Metro Manila','Malabon'),
 (74,81,'Metro Manila','Mandaluyong'),
 (75,81,'Metro Manila','Manila'),
 (76,81,'Metro Manila','Marikina'),
 (77,81,'Metro Manila','Muntinlupa'),
 (78,81,'Metro Manila','Navotas'),
 (79,81,'Metro Manila','Para¤aque'),
 (80,81,'Metro Manila','Pasay'),
 (81,81,'Metro Manila','Pasig'),
 (82,81,'Metro Manila','Quezon City');
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (83,81,'Metro Manila','San Juan'),
 (84,81,'Metro Manila','Taguig'),
 (85,81,'Metro Manila','Valenzuela '),
 (86,48,'Misamis Occidental','Oroquieta City'),
 (87,48,'Misamis Occidental','Ozamis City'),
 (88,48,'Misamis Occidental','Tangub City '),
 (89,49,'Misamis Oriental', 'Luzon REGION II (Cagayan Valley)','3','Cagayan de Oro'),
 (90,49,'Misamis Oriental','Gingoog City'),
 (91,49,'Misamis Oriental','El Salvador City '),
 (92,51,'Negros Occidental','Bacolod City'),
 (93,51,'Negros Occidental','Bago City'),
 (94,51,'Negros Occidental','Cadiz City'),
 (95,51,'Negros Occidental','Escalante City'),
 (96,51,'Negros Occidental','Himamaylan City'),
 (97,51,'Negros Occidental','Kabankalan City'),
 (98,51,'Negros Occidental','La Carlota City'),
 (99,51,'Negros Occidental','Sagay City'),
 (100,51,'Negros Occidental','San Carlos City'),
 (101,51,'Negros Occidental','Silay City'),
 (102,51,'Negros Occidental','Sipalay City'),
 (103,51,'Negros Occidental','Talisay City'),
 (104,51,'Negros Occidental','Victorias City ');
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (105,52,'Negros Oriental','Bais'),
 (106,52,'Negros Oriental','Bayawan'),
 (107,52,'Negros Oriental','Canlaon'),
 (108,52,'Negros Oriental','Dumaguete'),
 (109,52,'Negros Oriental','Guihulngan'),
 (110,52,'Negros Oriental','Tanjay '),
 (111,54,'Nueva Ecija', 'Luzon REGION III (Central Luzon)','4', 'Cabanatuan City'),
 (112,54,'Nueva Ecija', 'Luzon REGION III (Central Luzon)','4', 'Gapan City'),
 (113,54,'Nueva Ecija', 'Luzon REGION III (Central Luzon)','4', 'Palayan City'),
 (114,54,'Nueva Ecija', 'Luzon REGION III (Central Luzon)','4', 'San Jose City'),
 (115,54,'Nueva Ecija', 'Luzon REGION III (Central Luzon)','4', 'Science City of Mu¤oz '),
 (116,57,'Oriental Mindoro','Calapan City'),
 (117,58,'Puerto Princessa','Puerto Princesa City'),
 (118,59,'Pampanga', 'Luzon REGION III (Central Luzon)','4', 'Angeles City'),
 (119,59,'Pampanga', 'Luzon REGION III (Central Luzon)','4', 'City of San Fernando '),
 (120,60,'Pangasinan', 'Luzon REGION I (Ilocos Region)','2', 'Alaminos City'),
 (121,60,'Pangasinan', 'Luzon REGION I (Ilocos Region)','2', 'Dagupan City'),
 (122,60,'Pangasinan', 'Luzon REGION I (Ilocos Region)','2', 'San Carlos City'),
 (123,60,'Pangasinan', 'Luzon REGION I (Ilocos Region)','2', 'Urdaneta City '),
 (124,61,'Quezon', 'Luzon REGION IV-A (CALABARZON)','5', 'Lucena City'),
 (125,61,'Quezon', 'Luzon REGION IV-A (CALABARZON)','5', 'Tayabas City '),
 (126,63,'Rizal', 'Luzon REGION IV-A (CALABARZON)','5', 'Antipolo City'),
 (127,65,'Samar','Catbalogan City'),
 (128,65,'Samar','Calbayog City ');
INSERT INTO `cities` (`id`,`province_id`,`province`, `region`, `region_id`,`city`) VALUES 
 (129,68,'Sorsogon','Sorsogon City'),
 (130,69,'South Cotabato','General Santos City'),
 (131,69,'South Cotabato','Koronadal City'),
 (132,70,'Southern Leyte','Maasin CIty'),
 (133,71,'Sultan Kudarat','Tacurong City'),
 (134,73,'Surigao del Norte','Surigao City '),
 (135,74,'Surigao del Sur','Bislig CIty'),
 (136,74,'Surigao del Sur','Tandag CIty'),
 (137,75,'Tarlac', 'Luzon REGION III (Central Luzon)','4', 'Tarlac City'),
 (138,77,'Zambales', 'Luzon REGION III (Central Luzon)','4', 'Olongapo City'),
 (139,78,'Zamboanga del Norte','Dapitan City'),
 (140,79,'Zamboanga del Norte','Dipolog CIty'),
 (141,80,'Zamboanga del Sur','Pagadian City'),
 (142,81,'Zamboanga del Sur','Zamboanga City');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;



--
-- Definition of table `regions`
--

DROP TABLE IF EXISTS `regions`;
CREATE TABLE `regions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regions`
--

/*!40000 ALTER TABLE `regions` DISABLE KEYS */;
INSERT INTO `regions` (`id`,`region`) VALUES 
 (1,'National Capital Region (NCR)'),
 (2,'Luzon REGION I (Ilocos Region)'),
 (3,'Luzon REGION II (Cagayan Valley)'),
 (4,'Luzon REGION III (Central Luzon)'),
 (5,'Luzon REGION IV-A (CALABARZON)'),
 (6,'REGION IV-B (MIMAROPA)'),
 (7,'REGION V (Bicol Region)'),
 (8,'REGION VI (Western Visayas)'),
 (9,'REGION VII (Central Visayas)'),
 (10,'REGION VIII (Eastern Visayas)'),
 (11,'REGION IX (Zamboanga Peninsula)'),
 (12,'REGION X (Northern Mindanao)'),
 (13,'REGION XI (Davao Region)'),
 (14,'REGION XII (Soccsksargen)'),
 (15,'REGION XIII (CARAGA)'),
 (16,'Luzon REGION XIV Cordillera Administrative Region (CAR)'),
 (17,'REGION XV - Autonomous Region in Muslim Mindanao (ARMM)'),
 (18,'Region XVIII - NIR - Negros Island Region');
/*!40000 ALTER TABLE `regions` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
