package br.com.antlia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.antlia.model.vo.ProdutoVO;
import br.com.antlia.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
//	List<Produto> findAll();
	
	@Query("select NEW br.com.antlia.model.vo.ProdutoVO(a.codProduto, a.desProduto, b.datMes as mes, b.datAno as ano, b.numLancamento, b.desDescricao, b.valValor as valor) "
			+ "from Produto a inner join MovimentosManuais b on a.codProduto = b.codProduto")
	List<ProdutoVO> listarProdutosIncluidos();
}
