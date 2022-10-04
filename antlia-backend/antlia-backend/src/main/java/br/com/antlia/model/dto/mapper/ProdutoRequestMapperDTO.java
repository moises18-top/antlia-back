package br.com.antlia.model.dto.mapper;

import java.util.Objects;

import br.com.antlia.errors.ErrorMensagem;
import br.com.antlia.model.dto.ProdutoRequestDTO;
import br.com.antlia.models.MovimentosManuais;

public class ProdutoRequestMapperDTO {
	
	private MovimentosManuais movimentosManuais;
	
	
	
	
	public ProdutoRequestMapperDTO(ProdutoRequestDTO request) throws ErrorMensagem {
		
		movimentosManuais = new MovimentosManuais();
		
		
		movimentosManuais.setCodProduto(request.getCodProduto());
		movimentosManuais.setDatMes(request.getMes());
		movimentosManuais.setDatAno(request.getAno());
		movimentosManuais.setCodCosif(request.getCodCosif());
		movimentosManuais.setDesDescricao(request.getDescricao());
		movimentosManuais.setDesMovimento(request.getDescricao());
		movimentosManuais.setValValor(request.getValor());
	}
	
	public MovimentosManuais getMovimentoManual() {
		return this.movimentosManuais;
	}
	

}
