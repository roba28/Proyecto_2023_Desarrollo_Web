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
    
    // Se obtiene un Usuario, a partir del username de un usuario
    public Usuario getUsuarioPorUsername(String username);

    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameYContrasena(String username, String password);
    
    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameOEmail(String username, String email);
    
    // Se valida si existe un Usuario considerando el username
    public boolean existeUsuarioPorUsernameOEmail(String username, String email);
}
