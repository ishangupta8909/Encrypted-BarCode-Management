-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 08, 2014 at 05:21 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `barcodesecurity`
--
CREATE DATABASE IF NOT EXISTS `barcodesecurity` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `barcodesecurity`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` varchar(50) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(22) DEFAULT NULL,
  `quantity` varchar(5) DEFAULT NULL,
  `status` varchar(33) DEFAULT NULL,
  `state` varchar(34) DEFAULT NULL,
  `tdate` varchar(45) DEFAULT NULL,
  `rdate` varchar(34) DEFAULT NULL,
  `owner` varchar(45) DEFAULT NULL,
  `barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `name`, `quantity`, `status`, `state`, `tdate`, `rdate`, `owner`, `barcode`) VALUES
(1, 'a', '2', 'OUT', 'TEMP', '8/6/114', '7/8/14', 'dfsgrfgf', '1069'),
(2, 'a', '2', 'OUT', 'TEMP', '8/6/114', '7/8/14', 'dfsgrfgf', '3114'),
(3, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '6640'),
(4, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '4690'),
(5, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '2274'),
(6, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '3743'),
(7, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '7293'),
(8, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '9293'),
(9, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '8206'),
(10, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '4880'),
(11, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '3497'),
(12, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '2726'),
(13, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '881'),
(14, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '3183'),
(15, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '3995'),
(16, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '178'),
(17, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '719'),
(18, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '754'),
(19, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '7243'),
(20, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '3232'),
(21, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '2087'),
(22, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '1808'),
(23, 'sdfsd', '2', 'IN', 'TEMP', '8/6/114', '7/8/14', 'a', '8635'),
(24, 'k', '3', 'IN', 'TEMP', '8/6/114', '7/8/14', 'd', '471');

-- --------------------------------------------------------

--
-- Table structure for table `securitymanager`
--

CREATE TABLE IF NOT EXISTS `securitymanager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(33) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `contact` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `securitymanager`
--

INSERT INTO `securitymanager` (`id`, `name`, `gender`, `dob`, `contact`, `email`, `address`, `password`) VALUES
(2, 'Rohit', 'Male', '12/12/1990', '987654322234', 'rohit@gmail.com', 'chd', '12345'),
(3, 'jasleen', 'Female', '5/2/1994', '45782922233', 'maan@gmail.com', 'chdd', '9729');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
