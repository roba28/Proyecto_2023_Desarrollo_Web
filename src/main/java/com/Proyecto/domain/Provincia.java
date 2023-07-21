package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="provincia")
public class Provincia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long provincia; 
    private String nombreProvincia;
    
   

    public Provincia() {
    }

    public Provincia( String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    
}
