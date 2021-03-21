--DDL - Data Definition Language
-- CREATE database, table
-- DROP dtatbase, table
--ALTER table

--connected to the postgres database whe you are creating another db


SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'gills_art'; 

DROP DATABASE gills_art; 

CREATE DATABASE gills_art; 





