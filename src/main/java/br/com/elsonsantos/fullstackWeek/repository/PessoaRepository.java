package br.com.elsonsantos.fullstackWeek.repository;

import br.com.elsonsantos.fullstackWeek.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
