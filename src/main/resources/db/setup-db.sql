create database globomaticsBikeDb;

create user 'bike_user'@'localhost' identified by 'bike123';
grant all privileges on globomaticsBikeDb.* to 'bike_user'@'localhost';
flush privileges