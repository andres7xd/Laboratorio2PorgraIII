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
import org.una.zoologico.entities.lab2_vulnerabilidades;
import org.una.zoologico.repositories.Ilab2_vulnerabilidadesRepository;

/**
 *
 * @author andre
 */
@Service
public class lab2_vulnerabilidadesServiceImplementation implements Ilab2_vulnerabilidadesService {

    @Autowired
    private Ilab2_vulnerabilidadesRepository lab2_vulnerabilidadesRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<lab2_vulnerabilidades>> findAll() {
        return Optional.ofNullable(lab2_vulnerabilidadesRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<lab2_vulnerabilidades> findById(Long id) {
        return lab2_vulnerabilidadesRepository.findById(id);
    }

}
