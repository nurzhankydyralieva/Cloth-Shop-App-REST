DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id         BIGSERIAL PRIMARY KEY,
    user_name  VARCHAR(40) NOT NULL,
    first_name VARCHAR(40) NOT NULL,
    last_name  VARCHAR(40) NOT NULL,
    email      VARCHAR(50) UNIQUE,
    password   VARCHAR(255),
    phone      VARCHAR(255),
    roles      VARCHAR(50)

);