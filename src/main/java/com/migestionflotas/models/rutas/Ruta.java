package com.migestionflotas.models.rutas;

public class Ruta {
    private String[] puntos;
    
     // Campos adicionales para información de la ruta.
     private double distanciaTotal; // en kilómetros.
     private double tiempoEstimado; // en minutos.

     // Getters y Setters

     public String[] getPuntos() { return puntos; }
     public void setPuntos(String[] puntos) { this.puntos = puntos; }

     public double getDistanciaTotal() { return distanciaTotal; }
     public void setDistanciaTotal(double distanciaTotal) { this.distanciaTotal = distanciaTotal; }

     public double getTiempoEstimado() { return tiempoEstimado; }
     public void setTiempoEstimado(double tiempoEstimado) { this.tiempoEstimado = tiempoEstimado; }
}

