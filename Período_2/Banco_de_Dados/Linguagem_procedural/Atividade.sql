create database atividade_ThiagoAmorim;
use atividade_ThiagoAmorim;

-- Criação de Tabelas
create table FUNCIONARIO(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    SALARIO DECIMAL(7,2) NOT NULL
);

create table HISTORICO_FUNCIONARIO(
    ID_HISTORICO INT PRIMARY KEY AUTO_INCREMENT,
    ID_FUNCIONARIO INT NOT NULL,
    ACAO VARCHAR(100) NOT NULL,
    SALARIO_ANTIGO DECIMAL(7,2)
);

-- Procedures / Procedimentos
DELIMITER $$

create procedure inserir_funcionario(
    in f_nome varchar(100),
    in f_salario decimal(7,2)
)
begin
    insert into FUNCIONARIO (NOME, SALARIO)
    values (f_nome, f_salario);
    commit;
end $$

DELIMITER ;

DELIMITER $$

create procedure atualizar_salario(
    in f_id int,
    in f_salario decimal(7,2)
)
begin
    update FUNCIONARIO
    set SALARIO = f_salario
    where ID = f_id;
end $$

DELIMITER ;

DELIMITER $$

create procedure excluir_funcionario(
    in f_id int
)
begin
    delete from FUNCIONARIO
    where ID = f_id;
end $$

DELIMITER ;

-- Triggers / Gatilhos
DELIMITER $$

create trigger trg_log_updateOn_FUNCIONARIO
after update on FUNCIONARIO
for each row
begin
    insert into HISTORICO_FUNCIONARIO (ACAO, SALARIO_ANTIGO, ID_FUNCIONARIO)
    values ('ATUALIZACAO SALARIO', old.SALARIO, old.ID);
end $$

DELIMITER ;

DELIMITER $$

create trigger trg_log_deleteOn_FUNCIONARIO
after delete on FUNCIONARIO
for each row
begin
    insert into HISTORICO_FUNCIONARIO (ACAO, ID_FUNCIONARIO)
    values ('EXCLUSAO FUNCIONARIO', old.ID);
end $$

DELIMITER ;

-- Calls
call inserir_funcionario('Domingos', 7500.00);
call atualizar_salario(2, 9000.00);
call excluir_funcionario(1);

-- Select
Select * from FUNCIONARIO;
Select * from HISTORICO_FUNCIONARIO;