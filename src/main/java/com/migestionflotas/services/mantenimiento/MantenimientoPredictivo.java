package com.migestionflotas.services.mantenimiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoPredictivoService {

    private List<AlertaMantenimiento> alertas = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(MantenimientoPredictivoService.class, args);
    }

    @PostMapping("/alerta")
    public void generarAlerta(@RequestBody AlertaMantenimiento alerta) {
        alertas.add(alerta);
        System.out.println("Alerta generada para el vehículo: " + alerta.getVehiculoId());
        // Aquí se podría agregar lógica para notificar a los administradores.
    }

    @GetMapping("/alertas")
    public List<AlertaMantenimiento> obtenerAlertas() {
        return alertas;
    }

   @PutMapping("/alerta/{id}")
   public void resolverAlerta(@PathVariable int id, @RequestBody AlertaMantenimiento alertaActualizada) {
       if (id >= 0 && id < alertas.size()) {
           alertas.get(id).setResuelta(alertaActualizada.isResuelta());
       }
   }
}
