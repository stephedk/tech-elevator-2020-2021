@echo off

title Create vendingmachine database

SET PGPASSWORD=postgres1&& psql -U postgres -f createdb.sql
SET PGPASSWORD=postgres1&& psql -U postgres -d vendingmachine -f vendingmachine.sql
