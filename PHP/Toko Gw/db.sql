/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 8.0.21 : Database - toko_gw_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`toko_gw_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `toko_gw_db`;

/*Table structure for table `akun` */

DROP TABLE IF EXISTS `akun`;

CREATE TABLE `akun` (
  `email` varchar(50) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role` int DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `akun` */

insert  into `akun`(`email`,`password`,`role`) values 
('sazi@mamo.com','sazi',1);

/*Table structure for table `kategori` */

DROP TABLE IF EXISTS `kategori`;

CREATE TABLE `kategori` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama_kategori` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `kategori` */

insert  into `kategori`(`id`,`nama_kategori`) values 
(1,'Gelang pintar'),
(2,'Handphone');

/*Table structure for table `produk` */

DROP TABLE IF EXISTS `produk`;

CREATE TABLE `produk` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `harga_per_unit` int DEFAULT NULL,
  `stok` int DEFAULT NULL,
  `deskripsi` varchar(1000) DEFAULT NULL,
  `gambar` varchar(250) DEFAULT NULL,
  `id_kategori` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `PK_id_kategori` (`id_kategori`),
  CONSTRAINT `PK_id_kategori` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `produk` */

insert  into `produk`(`id`,`nama`,`harga_per_unit`,`stok`,`deskripsi`,`gambar`,`id_kategori`) values 
('E01','Mi band 5',450000,5,'Global version','/images/mi_band.jpg',1),
('E02','Samsung Galaxy S10',10000000,1,'Garansi Sein','/images/S10.jpg',2),
('E03','ROG Phone I',6000000,2,'Barang Second','/images/ROG_phone_1.jpg',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
