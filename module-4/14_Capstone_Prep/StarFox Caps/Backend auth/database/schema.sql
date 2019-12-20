BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS userPokemon;

CREATE TABLE users (
  id serial PRIMARY KEY,
  username varchar(255) NOT NULL UNIQUE,     -- Username
  password varchar(32) NOT NULL,      -- Password
  salt varchar(256) NOT NULL,          -- Password Salt
  role varchar(255) NOT NULL default('user')
);

CREATE TABLE userPokemon(
  id serial PRIMARY KEY,
  userId INT,
  pokeName TEXT,
  apiUrl Text,

	constraint fk_userPokemon_user foreign key (userId) references users (id)
)
select * from users
select * from userPokemon
insert INTO userPokemon(userId,pokeName,apiUrl) VALUES (2,'bulbasaur', 	'https://pokeapi.co/api/v2/pokemon/1/')

select * from userPokemon
COMMIT TRANSACTION;
