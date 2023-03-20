CREATE TABLE IF NOT EXISTS friends
(
    name    VARCHAR(60) PRIMARY KEY,
    surname VARCHAR NOT NULL,
    age     INT     NOT NULL,
    county  VARCHAR NOT NULL,
    city    VARCHAR NOT NULL,
    gender  VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS news
(
    title       VARCHAR(60) PRIMARY KEY,
    imgUrl      VARCHAR NOT NULL,
    description VARCHAR NOT NULL,
    date        VARCHAR NOT NULL
);