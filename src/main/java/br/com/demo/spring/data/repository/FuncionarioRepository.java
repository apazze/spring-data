package br.com.demo.spring.data.repository;

import br.com.demo.spring.data.model.Funcionario;
import br.com.demo.spring.data.model.FuncionarioProjecaoDTO;
import br.com.demo.spring.data.model.FuncionarioProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {


    //Derived Query Methods - queries criadas através de código Java
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    List<Funcionario> findByNome(String nome);
    //List<Funcionario> findByNome(String nome, Pageable pageable);

    //JPQL - queries criadas através de uma estrutura SQL, porém com os nomes das entidades Java

    @Query("SELECT f FROM Funcionario f WHERE f.nome = :nome " +
            "AND f.salario >= :salario AND f.dataContratacao = :data")
    List<Funcionario> buscarNomeSalarioMaiorDataContratacao(String nome, Double salario, LocalDate data);

//    List<Funcionario> findByCargoDescricao();

    //Eh equivalente a:
//    @Query("SELECT f FROM Funcionario f JOIN f.cargo c WHERE c.descricao = :descricao")
//    List<Funcionario> findByCargoPelaDescricao(String descricao);


    //Se a entidade for composta por 2 nomes, usar "_" para deixar mais claro
    //List<Funcionario> findByUnidadeTrabalhos_Descricao(String descricao);

    //Eh equivalente a:

//    @Query("SELECT f FROM Funcionario f JOIN f.unidadeTrabalhos u WHERE u.descricao = :descricao")
//    List<Funcionario> findByUnidadeTrabalhos_Descricao(String descricao);


    //Native Query - queries padrões SQL que conseguimos executar no nosso Client SQL
    //query nativa, usar atributos do banco e nao mais das entidades
//    @Query(value = "SELECT * FROM funcionarios f WHERE f.data_contratacao >= :data", nativeQuery = true)
//    List<Funcionario> buscaDataContratacaoMaior(LocalDate data);


    @Query(value = "SELECT f.id, f.nome, f.salario FROM funcionarios f", nativeQuery = true)
    List<FuncionarioProjection> findFuncionarioSalarioComProjecao();

    @Query(value = "SELECT f.id, f.nome, f.salario FROM funcionarios f", nativeQuery = true)
    List<FuncionarioProjecaoDTO> findFuncionarioSalarioComProjecaoClasse();

}
