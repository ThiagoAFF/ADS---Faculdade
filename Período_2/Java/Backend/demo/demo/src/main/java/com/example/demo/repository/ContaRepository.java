package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Conta;
public interface ContaRepository
        extends JpaRepository<Conta, Long> {
    Conta findByTitular(String titular);
}
