package br.com.cadastro.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Logradouro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private String logradouro;
	private String bairro; 
	private String cidade; 
	private String uf ;
	private String cep; 
	
	
	public Logradouro () {
		
	}


	public Logradouro(long id, String logradouro, String bairro, String cidade, String uf, String cep) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}


	public long getId() {
		return id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getUf() {
		return uf;
	}


	public String getCep() {
		return cep;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	
	//hascode equals para comparar os ids 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logradouro other = (Logradouro) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
//	hascode equals 
	
	
	
	
	
}
