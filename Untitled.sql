create database vehicle_inventory;
use vehicle_inventory;
select * from vehicle;
drop table vehicle;
create table vehicle(
id Integer,
image varchar(200),
type varchar(50),
brand varchar(50),
model varchar(50),
year Integer,
price Integer
)
