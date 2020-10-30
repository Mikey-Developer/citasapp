package com.daa.citas.model;

import java.util.UUID;

public class Empresa {
    UUID id_Empresa;
    String nombre;
    String descripcion;
    String tel;
    String direccion;
    String codigoPostal;
    String colonia;
    String estado;
    String ciudad;

    public Empresa(UUID id, String nombre, String descripcion, String tel, String direccion, String codigoPostal, String colonia, String estado, String ciudad) {
        this.id_Empresa = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tel = tel;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
        this.estado = estado;
        this.ciudad = ciudad;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
