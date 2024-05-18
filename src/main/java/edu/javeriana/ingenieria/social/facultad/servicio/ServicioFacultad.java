package edu.javeriana.ingenieria.social.facultad.servicio;

import edu.javeriana.ingenieria.social.facultad.dominio.Facultad;
import edu.javeriana.ingenieria.social.facultad.repositorio.RepositorioFacultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioFacultad {
    @Autowired
    private RepositorioFacultad repositorio;

    public List<Facultad> obtenerFacultades(){
        return repositorio.findAll();
    }

    public Facultad obtenerFacultad(Integer codigo){
        return repositorio.findOneByCodigo(codigo);
    }

    public boolean facultadExiste(Integer codigo){
        return repositorio.existsByCodigo(codigo);
    }
}
