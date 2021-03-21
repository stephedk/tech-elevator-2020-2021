-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name

SELECT p.name, c.name, c.open_from_mm, c.open_to_mm, c.daily_fee
FROM park AS p
JOIN campground AS c
ON p.park_id = c.park_id
ORDER BY p.name DESC, c.name DESC; 


-- select the park name and the total number of campgrounds for each park ordered by park name

SELECT p.name, SUM(c.campground_id) AS number_of_campgrounds
FROM park AS p
JOIN campground AS c
ON p.park_id = c.park_id
GROUP BY p.name
ORDER BY p.name DESC; 

-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name is 'Blackwoods'

SELECT p.name, c.name, s.site_number, s.max_occupancy, s.accessible, s.max_rv_length, s.utilities
FROM park AS p
JOIN campground AS c
ON p.park_id = c.park_id
JOIN site AS s
ON c.campground_id = s.campground_id
WHERE c.name = 'Blackwoods'; 

/*
  select park name, campground, total number of sites (column alias 'number_of_sites') ordered by park
  -------------------------------------------------
    Acadia	Blackwoods	276
    Acadia	Seawall	198
    Acadia	Schoodic Woods	92
    Arches	"Devil's Garden"	49
    Arches	Canyon Wren Group Site	1
    Arches	Juniper Group Site	1
    Cuyahoga Valley	The Unnamed Primitive Campsites	5
  -------------------------------------------------
*/

SELECT p.name, c.name, COUNT(s.site_id) AS number_of_sites
FROM park AS p
JOIN campground AS c
ON p.park_id = c.park_id
JOIN site AS s
ON c.campground_id = s.campground_id
GROUP BY p.name, c.name
ORDER BY p.name , c.name; 

-- select site number, reservation name, reservation from and to date ordered by reservation from date

SELECT s.site_number, r.name, r.from_date, r.to_date
FROM site AS s
JOIN reservation AS r
ON s.site_id = r.site_id
ORDER BY r.from_date; 

/*
  select campground name, total number of reservations for each campground ordered by total reservations desc
  -------------------------------------------------
    Seawall	13
    Blackwoods	9
    "Devil's Garden"	7
    Schoodic Woods	7
    The Unnamed Primitive Campsites	5
    Canyon Wren Group Site	4
    Juniper Group Site	4
  -------------------------------------------------
*/

SELECT c.name, COUNT(r.site_id) AS total_reservations
FROM campground AS c
JOIN site AS s
ON c.campground_id = s.campground_id
JOIN reservation AS r
ON s.site_id = r.site_id
GROUP BY c.name   
ORDER BY total_reservations DESC; 

