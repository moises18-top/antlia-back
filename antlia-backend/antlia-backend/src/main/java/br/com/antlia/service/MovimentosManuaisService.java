package br.com.antlia.service;

import org.springframework.http.ResponseEntity;

import br.com.antlia.errors.ErrorMensagem;
import br.com.antlia.model.dto.ProdutoRequestDTO;
import br.com.antlia.model.dto.ProdutoResponseDTO;

public interface MovimentosManuaisService {
	
	void criarProduto(ProdutoRequestDTO request) throws ErrorMensagem;
	
	ProdutoResponseDTO listarProdutos();


}
