-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 25-03-2015 a las 14:49:42
-- Versión del servidor: 5.5.28
-- Versión de PHP: 5.4.3



SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

CREATE database mecanics;
use mecanics;

--
-- Base de datos: `mecanics`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
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
-- Volcado de datos para la tabla `chofer`
--

INSERT INTO `chofer` (`Identificacion`, `Nombres`, `Apellidos`, `Direccion`, `Celular`, `Detalle`, `clienteid`) VALUES
('1100688006', 'Julio Enrique', 'Ospino Mejia', 'cll 18a #6-59', '3016927111', 'Ninguno', '1100688005'),
('1100688007', 'Alfredo Jose', 'Salas', 'cll 19a #6-59', '3016927112', 'Detalle', '1100688005'),
('12', 'a', 'bv', 'cll1233', '1102', 'Detalle', '1029'),
('110068805', 'Andres', 'montana', 'cll17a #6-59', '3016927111', 'ninguno', '1102578782'),
('110068806', 'Katherine', 'vitar', 'cll18a #7-59', '3026927177', 'Detalle', '1102578782'),
('100028272', 'fabio', 'palenque', 'cll19a #5-19', 'Celular', 'Detalle', '1102578782'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '1100688003'),
('1200', 'pedro', 'rodriguez', 'Direccion', 'Celular', 'Detalle', '102254');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
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
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`TipoIdentificacion`, `primeroNombre`, `segunNombre`, `primeroApellido`, `segundoApellido`, `numeroId`, `direccion`, `celular`, `detalles`) VALUES
('CC', 'Andres', 'Felipe', 'Montana', 'Revollo', '1100688005', 'cll17a #6-59', '301692711', 'cliente estrella	'),
('CC', 'Julio', 'enrique', 'ospino', 'mejia', '1102578782', 'kr 24u #4a-82', '3107489842', 'ninguno'),
('CC', 'Andres', 'Felipe', 'calamaro', 'revollo', '1100688003', 'cll17a # 6-59', '3016927111', 'ciego	'),
('CC', 'juan', 'sdfsdf', 'sdfsd', 'sdfsd', '102254', 'crrsfsdfjj', '3100255544', 'nnn');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallehistoriavehiculo`
--

CREATE TABLE IF NOT EXISTS `detallehistoriavehiculo` (
  `codhistori` varchar(30) DEFAULT NULL,
  `cantidad` varchar(10) DEFAULT NULL,
  `Marca` varchar(30) DEFAULT NULL,
  `Referencia` text,
  `Detalle` text,
  `Rueda` text,
  `Valorunitario` varchar(30) DEFAULT NULL,
  `valorTotal` varchar(30) DEFAULT NULL,
  `Valordescuento` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallehistoriavehiculo`
--

INSERT INTO `detallehistoriavehiculo` (`codhistori`, `cantidad`, `Marca`, `Referencia`, `Detalle`, `Rueda`, `Valorunitario`, `valorTotal`, `Valordescuento`) VALUES
('1', '2', 'evolutionity', '23-12', 'alerones', 'derecha superior', '12000', '24000', '22000'),
('2', '2', 'micolta', 'ub43', 'alerones postisos', 'izquierda superior', '50000', '100000', '90000'),
('2', '4', 'pistones uvr', 'hu455', 'pistones jodidos', 'inferior izquierda', '60000', '240000', '23000'),
('6', '1', 'kenda', 'nn', 'el veiculo vino con la placa dobla y la llanta desgastada', 'la rueda tracera hay q cambiarle las banda', '9500', '9500', '9500');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiavehiculo`
--

CREATE TABLE IF NOT EXISTS `historiavehiculo` (
  `nombre` varchar(50) DEFAULT NULL,
  `placa` varchar(50) DEFAULT NULL,
  `dueno` varchar(20) DEFAULT NULL,
  `chofer` varchar(20) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `valorTotal` varchar(20) DEFAULT NULL,
  `valorTotalConDescuento` varchar(20) DEFAULT NULL,
  `indice` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`indice`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `historiavehiculo`
--

INSERT INTO `historiavehiculo` (`nombre`, `placa`, `dueno`, `chofer`, `fecha`, `valorTotal`, `valorTotalConDescuento`, `indice`) VALUES
('Camaro', 'msi23', '1100688005', '1100688006', '2015-02-20 09:46:17', '24000', '22000', 1),
('mazda3', 'uv5', '1102578782', '100028272', '2015-03-05 10:00:00', '340000', '113000', 2),
('pulsar', 'ndu 45d', '102254', '1200', '2015-03-25 14:05:07', '9500', '9500', 3),
('pulsar', 'ndu 45d', '102254', '1200', '2015-03-25 18:04:06', '9500', '9500', 4),
('pulsar', 'ndu 45d', '102254', '1200', '2015-03-25 04:04:05', '9500', '9500', 5),
('pulsar', 'ndu 45d', '102254', '1200', '2015-03-25 04:06:05', '9500', '9500', 6);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
