-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-02-2017 a las 06:50:10
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `callcenter`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `motivo`
--

CREATE TABLE `motivo` (
  `id` int(10) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `motivo`
--

INSERT INTO `motivo` (`id`, `nombre`) VALUES
(1, 'chat colgado'),
(2, 'llamada colgada'),
(3, 'seguimiento');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `id` int(10) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`id`, `nombre`) VALUES
(1, 'colombia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `id` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `admin` int(10) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id`, `fecha`, `admin`, `nombre`) VALUES
(1, '2016-10-17', 1, 'proyecto 1'),
(2, '2016-10-17', 2, 'proyecto 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `id` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `pais` int(10) DEFAULT NULL,
  `colaborador` int(10) NOT NULL,
  `motivo` int(10) NOT NULL,
  `comentario` text NOT NULL,
  `terminadaPor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`id`, `fecha`, `pais`, `colaborador`, `motivo`, `comentario`, `terminadaPor`) VALUES
(1, '2016-10-17', 1, 1, 1, 'eh eh eh epa he', 'Agente'),
(2, '2016-10-17', 1, 2, 2, 'habia una vez y despues ya no habia ', 'Usuario'),
(3, '2016-10-17', 1, 1, 1, 'eh eh eh e3123pa he', 'Agente'),
(4, '2016-10-17', 1, 2, 2, 'habia una 213123vez y despues ya no habia ', 'Usuario'),
(5, '2016-10-17', 1, 1, 1, 'eh eh eh e123123123pa he', 'Agente'),
(6, '2016-10-17', 1, 2, 2, 'habia unaqdqdqd vez y despues ya no habia ', 'Usuario'),
(7, '2016-10-17', 1, 1, 1, 'eh eh ehqdqdqd epa he', 'Agente'),
(8, '2016-10-17', 1, 2, 2, 'habia una123123 vez y despues ya no habia ', 'Usuario'),
(9, '2016-10-17', 1, 1, 1, 'eh eh ehdqwdqd epa he', 'Agente'),
(10, '2016-10-17', 1, 2, 2, 'habia uqdqdna vez y despues ya no habia ', 'Usuario'),
(11, '2016-10-17', 1, 1, 1, 'eh eqdqdh eh epa he', 'Agente'),
(12, '2016-10-17', 1, 2, 2, 'habia u213123na vez y despues ya no habia ', 'Usuario'),
(13, '2016-10-17', 1, 1, 1, 'eh eh eh123213 epa he', 'Agente'),
(14, '2016-10-17', 1, 2, 2, 'habia uqdqdqdna vez y despues ya no habia ', 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(10) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `fechaInicio` date NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `idEmpresa` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `proyecto` int(10) NOT NULL,
  `admitido` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `apellidos`, `correo`, `fechaInicio`, `contrasena`, `idEmpresa`, `telefono`, `tipo`, `proyecto`, `admitido`) VALUES
(1, 'Pedro', 'Dominguez', 'mguillermo.ochoa@udea.edu.coxD', '2016-10-17', 'qwqsqs', '123', '122121212', 'admin', 1, 1),
(2, 'Andres', 'Rodriguez', 'noresponder@yahoo.es', '2016-10-17', 'sdqdqdqd', '213', '1212131313', 'colaborador', 0, 1),
(3, 'Camila', 'Largo', 'nomelose@live.com', '2016-10-17', 'wqdqwdqwd', '1234', '818812821', 'colaborador', 1, 0),
(4, 'Elisa', 'tutucuerpo', 'que@gmail.com', '2016-10-17', 'qdqwdwdwa', '654', '18291829129', 'colaborador', 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `motivo`
--
ALTER TABLE `motivo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `motivo`
--
ALTER TABLE `motivo`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
