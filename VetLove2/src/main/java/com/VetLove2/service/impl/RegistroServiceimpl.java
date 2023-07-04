package com.VetLove2.service.impl;

import com.VetLove2.domain.Registro;
import com.VetLove2.dao.RegistroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.VetLove2.service.RegistroService;

@Service
public class RegistroServiceimpl implements RegistroService {

    @Autowired
    private RegistroRepository repositorio;

    @Override
    public List<Registro> listarTodosLosRegistros() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Registro registro) {
        repositorio.save(registro);
    }

    @Override
    public void actualizar(Registro registro) {
        repositorio.save(registro);
    }

    @Override
    public void eliminar(Registro registro) {
        repositorio.delete(registro);
    }

}
