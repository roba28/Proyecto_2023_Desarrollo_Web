package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="canton")
public class Canton implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long provincia;
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long canton; 
    private String nombreCanton;
    
   

    public Canton() {
    }

    public Canton(Long provincia, Long canton, String nombreCanton) {
        this.provincia = provincia;
        this.canton = canton;
        this.nombreCanton = nombreCanton;
    }

    
}
