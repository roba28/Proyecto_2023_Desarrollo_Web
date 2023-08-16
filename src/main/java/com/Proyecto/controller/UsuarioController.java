package com.Proyecto.controller;

import com.Proyecto.domain.Canton;
import com.Proyecto.domain.Distrito;
import com.Proyecto.domain.EstadoUsuario;
import com.Proyecto.domain.Provincia;
import com.Proyecto.domain.Rol;
import org.springframework.ui.Model;
import com.Proyecto.domain.Usuario;
import com.Proyecto.service.CantonService;
import com.Proyecto.service.DistritoService;
import com.Proyecto.service.EstadoUsuarioService;
import com.Proyecto.service.ProvinciaService;
import com.Proyecto.service.RolService;
import com.Proyecto.service.UsuarioService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ProvinciaService provinciaService;

    @Autowired
    CantonService cantonService;

    @Autowired
    DistritoService distritoService;

    @Autowired
    RolService rolService;

    @Autowired
    EstadoUsuarioService estadoUsuarioService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /usuario/listado");
        List<Usuario> usuarios = usuarioService.getUsuarios();

        model.addAttribute("usuarios", usuarios);
//        return "Admin/listadoTecnicos";
        return "Admin/listadoTecnicos";
    }

//    @GetMapping("/Registrarse")
//    public String Registrarse(Usuario usuario, Model model) {
//        List<Provincia> provincias = provinciaService.getProvincias();
//        List<Canton> cantones = cantonService.getCantones();
//        List<Distrito> distritos = distritoService.getDistritos();
//        List<Rol> roles = rolService.getRoles();
//        List<EstadoUsuario> estadoUsuarios = estadoUsuarioService.getEstadoUsuarios();
//        model.addAttribute("provincias", provincias);
//        model.addAttribute("cantones", cantones);
//        model.addAttribute("distritos", distritos);
//        model.addAttribute("roles", roles);
//        model.addAttribute("estadoUsuarios", estadoUsuarios);
//        return "Registrarse";
//    }
//
//    @PostMapping("/guardar")
//    public String usuarioGuardar(Usuario usuario) {
//        usuario.setContrasena(new BCryptPasswordEncoder().encode(usuario.getContrasena()));
//        usuarioService.save(usuario);
//        return "redirect:/login";
//    }

    @PostMapping("/guardarActualizacion")
    public String usuarioGuardarActualizacion(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuario/listadoPersonal";
    }

    @GetMapping("/eliminar/{idUsuario}")
    public String usuarioEliminar(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    }

    @GetMapping("/modificar/{idUsuario}")
    public String usuarioModificar(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        List<Provincia> provincias = provinciaService.getProvincias();
        List<Canton> cantones = cantonService.getCantones();
        List<Distrito> distritos = distritoService.getDistritos();
        List<Rol> roles = rolService.getRoles();
        List<EstadoUsuario> estadoUsuarios = estadoUsuarioService.getEstadoUsuarios();
        model.addAttribute("usuario", usuario);
        model.addAttribute("provincias", provincias);
        model.addAttribute("cantones", cantones);
        model.addAttribute("distritos", distritos);
        model.addAttribute("roles", roles);
        model.addAttribute("estadoUsuarios", estadoUsuarios);
        return "usuario/modifica";
    }
    
    @GetMapping("/modificar/estado-rol/{idUsuario}")
    public String usuarioModificarEstadoRol(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        List<Rol> roles = rolService.getRoles();
        List<EstadoUsuario> estadoUsuarios = estadoUsuarioService.getEstadoUsuarios();
        model.addAttribute("usuario", usuario);
        model.addAttribute("roles", roles);
        model.addAttribute("estadoUsuarios", estadoUsuarios);
        return "usuario/modificaEstadoRol";
    }
    
    @GetMapping("/listadoPersonal")
    public String inicioPersonal(Model model) {
        log.info("Consumiendo el recurso /usuario/listado");
        List<Usuario> usuarios = usuarioService.getUsuarios();

        model.addAttribute("usuarios", usuarios);
        return "usuario/listadoPersonal";
    }

}
