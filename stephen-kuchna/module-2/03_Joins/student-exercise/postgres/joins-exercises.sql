-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT *
FROM actor
ORDER BY last_name DESC;

SELECT a.first_name 
        , a.last_name 
        , f.title
FROM actor AS a
INNER JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
WHERE a.actor_id = 44;

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT a.first_name 
        , a.last_name 
        , f.title
FROM actor AS a
INNER JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
WHERE a.actor_id = 135;

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT a.first_name 
        , a.last_name 
        , f.title
FROM actor AS a
INNER JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
WHERE a.actor_id = 35
        OR a.actor_id = 143;

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT *
FROM category
ORDER BY name DESC;

SELECT f.title
        , c.name
FROM film AS f
JOIN film_category AS fc
        ON f.film_id = fc.film_id
JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 6
ORDER BY f.title; 

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT f.title
        , c.name
FROM film AS f
JOIN film_category AS fc
        ON f.film_id = fc.film_id
JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 5
ORDER BY f.title; 

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT f.title
        , c.name
FROM film AS f
JOIN film_category AS fc
        ON f.film_id = fc.film_id
JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 3
        AND f.rating = 'G'
ORDER BY f.title; 

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT f.title
        , c.name
        , f.length
FROM film AS f
JOIN film_category AS fc
        ON f.film_id = fc.film_id
JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 8
        AND f.rating = 'G'
        AND f.length < 120
ORDER BY f.title;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT a.first_name 
        , a.last_name 
        , f.title
FROM actor AS a
INNER JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
WHERE a.actor_id = 103
        AND f.rating = 'G';


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT *
FROM category AS c
INNER JOIN film_category AS fc
        ON c.category_id = fc.category_id
INNER JOIN film as f
        ON fc.film_id = f.film_id
WHERE c.category_id = 14
AND f.release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)


SELECT a.first_name 
        , a.last_name 
        , f.title
FROM actor AS a
INNER JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
INNER JOIN film_category As fc
        ON f.film_id = fc.film_id
WHERE a.actor_id = 44
        AND fc.category_id = 1 ;


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address
        ,a.district
        ,a.postal_code
        ,city.city
        ,c.country
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN city AS city
        ON a.city_id = city.city_id
INNER JOIN country AS c
        ON city.country_id = c.country_id;


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT store.store_id
        ,a.address
        ,s.first_name
        ,s.last_name
FROM store
JOIN staff AS s
        ON store.manager_staff_id = s.staff_id
JOIN address AS a
        ON store.address_id = a.address_id;


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)

SELECT c.last_name
        , c.first_name
        , count(c.customer_id) AS rentals
FROM customer AS c
INNER JOIN payment AS p
        ON c.customer_id = p.customer_id
GROUP BY c.last_name
        ,c.first_name
ORDER BY rentals DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)

SELECT c.last_name
        , c.first_name
        ,SUM(amount) AS dollars_spent
FROM customer AS c
INNER JOIN payment AS p
        ON c. customer_id = p.customer_id
GROUP BY c.last_name
        ,c.first_name
ORDER BY dollars_spent DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT s.store_id
        , a.address
       -- , COUNT(DISTINCT i.inventory_id) AS inventory_count
        , COUNT(r.rental_id) AS rental_count
        , SUM(amount) AS total_sales
        , AVG(amount) AS average_sales
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN inventory AS i
        ON s.store_id = i.store_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
INNER JOIN payment AS p
        ON r.rental_id = p.rental_id
--WHERE s.store_id = 1
GROUP BY s.store_id
        , a.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)

SELECT f.title
       , COUNT(i.inventory_id) AS number_of_rentals
FROM film AS f
INNER JOIN inventory AS i
        ON f.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
GROUP BY f.title
ORDER BY number_of_rentals DESC
LIMIT 10; 

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)

SELECT c.name
        ,COUNT(r.rental_id) AS number_of_rentals
FROM category AS c
JOIN film_category AS fc
        ON c.category_id = fc.category_id
JOIN film AS f
        ON fc.film_id = f.film_id
JOIN inventory AS i
        ON f.film_id = i.film_id
JOIN rental AS r
        ON i.inventory_id = r.inventory_id
GROUP BY c.name
ORDER BY number_of_rentals DESC
LIMIT 5; 


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT f.title
        ,COUNT(r.rental_id) AS number_of_rentals
FROM category AS c
JOIN film_category AS fc
        ON c.category_id = fc.category_id
JOIN film AS f
        ON fc.film_id = f.film_id
JOIN inventory AS i
        ON f.film_id = i.film_id
JOIN rental AS r
        ON i.inventory_id = r.inventory_id
WHERE c.name = 'Action'
GROUP BY f.title
ORDER BY number_of_rentals DESC
LIMIT 5; 

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)

SELECT a.first_name
        , a.last_name
        , COUNT(r.rental_id) AS number_of_rentals
FROM actor AS a
JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
JOIN film as f
        ON fa.film_id = f.film_id
JOIN inventory AS i
        ON f.film_id = i.film_id
JOIN rental AS r
        ON i.inventory_id = r.inventory_id
GROUP BY a.last_name, a.first_name
ORDER BY number_of_rentals DESC
LIMIT 10; 

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name
        , a.last_name
        , COUNT(r.inventory_id) AS number_of_rentals
FROM actor AS a
JOIN film_actor as fa
        ON a.actor_id = fa.actor_id
JOIN film as f
        ON fa.film_id = f.film_id
JOIN film_category AS fc
        ON f.film_id = fc.film_id
JOIN inventory AS i
        ON f.film_id = i.film_id
JOIN rental AS r
        ON i.inventory_id = r.inventory_id
WHERE fc.category_id = 5
GROUP BY a.last_name, a.first_name
ORDER BY number_of_rentals DESC
LIMIT 5;