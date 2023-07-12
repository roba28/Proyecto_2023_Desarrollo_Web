package com.Proyecto.service;


import com.Proyecto.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
//    Método que retorna la lista de usuarios
    public List<Usuario> getUsuarios();
    
    // Se obtiene un Usuario, a partir del id de un usuario
    public Usuario getUsuario(Usuario usuario);
    
    // Se inserta un nuevo usuario si el id del usuario esta vacío
    // Se actualiza un usuario si el id del usuario NO esta vacío
    public void save(Usuario usuario);
    
    // Se elimina el usuario que tiene el id pasado por parámetro
    public void delete(Usuario usuario);
}
