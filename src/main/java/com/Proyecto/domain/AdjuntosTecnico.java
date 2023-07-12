package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "adjuntos_tecnico")
public class AdjuntosTecnico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adjunto")
    private Long idAdjunto;
    @Column(name = "id_ticket")
    private Long idTicket;
    @Column(name = "id_tecnico")
    private Long idTecnico;
    private String archivo;

    public AdjuntosTecnico() {
    }

    public AdjuntosTecnico(Long idTicket, Long idTecnico, String archivo) {
        this.idTicket = idTicket;
        this.idTecnico = idTecnico;
        this.archivo = archivo;
    }
    
    

}
