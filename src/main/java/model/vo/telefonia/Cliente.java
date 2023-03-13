package model.vo.telefonia;

import java.util.List;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String cpf;
	private List<Telefone> telefones; 
	private boolean ativo;
	private Endereco endereco;
	
	public Cliente() {
		
	}
	
	
	public Cliente(Integer id, String nome, String cpf, List<Telefone> telefones, boolean ativo, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
		this.ativo = ativo;
		this.endereco = endereco;
	}


	public Cliente(String nome, String cpf, List<Telefone> telefones, boolean ativo, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
		this.ativo = ativo;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	public String toString() {
		return "\n Cliente Nome: " + this.getNome()
				+ "\n Cpf: " + this.getCpf() 
				+ "\n Telefones " + this.getTelefones() 
				+ "\n Ativo: " + this.isAtivo()
				+ "\n Endereco" + this.getEndereco();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
