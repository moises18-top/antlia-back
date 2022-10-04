package br.com.antlia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@Column(name = "COD_PRODUTO")
	private int codProduto;
	@Column(name = "DES_PRODUTO")
	private String desProduto;
	@Column(name = "STA_STATUS")
	private int staStatus;

}
