package com.daa.citas.model;

import java.util.Date;
import java.util.Timer;
import java.util.UUID;

public class Cita {
    UUID id;
    UUID id_Cliente;
    UUID id_Doctor;
    UUID id_Servicio;
    String nombre;
    String descripcion;
    Date fecha;
    Timer Horario;

    public Cita(UUID id, UUID id_Cliente, UUID id_Doctor, UUID id_Servicio, String nombre, String descripcion, Date fecha, Timer horario) {
        this.id = id;
        this.id_Cliente = id_Cliente;
        this.id_Doctor = id_Doctor;
        this.id_Servicio = id_Servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        Horario = horario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(UUID id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public UUID getId_Doctor() {
        return id_Doctor;
    }

    public void setId_Doctor(UUID id_Doctor) {
        this.id_Doctor = id_Doctor;
    }

    public UUID getId_Servicio() {
        return id_Servicio;
    }

    public void setId_Servicio(UUID id_Servicio) {
        this.id_Servicio = id_Servicio;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Timer getHorario() {
        return Horario;
    }

    public void setHorario(Timer horario) {
        Horario = horario;
    }

    public String getIdCita() {
        return this.getId().toString();
    }
}
