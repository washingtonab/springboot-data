package br.com.springboot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springboot.data.model.Pessoa;
import br.com.springboot.data.repository.PessoaRepository;

@SpringBootApplication
public class SpringbootDataApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Pessoa p1 = new Pessoa();
		p1.setId(1L);
		p1.setNome("henrique");
		p1.setIdate(8);
		p1.setEmail("henrique@gmail.com");

		Pessoa p2 = new Pessoa();
		p2.setId(2L);
		p2.setNome("washington");
		p2.setIdate(30);
		p2.setEmail("washington@gmail.com");

		System.out.println("Save: " + p1.getId());
		repository.save(p1);

		System.out.println("Save: " + p2.getId());
		repository.save(p2);

		System.out.println("Count: " + repository.count());
	}

}
