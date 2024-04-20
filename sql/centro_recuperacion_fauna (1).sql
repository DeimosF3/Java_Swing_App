-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-04-2024 a las 19:28:17
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `centro_recuperacion_fauna`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aves`
--

CREATE TABLE `aves` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_entrada` date DEFAULT curdate(),
  `especie` varchar(50) NOT NULL,
  `peso` varchar(10) DEFAULT NULL,
  `tipo_lesion` varchar(100) NOT NULL,
  `gravedad` varchar(20) DEFAULT NULL,
  `cazaFurtiva` tinyint(1) DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `veterinario_salida` varchar(50) DEFAULT NULL,
  `fecha_fallecimiento` date DEFAULT NULL,
  `certificado_fallecimiento` varchar(50) DEFAULT NULL,
  `tratamiento` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `aves`
--

INSERT INTO `aves` (`id`, `nombre`, `fecha_entrada`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `cazaFurtiva`, `fecha_salida`, `veterinario_salida`, `fecha_fallecimiento`, `certificado_fallecimiento`, `tratamiento`) VALUES
(1, 'Apolo', '2024-04-10', 'Halcón peregrino', '1.20', 'Fractura ala', 'Moderado', 1, NULL, NULL, NULL, NULL, 'Ibuprofeno'),
(2, 'Luna', '2024-04-10', 'Lechuza común', '0.80', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL),
(3, 'Zeus', '2024-04-10', 'Cuervo común', '1.50', 'Fractura pico', 'Moderado', 0, NULL, NULL, NULL, NULL, NULL),
(4, 'Aurora', '2024-04-10', 'Gavilán común', '0.90', 'Herida grave', 'Grave', 0, NULL, NULL, NULL, NULL, NULL),
(5, 'Thor', '2024-04-10', 'Aguilucho lagunero', '1.10', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL),
(6, 'Gaia', '2024-04-10', 'Busardo ratonero', '1.40', 'Fractura ala', 'Moderado', 1, NULL, NULL, NULL, NULL, NULL),
(7, 'Eolo', '2024-04-10', 'Milano negro', '1.30', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL),
(8, 'Artemisa', '2024-04-10', 'Lechuza común', '1.00', 'Fractura pata', 'Moderado', 0, NULL, NULL, NULL, NULL, NULL),
(9, 'Hércules', '2024-04-10', 'Cernícalo vulgar', '1.10', 'Herida grave', 'Grave', 1, NULL, NULL, NULL, NULL, NULL),
(10, 'Diana', '2024-04-10', 'Cernícalo común', '1.20', 'Herida grave', 'Grave', 1, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mamiferos`
--

CREATE TABLE `mamiferos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_entrada` date DEFAULT curdate(),
  `especie` varchar(50) NOT NULL,
  `peso` varchar(10) DEFAULT NULL,
  `tipo_lesion` varchar(100) NOT NULL,
  `gravedad` varchar(20) DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `veterinario_salida` varchar(50) DEFAULT NULL,
  `fecha_fallecimiento` date DEFAULT NULL,
  `certificado_fallecimiento` varchar(50) DEFAULT NULL,
  `atropello` tinyint(1) DEFAULT NULL,
  `tratamiento` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mamiferos`
--

INSERT INTO `mamiferos` (`id`, `nombre`, `fecha_entrada`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `fecha_salida`, `veterinario_salida`, `fecha_fallecimiento`, `certificado_fallecimiento`, `atropello`, `tratamiento`) VALUES
(1, 'Osito', '2024-04-10', 'Oso pardo', '150.50', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 1, NULL),
(2, 'Zorro', '2024-04-10', 'Zorro rojo', '7.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(3, 'Pantera', '2024-04-10', 'Pantera negra', '100.00', 'Fractura de mandíbula', 'Grave', NULL, NULL, NULL, NULL, 0, NULL),
(4, 'Lince', '2024-04-10', 'Lince ibérico', '25.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(5, 'Canguro', '2024-04-10', 'Canguro rojo', '50.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 0, NULL),
(6, 'Elefante', '2024-04-10', 'Elefante africano', '5000.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, 0, NULL),
(7, 'Tigre', '2024-04-10', 'Tigre siberiano', '200.00', 'Contusión', 'Moderado', NULL, NULL, NULL, NULL, 0, NULL),
(8, 'León', '2024-04-10', 'León africano', '180.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 1, NULL),
(9, 'Jirafa', '2024-04-10', 'Jirafa reticulada', '900.00', 'Contusión', 'Leve', NULL, NULL, NULL, NULL, 1, NULL),
(10, 'Hipopótamo', '2024-04-10', 'Hipopótamo común', '2000.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(11, 'a', '2024-04-20', 'a', '2', 'a', 'Leve', NULL, NULL, NULL, NULL, 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reptiles`
--

CREATE TABLE `reptiles` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_entrada` date DEFAULT curdate(),
  `especie` varchar(50) NOT NULL,
  `peso` varchar(10) DEFAULT NULL,
  `tipo_lesion` varchar(100) NOT NULL,
  `gravedad` varchar(20) DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `veterinario_salida` varchar(50) DEFAULT NULL,
  `fecha_fallecimiento` date DEFAULT NULL,
  `certificado_fallecimiento` varchar(50) DEFAULT NULL,
  `infeccion_bacteriana` tinyint(1) DEFAULT NULL,
  `tratamiento` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reptiles`
--

INSERT INTO `reptiles` (`id`, `nombre`, `fecha_entrada`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `fecha_salida`, `veterinario_salida`, `fecha_fallecimiento`, `certificado_fallecimiento`, `infeccion_bacteriana`, `tratamiento`) VALUES
(1, 'Tortuguita', '2024-04-10', 'Tortuga boba', '5.00', 'Fractura de caparazón', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(2, 'Cocodrilo', '2024-04-10', 'Cocodrilo del Nilo', '200.00', 'Mordedura', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(3, 'Iguana', '2024-04-10', 'Iguana verde', '2.50', 'Mordedura', 'Leve', NULL, NULL, NULL, NULL, 1, NULL),
(4, 'Boa', '2024-04-10', 'Boa constrictor', '15.00', 'Fractura de columna', 'Grave', NULL, NULL, NULL, NULL, 1, NULL),
(5, 'Tortuga', '2024-04-10', 'Tortuga de tierra', '10.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 0, NULL),
(6, 'Cobra', '2024-04-10', 'Cobra real', '3.00', 'Mordedura', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(7, 'Dragón', '2024-04-10', 'Dragón de Komodo', '70.00', 'Mordedura', 'Moderado', NULL, NULL, NULL, NULL, 0, NULL),
(8, 'Tortuga Marina', '2024-04-10', 'Tortuga laúd', '500.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 1, NULL),
(9, 'Serpiente Rey', '2024-04-10', 'Serpiente de cascabel', '2.00', 'Mordedura', 'Moderado', NULL, NULL, NULL, NULL, 0, NULL),
(10, 'Gecko', '2024-04-10', 'Gecko común', '0.10', 'Herida leve', 'Leve', NULL, NULL, NULL, NULL, 0, NULL),
(11, 'Tortuga de agua', '2024-04-10', 'Tortuga de orejas rojas', '3.50', 'Herida leve', 'Leve', NULL, NULL, NULL, NULL, 0, NULL),
(12, 'Varano', '2024-04-10', 'Varanus salvator', '20.00', 'Fractura de cola', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(13, 'Tortuga Terrestre', '2024-04-10', 'Testudinidae', '6.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, 1, NULL),
(14, 'Camaleón', '2024-04-10', 'Chamaeleonidae', '0.30', 'Contusión', 'Leve', NULL, NULL, NULL, NULL, 0, NULL),
(15, 'Caimán', '2024-04-10', 'Caiman crocodilus', '25.00', 'Mordedura', 'Moderado', NULL, NULL, NULL, NULL, 1, NULL),
(16, 'Arturito', '2024-04-10', 'Tortuga de orejas rojas', '3.50', 'Herida leve', 'Leve', NULL, NULL, NULL, NULL, 0, NULL),
(17, 'REPTI', '2024-04-20', 'reptando', '2', 'no tiene cola', 'Leve', NULL, NULL, NULL, NULL, 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `veterinario`
--

CREATE TABLE `veterinario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `veterinario`
--

INSERT INTO `veterinario` (`id`, `nombre`, `apellido`, `telefono`) VALUES
(1, 'Juan', 'García', '123-456-7890'),
(2, 'María', 'López', '987-654-3210'),
(3, 'Carlos', 'Martínez', '555-123-4567'),
(4, 'Ana', 'Rodríguez', '111-222-3333'),
(5, 'Pedro', 'Sánchez', '999-888-7777');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aves`
--
ALTER TABLE `aves`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mamiferos`
--
ALTER TABLE `mamiferos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reptiles`
--
ALTER TABLE `reptiles`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `veterinario`
--
ALTER TABLE `veterinario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aves`
--
ALTER TABLE `aves`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `mamiferos`
--
ALTER TABLE `mamiferos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `reptiles`
--
ALTER TABLE `reptiles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `veterinario`
--
ALTER TABLE `veterinario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
