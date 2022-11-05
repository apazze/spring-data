package br.com.demo.spring.data.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "unidades")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private String endereco;

    @ManyToMany(mappedBy = "unidades", fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios;

    public Unidade(String descricao, String endereco) {
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public Unidade() {
    }
}
