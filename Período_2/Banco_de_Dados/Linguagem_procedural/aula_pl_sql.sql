-- Criando a tabela de clientes
CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);
-- Criando a tabela de log sem geração automática do ID
CREATE TABLE log_clientes (
    id_log INT PRIMARY KEY,
    acao VARCHAR(10),
    id_cliente INT,
    data_hora DATETIME
);
INSERT INTO clientes VALUES 
(1, 'João Silva', 'joao@email.com'),
(2, 'Maria Souza', 'maria@email.com'),
(3, 'Carlos Oliveira', 'carlos@email.com');

select * from clientes;

select now();

DELIMITER $$ -- Delimita um bloco, deve ter começo e fim
begin -- começa um bloco de programação

declare -- Declarar variáveis
    v_numero int;
    v_data datetime;
    
v_numero := 2;
v_numero := v_numero * 2;
	if v_numero = 2 then
		v+numero := 0;
        v_data := now(); -- Puxa o horário atual
	else
		v_numero := 1;
	end if;
    
end; -- termina o bloco
DELIMITER ;

DELIMITER $$

CREATE FUNCTION obter_proximo_id () RETURNS INTEGER

deterministic

BEGIN

DECLARE
v_proximo_id INTEGER;

SELECT max(id_cliente) + 1 INTO v_proximo_id FROM clientes;
RETURN v_proximo_id;

END $$

DELIMITER ;

select obter_proximo_id ();

insert into clientes values
(obter_proximo_id(), 'Silva', 'joao@email.com'),
(obter_proximo_id(), 'Souza', 'maria@email.com'),
(obter_proximo_id(), 'Oliveira', 'carlos@email.com');

DELIMITER $$

CREATE PROCEDURE inserir_cliente( -- Cria *Procedimento*, não _função_. Procedure não processa/retorna dados.
    IN p_nome VARCHAR(100),
    IN p_email VARCHAR(100)
)
BEGIN 
    INSERT INTO clientes (id_cliente, nome, email)
    VALUES (obter_proximo_id(), p_nome, p_email);
    COMMIT;
END $$
DELIMITER ;

call inserir_cliente('domingos', 'dd@email.com'); -- Call é o 'SELECT de procedimentos'

DELIMITER $$
create trigger trg_log_inserir_cliente
after insert on clientes
for each row
begin
	insert into log_clientes (id_log, acao, id_cliente, data_hora)
    values (obter_prox_log(), 'INSERT', new.id_cliente, now());
end $$
DELIMITER ;

DELIMITER $$
create function obter_prox_log() returns integer
deterministic
begin
declare
v_prox_log integer;
	select ifnull(max(id_log), 0) + 1 into v_prox_log from log_clientes;
    return v_prox_log;
end $$
DELIMITER ;

drop trigger trg_log_inserir_cliente;
drop function obter_prox_log;

call inserir_cliente('teste trigger', 'testando@123');
call inserir_cliente('Mano Brown', 'Mano@Brown');

select * from clientes;
select * from log_clientes;