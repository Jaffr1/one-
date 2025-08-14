use batch5354;
select * from emptable;
insert into emptable values(1,'emp1',1000,'soft','uniq');
insert into emptable(empid,name) values(2,'emp2');
savepoint a;
insert into emptable(empid,name) values(3,'emp3');
savepoint b;
update emptable set job='test' where name='emp3';
savepoint c;
select * from emptable;
rollback to c;
rollback to b;
rollback to a;
rollback to b;

alter table emptable add column mail varchar(20);
savepoint f;
alter table emptable rename column job to role;
savepoint g;

select * from emptable;
rollback to g;
rollback to f;

insert into emptable values(1,'emp1',1000,'soft','uniq','emp1@gmail.com');
savepoint x;
insert into emptable(empid,name) values(2,'emp2');
savepoint y;
commit;
rollback to x;

select * from emptable;

create user 'userone'@'localhost' 
identified by '1234';

grant select on employee.emp 
to 'userone'@'localhost';

grant all on employee.emp 
to 'userone'@'localhost';

grant all on employee.* 
to 'userone'@'localhost';

grant select on *.*
to 'userone'@'localhost';

revoke select on employee.emp  
from 'userone'@'localhost' ;

revoke all privileges,grant option from 'userone'@'localhost';