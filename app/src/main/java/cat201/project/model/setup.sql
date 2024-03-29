-- auto create restaurant database and tables for authentication
CREATE DATABASE IF NOT EXISTS RESTAURANT;

USE RESTAURANT;

CREATE TABLE IF NOT EXISTS EMPLOYEE (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    USERNAME VARCHAR(100) NOT NULL,
    PASSWORD VARCHAR(100) NOT NULL,
    QUESTION VARCHAR(100) NOT NULL,
    ANSWER VARCHAR(100) NOT NULL,
    DATE DATE DEFAULT NULL,
    UNIQUE (USERNAME)
);

CREATE TABLE IF NOT EXISTS PRODUCT (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    PROD_ID VARCHAR(100) NOT NULL,
    PROD_NAME VARCHAR(100) NOT NULL,
    STOCK INT NOT NULL,
    TYPE VARCHAR(100) NOT NULL,
    PRICE DOUBLE NOT NULL,
    STATUS VARCHAR(100) NOT NULL,
    IMAGE VARCHAR(500) NOT NULL,
    DATE DATE DEFAULT NULL,
    UNIQUE (PROD_ID)
);

CREATE TABLE IF NOT EXISTS CUSTOMER (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    CUSTOMER_ID INT NOT NULL,
    PROD_ID VARCHAR(100) NOT NULL,
    PROD_NAME VARCHAR(100) NOT NULL,
    TYPE VARCHAR(100) NOT NULL,
    QUANTITY INT NOT NULL,
    PRICE DOUBLE NOT NULL,
    DATE DATE DEFAULT NULL,
    IMAGE VARCHAR(500) NOT NULL,
    EM_USERNAME VARCHAR(100) NOT NULL,
    FOREIGN KEY (PROD_ID) REFERENCES PRODUCT(PROD_ID) ON DELETE CASCADE,
    FOREIGN KEY (EM_USERNAME) REFERENCES EMPLOYEE(USERNAME)
);

CREATE TABLE IF NOT EXISTS RECEIPT (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    CUSTOMER_ID INT NOT NULL,
    TOTAL DOUBLE NOT NULL,
    DATE DATE NOT NULL,
    EM_USERNAME VARCHAR(100) NOT NULL,
    FOREIGN KEY (EM_USERNAME) REFERENCES EMPLOYEE(USERNAME)
);