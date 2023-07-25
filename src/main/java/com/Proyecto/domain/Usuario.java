package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String usuario;
    private String contrasena;
    private String nombreCompleto;
    private int cedula;
    private String email;
    private int telefono;
    private String sexo;
    private String pais;
    private String otrasSenas;
    private String fechaRegistro;
    private boolean terminosCondiciones;
    
    @ManyToOne
    @JoinColumn(name = "provincia")
    private Provincia provincia;
    
    @ManyToOne
    @JoinColumn(name = "canton")
    private Canton canton;
    
    @ManyToOne
    @JoinColumn(name = "distrito")
    private Distrito distrito;
    
    @ManyToOne
    @JoinColumn(name = "rol")
    private Rol rol;
    
    @ManyToOne
    @JoinColumn(name = "estadoUsuario")
    private EstadoUsuario estadoUsuario;

    public Usuario() {
    }

//    public Usuario(String usuario, String contrasena, String nombreCompleto, int cedula, String email, int telefono, String sexo, String pais, String otrasSenas, String fechaRegistro, boolean terminosCondiciones) {
//        this.usuario = usuario;
//        this.contrasena = contrasena;
//        this.nombreCompleto = nombreCompleto;
//        this.cedula = cedula;
//        this.email = email;
//        this.telefono = telefono;
//        this.sexo = sexo;
//        this.pais = pais;
//        this.otrasSenas = otrasSenas;
//        this.fechaRegistro = fechaRegistro;
//        this.terminosCondiciones = terminosCondiciones;
//    }

    
    
    

}
