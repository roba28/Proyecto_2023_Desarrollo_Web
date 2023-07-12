package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long idTicket;
    @Column(name = "id_usuario")
    private Long idUsuario;
    private Long estado;
    private Long tipoIncidencia;
    private Long prioridad;
    private String titulo;
    private String descripcion;
    private String comentariosUsuario;
    private String fechaRegistroUsuario;
    private String fechaRegistraTecnico;
    private Long idTecnico;
    private String comentarioTecnico;
    
    private boolean terminosCondiciones;

    public Ticket() {
    }

    public Ticket(Long idUsuario, Long estado, Long tipoIncidencia, Long prioridad, String titulo, String descripcion, String comentariosUsuario, String fechaRegistroUsuario, String fechaRegistraTecnico, Long idTecnico, String comentarioTecnico, boolean terminosCondiciones) {
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.tipoIncidencia = tipoIncidencia;
        this.prioridad = prioridad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.comentariosUsuario = comentariosUsuario;
        this.fechaRegistroUsuario = fechaRegistroUsuario;
        this.fechaRegistraTecnico = fechaRegistraTecnico;
        this.idTecnico = idTecnico;
        this.comentarioTecnico = comentarioTecnico;
        this.terminosCondiciones = terminosCondiciones;
    }

     
    
    

}
