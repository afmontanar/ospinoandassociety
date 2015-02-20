-- phpMyAdmin SQL Dump
-- version 4.2.6deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 20-02-2015 a las 09:58:01
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
('1100688006', 'Julio Enrique', 'Ospino Mejia', 'cll 18a #6-59', '3016927111', 'Ninguno', '1100688005'),
('1100688007', 'Alfredo Jose', 'Salas', 'cll 19a #6-59', '3016927112', 'Detalle', '1100688005'),
('12', 'a', 'bv', 'cll1233', '1102', 'Detalle', '1029');

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
('CC', 'Andres', 'Felipe', 'Montana', 'Revollo', '1100688005', 'cll17a #6-59', '301692711', 'cliente estrella	');

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
('1', '2', 'evolutionity', '23-12', 'alerones', 'derecha superior', '12000', '24000', '22000');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `historiaVehiculo`
--

INSERT INTO `historiaVehiculo` (`nombre`, `placa`, `dueno`, `chofer`, `fecha`, `valorTotal`, `valorTotalConDescuento`, `indice`) VALUES
('Camaro', 'msi23', '1100688005', '1100688006', '2015-02-20 09:46:17', '24000', '22000', 1);

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
MODIFY `indice` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
