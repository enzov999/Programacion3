/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadService.obtenerTodasLasCiudades();
    }

    @GetMapping("/{id}")
    public Ciudad obtenerCiudadPorId(@PathVariable Integer id) {
        return ciudadService.obtenerCiudadPorId(id);
    }

    @PostMapping
    public Ciudad crearCiudad(@RequestBody Ciudad ciudad) {
        return ciudadService.crearCiudad(ciudad);
    }

    @PutMapping("/{id}")
    public Ciudad modificarCiudad(@PathVariable Integer id, @RequestBody Ciudad ciudad) {
        return ciudadService.modificarCiudad(id, ciudad);
    }

    @DeleteMapping("/{id}")
    public void eliminarCiudad(@PathVariable Integer id) {
        ciudadService.eliminarCiudad(id);
    }
}

