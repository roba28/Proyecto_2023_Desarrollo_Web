package com.Proyecto.service;


import com.Proyecto.domain.AdjuntosCliente;
import java.util.List;

public interface AdjuntosClienteService {
    
//    Método que retorna la lista de adjuntosClientes
    public List<AdjuntosCliente> getAdjuntosClientes();
    
    // Se obtiene un AdjuntosCliente, a partir del id de un adjuntosCliente
    public AdjuntosCliente getAdjuntosCliente(AdjuntosCliente adjuntosCliente);
    
    // Se inserta un nuevo adjuntosCliente si el id del adjuntosCliente esta vacío
    // Se actualiza un adjuntosCliente si el id del adjuntosCliente NO esta vacío
    public void save(AdjuntosCliente adjuntosCliente);
    
    // Se elimina el adjuntosCliente que tiene el id pasado por parámetro
    public void delete(AdjuntosCliente adjuntosCliente);
}
