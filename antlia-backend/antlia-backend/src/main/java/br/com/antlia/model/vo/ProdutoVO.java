package br.com.antlia.model.vo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoVO {
	private int codProduto;
	private String desProduto;
	private String numLancamento;
	private String descricao;
	private String valor;
	private int ano;
	private int mes;
	
	public ProdutoVO(int codProduto, String desProduto, int ano, int mes, String numLancamento, String descricao, String valor ) {
		this.codProduto = codProduto;
		this.desProduto = desProduto;
		this.numLancamento = numLancamento;
		this.descricao = descricao;
		this.valor = valor;
		this.ano = ano;
		this.mes = mes;
	}
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getDesProduto() {
		return desProduto;
	}
	public void setDesProduto(String desProduto) {
		this.desProduto = desProduto;
	}
	public String getNumLancamento() {
		return numLancamento;
	}
	public void setNumLancamento(String numLancamento) {
		this.numLancamento = numLancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	
}
