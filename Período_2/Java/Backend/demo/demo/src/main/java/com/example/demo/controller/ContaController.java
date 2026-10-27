package com.example.demo.controller;

import com.example.demo.dto.ContaDTO;
import com.example.demo.entity.Conta;
import com.example.demo.mapper.ContaMapper;
import com.example.demo.service.ContaService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/contas")
public class ContaController {
    private final ContaService service;
    public ContaController(ContaService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public Conta buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @GetMapping("/{id}")
    public ContaDTO buscarPorId(@PathVariable Long id) {
    Conta conta = service.buscarPorId(id);
    return ContaMapper.paraDTO(conta);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContaDTO criar(
        @Valid @RequestBody ContaRequest r) {
            Conta conta = service.criar(r);
            return ContaMapper.paraDTO(conta);
        }

}
