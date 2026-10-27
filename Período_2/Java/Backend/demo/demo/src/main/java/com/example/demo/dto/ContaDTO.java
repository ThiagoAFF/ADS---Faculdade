package com.example.demo.dto;

import java.math.BigDecimal;

public record ContaDTO(
    Long id,
    String titular,
    BigDecimal valor
) { };

// GET /contas/1 devolvendo ContaDTO
{ "id": 1, "titular": "Ana Souza",
"saldo": 1500.00 }
