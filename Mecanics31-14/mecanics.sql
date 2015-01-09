-- phpMyAdmin SQL Dump
-- version 4.2.6deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-12-2014 a las 11:18:55
-- Versión del servidor: 5.5.40-0ubuntu1
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
('Identificacion', 'Nombres', 'Apellidos', 'Direccion', 'Celular', 'Detalle', '21');

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
('CC', 'a', 'aa', 'aa', 'aa', '21', '12qw', 'ass12233', 'ss');

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
`indice` bigint(20) NOT NULL,
  `valorTotal` varchar(20) DEFAULT NULL,
  `valorTotalConDescuento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
MODIFY `indice` bigint(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
