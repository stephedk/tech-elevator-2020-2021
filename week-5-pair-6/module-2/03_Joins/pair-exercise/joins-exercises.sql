-- Write queries to return the following:
-- The following queries utilize the "world" database.

-- 1. The city name, country name, and city population of all cities in Europe with population greater than 1 million
-- (36 rows)

SELECT city.name
        , city.population
        ,c.name
FROM city
JOIN country AS c
        ON city.countrycode = c.code
WHERE c.continent = 'Europe'
AND city.population > 1000000; 

-- 2. The city name, country name, and city population of all cities in countries where French is an official language and the city population is greater than 1 million
-- (2 rows)

SELECT city.name
        ,city.population
        ,co.name
FROM city 
JOIN country AS co
        ON city.countrycode = co.code
JOIN countrylanguage AS cl
        ON city.countrycode = cl.countrycode
WHERE cl.language = 'French'
AND cl.isOfficial = true
AND city.population > 1000000;

-- 3. The name of the countries and continents where the language Javanese is spoken
-- (1 row)

SELECT co.name
        , co.continent
FROM country AS co
JOIN countrylanguage AS cl
ON co.code = cl.countrycode
WHERE cl.language = 'Javanese';

-- 4. The names of all of the countries in Africa that speak French as an official language
-- (5 row)

SELECT co.name
FROM country AS co
JOIN countrylanguage AS cl
        ON co.code = cl.countrycode
WHERE co.continent = 'Africa'
        AND cl.language = 'French'
        AND cl.isofficial = true;

-- 5. The average city population of cities in Europe
-- (average city population in Europe: 287,684)

SELECT AVG(c.population)
FROM city AS c
JOIN country As co
ON c.countrycode = co.code
WHERE continent = 'Europe';

-- 6. The average city population of cities in Asia
-- (average city population in Asia: 395,019)

SELECT AVG(c.population)
FROM city AS C
JOIN country AS CO
ON C.countrycode = CO.code
WHERE CO.continent = 'Asia';

-- 7. The number of cities in countries where English is an official language
-- (number of cities where English is official language: 523)

SELECT COUNT(c.name)
FROM city AS c
JOIN countrylanguage AS cl
ON c.countrycode = cl.countrycode
WHERE cl.language = 'English'
AND cl.isOfficial = true; 

-- 8. The average population of cities in countries where the official language is English
-- (average population of cities where English is official language: 285,809)

SELECT AVG(population)
FROM city AS C
JOIN countrylanguage AS CL
ON C.countrycode = CL.countrycode
WHERE CL.language = 'English'
AND CL.isOfficial = true;

-- 9. The names of all of the continents and the population of the continent’s largest city
-- (6 rows, largest population for North America: 8,591,309)

SELECT co.continent
, MAX(c.population)
FROM country AS co
JOIN city as c
ON co.code = c.countrycode
GROUP BY co.continent; 

-- 10. The names of all of the cities in South America that have a population of more than 1 million people and the official language of each city’s country
-- (29 rows)

SELECT C.name
,CL.language
FROM city AS C
JOIN country AS CO ON C.countrycode = CO.code
JOIN countrylanguage AS CL ON C.countrycode = CL.countrycode
WHERE CO.continent = 'South America'
AND C.population > 1000000
AND CL.isofficial = true;
