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
import org.una.zoologico.entities.lab2_habitats;
import org.una.zoologico.repositories.Ilab2_habitatsRepository;
import org.una.zoologico.repositories.Ilab2_recorridosRepository;

/**
 *
 * @author andre
 */
@Service
public class lab2_habitatsServiceImplementation implements Ilab2_habitatsService{
    
    @Autowired
    private Ilab2_habitatsRepository lab2_habitatsRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<lab2_habitats>> findAll() {
        return Optional.ofNullable(lab2_habitatsRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<lab2_habitats> findById(Long id) {
        return lab2_habitatsRepository.findById(id);
    }
}
