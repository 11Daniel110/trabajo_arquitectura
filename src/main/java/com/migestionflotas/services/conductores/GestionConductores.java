package com.migestionflotas.services.conductores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/conductores")
public class GestionConductoresService {

    private Map<String, Conductor> conductores = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(GestionConductoresService.class, args);
    }

    @GetMapping("/{id}")
    public Conductor obtenerConductor(@PathVariable String id) {
        return conductores.get(id);
    }

    @PostMapping("/")
    public void registrarConductor(@RequestBody Conductor conductor) {
        conductores.put(conductor.getId(), conductor);
    }

    @PutMapping("/{id}")
    public void actualizarConductor(@PathVariable String id, @RequestBody Conductor conductorActualizado) {
        conductores.put(id, conductorActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarConductor(@PathVariable String id) {
        conductores.remove(id);
    }
}