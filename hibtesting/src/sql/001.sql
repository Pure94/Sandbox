
CREATE SCHEMA IF NOT EXISTS public;
SET search_path TO public;

DROP TABLE IF EXISTS student;
CREATE TABLE student (
                           id BIGINT PRIMARY KEY,
                           first_name VARCHAR(45) DEFAULT NULL,
                           last_name VARCHAR(45) DEFAULT NULL,
                           email VARCHAR(45) DEFAULT NULL
)