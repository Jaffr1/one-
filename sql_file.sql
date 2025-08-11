create database Batch5354;
use Batch5354;
show tables;

create table Student(id int,name varchar(10),
batch varchar(10));
select * from Student;
desc Student;

insert into Student values(1,'kanish','javafsd');

insert into Student values(2,'harshi','javafsd'),
(3,'thiru','javafsd'),(4,'arun','javafsd');

create table Tab1(joindate date,curtime time,name varchar(10));
insert into Tab1(joindate,curtime) values('2025-08-11','12:59:30');
select * from Tab1;

create table Tab2(id int not null,name varchar(10)unique,
city varchar(10) default 'chennai');
desc Tab2;

insert into Tab2 values(1,'std1','tnagar');
insert into Tab2(id,name) values(2,'std2');
insert into Tab2(name) values('std2');
select * from Tab2;

create table Tab3(sno int primary key,name varchar(10),
age int check(age>=18));
insert into Tab3 values(2,'std1',22);
select * from Tab3;

create table Tab4(sno int primary key auto_increment,name 
varchar(10));
insert into Tab4(name) values('arun');
select * from Tab4;

create table Tab5(sno int primary key auto_increment,name 
varchar(10))auto_increment=100;
insert into Tab5(name) values('tharun');
select * from Tab5;