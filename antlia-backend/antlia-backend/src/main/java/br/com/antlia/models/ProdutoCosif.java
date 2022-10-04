package br.com.antlia.models;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name="produto_cosif")
@Getter
@Setter
public class ProdutoCosif {
	
	@Column(name="COD_PRODUTO")
	private int codProduto;
	@Column(name="COD_COSIF")
	private int codCosif;
	@Column(name="COD_CLASSIFICACAO")
	private String codClassificacao;
	@Column(name="STA_STATUS")
	private int staStatus;
	
}
