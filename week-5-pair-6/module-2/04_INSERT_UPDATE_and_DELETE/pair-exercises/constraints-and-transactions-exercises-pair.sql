-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
/*
BEGIN TRANSACTION;
INSERT INTO city (name, countrycode, district, population)
VALUES ('Smallville', 'USA', 'Kansas', 45001);

SELECT * 
FROM city
WHERE name = 'Smallville';
ROLLBACK TRANSACTION;
*/
-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
/*
BEGIN TRANSACTION; 
INSERT INTO countrylanguage(countrycode, language, isofficial, percentage)
VALUES ('USA', 'Kryptonese', false, 0.0001); 

SELECT *
FROM countrylanguage
WHERE language = 'Kryptonese'; 
ROLLBACK TRANSACTION; 
*/
-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.
/*
BEGIN TRANSACTION;
UPDATE countrylanguage SET language = 'Krypto-babble'
WHERE language = 'Kryptonese';

SELECT * 
FROM countrylanguage
WHERE language = 'Krypto-babble';
ROLLBACK TRANSACTION;
*/
-- 4. Set the US captial to Smallville, Kansas in the country table.
/*
SELECT * FROM city
WHERE id = 3813
ORDER BY name DESC; 

BEGIN TRANSACTION; 
UPDATE country SET capital = 4080
WHERE capital = 3813
AND code = 'USA'; 

SELECT name, capital
FROM country
WHERE code = 'USA'; 
ROLLBACK TRANSACTION; 
*/
-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
/*
BEGIN TRANSACTION;
SELECT * 
FROM city
WHERE name = 'Smallville';

DELETE FROM city
WHERE name = 'Smallville';

SELECT * 
FROM city
WHERE name = 'Smallville';

ROLLBACK TRANSACTION;
*/
-- Yes it succeeded because there is no constraint on deleting a row from the city table

-- 6. Return the US captial to Washington.
/*
BEGIN TRANSACTION; 

UPDATE country SET capital = 3813
WHERE capital = 4080
AND code = 'USA'; 

SELECT *
FROM country
WHERE capital = 3813; 

ROLLBACK TRANSACTION; 
*/
-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
/*
BEGIN TRANSACTION;
SELECT * 
FROM city
WHERE name = 'Smallville';

DELETE FROM city
WHERE name = 'Smallville';

SELECT * 
FROM city
WHERE name = 'Smallville';

ROLLBACK TRANSACTION;
*/
-- Yes it succeeded, but 0 rows were affected because we deleted Smallville from the city table in problem #5

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)
/*
BEGIN TRANSACTION;

SELECT *
FROM countrylanguage
WHERE countrycode IN (
        SELECT code
        FROM country
        WHERE indepyear BETWEEN 1800 AND 1972
        );

UPDATE countrylanguage SET isofficial = NOT isOfficial
WHERE countrycode IN (
        SELECT code
        FROM country
        WHERE indepyear BETWEEN 1800 AND 1972
        ); 

ROLLBACK TRANSACTION; 
*/
-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)
/*
BEGIN TRANSACTION;
SELECT name
,population
FROM city

UPDATE city SET population = population / 1000

SELECT name
,population
FROM city
ROLLBACK TRANSACTION;
*/
-- 10. Assuming a country's surfacearea is expressed in square miles, convert it to 
-- square meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)

BEGIN TRANSACTION;

UPDATE country SET surfacearea = surfacearea * 1609.344
WHERE code IN
       (SELECT countrycode
       FROM countrylanguage
       WHERE language = 'French'
       AND percentage > 20); 

SELECT surfacearea
FROM country
WHERE code IN
       (SELECT countrycode
       FROM countrylanguage
       WHERE language = 'French'
       AND percentage > 20); 

ROLLBACK TRANSACTION; 


