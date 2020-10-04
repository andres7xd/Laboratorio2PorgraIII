/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.zoologico.entities.lab2_estaciones_recorridos;
import org.una.zoologico.repositories.Ilab2_estaciones_recorridosRepository;

/**
 *
 * @author Luis
 */
@Service
public class lab2_estaciones_recorridosServiceImplementation implements Ilab2_estaciones_recorridosService{
    
    @Autowired
    private Ilab2_estaciones_recorridosRepository lab2_estaciones_recorridosRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<lab2_estaciones_recorridos>> findAll() {
        return Optional.ofNullable(lab2_estaciones_recorridosRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<lab2_estaciones_recorridos> findById(Long id) {
        return lab2_estaciones_recorridosRepository.findById(id);
    }
}
