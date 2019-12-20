select category.name, film.title
from film_category
inner join film on film_category.film_id = film.film_id
inner join category on film_category.category_id = category.category_id
order by category.name, film.title

/* This is what ALL your statements should have for a join
SELECT table1.column, table2.column
from table1
[inner join | left join | right join] table2 on table1.column = table2.column;
*/

-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:
select p.payment_id, c.first_name as first, c.customer_id
from payment as p
inner join customer c on p.customer_id = c.customer_id 
where payment_id = 16666

-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table
select *
from payment as p
inner join customer c on p.customer_id = c.customer_id 
where payment_id = 16666


-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:
select p.payment_id, (c.first_name || ' ' ||c.last_name) as fullName
from payment as p
inner join customer c on p.customer_id = c.customer_id 
where payment_id = 16666

-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.
select p.payment_id, (c.first_name || ' ' ||c.last_name) as fullName, r.return_date
from payment as p
inner join customer c on p.customer_id = c.customer_id 
inner join rental r on p.rental_id = r.rental_id
where payment_id = 16666 

select * from rental where customer_id = 204

select * from payment where customer_id = 204

-- What did they rent? Film id can be gotten through inventory.
select customer.first_name, rental.return_date, film.title
from payment 
inner join customer on customer.customer_id = payment.customer_id
inner join rental on payment.rental_id = rental.rental_id
inner join inventory on rental.inventory_id = inventory.inventory_id
inner join film on film.film_id = inventory.film_id
where payment.payment_id = 16666 

-- What if we wanted to know who acted in that film?
select * from film where title = 'VOICE PEACH'

select film.title, (actor.first_name || ' ' ||actor.last_name) as actor
from film
inner join film_actor on film.film_id = film_actor.film_id
inner join actor on film_actor.actor_id = actor.actor_id
where film.title = 'VOICE PEACH'

-- What if we wanted a list of all the films and their categories ordered by film title
SELECT film.title, category.name
from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
order by film.title


-- Show all the 'Comedy' films ordered by film title
SELECT film.title, category.name
from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'
order by film.title

-- Finally, let's count the number of films under each category
select category.name, category.category_id, count(*)
from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
group by category.category_id


-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.
select country.name, city.name
from country
join city on country.capital = city.id

select count(*) from country

-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:
select country.name, city.name
from country left join city on country.capital = city.id

select country.name, city.name
from  city right join country on country.capital = city.id

-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates
select first_name
from actor
union
select first_name
from customer
order by first_name

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
select first_name, 'A' as source
from actor
union
select first_name, 'C' as source
from customer
order by first_name

--get the list of first names that are in both actor and customer table
select distinct actor.first_name
from actor
inner join customer on actor.first_name = customer.first_name
order by actor.first_name