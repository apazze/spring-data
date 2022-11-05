package br.com.demo.spring.data.model;

public interface FuncionarioProjection {
    Integer getId();
    String getNome();
    Double getSalario();

    //O objetivo de criar essa interface é encapsular os valores de retorno da consulta dentro de métodos.
}
