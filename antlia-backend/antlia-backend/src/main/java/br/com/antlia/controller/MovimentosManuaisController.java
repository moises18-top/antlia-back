package br.com.antlia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.antlia.errors.ErrorMensagem;
import br.com.antlia.model.dto.ProdutoRequestDTO;
import br.com.antlia.model.dto.ProdutoResponseDTO;
import br.com.antlia.models.Produto;
import br.com.antlia.repository.ProdutoRepository;
import br.com.antlia.service.MovimentosManuaisService;

@RestController
@RequestMapping("/antlia")
public class MovimentosManuaisController {
	
	@Autowired
	private MovimentosManuaisService service;
	
	@PostMapping("/produtos")
	public ResponseEntity<?> criarProduto(@RequestBody ProdutoRequestDTO request) throws ErrorMensagem{
		 service.criarProduto(request);
		 return new ResponseEntity<>("Sucesso!",HttpStatus.OK);
	}
	
	@GetMapping("/produtos")
	public ProdutoResponseDTO listarProdutos(){
		return service.listarProdutos();
	}
	
}
