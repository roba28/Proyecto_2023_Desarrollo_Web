
package com.Proyecto.service.impl;

import com.Proyecto.dao.UsuarioDao;
import com.Proyecto.domain.Usuario;
import com.Proyecto.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        List<Usuario> lista = usuarioDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
