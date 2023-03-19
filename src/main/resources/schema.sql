CREATE TABLE IF NOT EXISTS friends (
    name     VARCHAR(60)      PRIMARY KEY,
    surname     VARCHAR      NOT NULL,
    age     INT      NOT NULL,
    county     VARCHAR      NOT NULL,
    city     VARCHAR      NOT NULL,
    gender     VARCHAR      NOT NULL
);