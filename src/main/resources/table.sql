DROP TABLE IF EXIST employee CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE employees(
    id INTEGER PRIMARY KEY DEFAULT nextval ('global_seq'),
    name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    position VARCHAR NOT NULL,
    department INTEGER NOT NULL
);
