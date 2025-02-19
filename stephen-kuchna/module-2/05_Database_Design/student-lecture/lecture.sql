--1. drop all tables
--2. create all tables
--3. add relationships
--4. populate the tables

DROP TABLE IF EXISTS customer; 
DROP TABLE IF EXISTS sale; 
DROP TABLE IF EXISTS sale_line_item; 
DROP TABLE IF EXISTS art; 
DROP TABLE IF EXISTS artist; 



CREATE TABLE customer 
(customer_id, SERIAL NOT NULL PRIMARY KEY --collumn_name, datatype NULL/ NOT NULL constraints
        , first_name VARCHAR(50) NOT NULL
        , last_name VARCHAR(50) NOT NULL
        , street_address VARCHAR(50) NULL
        , city VARCHAR (20) NULL
        , state CHAR (2) NULL
        , zip VARCHAR(10) NULL
        , phone VARCHAR(15) NOT NULL
);

CREATE TABLE sale
(
        sale_id SERIAL NOT NULL PRIMARY KEY
        , customer_id INTEGER NOT NULL
        , purchase_date DATE NOT NULL
);

CREATE TABLE sale_line_item
(
        sale_id INTEGER NOT NULL 
        , art_id INTEGER NOT NULL 
        , price DECIMAL (10, 2) NOT NULL
        
                ,PRIMARY KEY (
                sale_id
                , art_id
        )
); 

CREATE TABLE art
(
        art_id SERIAL NOT NULL PRIMARY KEY
        , artist_id INTEGER NOT NULL
        , title VARCHAR (255) NOT NULL
); 

CREATE TABLE artist
(
        artist_id INTEGER NOT NULL PRIMARY KEY
        , name VARCHAR (100)
); 

ALTER TABLE sale --which table we're altering
ADD CONSTRAINT fk_customer_sale -- name of constraint
FOREIGN KEY (customer_id) --which column in the sale table
REFERENCES customer (customer_id); -- point to other table and column

ALTER TABLE sale_line_item
ADD CONSTRAINT fk_sale_sale_line_item
FOREIGN KEY (sale_id)
REFERENCES sale (sale_id); 

ALTER TABLE sale_line_item
ADD CONSTRAINT fk_art_sale_line_item
FOREIGN KEY (art_id)
REFERENCES art (art_id); 

ALTER TABLE art
ADD CONSTRAINT fk_artist_art
FOREIGN KEY (artist_id)
REFERENCES artist (artist_id); 

ALTER TABLE sale
ADD CONSTRAINT ck_sales_price
CHECK (price > 0); 

