-- auto create restaurant table and employee table for authentication
CREATE DATABASE IF NOT EXISTS restaurant;
USE restaurant;
CREATE TABLE IF NOT EXISTS employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    question VARCHAR(100) NOT NULL,
    answer VARCHAR(100) NOT NULL,
    date DATE DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    prod_id VARCHAR(100) NOT NULL,
    prod_name VARCHAR(100) NOT NULL,
    stock INT(100) NOT NULL,
    type VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    status VARCHAR(100) NOT NULL,
    image VARCHAR(500) NOT NULL,
    date DATE DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT(100) NOT NULL,
    prod_id VARCHAR(100) NOT NULL,
    prod_name VARCHAR(100) NOT NULL,
    type VARCHAR(100) NOT NULL,
    quantity INT(100) NOT NULL,
    price DOUBLE NOT NULL,
    date DATE DEFAULT NULL,
    image VARCHAR(500) NOT NULL,
    em_username VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS receipt (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT(100) NOT NULL,
    total DOUBLE NOT NULL,
    date DATE NOT NULL,
    em_username VARCHAR(100) NOT NULL
);