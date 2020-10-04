/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.services;

import java.util.List;
import java.util.Optional;
import org.una.zoologico.entities.lab2_estaciones_recorridos;

/**
 *
 * @author Luis
 */
public interface Ilab2_estaciones_recorridosService {

    public Optional<List<lab2_estaciones_recorridos>> findAll();

    public Optional<lab2_estaciones_recorridos> findById(Long id);
}