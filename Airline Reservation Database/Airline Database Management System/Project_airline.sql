CREATE DATABASE  IF NOT EXISTS `airline`;

USE `airline`;

DROP TABLE IF EXISTS `aircraft`;
CREATE TABLE `aircraft` (
  `aircraft_id` char(7) NOT NULL,
  `no_of_seats` int NOT NULL,
  PRIMARY KEY (`aircraft_id`)
);

DROP TABLE IF EXISTS `cancel_ticket`;
CREATE TABLE `cancel_ticket` (
  `flight_id` int NOT NULL,
  `passenger_name` varchar(20) NOT NULL,
  `description` varchar(150) NOT NULL
);

DROP TABLE IF EXISTS `charges`;
CREATE TABLE `charges` (
  `route_code` varchar(12) NOT NULL,
  `first_class` int NOT NULL,
  `business_class` int NOT NULL,
  `economy_class` int NOT NULL,
  UNIQUE KEY `route_code_UNIQUE` (`route_code`),
  CONSTRAINT `charges_ibfk_1` FOREIGN KEY (`route_code`) REFERENCES `routes` (`route_code`)
);
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `contact_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL,
  `cell` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`contact_id`)
);
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `flight_id` int NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `contact_id` int NOT NULL,
  `amount` int NOT NULL,
  `_source` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL,
  PRIMARY KEY (`booking_id`),
  KEY `flight_id` (`flight_id`),
  KEY `contact_id` (`contact_id`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`flight_id`) REFERENCES `flight_schedule` (`flight_id`),
  CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`contact_id`) REFERENCES `contacts` (`contact_id`)
);

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `job_id` char(5) NOT NULL,
  `experience` varchar(15) NOT NULL,
  `designation` varchar(30) NOT NULL,
  `education` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `contact_id` int DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `job_id` (`job_id`),
  KEY `employees_ibfk_2` (`contact_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`),
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`contact_id`) REFERENCES `contacts` (`contact_id`)
);

DROP TABLE IF EXISTS `flight_schedule`;
CREATE TABLE `flight_schedule` (
  `aircraft_id` char(7) NOT NULL,
  `flight_id` int NOT NULL AUTO_INCREMENT,
  `date_` date NOT NULL,
  `arrival_time` time NOT NULL,
  `departure_time` time NOT NULL,
  `route_code` varchar(12) NOT NULL,
  PRIMARY KEY (`flight_id`),
  KEY `aircraft_id` (`aircraft_id`),
  KEY `flight_schedule_ibfk_2` (`route_code`),
  CONSTRAINT `flight_schedule_ibfk_2` FOREIGN KEY (`route_code`) REFERENCES `routes` (`route_code`)
);

DROP TABLE IF EXISTS `jobs`;
CREATE TABLE `jobs` (
  `job_id` char(5) NOT NULL,
  `job_title` varchar(20) NOT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`job_id`),
  CONSTRAINT `jobs_chk_1` CHECK ((`salary` > 0))
);
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `pass` varchar(25) NOT NULL,
  `role_id` varchar(15) NOT NULL DEFAULT 'Customer',
  `contact_id` int DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `contact_id_idx` (`contact_id`),
  CONSTRAINT `contact_id` FOREIGN KEY (`contact_id`) REFERENCES `contacts` (`contact_id`)
);
DROP TABLE IF EXISTS `routes`;
CREATE TABLE `routes` (
  `source_` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL,
  `route_code` varchar(12) NOT NULL,
  PRIMARY KEY (`route_code`)
);

DROP TABLE IF EXISTS `transactions`;
CREATE TABLE `transactions` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `extra_charges` int DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `total_amount` int NOT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `username` (`username`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  CONSTRAINT `transactions_chk_1` CHECK ((`total_amount` > 0))
);