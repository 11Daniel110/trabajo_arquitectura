package com.migestionflotas.models.mantenimiento;

public class AlertaMantenimiento {
    private String vehiculoId;
    private String tipoDeMantenimiento;
    private String descripcion;
    
    // Campos adicionales para seguimiento de alertas
    private boolean resuelta;
    
    // Getters y Setters

    public String getVehiculoId() { return vehiculoId; }
    public void setVehiculoId(String vehiculoId) { this.vehiculoId = vehiculoId; }

    public String getTipoDeMantenimiento() { return tipoDeMantenimiento; }
    public void setTipoDeMantenimiento(String tipoDeMantenimiento) { this.tipoDeMantenimiento = tipoDeMantenimiento; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public boolean isResuelta() { return resuelta; }
    public void setResuelta(boolean resuelta) { this.resuelta = resuelta; }
}
