-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor(first_name,last_name)
values('HAMPTON', 'AVENUE'),('LISA', 'BYWAY');

--select * 
--from actor





-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

insert into film (title, description,release_year,language_id,length)
values ('EUCLIDEAN PI','The epic story of Euclid as a pizza delivery boy in
ancient Greece',2008,1,198);

--select *
--from film
--order by length desc

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor(actor_id, film_id)
values (203,1001);
insert into film_actor(actor_id, film_id)
values(204,1001);



--select * 
--from film_actor


-- 4. Add Mathmagical to the category table.
insert into category(name)
values('Mathmagial');
--17
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
update film_category
set category_id = 17
where film_id in(494,274,714,996);
insert into film_category(film_id, category_id)
values(1001,17);
--select * from film_category
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
update film
set rating = 'G'
where film_id in(494,274,714,996,1001);

-- 7. Add a copy of "Euclidean PI" to all the stores.
insert into inventory(film_id,store_id)
values(1001,1),(1001,2);

--select * from inventory
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <It did not work because it's embeded in other tables, there are constriants in place to keep that from happening>
delete
from film
where film_id = 1001;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <NO IT VIOLATES THE FORIEGN KEY CONSTRAINT!>

delete
--select *
from category
where name = 'Mathmagical';

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YES! BECAUSE YOU CAN CHANGE THE CATEGORY OF ANY FILM YOU WANT IT'S A FREE COUNTRY>

delete
--select *
from film_category
where category_id = 17;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <MAGICAL IS GONE BECAUSE YOU CAN ADD AND DELETE CATEGORIES>
delete
--select *
from category
where name = 'Mathmagical';

delete
from inventory
where film_id = 1001;




-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;
--Delete all connections to the film and the film should be good to delete
--
