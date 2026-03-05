# Jogo da velha = Comentário
# Aula 1 - DDL e DML

# Criação de banco de dados
create database Biblioteca;
use Biblioteca;

# Criação da tabela
create table Livros (
	id int auto_increment primary key,
	titulo varchar(100),
	autor varchar(100),
	genero varchar(30),
	ISBN varchar(14) unique key,
	data_arquivado date,
	data_livro date
);

create table Aluguel(
	nome_cliente varchar(100),
    cpf varchar(11),
    
);

# Alterar Tabela
alter table Livros add column ISBN varchar(14) unique key after genero;

drop table Livros;

insert into Livros values (
	1, 'O Estranho Misterioso', 'Mark Twain', 'Ficção', '978-8585554125', '2026-03-04', '2012-01-01'),
    (2, 'A Divina Comédia - Inferno', 'Dante Alighieri', 'Ficção', '978-6550970321', '2026-03-04', '2020-03-18'),
    (3, 'A Divina Comédia - Purgatório', 'Dante Alighieri', 'Ficção', '978-6550970338', '2026-03-04', '2020-03-23'),
    (4, 'A Divina Comédia - Paraíso', 'Dante Alighieri', 'Ficção', '978-6550970345', '2026-03-04', '2020-03-25'
);


# Acessar tabela
select * from Livros;

# Mostra todas as tabelas
show full tables;