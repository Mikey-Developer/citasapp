package com.daa.citas.model;

import java.util.UUID;

public class Servicio {
    UUID id_Servicio;
    UUID id_Empresa;
    String nombre;
    String descripcion;

    public Servicio(UUID id, String nombre, String descripcion) {
        this.id_Servicio = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public UUID getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(UUID id_Empresa) {
        this.id_Empresa = id_Empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
