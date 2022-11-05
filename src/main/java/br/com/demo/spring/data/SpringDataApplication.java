package br.com.demo.spring.data;

import br.com.demo.spring.data.model.Cargo;
import br.com.demo.spring.data.model.Funcionario;
import br.com.demo.spring.data.model.Unidade;
import br.com.demo.spring.data.repository.CargoRepository;
import br.com.demo.spring.data.repository.FuncionarioRepository;
import br.com.demo.spring.data.repository.UnidadeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
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
		Cargo Analista = cargoRepository.save(new Cargo("ANALISTA"));
		Unidade Gravatai = unidadeRepository.save(new Unidade("MATRIZ", "GRAVATAI"));
		Funcionario Alisson = funcionarioRepository.save(new Funcionario("Alisson", "123456", 1000.05, LocalDate.now(), Analista, List.of(Gravatai)));

	}
} // http://localhost:8085/h2-console
