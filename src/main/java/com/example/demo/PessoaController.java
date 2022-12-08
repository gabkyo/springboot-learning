package com.example.demo;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    private final String template = "A pessoa %s nasceu em %s e gosta de %s.";
    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/pessoa")
    public Pessoa pessoa(@RequestParam(value = "nome", defaultValue = "Zé Ninguém") String nome,
        @RequestParam(value = "aniversario", defaultValue = "01-01-1999") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate aniversario,
        @RequestParam(value = "favorito" , defaultValue = "Nada") String favorito){
            return new Pessoa(contador.incrementAndGet(), nome, aniversario, favorito);
        }



}
