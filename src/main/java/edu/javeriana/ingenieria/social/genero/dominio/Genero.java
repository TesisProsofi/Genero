package edu.javeriana.ingenieria.social.genero.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Genero {
    @Id
    private Integer id;
    private String sigla;
    private String descripcion;
}
