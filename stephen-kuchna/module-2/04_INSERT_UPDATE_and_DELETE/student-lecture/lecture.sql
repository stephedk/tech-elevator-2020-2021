-- INSERT

SELECT *
FROM countrylanguage;
/*
INSERT INTO <table> (available columns)
VALUES (<values>)
*/
-- 1. Add Klingon as a spoken language in the USA
-- 2. Add Klingon as a spoken language in Great Britain

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isOfficial
        , percentage
)
VALUES
(
        'USA'
        , 'Klingon'
        , false
        , 0.001
);

SELECT *
FROM countrylanguage
WHERE countrycode = 'USA';


INSERT INTO countrylanguage
(
        countrycode
        , language
        , isOfficial
        , percentage
)
VALUES
(
        'GBR'
        , 'Klingon'
        , false
        , 0.2
);

-- UPDATE

--Syntax
/*
UPDATE <table name>
SET <column> = value
        , <column> = value
WHERE <condition> -- ALWAYS HAVE A WHERE CLAUSE OR YOU COULD UPDATE ALL ROWS IN DATABASE
*/

-- 1. Update the capital of the USA to Houston
-- 2. Update the capital of the USA to Washington DC and the head of state

SELECT *
FROM country
WHERE code = 'USA'
--current capitol is 3813 (Wash DC)
-- Houston is 3796

UPDATE country
SET capital = 3796
WHERE code = 'USA'; 

UPDATE country
SET capital = 3813
        , headofstate = 'Joe Biden'
WHERE code = 'USA'; 

-- DELETE

-- 1. Delete English as a spoken language in the USA
-- 2. Delete all occurrences of the Klingon language 

DELETE FROM countrylanguage
WHERE code = 'USA' 
        AND language = 'English'
        

DELETE FROM countrylanguage
WHERE language = 'Klingon'; 
        

-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isOfficial
        , percentage
)
VALUES
(
        'QSA' -- can't do this because country doesn't exist yet
        , 'ELvish'
        , false
        , 0.02
);

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?

-- 3. Try deleting the country USA. What happens?
SELECT *
FROM country
WHERE code = 'USA'; 

DELETE FROM country
WHERE code = 'USA'; ---fails because code has dependancies

-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

--(won't allow insertion of duplicate values)

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'

UPDATE country
SET continent = 'Outer Space' -- violates country continent constraint
WHERE code = 'USA'; 

-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.

BEGIN TRANSACTION; 

        DELETE FROM countrylanguage; 

        SELECT *
        FROM countrylanguage

ROLLBACK TRANSACTION;

--change capital to Houston (without WHERE)

BEGIN TRANSACTION; 

UPDATE country
SET capital = 3796; 

SELECT code --shows all updated capitals
        , capital
FROM country; 

ROLLBACK TRANSACTION; -- rolls back any changes

SELECT code --verify that no capitals were actually updated
        , capital
FROM country; 

-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.

BEGIN TRANSACTION; 

        UPDATE country
        SET lifeexpectancey = 82.2
        WHERE code = 'USA'
        
ROLLBACK TRANSACTION;

SELECT * FROM country
WHERE code = 'USA'; 