package com.migestionflotas.services.rutas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/rutas")
public class OptimizacionRutasService {

   // Simulación de un servicio externo para optimizar rutas.
   // En un caso real, esto podría integrarse con APIs de mapas.
   
   public static void main(String[] args) {
       SpringApplication.run(OptimizacionRutasService.class, args);
   }

   @PostMapping("/optimizar")
   public Ruta optimizarRuta(@RequestBody RutaRequest request) {
       // Lógica simplificada para optimizar la ruta.
       Ruta rutaOptima = new Ruta();
       rutaOptima.setPuntos(new String[]{"Punto A", "Punto B", "Punto C"});
       rutaOptima.setDistanciaTotal(15.0); // Distancia total en kilómetros.
       rutaOptima.setTiempoEstimado(20.0); // Tiempo estimado en minutos.
       return rutaOptima;
   }
}
