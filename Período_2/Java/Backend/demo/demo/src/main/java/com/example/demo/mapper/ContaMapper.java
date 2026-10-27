package com.example.demo.mapper;

import com.example.demo.dto.ContaDTO;
import com.example.demo.entity.Conta;

public class ContaMapper {
    public static ContaDTO paraDTO(Conta conta) {
        return new ContaDTO(
            conta.getId(),
            conta.getTitular(),
            conta.getValor() // renomeou? só aqui
        );
        // senhaHash e gerenteId não são copiados
    }

    public static Conta paraEntity(ContaRequest r) {
        return new Conta(r.titular(), r.valor());
    }

}

