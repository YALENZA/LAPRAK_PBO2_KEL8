CREATE DATABASE IF NOT EXISTS aplikasimanajemensurat;

-- Kita suruh sistem menggunakan database tersebut
USE aplikasimanajemensurat;

-- 2. SETTINGAN STANDAR --
SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';
SET NAMES utf8mb4;

-- 3. PEMBUATAN TABEL --

-- Tabel USER
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_lengkap` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `nim` varchar(20) NOT NULL,
  `role` enum('Administrator','User','Ketua') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Tabel SURAT_MASUK
DROP TABLE IF EXISTS `surat_masuk`;
CREATE TABLE `surat_masuk` (
  `id` int NOT NULL AUTO_INCREMENT,
  `no_surat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `pengirim` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `penerima` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `perihal` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `lampiran` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `foto` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` enum('baru','didisposisi','selesai') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Tabel SURAT_DISPOSISI
DROP TABLE IF EXISTS `surat_disposisi`;
CREATE TABLE `surat_disposisi` (
  `id_disposisi` int NOT NULL AUTO_INCREMENT,
  `id_surat_masuk` int NOT NULL,
  `disposisi_ke` enum('Ketua') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `instruksi` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_disposisi` date NOT NULL,
  `status` enum('proses','selesai') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_disposisi`),
  KEY `id_surat_masuk` (`id_surat_masuk`),
  CONSTRAINT `surat_disposisi_ibfk_1` FOREIGN KEY (`id_surat_masuk`) REFERENCES `surat_masuk` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Tabel SURAT_KELUAR
DROP TABLE IF EXISTS `surat_keluar`;
CREATE TABLE `surat_keluar` (
  `id_surat_keluar` int NOT NULL AUTO_INCREMENT,
  `no_surat` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_keluar` date DEFAULT NULL,
  `pengirim` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `penerima` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `perihal` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `lampiran` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `foto` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_surat_keluar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SET foreign_key_checks = 1;