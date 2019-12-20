--USE THE WORLD DATABASE

-- INSERT

-- INSERT INTO table_name (column1, column2, ...)
-- VALUES (value1, value2, ...)

-- 1. Add Klingon as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isOfficial,percentage)
VALUES('USA', 'Klingon','true',18.3);

select * from countrylanguage where countrycode = 'USA'

-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage (countrycode, language, isOfficial,percentage)
VALUES('GBR', 'Klingon','false',0.0);
select * from countrylanguage where countrycode = 'GBR'

-- UPDATE
-- UPDATE table_name
-- SET columnA = value
-- WHERE columnB = value

-- 1. Update the capital of the USA to Houston
Update country
set capital = (select id from city where name = 'Houston')
where code = 'USA'

select * from country where code = 'USA'

-- 2. Update the capital of the USA to Washington DC and the head of state
select id from city where name = 'Washington'
UPDATE country
SET capital =  3813,
    headofstate = 'Worf'
WHERE code = 'USA'

-- DELETE
--DELETE from table_name
--WHERE column=value

-- 1. Delete English as a spoken language in the USA
DELETE 
--select * 
from countrylanguage
WHERE countrycode='USA' and language = 'English'

-- 2. Delete all occurrences of the Klingon language 
DELETE 
-- select *
from countrylanguage
WHERE language = 'Klingon'

-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage ( language, isOfficial,percentage)
VALUES('Elvish',TRUE,18.3);

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage ( countrycode, language, isOfficial,percentage)
VALUES('ZZZ','English',TRUE,18.3);


-- 3. Try deleting the country USA. What happens?
DELETE FROM country
WHERE code = 'USA'


-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
INSERT INTO countrylanguage ( countrycode, language, isOfficial,percentage)
VALUES('USA','English',TRUE,18.3);

-- 2. Try again. What happens?

INSERT INTO countrylanguage ( countrycode, language, isOfficial,percentage)
VALUES('USA','English',TRUE,18.3);

-- 3. Let's relocate the USA to the continent - 'Outer Space'

Update country
set continent = 'Outer Space'
where code = 'USA'

-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;


-- TRANSACTIONS

--START TRANSACTION
--COMMIT 
--OR
--ROLLBACK

-- 1. Try deleting all of the rows from the country language table and roll it back.
START TRANSACTION;
DELETE from countrylanguage;
SELECT * from countrylanguage;
ROLLBACK;

-- 2. Try updating all of the cities to be in the USA and roll it back
START TRANSACTION; 
update city
set countrycode = 'USA';
select * from city
Rollback;

select * from city

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.

select * from city where name = 'Kabul'