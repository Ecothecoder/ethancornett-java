-- ORDERING RESULTS

-- Populations of all countries in descending order
select name,population
from country
order by population DESC;

--Names of countries and continents in ascending order
select continent,name
from country
order by continent asc, name asc;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
select name, lifeexpectancy
from country
where lifeexpectancy is not null
order by lifeexpectancy DESC
limit 10; 

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
--'city, state", sorted by state then city
select (name || ' , '||district) as name_and_state
from city
where district in ('California','Oregon','Washington')
order by district,name


-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
-- with two decimal places
select round(AVG(lifeexpectancy)::numeric,2)
from country

-- Total population in Ohio
select SUM(population)
from city
where district = 'Ohio';

-- The surface area of the smallest country in the world
select name,surfacearea
from country
order by surfacearea asc
limit 1;

select MIN(surfacearea)
from country;

-- The 10 largest countries in the world
Select name
from country
order by surfacearea desc
limit 10

-- The number of countries who declared independence in 1991
select count(name)
from country
where indepyear = 1991; 

--how many countries each year by year
select count(*),indepyear
FROM country
group by indepyear
order by count(*) desc

-- GROUP BY
--SELECT
--FROM
--WHERE
--GROUP BY
--ORDER BY

-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language,count(countrycode), avg(percentage) 
FROM countrylanguage
GROUP BY language
ORDER BY count(countrycode) DESC

-- Average life expectancy of each continent ordered from highest to lowest
select continent, avg(lifeexpectancy)
from country
--where lifeexpectancy is not NULL
group by continent
order by avg(lifeexpectancy) desc


-- Exclude Antarctica from consideration for average life expectancy
select continent, avg(lifeexpectancy)
from country
where continent <> 'Antarctica'
group by continent
order by avg(lifeexpectancy) desc

-- Sum of the population of cities in each state in the USA ordered by state name
select sum(population), district
from city
where countrycode = 'USA'
group by district
order by district

-- The average population of cities in each state in the USA ordered by state name
select district, round(avg(population)::numeric,2), sum(population)
from city
where countrycode = 'USA'
group by district
order by district

-- The average population of cities in each state in each country order by country, state
select countrycode, district, round(avg(population)::numeric,2) as AveragePop
from city
group by countrycode, district
order by countrycode, district


--select country code where they have at least 3 cities with a pop over 100000
select countrycode, count(*)
from city
where population > 100000 
group by countrycode
having count(*) > 3

--select *
--from city 
--where countrycode = 'ABW' and district = '–'

-- SUBQUERIES
-- Find the names of cities under a given government leader
select code from country where headofstate = 'Elisabeth II';

select name, countrycode
from city
where countrycode in (select code from country where headofstate = 'Elisabeth II')

-- Find the names of cities whose country they belong to has not declared independence yet
select name, code from country where indepyear is null

select city.name, city.countrycode
from city
where countrycode in (select code from country where indepyear is null)
order by countrycode, name

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as'c" for city and'co" for country.
SELECT c.name, c.district
from city as c

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
