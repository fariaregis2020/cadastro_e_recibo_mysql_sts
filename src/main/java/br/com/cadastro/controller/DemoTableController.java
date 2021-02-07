package br.com.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cadastro.entities.DemoTable;
import br.com.cadastro.repository.DemoTableRepository;

@Controller
public class DemoTableController {

	@Autowired
	private DemoTableRepository demoTableRepository;

	
	@RequestMapping(method = RequestMethod.GET, value ="/salvardemo")
	private String demotable() {
		return "/cadastro/tabela";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/salvardemo")
	private String demotable(DemoTable demotable) {
		demoTableRepository.save(demotable);
		return "/cadastro/tabela";
	}
	

	
	
}
