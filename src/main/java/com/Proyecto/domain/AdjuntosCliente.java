package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "adjuntos_cliente")
public class AdjuntosCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adjunto")
    private Long idAdjunto;
    @Column(name = "id_ticket")
    private Long idTicket;
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String archivo;

    public AdjuntosCliente() {
    }

    public AdjuntosCliente(Long idTicket, Long idUsuario, String archivo) {
        this.idTicket = idTicket;
        this.idUsuario = idUsuario;
        this.archivo = archivo;
    }
    
    

}
