package br.com.antlia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "movimentos_manuais")
public class MovimentosManuais {

	@Id
	@Column(name = "DAT_MES")
	private int datMes;
	@Column(name = "DAT_ANO")
	private int datAno;
	@Column(name = "NUM_LANCAMENTO")
	private String numLancamento;
	@Column(name = "COD_PRODUTO")
	private int codProduto;
	@Column(name = "COD_COSIF")
	private int codCosif;
	@Column(name = "DES_DESCRICAO")
	private String desDescricao;
	@Column(name = "DES_MOVIMENTO")
	private String desMovimento;
	@Column(name = "COD_USUARIO")
	private int codUsuario;
	@Column(name = "VAL_VALOR")
	private String valValor;
	public int getDatMes() {
		return datMes;
	}
	public void setDatMes(int datMes) {
		this.datMes = datMes;
	}
	public int getDatAno() {
		return datAno;
	}
	public void setDatAno(int datAno) {
		this.datAno = datAno;
	}
	public String getNumLancamento() {
		return numLancamento;
	}
	public void setNumLancamento(String numLancamento) {
		this.numLancamento = numLancamento;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public int getCodCosif() {
		return codCosif;
	}
	public void setCodCosif(int codCosif) {
		this.codCosif = codCosif;
	}
	public String getDesDescricao() {
		return desDescricao;
	}
	public void setDesDescricao(String desDescricao) {
		this.desDescricao = desDescricao;
	}
	public String getDesMovimento() {
		return desMovimento;
	}
	public void setDesMovimento(String desMovimento) {
		this.desMovimento = desMovimento;
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getValValor() {
		return valValor;
	}
	public void setValValor(String valValor) {
		this.valValor = valValor;
	}
	
	

}
