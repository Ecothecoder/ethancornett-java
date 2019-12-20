BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS favorites;

CREATE TABLE users (
  id serial PRIMARY KEY,
  username varchar(255) NOT NULL UNIQUE,     -- Username
  password varchar(32) NOT NULL,      -- Password
  salt varchar(256) NOT NULL,          -- Password Salt
  role varchar(255) NOT NULL default('user')
);

CREATE TABLE favorites (
  id serial PRIMARY KEY,
  userId int,
  fact text,
  picturePath text,

  CONSTRAINT fk_users FOREIGN KEY(userId) REFERENCES users(id)
);

COMMIT TRANSACTION;
