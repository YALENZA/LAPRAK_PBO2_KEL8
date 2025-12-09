-- AdminNeo 4.17.2 MySQL 8.0.30 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `surat_diposisi`;
CREATE TABLE `surat_diposisi` (
  `id_disposisi` int NOT NULL AUTO_INCREMENT,
  `id_surat_masuk` int NOT NULL,
  `disposisi_ke` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `instruksi` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_disposisi` date NOT NULL,
  `status` enum('proses','selesai') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_disposisi`),
  KEY `id_surat_masuk` (`id_surat_masuk`),
  CONSTRAINT `surat_diposisi_ibfk_1` FOREIGN KEY (`id_surat_masuk`) REFERENCES `surat_masuk` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `surat_diposisi` (`id_disposisi`, `id_surat_masuk`, `disposisi_ke`, `instruksi`, `tanggal_disposisi`, `status`) VALUES
(1,	2,	'dasd',	'-',	'2025-12-08',	'selesai'),
(2,	5,	'asd',	'-',	'2025-12-08',	'selesai'),
(3,	2,	'dasd',	'-',	'2025-12-08',	'selesai'),
(4,	3,	'wer',	'-',	'2025-12-08',	'selesai'),
(5,	7,	'Departemen HID',	'-',	'2025-12-09',	'proses'),
(6,	5,	'Departemen Humas',	'-',	'2025-12-09',	'proses');

-- 2025-12-08 17:07:47 UTC
