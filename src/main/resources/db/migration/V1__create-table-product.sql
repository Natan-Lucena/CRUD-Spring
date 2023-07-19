CREATE TABLE product (
    id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    price_in_cents INT NOT NULL
);