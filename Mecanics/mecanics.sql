-- phpMyAdmin SQL Dump
-- version 4.2.6deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 27-01-2015 a las 10:07:47
-- Versión del servidor: 5.5.41-0ubuntu0.14.10.1
-- Versión de PHP: 5.5.12-2ubuntu4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

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
('q', 'q', 'q', 'q', 'q', 'q', 'q'),
('1100688006', 'Andres', 'calamaro', 'cll 17 a #6-25', '3016927112', 'Detalle', '11006688005'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '11006688005'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '1323'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '12'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '12'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '23442'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '6666'),
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '21'),
('100467344', 'liceth', 'palomino', 'cr 76e # 23o - 4', 'Celular', 'Detalle', '1102578782');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Cliente`
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
-- Volcado de datos para la tabla `Cliente`
--

INSERT INTO `Cliente` (`TipoIdentificacion`, `primeroNombre`, `segunNombre`, `primeroApellido`, `segundoApellido`, `numeroId`, `direccion`, `celular`, `detalles`) VALUES
('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
('CC', 'Andres', 'Felipe', 'Montana', 'Revollo', '11006688005', 'cll 17 a # 6-59', '3016927111', 'oiga'),
('CC', 'aa', 'bb', 'kkk', 'ppp', '1323', 'asd', '123322', ''),
('CC', 'jjks', 'kjsd', 'kj', 'k', '12', 'asd', 'ki', 'jm'),
('CC', 'Andres', 'Felipe', 'Montana', 'Revollo', '23442', '32322', '44445434', 'kkk'),
('CC', 'afmo', 'caterpiler', 'kdk', 'ksdkj', '6666', 'cvlllsdii', '2039223', 'jdk2'),
('CC', 'a', 'aa', 'aa', 'aa', '21', '12qw', 'ass12233', 'ss'),
('CC', 'julio', 'enrique', 'ospino', 'mejia', '1102578782', 'cr 24u # 4a - 82', '3107489842', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DetalleHistoriaVehiculo`
--

CREATE TABLE IF NOT EXISTS `DetalleHistoriaVehiculo` (
  `codhistori` varchar(30) DEFAULT NULL,
  `cantidad` varchar(10) DEFAULT NULL,
  `Marca` varchar(30) DEFAULT NULL,
  `Referencia` varchar(30) DEFAULT NULL,
  `Detalle` varchar(20) DEFAULT NULL,
  `Rueda` varchar(30) DEFAULT NULL,
  `Valorunitario` varchar(30) DEFAULT NULL,
  `valorTotal` varchar(30) DEFAULT NULL,
  `Valordescuento` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `DetalleHistoriaVehiculo`
--

INSERT INTO `DetalleHistoriaVehiculo` (`codhistori`, `cantidad`, `Marca`, `Referencia`, `Detalle`, `Rueda`, `Valorunitario`, `valorTotal`, `Valordescuento`) VALUES
('12', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
('7', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
('7', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
('8', '2', 'xxx', 'xxxx', 'xxx', 'xxx', '12000', '24000', '22000'),
('8', '2', 'yyy', 'yyyy', 'yyy', 'yyy', '14000', '28000', '23000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dhistoria`
--

CREATE TABLE IF NOT EXISTS `dhistoria` (
  `cantidad` varchar(20) DEFAULT NULL,
  `marca` varchar(300) DEFAULT NULL,
  `referencia` varchar(300) DEFAULT NULL,
  `rueda` varchar(300) DEFAULT NULL,
  `detalle` varchar(300) DEFAULT NULL,
  `valorUnitario` varchar(20) DEFAULT NULL,
  `valorTotal` varchar(20) DEFAULT NULL,
  `valorConDescuento` varchar(20) DEFAULT NULL,
  `indiceHistoria` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiaVehiculo`
--

CREATE TABLE IF NOT EXISTS `historiaVehiculo` (
  `nombre` varchar(50) DEFAULT NULL,
  `placa` varchar(50) DEFAULT NULL,
  `dueno` varchar(20) DEFAULT NULL,
  `chofer` varchar(20) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `valorTotal` varchar(20) DEFAULT NULL,
  `valorTotalConDescuento` varchar(20) DEFAULT NULL,
`indice` bigint(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `historiaVehiculo`
--

INSERT INTO `historiaVehiculo` (`nombre`, `placa`, `dueno`, `chofer`, `fecha`, `valorTotal`, `valorTotalConDescuento`, `indice`) VALUES
('toyota', 'and7', '110021212', '1235456', '2015-01-10 00:00:00', '12000', '160000', 1),
('', '', '', '', '0000-00-00 00:00:00', '20000', '12000', 2),
('m', 'a', 'a', 'a', '2015-01-19 00:00:00', '12', '12', 3),
('chevrolet', 'uvr123', '11006688005', '1100688006', '2015-01-19 00:00:00', '20000', '17000', 4),
('chevrolet', 'oe12', '11006688005', '1100688006', '2015-01-19 00:00:00', '26000', '23000', 5),
('lanborgini', 'cr7', '11006688005', 'Identificacion', '2015-01-27 09:11:00', '24000', '20000', 6),
('toyuirie', 'cr7', '11006688005', '1100688006', '2015-01-27 09:24:00', '63000', '57000', 7),
('camaro', 'yryo32', '11006688005', '1100688006', '2015-01-27 09:35:00', '52000', '45000', 8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `historiaVehiculo`
--
ALTER TABLE `historiaVehiculo`
 ADD PRIMARY KEY (`indice`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `historiaVehiculo`
--
ALTER TABLE `historiaVehiculo`
MODIFY `indice` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
