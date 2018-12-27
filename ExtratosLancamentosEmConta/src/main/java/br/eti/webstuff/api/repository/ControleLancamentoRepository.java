package br.eti.webstuff.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eti.webstuff.api.entity.ControleLancamento;

public interface ControleLancamentoRepository extends JpaRepository<ControleLancamento, Long> {

}
