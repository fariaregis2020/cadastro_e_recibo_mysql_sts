package br.com.cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.entities.DemoTable;

@Repository
public interface DemoTableRepository extends CrudRepository<DemoTable, Long>  {

}
