-- **************************************************************
-- This script destroys the database and associated users
-- **************************************************************

-- The following line terminates any active connections to the database so that it can be destroyed
SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'brewery_finder';

DROP DATABASE brewery_finder;

DROP USER brewery_finder_owner;
DROP USER brewery_finder_appuser;

-- Re-Create the database
CREATE DATABASE brewery_finder;