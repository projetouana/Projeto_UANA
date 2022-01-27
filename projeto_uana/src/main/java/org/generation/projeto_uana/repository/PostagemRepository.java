package org.generation.projeto_uana.repository;

import java.util.List;

import org.generation.projeto_uana.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public List<Postagem> findAllByTextoContainingIgnoreCase (String texto);
}
