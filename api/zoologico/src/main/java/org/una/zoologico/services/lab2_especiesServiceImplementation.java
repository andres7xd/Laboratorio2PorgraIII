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
import org.una.zoologico.entities.lab2_especies;
import org.una.zoologico.repositories.Ilab2_especiesRepository;

/**
 *
 * @author rache
 */
@Service
public class lab2_especiesServiceImplementation implements Ilab2_especiesService {

    @Autowired
    private Ilab2_especiesRepository lab2_especiesRepository;

    @Override
    public Optional<List<lab2_especies>> findAll() {
        return Optional.ofNullable(lab2_especiesRepository.findAll());
    }

    @Override
    public Optional<lab2_especies> findById(Long id) {
        return lab2_especiesRepository.findById(id);
    }

}
