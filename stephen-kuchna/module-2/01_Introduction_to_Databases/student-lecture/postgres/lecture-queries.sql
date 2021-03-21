-- SELECT ... FROM
-- Selecting the names for all countries

SELECT *
FROM country;


-- Selecting the name and population of all countries

SELECT name
        , population
FROM country;

-- Selecting all columns from the city table

SELECT *
FROM city;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio

SELECT *
FROM city
WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776

SELECT *
FROM country
WHERE indepyear = 1776;



-- Selecting countries not in Asia

SELECT *
FROM country
WHERE continent != 'Asia';

SELECT *
FROM country
WHERE NOT (continent = 'Asia'); --both these codes are functionally the same


-- Selecting countries that do not have an independence year

SELECT name
        , indepyear
FROM country
WHERE indepyear IS NULL; -- IS NULL determines that there is NO value

-- Selecting countries that do have an independence year

SELECT name
        , indepyear
FROM country
WHERE indepyear IS NOT NULL;


-- Selecting countries that have a population greater than 5 million

SELECT name
        , population
FROM country
WHERE population < 5000000; 

-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

SELECT *
FROM city
WHERE district = 'Ohio'
    AND population > 400000; 

-- Selecting country names on the continent North America or South America

SELECT name
        , continent
FROM country
WHERE continent = 'North America'
        OR continent = 'South Ameica';

-- strings can be compared using LIKE
/*SELECT name
        , continent
FROM country
WHERE continent LIKE '%America'; 

ILIKE is a case insensitive version of LIKE- it only works to compare strings

-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
*/

SELECT *
FROM country; 
        ,population
        ,lifeexpectancy
        ,population/ surfacearea AS population_density
FROM country; 

