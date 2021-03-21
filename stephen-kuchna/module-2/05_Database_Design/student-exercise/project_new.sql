SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'project_new';

DROP DATABASE project_new;

CREATE DATABASE project_new;