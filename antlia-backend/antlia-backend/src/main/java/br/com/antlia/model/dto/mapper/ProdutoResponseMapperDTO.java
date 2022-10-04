package br.com.antlia.model.dto.mapper;

import java.util.List;

import br.com.antlia.model.dto.ProdutoResponseDTO;
import br.com.antlia.model.vo.ProdutoVO;

public class ProdutoResponseMapperDTO {
	
	private ProdutoResponseDTO response;
	
	
	public ProdutoResponseMapperDTO(List<ProdutoVO> listVO) {
		response = new ProdutoResponseDTO();
		response.setListaProduto(listVO);
		response.setRetornoMsg("Lista retornada com sucesso!");
		
	}
	
	public ProdutoResponseDTO getResponse() {
		return this.response;
	}
	

}
