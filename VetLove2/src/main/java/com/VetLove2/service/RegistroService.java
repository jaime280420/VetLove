/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove2.service;

import com.VetLove2.domain.Registro;
import java.util.List;

public interface RegistroService {
    public List<Registro> listarTodosLosRegistros();
	
	public void guardar(Registro registro);
		
	public void actualizar(Registro Registro);
	
	public void eliminar(Registro registro);
}

