-- phpMyAdmin SQL Dump
-- version 4.0.6deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 16, 2014 at 07:03 PM
-- Server version: 5.5.35-0ubuntu0.13.10.2
-- PHP Version: 5.5.3-1ubuntu2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mecanics`
--
CREATE DATABASE mecanics;
USE mecanics;
-- --------------------------------------------------------

--
-- Table structure for table `chofer`
--

CREATE TABLE IF NOT EXISTS `chofer` (
  `Identificacion` varchar(20) DEFAULT NULL,
  `Nombres` varchar(20) DEFAULT NULL,
  `Apellidos` varchar(20) DEFAULT NULL,
  `Direccion` varchar(20) DEFAULT NULL,
  `Celular` varchar(20) DEFAULT NULL,
  `Detalle` varchar(20) DEFAULT NULL,
  `clienteid` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chofer`
--

INSERT INTO `chofer` (`Identificacion`, `Nombres`, `Apellidos`, `Direccion`, `Celular`, `Detalle`, `clienteid`) VALUES
('q', 'q', 'q', 'q', 'q', 'q', 'q');

-- --------------------------------------------------------

--
-- Table structure for table `Cliente`
--

CREATE TABLE IF NOT EXISTS `Cliente` (
  `TipoIdentificacion` varchar(20) DEFAULT NULL,
  `primeroNombre` varchar(20) DEFAULT NULL,
  `segunNombre` varchar(20) DEFAULT NULL,
  `primeroApellido` varchar(20) DEFAULT NULL,
  `segundoApellido` varchar(20) DEFAULT NULL,
  `numeroId` varchar(20) DEFAULT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `detalles` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Cliente`
--

INSERT INTO `Cliente` (`TipoIdentificacion`, `primeroNombre`, `segunNombre`, `primeroApellido`, `segundoApellido`, `numeroId`, `direccion`, `celular`, `detalles`) VALUES
('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
