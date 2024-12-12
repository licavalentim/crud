package com.exemple.LRcar.LRcar.Model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LRcar")
public class LRcarModel {

    @Id
    private UUID id = UUID.randomUUID(); 

    private String nome;
  private String placa;
  private String anodelancamento;
  private String cor;
  private String modelo;
  private String status;
  public class Veiculo {
	  
	  
  }
	 
	  
	    public void Veiculo(String nome, String placa, String anodelancamento, String cor, String modelo, String status) {
	        this.nome = nome;
	        this.placa = placa;
	        this.anodelancamento = anodelancamento;
	        this.cor = cor;
	        this.modelo = modelo;
	        this.status = status;
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getPlaca() {
	        return placa;
	    }

	    public void setPlaca(String placa) {
	        this.placa = placa;
	    }

	    public String getAnodelancamento() {
	        return anodelancamento;
	    }

	    public void setAnodelancamento(String anodelancamento) {
	        this.anodelancamento = anodelancamento;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

  }

   