package com.VetLove2.service.impl;

import com.VetLove2.domain.Registro;
import com.VetLove2.dao.VetLoveDao;
import com.VetLove2.service.VetLoveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VetLoveServiceimpl implements VetLoveService {

    @Autowired
    private VetLoveDao vetLoveDao;

    @Override
    @Transactional(readOnly = true)
    public List<Registro> getRegistros(boolean activos) {
        List<Registro> lista = vetLoveDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Registro getRegistro(Registro registro) {
        return vetLoveDao.findById(registro.getIdUsuario()).orElse(null);

    }
}
