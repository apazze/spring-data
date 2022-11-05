package br.com.demo.spring.data;

import br.com.demo.spring.data.model.Cargo;
import br.com.demo.spring.data.model.Funcionario;
import br.com.demo.spring.data.model.FuncionarioProjection;
import br.com.demo.spring.data.repository.CargoRepository;
import br.com.demo.spring.data.repository.FuncionarioRepository;
import br.com.demo.spring.data.repository.UnidadeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private final CargoRepository cargoRepository;
	private final UnidadeRepository unidadeRepository;
	private final FuncionarioRepository funcionarioRepository;

	public SpringDataApplication(CargoRepository cargoRepository, UnidadeRepository unidadeRepository, FuncionarioRepository funcionarioRepository) {
		this.cargoRepository = cargoRepository;
		this.unidadeRepository = unidadeRepository;
		this.funcionarioRepository = funcionarioRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		int i = 1000;
//		while(i>0){
//			Cargo Analista = cargoRepository.save(new Cargo("ANALISTA"));
//			i--;
//		}
//
//		Pageable pageable = PageRequest.of(0, 5, Sort.by(Sort.Direction.ASC, "nome"));
//
//		Page<Cargo> cargosPorPagina = cargoRepository.findAll(pageable);

//		Unidade Gravatai = unidadeRepository.save(new Unidade("MATRIZ", "GRAVATAI"));
//		Funcionario Alisson = funcionarioRepository.save(new Funcionario("Alisson", "123456", 1000.05, LocalDate.now(), Analista, List.of(Gravatai)));
//
//		List<Funcionario> funcionarios = funcionarioRepository
//				.buscarNomeSalarioMaiorDataContratacao("Alisson", 1000d, LocalDate.now());

		funcionarioRepository.save(new Funcionario("Fulano1"));
		funcionarioRepository.save(new Funcionario("Fulano2"));
		funcionarioRepository.save(new Funcionario("Fulano3"));
		funcionarioRepository.save(new Funcionario("Fulano4"));
		funcionarioRepository.save(new Funcionario("Fulano5"));
		funcionarioRepository.save(new Funcionario("Fulano6"));
		funcionarioRepository.save(new Funcionario("Fulano7"));
		List<FuncionarioProjection> funcionarioProjections = funcionarioRepository.findFuncionarioSalarioComProjecao();




	}
}
