-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER brewery_finder_owner
WITH PASSWORD 'finalcapstone';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO brewery_finder_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO brewery_finder_owner;

CREATE USER brewery_finder_appuser
WITH PASSWORD 'finalcapstone';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO brewery_finder_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO brewery_finder_appuser;
