package com.itb.tcc.empresavendaereciclagem.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
	//public: Acesso liberado para todas as classes.
	//private: Acesso permitido apenas para os membros 
	//da própria classe.
	//Entende-se por membros (atributos e ou métodos)
	
	//Métodos Setter's e Getter's : atribuir e recuperar dados do atributo RESPECTIVAMENTE
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;      
	}        // nao precisa colocar o this aqui pois não tem nenhuma variavel inserida 

	public void setNome(Long nome) {
		this.nome = nome;
	}
	public Long getNome() {
		return nome;      
	}  
	public void setDescrição(Long descricao) {
		this.descricao = descricao;
	}
	public Long getDescrição() {
		return descricao;      
	}  
	public void setcodigoBarras(Long codigoBarras) {
		this.codigobarras = codigobarras;
	}
	public Long getcodigoBarras() {
		return codigoBarras;      
	}  
}
