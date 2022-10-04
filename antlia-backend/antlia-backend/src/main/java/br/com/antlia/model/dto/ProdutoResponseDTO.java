package br.com.antlia.model.dto;

import java.util.List;


import br.com.antlia.model.vo.ProdutoVO;

public class ProdutoResponseDTO {
	
	private String retornoMsg;
	private List<ProdutoVO> listaProduto;
	public String getRetornoMsg() {
		return retornoMsg;
	}
	public void setRetornoMsg(String retornoMsg) {
		this.retornoMsg = retornoMsg;
	}
	public List<ProdutoVO> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<ProdutoVO> listaProduto) {
		this.listaProduto = listaProduto;
	}

}
