package br.com.demo.spring.data.repository;

import br.com.demo.spring.data.model.Unidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends CrudRepository<Unidade, Integer> {
}
