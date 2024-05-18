package edu.javeriana.ingenieria.social.facultad.controlador;

import edu.javeriana.ingenieria.social.facultad.dominio.Facultad;
import edu.javeriana.ingenieria.social.facultad.servicio.ServicioFacultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facultades")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorFacultad {
    @Autowired
    private ServicioFacultad servicio;

    @GetMapping("listar")
    public List<Facultad> obtenerFacultades(){
        return servicio.obtenerFacultades();
    }

    @GetMapping("obtener")
    public ResponseEntity<Facultad> obtenerFacultad(@RequestParam Integer codigo){
        if(codigo == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.facultadExiste(codigo)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerFacultad(codigo), HttpStatus.OK);
    }
}
