-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Dim 29 Octobre 2017 à 15:31
-- Version du serveur: 5.5.27
-- Version de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `bobo`
--

-- --------------------------------------------------------

--
-- Structure de la table `tp_tache`
--

CREATE TABLE IF NOT EXISTS `tp_tache` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tache` varchar(50) NOT NULL,
  `categorie` varchar(30) NOT NULL,
  `fait` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Contenu de la table `tp_tache`
--

INSERT INTO `tp_tache` (`id`, `tache`, `categorie`, `fait`) VALUES
(1, 'sall', 'Perso', 1),
(3, 'sall', 'Pro', 0),
(6, 'paris est ', 'Pro', 1),
(10, 'sall', 'Perso', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
