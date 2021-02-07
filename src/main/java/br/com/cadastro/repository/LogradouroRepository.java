package br.com.cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.entities.Logradouro;

@Repository
public interface LogradouroRepository extends CrudRepository<Logradouro, Long>  {

}
