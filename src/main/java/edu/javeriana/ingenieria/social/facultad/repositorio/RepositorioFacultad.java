package edu.javeriana.ingenieria.social.facultad.repositorio;

import edu.javeriana.ingenieria.social.facultad.dominio.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioFacultad extends JpaRepository<Facultad, Integer> {
    Facultad findOneByCodigo(Integer codigo);

    boolean existsByCodigo(Integer codigo);
}
