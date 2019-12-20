--Employee exercise


BEGIN TRANSACTION;



CREATE TABLE department
(
    department_id serial,
    Name varchar(64) not null,
    constraint pk_department primary key (department_id)

);

CREATE TABLE projects 
(
    project_id serial,
    Pro_Num int not null,
    name varchar(64) not null,
    Start_Date date not null,
    constraint pk_proj primary key (project_id)
);



CREATE TABLE employee
(
    Employee_id serial,
    Employee_Number int not null,
    Job_Title varchar(64) not null,
    Last_Name varchar(64) not null,
    First_Name varchar(64) not null,
    Gender varchar(64) not null,
    DoB date not null,
    Date_of_Hire date not null,
    department_id int not null,
    project_id int not null,
	constraint pk_employee primary key (employee_id),
    constraint fk_projemployee FOREIGN key (project_id) references projects (project_id),
    constraint fk_departemployee foreign key (department_id) references department (department_id)
);

--Time to fill the tables!

--Populate the tables with data for at least four projects, three departments, and eight employees.
--Make sure each project has at least one employee assigned to it, and each department has at least two employees.
Insert into department (name)
values ('Davids Go Shop'), ('Craigs Lifting Waittime'), ('Pauls Comedy Shaq');

insert into projects (Pro_num, name, Start_Date)
values (34, 'Metal Gear', '1980-12-23'), (39, 'Phantom Arm', '1990-12-23'),(60, 'Gray Fox!', '1995-12-23'), (80, 'Game of the Year', '1999-12-23');

insert into employee (Employee_Number,Job_Title,Last_Name,First_Name,Gender, DoB, Date_of_Hire,department_id,project_id)
values(23, 'Gunner', 'Snake','Solid','Male','1978-12-23','1978-12-25',1,3),
    (56, 'King', 'Big','Boss','Male','1930-12-23','1978-12-25',1,3),
    (12, 'Lesser Twin', 'Snake','Liquid','Male','1978-12-23','1978-12-25',2,3),
    (45, 'Im not sure', 'Snake','Solidious','Male','1978-12-23','1978-12-25',2,4),
    (1, 'Female Lead', 'Campbell','Meryl','Female','1960-12-23','1978-12-25',3,4),
    (2, 'Crazy Robot', 'Jeager','Frank','Male','1945-12-23','1978-12-25',3,3),
    (54, 'Ocelot', 'Ocelot','Revolver','Male','1970-12-23','1978-12-25',1,1),
    (90, 'Inter', 'Ryan','Jack','Male','1977-12-23','1978-12-25',3,2);


Commit;