/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove2.service;

import com.VetLove2.domain.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface VetLoveService {

    public List<Registro> getRegistros(boolean activos);

    public Registro getRegistro(Registro registro);

    public void save(Registro registro);

    public void delete(Registro registro);

}
