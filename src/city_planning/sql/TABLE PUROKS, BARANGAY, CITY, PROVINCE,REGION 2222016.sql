--
-- Definition of table `streets`
--

DROP TABLE IF EXISTS `streets`;
CREATE TABLE `streets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street` varchar(100) DEFAULT NULL,
  `purok_id` int(11) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `streets`
--


--
-- Definition of table `puroks`
--
DROP TABLE IF EXISTS `puroks`;
CREATE TABLE `puroks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `purok` varchar(100) DEFAULT NULL,
  `barangay_id` int(11) DEFAULT NULL,
  `barangay` varchar(100) DEFAULT NULL,
   `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
 `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `puroks`
--

--
-- Definition of table `barangay`
--

DROP TABLE IF EXISTS `barangays`;
CREATE TABLE `barangays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `barangay` varchar(100) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
 `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=332 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barangay`
--

--
-- Definition of table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(100) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--


--
-- Definition of table `provinces`
--

DROP TABLE IF EXISTS `provinces`;
CREATE TABLE `provinces` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(100) DEFAULT NULL,
  `region_id` int(11) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinces`
--

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