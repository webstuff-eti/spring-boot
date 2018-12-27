package br.eti.webstuff.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.eti.webstuff.api.entity.DadosDomicilioBancario;



public interface DadosDomicilioBancarioRepository extends JpaRepository<DadosDomicilioBancario, Long> {

	@Transactional(readOnly = true)
	DadosDomicilioBancario findByNumeroContaCorrente(String numeroContaCorrente);
}
