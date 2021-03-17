package br.edu.cesmac.si.nolapi.repository;

import br.edu.cesmac.si.nolapi.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

}
