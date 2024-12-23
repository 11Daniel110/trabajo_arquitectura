 package com.migestionflotas.models.seguimiento;

public class Vehiculo {
   private String id;
   private String ubicacion;
   private double velocidad;
   private String estado;
   
   // Campos adicionales para información del vehículo.
   private double nivelCombustible; // Porcentaje de combustible restante.
   private int kilometrajeTotal; // Kilometraje total del vehículo.

   // Getters y Setters

   public String getId() { return id; }
   public void setId(String id) { this.id = id; }

   public String getUbicacion() { return ubicacion; }
   public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

   public double getVelocidad() { return velocidad; }
   public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

   public String getEstado() { return estado; }
   public void setEstado(String estado) { this.estado = estado; }

   public double getNivelCombustible() { return nivelCombustible; }
   public void setNivelCombustible(double nivelCombustible) { this.nivelCombustible = nivelCombustible; }

   public int getKilometrajeTotal() { return kilometrajeTotal; }
   public void setKilometrajeTotal(int kilometrajeTotal) { this.kilometrajeTotal = kilometrajeTotal; }
}
