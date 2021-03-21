-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT *
FROM actor; 

BEGIN TRANSACTION; 

INSERT INTO actor(actor_id, first_name, last_name)
VALUES(201, 'Hampton', 'Avenue');  


INSERT INTO actor(actor_id, first_name, last_name)
VALUES(202, 'Lisa', 'Byway');         

COMMIT TRANSACTION; 

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
BEGIN TRANSACTION; 

SELECT *
FROM film; 

INSERT INTO film(film_id, title, description, release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost)
VALUES(1001, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, null, 3, 4.99, 198, 19.99);

COMMIT TRANSACTION; 
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION; 

INSERT INTO film_actor(film_id, actor_id)
VALUES (1001, 201); 

INSERT INTO film_actor(film_id, actor_id)
VALUES (1001, 202); 

COMMIT TRANSACTION;

-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;  

SELECT *
FROM category; 

INSERT INTO category(category_id, name)
VALUES (17, 'Mathmagical'); 
COMMIT TRANSACTION; 

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
BEGIN TRANSACTION; 

INSERT INTO film_category(film_id, category_id)
VALUES (1001, 17); 

INSERT INTO film(film_id, title, language_id)
VALUES (1002, 'EGG IGBY', 1); 

INSERT INTO film(film_id, title, language_id)
VALUES (1003, 'KARATE MOON', 1); 

INSERT INTO film(film_id, title, language_id)
VALUES (1004, 'RANDOM GO', 1); 

INSERT INTO film(film_id, title, language_id)
VALUES (1005, 'YOUNG LANGUAGE', 1); 

INSERT INTO film_category(film_id, category_id)
VALUES (1002, 17); 

INSERT INTO film_category(film_id, category_id)
VALUES (1003, 17); 

INSERT INTO film_category(film_id, category_id)
VALUES (1004, 17); 

INSERT INTO film_category(film_id, category_id)
VALUES (1005, 17); 

COMMIT TRANSACTION; 

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION; 

UPDATE film SET rating = 'G'
WHERE film_id = 1001; 

UPDATE film SET rating = 'G'
WHERE film_id = 1002; 

UPDATE film SET rating = 'G'
WHERE film_id = 1003; 

UPDATE film SET rating = 'G'
WHERE film_id = 1004; 

UPDATE film SET rating = 'G'
WHERE film_id = 1005; 

COMMIT TRANSACTION; 

-- 7. Add a copy of "Euclidean PI" to all the stores.
--

SELECT MAX(inventory_id) FROM inventory; 

BEGIN TRANSACTION; 

INSERT INTO inventory
(film_id, store_id)
VALUES (1001, 1), (1001, 2); 

COMMIT TRANSACTION; 

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION; 

DELETE FROM film
WHERE film_id = 1001
AND title = 'Euclidean PI'; 

ROLLBACK TRANSACTION; 

/*not sure if you're asking me to scrub all reference of the film from the database or not
this action violates the foreign key constraint and I'd have to delete it from the film_actor table as well
*/

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

/* it won't let me do this because of dependencies, 
even after I added film_category, so I'm guessing I need to add film as well
*/

BEGIN TRANSACTION; 

DELETE FROM category 
WHERE category_id = 17; 

DELETE FROM film_category
WHERE category_id = 17; 

ROLLBACK TRANSACTION; 

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

--this one works which seems weird to me that I don't have to delete it from film_category too

BEGIN TRANSACTION; 

DELETE FROM film_category
WHERE category_id = 17; 
 
ROLLBACK TRANSACTION;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION; 

DELETE FROM category
WHERE name = 'Mathmagical'; 

DELETE FROM category
WHERE category_id = 17; 

DELETE FROM film_category
WHERE category_id = 17; 

DELETE FROM film_category
WHERE film_id = 1001; 

DELETE FROM film
WHERE film_id = 1001
AND title = 'Euclidean PI'; 

DELETE FROM film_actor
WHERE film_id = 1001
AND actor_id = 201
AND actor_id = 202; 

DELETE FROM inventory
WHERE film_id = 1001; 

ROLLBACK TRANSACTION; 

/*
At this point it's telling me I need to delete "inventory_id = 6"
from the rental table, which I didn't set, so I think if I try to
delete that it's probably going to screw up a larger part of the database
*/

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--well, let's see here:
BEGIN TRANSACTION; 

SELECT * FROM rental
SELECT * FROM inventory

ROLLBACK TRANSACTION; 


