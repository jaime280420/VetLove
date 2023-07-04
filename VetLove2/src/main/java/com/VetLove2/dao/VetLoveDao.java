/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove2.dao;

import com.VetLove2.domain.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetLoveDao extends JpaRepository<Registro, Long> {

}
