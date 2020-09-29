create database dbclienteburguer;
use dbclienteburguer;

create table tbclientes(
idcliente int auto_increment primary key,
nomecliente varchar(50) not null,
cpf varchar(13) not null unique,
telefone varchar(20) not null,
email varchar(100) not null
);

select * from tbclientes;