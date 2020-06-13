-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2020 at 12:29 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koperasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE `kasir` (
  `no_pinjaman` varchar(55) NOT NULL,
  `no_anggota` varchar(55) NOT NULL,
  `nama` varchar(55) NOT NULL,
  `tgl_angsuran` varchar(55) NOT NULL,
  `total_pinjaman` varchar(55) NOT NULL,
  `sisa_pinjaman` varchar(55) NOT NULL,
  `kode_angsuran` varchar(55) NOT NULL,
  `jatuh_tempo` varchar(55) NOT NULL,
  `angsuran_ke` varchar(55) NOT NULL,
  `angsuran_pokok` varchar(55) NOT NULL,
  `angsuran_bunga` varchar(55) NOT NULL,
  `denda` varchar(55) NOT NULL,
  `total_angsuran` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kasir`
--

INSERT INTO `kasir` (`no_pinjaman`, `no_anggota`, `nama`, `tgl_angsuran`, `total_pinjaman`, `sisa_pinjaman`, `kode_angsuran`, `jatuh_tempo`, `angsuran_ke`, `angsuran_pokok`, `angsuran_bunga`, `denda`, `total_angsuran`) VALUES
('K0334', '145', 'abigail', '16 oktober 2019', '30000000', '20000000', 'A0334', '14 oktober 2019', '5', '2000000', '15000', '5000', '2020000');

-- --------------------------------------------------------

--
-- Table structure for table `loginbuku`
--

CREATE TABLE `loginbuku` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginbuku`
--

INSERT INTO `loginbuku` (`username`, `password`) VALUES
('pembukuan', 'pembukuan');

-- --------------------------------------------------------

--
-- Table structure for table `loginman`
--

CREATE TABLE `loginman` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginman`
--

INSERT INTO `loginman` (`username`, `password`) VALUES
('manager', 'manager');

-- --------------------------------------------------------

--
-- Table structure for table `loginproses`
--

CREATE TABLE `loginproses` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginproses`
--

INSERT INTO `loginproses` (`username`, `password`) VALUES
('proses', 'proses');

-- --------------------------------------------------------

--
-- Table structure for table `login_kasir`
--

CREATE TABLE `login_kasir` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_kasir`
--

INSERT INTO `login_kasir` (`username`, `password`) VALUES
('kasir', 'kasir');

-- --------------------------------------------------------

--
-- Table structure for table `pembukuan`
--

CREATE TABLE `pembukuan` (
  `bulan` varchar(70) NOT NULL,
  `jumlah_simpanan` varchar(70) NOT NULL,
  `jumlah_pinjaman` varchar(70) NOT NULL,
  `jumlah_angsuran` varchar(70) NOT NULL,
  `total_pemasukkan` varchar(70) NOT NULL,
  `total_pengeluaran` varchar(70) NOT NULL,
  `tanggal_data` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembukuan`
--

INSERT INTO `pembukuan` (`bulan`, `jumlah_simpanan`, `jumlah_pinjaman`, `jumlah_angsuran`, `total_pemasukkan`, `total_pengeluaran`, `tanggal_data`) VALUES
('12', '100.000.000', '50.000.000', '60.000.000', '160.000.000', '50.000.000', '17 des 2019');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE `pinjaman` (
  `no_kredit` varchar(50) NOT NULL,
  `no_anggota` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jumlah_pinjaman` varchar(50) NOT NULL,
  `tujuan_pinjaman` varchar(50) NOT NULL,
  `bunga` varchar(50) NOT NULL,
  `jaminan` varchar(50) NOT NULL,
  `no_jaminan` varchar(50) NOT NULL,
  `jangka_waktu` varchar(50) NOT NULL,
  `jumlah_angsuran` varchar(50) NOT NULL,
  `tanggal_kredit` varchar(50) NOT NULL,
  `tanggal_realisasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pinjaman`
--

INSERT INTO `pinjaman` (`no_kredit`, `no_anggota`, `nama`, `alamat`, `jumlah_pinjaman`, `tujuan_pinjaman`, `bunga`, `jaminan`, `no_jaminan`, `jangka_waktu`, `jumlah_angsuran`, `tanggal_kredit`, `tanggal_realisasi`) VALUES
('K0334', '145', 'abigail', 'cluring', '30000000', 'usaha', '15000', 'BPKB', '223478991', '15 bulan', '2000000', '12 mei 2019', '19 mei 2019');

-- --------------------------------------------------------

--
-- Table structure for table `proses`
--

CREATE TABLE `proses` (
  `no_anggota` varchar(60) NOT NULL,
  `nama` varchar(60) NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `no_telefon` varchar(60) NOT NULL,
  `no_identitas` varchar(60) NOT NULL,
  `tanggal_masuk` varchar(60) NOT NULL,
  `keterangan` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proses`
--

INSERT INTO `proses` (`no_anggota`, `nama`, `alamat`, `no_telefon`, `no_identitas`, `tanggal_masuk`, `keterangan`) VALUES
('021', 'yudi', 'silir', '081332444444', '512334555', '12 mei 2019', 'simpanan'),
('145', 'abigail', 'cluring', '081223777777', '513346778', '20 maret 2019', 'pinjaman');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan`
--

CREATE TABLE `simpanan` (
  `no_simpanan` varchar(50) NOT NULL,
  `no_anggota` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `simpanan_wajib` varchar(50) NOT NULL,
  `simpanan_sukarela` varchar(50) NOT NULL,
  `tanggal_masuk` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `simpanan`
--

INSERT INTO `simpanan` (`no_simpanan`, `no_anggota`, `nama`, `alamat`, `simpanan_wajib`, `simpanan_sukarela`, `tanggal_masuk`) VALUES
('S0221', '021', 'yudi', 'silir', '12000000', '30000', '12 mei 2012');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`no_pinjaman`);

--
-- Indexes for table `loginbuku`
--
ALTER TABLE `loginbuku`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `loginman`
--
ALTER TABLE `loginman`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `loginproses`
--
ALTER TABLE `loginproses`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `login_kasir`
--
ALTER TABLE `login_kasir`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pembukuan`
--
ALTER TABLE `pembukuan`
  ADD PRIMARY KEY (`bulan`);

--
-- Indexes for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`no_kredit`);

--
-- Indexes for table `proses`
--
ALTER TABLE `proses`
  ADD PRIMARY KEY (`no_anggota`);

--
-- Indexes for table `simpanan`
--
ALTER TABLE `simpanan`
  ADD PRIMARY KEY (`no_simpanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
