package br.com.antlia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.antlia.models.MovimentosManuais;

@Repository
public interface MovimentosManuaisRepository extends JpaRepository<MovimentosManuais,Long> {
}
