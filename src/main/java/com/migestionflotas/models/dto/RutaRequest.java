package com.migestionflotas.models.dto;

public class RutaRequest {
    private String origen;
    private String destino;
    
     // Campos adicionales para condiciones de tráfico y clima.
     private boolean evitarPeajes;
     private boolean evitarAutopistas;

     // Getters y Setters

     public String getOrigen() { return origen; }
     public void setOrigen(String origen) { this.origen = origen; }

     public String getDestino() { return destino; }
     public void setDestino(String destino) { this.destino = destino; }

     public boolean isEvitarPeajes() { return evitarPeajes; }
     public void setEvitarPeajes(boolean evitarPeajes) { this.evitarPeajes = evitarPeajes; }

     public boolean isEvitarAutopistas() { return evitarAutopistas; }
     public void setEvitarAutopistas(boolean evitarAutopistas) { this.evitarAutopistas = evitarAutopistas; }
}
