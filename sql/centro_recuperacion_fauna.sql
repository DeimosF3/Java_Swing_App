-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-04-2024 a las 18:57:27
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
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `id` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `especie` varchar(50) NOT NULL,
  `peso` varchar(10) DEFAULT NULL,
  `tipo_lesion` varchar(100) NOT NULL,
  `gravedad` varchar(20) DEFAULT NULL,
  `motivo_lesion` tinyint(1) DEFAULT NULL,
  `infeccion_bacteriana` tinyint(1) DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `veterinario_salida` varchar(50) DEFAULT NULL,
  `fecha_fallecimiento` date DEFAULT NULL,
  `certificado_fallecimiento` varchar(50) DEFAULT NULL,
  `atropello` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`id`, `tipo`, `nombre`, `fecha_entrada`, `especie`, `peso`, `tipo_lesion`, `gravedad`, `motivo_lesion`, `infeccion_bacteriana`, `fecha_salida`, `veterinario_salida`, `fecha_fallecimiento`, `certificado_fallecimiento`, `atropello`) VALUES
(1, 'ave', 'Apolo', '2024-04-10', 'Halcón peregrino', '1.20', 'Fractura ala', 'Moderado', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'ave', 'Luna', '2024-04-10', 'Lechuza común', '0.80', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'ave', 'Zeus', '2024-04-10', 'Cuervo común', '1.50', 'Fractura pico', 'Moderado', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'ave', 'Aurora', '2024-04-10', 'Gavilán común', '0.90', 'Herida grave', 'Grave', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(5, 'ave', 'Thor', '2024-04-10', 'Aguilucho lagunero', '1.10', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(6, 'ave', 'Gaia', '2024-04-10', 'Busardo ratonero', '1.40', 'Fractura ala', 'Moderado', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(7, 'ave', 'Eolo', '2024-04-10', 'Milano negro', '1.30', 'Contusión', 'Leve', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(8, 'ave', 'Artemisa', '2024-04-10', 'Lechuza común', '1.00', 'Fractura pata', 'Moderado', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(9, 'ave', 'Hércules', '2024-04-10', 'Cernícalo vulgar', '1.10', 'Herida grave', 'Grave', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(10, 'ave', 'Diana', '2024-04-10', 'Cernícalo común', '1.20', 'Herida grave', 'Grave', 1, NULL, NULL, NULL, NULL, NULL, NULL),
(11, 'mamífero', 'Osito', '2024-04-10', 'Oso pardo', '150.50', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(12, 'mamífero', 'Zorro', '2024-04-10', 'Zorro rojo', '7.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(13, 'mamífero', 'Pantera', '2024-04-10', 'Pantera negra', '100.00', 'Fractura de mandíbula', 'Grave', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(14, 'mamífero', 'Lince', '2024-04-10', 'Lince ibérico', '25.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(15, 'mamífero', 'Canguro', '2024-04-10', 'Canguro rojo', '50.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(16, 'mamífero', 'Elefante', '2024-04-10', 'Elefante africano', '5000.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(17, 'mamífero', 'Tigre', '2024-04-10', 'Tigre siberiano', '200.00', 'Contusión', 'Moderado', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(18, 'mamífero', 'León', '2024-04-10', 'León africano', '180.00', 'Herida grave', 'Grave', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(19, 'mamífero', 'Jirafa', '2024-04-10', 'Jirafa reticulada', '900.00', 'Contusión', 'Leve', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(20, 'mamífero', 'Hipopótamo', '2024-04-10', 'Hipopótamo común', '2000.00', 'Fractura de pata', 'Moderado', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(21, 'reptil', 'Tortuguita', '2024-04-10', 'Tortuga boba', '5.00', 'Fractura de caparazón', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(22, 'reptil', 'Cocodrilo', '2024-04-10', 'Cocodrilo del Nilo', '200.00', 'Mordedura', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(23, 'reptil', 'Iguana', '2024-04-10', 'Iguana verde', '2.50', 'Mordedura', 'Leve', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(24, 'reptil', 'Boa', '2024-04-10', 'Boa constrictor', '15.00', 'Fractura de columna', 'Grave', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(25, 'reptil', 'Tortuga', '2024-04-10', 'Tortuga de tierra', '10.00', 'Herida grave', 'Grave', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(26, 'reptil', 'Cobra', '2024-04-10', 'Cobra real', '3.00', 'Mordedura', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(27, 'reptil', 'Dragón', '2024-04-10', 'Dragón de Komodo', '70.00', 'Mordedura', 'Moderado', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(28, 'reptil', 'Tortuga Marina', '2024-04-10', 'Tortuga laúd', '500.00', 'Herida grave', 'Grave', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(29, 'reptil', 'Serpiente Rey', '2024-04-10', 'Serpiente de cascabel', '2.00', 'Mordedura', 'Moderado', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(30, 'reptil', 'Gecko', '2024-04-10', 'Gecko común', '0.10', 'Herida leve', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(31, 'reptil', 'Tortuga de agua', '2024-04-10', 'Tortuga de orejas rojas', '3.50', 'Herida leve', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(32, 'reptil', 'Varano', '2024-04-10', 'Varanus salvator', '20.00', 'Fractura de cola', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(33, 'reptil', 'Tortuga Terrestre', '2024-04-10', 'Testudinidae', '6.00', 'Herida grave', 'Grave', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(34, 'reptil', 'Camaleón', '2024-04-10', 'Chamaeleonidae', '0.30', 'Contusión', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(35, 'reptil', 'Caimán', '2024-04-10', 'Caiman crocodilus', '25.00', 'Mordedura', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(36, 'reptil', 'Tortuga de agua', '2024-04-10', 'Tortuga de orejas rojas', '3.50', 'Herida leve', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(37, 'reptil', 'Varano', '2024-04-10', 'Varanus salvator', '20.00', 'Fractura de cola', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(38, 'reptil', 'Tortuga Terrestre', '2024-04-10', 'Testudinidae', '6.00', 'Herida grave', 'Grave', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(39, 'reptil', 'Camaleón', '2024-04-10', 'Chamaeleonidae', '0.30', 'Contusión', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(40, 'reptil', 'Caimán', '2024-04-10', 'Caiman crocodilus', '25.00', 'Mordedura', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(41, 'reptil', 'Tortuga de agua', '2024-04-10', 'Tortuga de orejas rojas', '3.50', 'Herida leve', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(42, 'reptil', 'Varano', '2024-04-10', 'Varanus salvator', '20.00', 'Fractura de cola', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(43, 'reptil', 'Tortuga Terrestre', '2024-04-10', 'Testudinidae', '6.00', 'Herida grave', 'Grave', NULL, 1, NULL, NULL, NULL, NULL, NULL),
(44, 'reptil', 'Camaleón', '2024-04-10', 'Chamaeleonidae', '0.30', 'Contusión', 'Leve', NULL, 0, NULL, NULL, NULL, NULL, NULL),
(45, 'reptil', 'Caimán', '2024-04-10', 'Caiman crocodilus', '25.00', 'Mordedura', 'Moderado', NULL, 1, NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
