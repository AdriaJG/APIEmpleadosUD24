DROP table IF EXISTS empleados;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo ENUM('BECARIO','JUNIOR', 'SENIOR', 'BOSS')
);

insert into empleado (nombre, trabajo)values('Jose','BECARIO');
insert into empleado (nombre, trabajo)values('Juan','SENIOR');
insert into empleado (nombre, trabajo)values('Pedro','BOSS');