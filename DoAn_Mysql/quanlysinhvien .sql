-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 03, 2021 at 03:58 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlysinhvien`
--
CREATE DATABASE IF NOT EXISTS `quanlysinhvien` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `quanlysinhvien`;

-- --------------------------------------------------------

--
-- Table structure for table `ketqua`
--

DROP TABLE IF EXISTS `ketqua`;
CREATE TABLE IF NOT EXISTS `ketqua` (
  `MaSV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaMonHoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Diem` int(10) DEFAULT '0',
  PRIMARY KEY (`MaMonHoc`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
CREATE TABLE IF NOT EXISTS `khoa` (
  `MaKhoa` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenKhoa` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`MaKhoa`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`) VALUES
('MK0001', 'Cong Nghe Thong Tin');

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
CREATE TABLE IF NOT EXISTS `monhoc` (
  `MaMonHoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenMonHoc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoTiet` int(20) DEFAULT '0',
  PRIMARY KEY (`MaMonHoc`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`MaMonHoc`, `TenMonHoc`, `SoTiet`) VALUES
('MH0001', 'Lap Trinh Ung Dung', 75),
('MH0002', 'BackEnd', 75);

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
CREATE TABLE IF NOT EXISTS `sinhvien` (
  `MaSV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenSV` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NoiSinh` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `DiaChi` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `Quan` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `MaKhoa` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HocBong` int(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MaSV`,`MaKhoa`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `TenSV`, `NgaySinh`, `GioiTinh`, `NoiSinh`, `DiaChi`, `Quan`, `MaKhoa`, `HocBong`) VALUES
('SV0001', 'NTD', '1969-12-25', 'Nam', 'BT', 'ASD1', 'S', 'MK0001', 1);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `TenDangNhap` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MatKhau` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenHienThi` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaSV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Quyen` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`TenDangNhap`,`MaSV`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`TenDangNhap`, `MatKhau`, `TenHienThi`, `MaSV`, `Quyen`) VALUES
('ad123', '123', 'Admin Trang này', '2', 'Admin'),
('sv124', '123456', 'Pham Hung Cuong', '0', 'SinhVien');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
