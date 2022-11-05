package br.com.demo.spring.data.repository;

import br.com.demo.spring.data.model.Cargo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends PagingAndSortingRepository<Cargo, Integer> {

}
