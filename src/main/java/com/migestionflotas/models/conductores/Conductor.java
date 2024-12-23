package com.migestionflotas.models.conductores;

import java.util.Date;

public class Conductor {
    private String id;
    private String nombre;
    private String licencia;
    private double consumoCombustible; // en litros por 100 km
    private double seguridad; // índice de seguridad (0-100)
    private Date fechaContratacion;

    // Getters y Setters

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public double getConsumoCombustible() { return consumoCombustible; }
    public void setConsumoCombustible(double consumoCombustible) {
    	this.consumoCombustible = consumoCombustible; }

    public double getSeguridad() { return seguridad; }
    public void setSeguridad(double seguridad) { this.seguridad = seguridad; }

    public Date getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(Date fechaContratacion) { 
    	this.fechaContratacion = fechaContratacion; }
}
