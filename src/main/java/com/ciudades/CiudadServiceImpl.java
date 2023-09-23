/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad obtenerCiudadPorId(Integer id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @Override
    public Ciudad crearCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
public Ciudad modificarCiudad(Integer id, Ciudad ciudad) {
    Optional<Ciudad> ciudadExistente = ciudadRepository.findById(id);

    if (ciudadExistente.isPresent()) {
        Ciudad ciudadActual = ciudadExistente.get();
        ciudadActual.setNombre(ciudad.getNombre()); 
        return ciudadRepository.save(ciudadActual);
    }
    return null; 
}


    @Override
    public void eliminarCiudad(Integer id) {
        ciudadRepository.deleteById(id);
    }
}

