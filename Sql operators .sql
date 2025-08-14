use employee;
select * from emp;
select name ,job,deptno from emp 
where job='manager' and deptno=20;

select name ,job,deptno,salary from emp where 
job ='salesman' or deptno =30;

select name ,job from emp 
where  not job='salesman';

select * from emp where deptno in (10,20);
select * from emp where deptno not in (10,20);

select * from emp where comm is null;
select * from emp where comm = null;
select * from emp where comm = 'null';

select * from emp where comm is not null;

select * from emp where name like 'smith';
select * from emp where name like 'a%';
select * from emp where name like 'w___';
select * from emp where name like '%a%';
select * from emp where name not like '%a%';

select name,job,hiredate,empno from emp 
where empno between 7369 and 7782;

select name,job,hiredate from emp where 
hiredate between '1981-02-22' and '1981-12-05';

create table tableone(id int, name varchar(10),
job varchar(10));

insert into tableone values(1,'A','soft'),
(2,'B','soft'),(3,'c','soft');

create table tabletwo(id int, name varchar(10),
email varchar(10));

insert into tabletwo values(1,'A','A@gamail'),
(2,'d','dgmail'),(3,'e','egmail');

select * from tableone;
select * from tabletwo;

select id,name from tableone union select id
,name from tabletwo;

select id,name from tableone union all select id
,name from tabletwo;

select id,name from tableone intersect select id
,name from tabletwo;

select name from emp where name like '_a%';