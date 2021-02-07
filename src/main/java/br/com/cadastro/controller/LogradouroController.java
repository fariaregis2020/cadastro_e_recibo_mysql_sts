package br.com.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cadastro.entities.Logradouro;
import br.com.cadastro.repository.LogradouroRepository;

@Controller
public class LogradouroController {

	@Autowired
	private LogradouroRepository logradouroRepository;
	
	
	@RequestMapping (method = RequestMethod.GET, value ="/logradouro_save")
	private String logradouro() {
		return "cadastro/logradouro";
	}
	
	@RequestMapping (method = RequestMethod.POST, value ="/logradouro_save")
	private String logradouro(Logradouro logradouro) {
		logradouroRepository.save(logradouro);
		return "cadastro/logradouro";
	}
	
	
	
	
}
