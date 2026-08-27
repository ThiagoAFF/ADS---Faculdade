create database atv_1p2;
use atv_1p2;

create table CURSO (
	id_curso int primary key auto_increment,
    nome varchar(50) not null,
    duracao int not null
);

create table ALUNO (
	id_aluno int auto_increment,
    nome varchar(50) not null,
    id_curso int not null,
    primary key (id_aluno, id_curso),
    foreign key ALUNO(id_curso) references CURSO(id_curso)
);

create table DISCIPLINA (
	id_disciplina int primary key auto_increment,
    nome varchar(50) not null,
    nome_professor varchar(50) not null
);

create table MATRICULA (
	id_aluno int,
    id_disciplina int,
    Semestre varchar(6),
    nota double,
    primary key (id_aluno, id_disciplina, Semestre),
    foreign key MATRICULA(id_aluno) references ALUNO(id_aluno),
    foreign key MATRICULA(id_disciplina) references DISCIPLINA(id_disciplina)
);

insert into CURSO (nome, duracao)
values
("Análise e Desenvolvimento de Sistemas", 24),
("Engenharia Civil", 60),
("Administração", 48);

insert into ALUNO (nome, id_curso)
values
("João Silva", 1),
("Maria Souza", 1),
("Pedro Santos", 2),
("Ana Costa", 2),
("Lucas Oliveira", 3),
("Beatriz Lima", 3);

insert into DISCIPLINA (nome, nome_professor)
values
("Banco de Dados", "Carlos Mendes"),
("Programação Web", "Fernanda Alves"),
("Estruturas de Concreto", "Roberto Dias"),
("Gestão Financeira", "Patrícia Rocha"),
("Cálculo I", "Marcelo Nunes");

insert into MATRICULA (id_aluno, id_disciplina, Semestre, nota)
values
(1, 1, "2026.1", 8.5),
(2, 2, "2026.1", 7.0),
(3, 3, "2026.1", 9.0),
(4, 3, "2026.1", 6.5),
(5, 4, "2026.1", 7.8),
(6, 5, "2026.1", 8.2);

select ALUNO.nome, CURSO.nome
from ALUNO
join CURSO on ALUNO.id_curso = CURSO.id_curso;

select DISCIPLINA.nome, DISCIPLINA.nome_professor from DISCIPLINA;

select MATRICULA.id_aluno, MATRICULA.id_disciplina from MATRICULA where Semestre = '2026.1';

select count(distinct id_aluno) from ALUNO;

create database atv_1p2;
use atv_1p2;

create table CURSO (
	id_curso int primary key auto_increment,
    nome varchar(50) not null,
    duracao int not null
);

create table ALUNO (
	id_aluno int auto_increment,
    nome varchar(50) not null,
    id_curso int not null,
    primary key (id_aluno, id_curso),
    foreign key ALUNO(id_curso) references CURSO(id_curso)
);

create table DISCIPLINA (
	id_disciplina int primary key auto_increment,
    nome varchar(50) not null,
    nome_professor varchar(50) not null
);

create table MATRICULA (
	id_aluno int,
    id_disciplina int,
    Semestre varchar(6),
    nota double,
    primary key (id_aluno, id_disciplina, Semestre),
    foreign key MATRICULA(id_aluno) references ALUNO(id_aluno),
    foreign key MATRICULA(id_disciplina) references DISCIPLINA(id_disciplina)
);

insert into CURSO (nome, duracao)
values
("Análise e Desenvolvimento de Sistemas", 24),
("Engenharia Civil", 60),
("Administração", 48);

insert into ALUNO (nome, id_curso)
values
("João Silva", 1),
("Maria Souza", 1),
("Pedro Santos", 2),
("Ana Costa", 2),
("Lucas Oliveira", 3),
("Beatriz Lima", 3);

insert into DISCIPLINA (nome, nome_professor)
values
("Banco de Dados", "Carlos Mendes"),
("Programação Web", "Fernanda Alves"),
("Estruturas de Concreto", "Roberto Dias"),
("Gestão Financeira", "Patrícia Rocha"),
("Cálculo I", "Marcelo Nunes");

insert into MATRICULA (id_aluno, id_disciplina, Semestre, nota)
values
(1, 1, "2026.1", 8.5),
(2, 2, "2026.1", 7.0),
(3, 3, "2026.1", 9.0),
(4, 3, "2026.1", 6.5),
(5, 4, "2026.1", 7.8),
(6, 5, "2026.1", 8.2);

-- 9 - Início de Select
select ALUNO.nome, CURSO.nome
from ALUNO
join CURSO on ALUNO.id_curso = CURSO.id_curso;

-- 10
select DISCIPLINA.nome, DISCIPLINA.nome_professor from DISCIPLINA;

-- 11
select MATRICULA.id_aluno, MATRICULA.id_disciplina from MATRICULA where Semestre = '2026.1';

-- 12
select count(distinct id_aluno) from ALUNO;

-- 13
select CURSO.nome, ALUNO.nome, MATRICULA.Semestre, DISCIPLINA.nome
from MATRICULA
join ALUNO on MATRICULA.id_aluno = ALUNO.id_aluno
join DISCIPLINA on MATRICULA.id_disciplina = DISCIPLINA.id_disciplina
join CURSO on ALUNO.id_curso = CURSO.id_curso
order by 1,3;

-- 14
select avg(nota) from MATRICULA;

-- 14
select min(nota), max(nota) from MATRICULA;

-- 16
select ALUNO.nome, DISCIPLINA.nome, MATRICULA.nota
from MATRICULA
join ALUNO on MATRICULA.id_aluno = ALUNO.id_aluno
join DISCIPLINA on MATRICULA.id_disciplina = DISCIPLINA.id_disciplina
where Semestre = '2026.1';

-- 18
select DISCIPLINA.nome, MATRICULA.id_aluno, MATRICULA.Semestre, MATRICULA.nota
from DISCIPLINA
left join MATRICULA on DISCIPLINA.id_disciplina = MATRICULA.id_disciplina;
-- or
select D.id_disciplina, D.nome, D.nome_professor, M.id_aluno from DISCIPLINA D
left join matricula m on m.id_DISCIPLINA = d.id_DISCIPLINA;

-- 19 - Início de Update
-- Sem o where, todas as linhas serão atualizadas. O mesmo é válido para DELETE
update MATRICULA 
set nota = 10
where id_disciplina = 1;

select * from MATRICULA;

-- 20
-- Não usar ' = ' para comparar null, mas usar o ' is ' | Edit -> Turn Safe OFF | Query -> Reconnect to Server
update MATRICULA
set nota = 7
where nota is null;