SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS super_heroes (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  age int,
  special_power VARCHAR,
  weakness VARCHAR
);

CREATE TABLE IF NOT EXISTS squads (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  fighting VARCHAR,
  maxsize int;
);