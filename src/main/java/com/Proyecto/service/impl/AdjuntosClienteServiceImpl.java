
package com.Proyecto.service.impl;

import com.Proyecto.dao.AdjuntosClienteDao;
import com.Proyecto.domain.AdjuntosCliente;
import com.Proyecto.service.AdjuntosClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdjuntosClienteServiceImpl implements AdjuntosClienteService{
    
    @Autowired
    private AdjuntosClienteDao adjuntosClienteDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<AdjuntosCliente> getAdjuntosClientes() {
        List<AdjuntosCliente> lista = adjuntosClienteDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public AdjuntosCliente getAdjuntosCliente(AdjuntosCliente adjuntosCliente) {
        return adjuntosClienteDao.findById(adjuntosCliente.getIdAdjunto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(AdjuntosCliente adjuntosCliente) {
        adjuntosClienteDao.save(adjuntosCliente);
    }

    @Override
    @Transactional
    public void delete(AdjuntosCliente adjuntosCliente) {
        adjuntosClienteDao.delete(adjuntosCliente);
    }
}
