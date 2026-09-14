create table departamentos (
	id_depto int primary key,
    nome_depto varchar(50)
);

create table funcionarios (
	id_func int primary key,
    nome_func varchar(50),
    salario decimal(10,2),
    id_depto int,
    foreign key (id_depto) references departamentos(id_depto)
);

insert into departamentos values
(1, 'TI'),
(2, 'RH');

insert into funcionarios values
(101, 'Alice Turing', 5000.00, 1),
(102, 'Bob Martin', 4500.00, 1),
(103, 'Carol Silva', 4000.00, 2);

show index from departamentos;
show index from funcionarios;

create index idx_salario on funcionarios (salario);
drop index idx_salario on funcionarios;
drop index id_depto on funcionarios; /* !! */

