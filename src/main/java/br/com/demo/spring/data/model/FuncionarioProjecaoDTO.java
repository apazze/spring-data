package br.com.demo.spring.data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioProjecaoDTO {
    //tbm é possivel fazer projeção via classe, o construtor deve receber os atributos na ordem da query
    private Integer id;
    private String nome;
    private Double salario;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public FuncionarioProjecaoDTO(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
}
