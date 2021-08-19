package com.daniel.portifolio.domain;

import java.math.BigDecimal;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7, 2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name="data_entrada", nullable = false, columnDefinition = "DATE")
	private String dataEntrada;
	
	@Column(name="data_saida", columnDefinition = "DATE")
	private String dataSaida;
	
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}


	public String getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public String getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;
}
