DROP TABLE IF EXISTS SPITTER;

--USER TABLE
CREATE TABLE IF NOT EXISTS SPITTER (
IDUSER INT GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1)NOT NULL  PRIMARY KEY,
USERNAME VARCHAR(255) NOT NULL,
PASSWORD VARCHAR(255) NOT NULL,
FULLNAME VARCHAR(255) NOT NULL
)