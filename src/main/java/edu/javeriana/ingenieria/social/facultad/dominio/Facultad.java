package edu.javeriana.ingenieria.social.facultad.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
public class Facultad {
    @Id
    private Integer id;
    private Integer codigo;
    private String nombre;

    @Column(name="fecha_fundacion")
    private Date fundacion;
}
