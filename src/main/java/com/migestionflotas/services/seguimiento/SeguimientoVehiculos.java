package com.migestionflotas.services.seguimiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.migestionflotas.models.seguimiento.Vehiculo;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/seguimiento")
public class SeguimientoVehiculosService {

   private Map<String, Vehiculo> vehiculos = new HashMap<>();

   public static void main(String[] args) {
       SpringApplication.run(SeguimientoVehiculosService.class, args);
   }

   @GetMapping("/{id}")
   public Vehiculo obtenerVehiculo(@PathVariable String id) {
       return vehiculos.get(id);
   }

   @PostMapping("/")
   public void registrarVehiculo(@RequestBody Vehiculo vehiculo) {
       vehiculos.put(vehiculo.getId(), vehiculo);
       System.out.println("Vehículo registrado: " + vehiculo.getId());
   }

   @PutMapping("/{id}")
   public void actualizarEstadoVehiculo(@PathVariable String id, @RequestBody Vehiculo vehiculoActualizado) {
       vehiculos.put(id, vehiculoActualizado);
       System.out.println("Estado del vehículo actualizado: " + id);
   }

   @DeleteMapping("/{id}")
   public void eliminarVehiculo(@PathVariable String id) {
       vehiculos.remove(id);
       System.out.println("Vehículo eliminado: " + id);
   }
}
