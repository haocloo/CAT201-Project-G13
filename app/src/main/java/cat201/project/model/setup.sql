-- auto create restaurant table and employee table for authentication
CREATE DATABASE IF NOT EXISTS restaurant;
USE restaurant;
CREATE TABLE IF NOT EXISTS employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    password VARCHAR(100),
    question VARCHAR(100),
    answer VARCHAR(100),
    date DATE DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    prod_id VARCHAR(100),
    prod_name VARCHAR(100),
    stock INT(100),
    type VARCHAR(100),
    price DOUBLE,
    status VARCHAR(100),
    image VARCHAR(500),
    date DATE DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT(100),
    prod_name VARCHAR(100),
    quantity INT(100),
    price DOUBLE,
    date DATE DEFAULT NULL,
    em_username VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS receipt (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT(100),
    total DOUBLE,
    date DATE DEFAULT NULL,
    em_username VARCHAR(100)
);
