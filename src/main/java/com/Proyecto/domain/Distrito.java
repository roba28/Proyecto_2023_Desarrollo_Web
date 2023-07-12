package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="distrito")
public class Distrito implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    private Long provincia;
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long canton; 
    @Id
    private Long distrito; 
    private String nombreDistrito;
    
   

    public Distrito() {
    }

    public Distrito(Long provincia, Long canton, Long distrito, String nombreDistrito) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.nombreDistrito = nombreDistrito;
    }

       
}
