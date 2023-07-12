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
    private Long provincia;
    private Long canton;
    private Long distrito;
    private String otrasSenas;
    private Long rol;
    private String fechaRegistro;
    private Long estadoUsuario;
    private boolean terminosCondiciones;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String nombreCompleto, int cedula, String email, int telefono, String sexo, String pais, Long provincia, Long canton, Long distrito, String otrasSenas, Long rol, String fechaRegistro, Long estadoUsuario, boolean terminosCondiciones) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.pais = pais;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.otrasSenas = otrasSenas;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
        this.estadoUsuario = estadoUsuario;
        this.terminosCondiciones = terminosCondiciones;
    }

    
    
    

}
