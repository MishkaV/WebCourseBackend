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

CREATE TABLE IF NOT EXISTS groups
(
    id        VARCHAR(60) PRIMARY KEY,
    imgUrl    VARCHAR NOT NULL,
    groupName VARCHAR NOT NULL,
    city      VARCHAR NOT NULL,
    theme     VARCHAR NOT NULL,
    followers VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS messages
(
    fullName  VARCHAR(60) PRIMARY KEY,
    shortText VARCHAR NOT NULL,
    sentTime  VARCHAR NOT NULL,
    imgUrl    VARCHAR NOT NULL
);



CREATE TABLE IF NOT EXISTS post
(
    id            VARCHAR(60) PRIMARY KEY,
    fullName      VARCHAR NOT NULL,
    userUrl       VARCHAR NOT NULL,
    date          VARCHAR NOT NULL,
    imgUrl        VARCHAR NOT NULL,
    similarImgUrl VARCHAR NOT NULL
);
