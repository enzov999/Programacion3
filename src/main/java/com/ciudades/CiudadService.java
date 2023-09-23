/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ciudades;

import java.util.List;

public interface CiudadService {
    List<Ciudad> obtenerTodasLasCiudades();
    Ciudad obtenerCiudadPorId(Integer id);
    Ciudad crearCiudad(Ciudad ciudad);
    Ciudad modificarCiudad(Integer id, Ciudad ciudad);
    void eliminarCiudad(Integer id);
}

