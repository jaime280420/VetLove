package com.VetLove2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Registro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String nombre;
    private String email;
    private String contrasena;
    private String repetirContrasena;
    private boolean activos;

    public Registro() {
    }

    public Registro(String nombre, String email, String contrasena, String repetirContrasena, boolean activos) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
        this.activos = activos;
    }

}
