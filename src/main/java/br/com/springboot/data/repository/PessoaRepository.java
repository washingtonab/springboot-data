package br.com.springboot.data.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.springboot.data.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
