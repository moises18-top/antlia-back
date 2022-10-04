package br.com.antlia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.antlia.errors.ErrorMensagem;
import br.com.antlia.model.dto.ProdutoRequestDTO;
import br.com.antlia.model.dto.ProdutoResponseDTO;
import br.com.antlia.model.dto.mapper.ProdutoRequestMapperDTO;
import br.com.antlia.model.dto.mapper.ProdutoResponseMapperDTO;
import br.com.antlia.model.vo.ProdutoVO;
import br.com.antlia.models.MovimentosManuais;
import br.com.antlia.repository.MovimentosManuaisRepository;
import br.com.antlia.repository.ProdutoRepository;
import br.com.antlia.service.MovimentosManuaisService;

@Service
public class MovimentosManuaisServiceImpl implements MovimentosManuaisService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private MovimentosManuaisRepository movimentosManuaisRepository;

	@Override
	public ProdutoResponseDTO listarProdutos() {
		ProdutoResponseMapperDTO mapper = null;
		List<ProdutoVO> responseBS = new ArrayList<>();
		try {
			responseBS = produtoRepository.listarProdutosIncluidos();

			mapper = new ProdutoResponseMapperDTO(responseBS);

		} catch (Exception e) {
			throw e;
		}
		return mapper.getResponse();
	}

	@Override
	public void criarProduto(ProdutoRequestDTO request) throws ErrorMensagem{
		
		try {
			MovimentosManuais movimentoManual = new ProdutoRequestMapperDTO(request).getMovimentoManual();
			
			movimentosManuaisRepository.saveAndFlush(movimentoManual);
		}catch(Exception e) {
			throw e;
		}
		
	}

}
