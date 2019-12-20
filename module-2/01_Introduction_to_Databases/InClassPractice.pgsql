-- city that start with D and end with d with pop > 200,000
SELECT * 
FROM city
WHERE name like 'D%d'
 and population>200000;

 
 
--countries where the life expectancy is > 70
 SELECT name, lifeexpectancy
 FROM Country
 WHERE lifeexpectancy > 70;

 --countries where the life expectancy is between 65 and 70
select name, lifeexpectancy
from country
where lifeexpectancy BETWEEN 65 and 70;

--all the country codes where they speak spanish or Creole English
select * 
from countrylanguage
WHERE language = 'Spanish' or language = 'Creole English';

--all the country codes where they speak spanish or Creole English and use In
select * 
from countrylanguage
WHERE language in('Spanish','Creole English');

--all the country codes where they don't speak spanish or Creole English and use In
select * 
from countrylanguage
WHERE language not in('Spanish','Creole English');

--find all countries without an indepyear
select * 
from  country
where indepyear is null;


--find all countries that have indepyear set
select * 
from  country
where indepyear is not null;

--select all cities in country code dza
select * 
from city
where countrycode = 'DZA';

--select all cities not in country code dza
select * 
from city
where countrycode != 'DZA';

-- all of the country codes that have at least 1 city with a poplulate over 1,000,000
-- and change the column name on the output to appbreviation
select distinct countrycode as Abbreviation
from city 
where population>1000000

