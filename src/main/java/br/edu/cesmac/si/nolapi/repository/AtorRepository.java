package br.edu.cesmac.si.nolapi.repository;

import br.edu.cesmac.si.nolapi.domain.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {

}