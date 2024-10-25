create database estructuras

create table Empleados
(
id int identity(1,1) primary key,
Cedula int,
Nombre varchar(40),
Apellido varchar(40),
Correo varchar(200)
)

select * from Empleados
insert into Empleados(Cedula,Nombre,Apellido,Correo)
values (71228300,'dennis', 'garro','sistemasitm@hotmail.com')

insert into Empleados(Cedula,Nombre,Apellido,Correo)
values (71228301,'maria', 'del valle','delvalle@hotmail.com')