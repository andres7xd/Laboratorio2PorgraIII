/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.services;

import java.util.List;
import java.util.Optional;
import org.una.zoologico.entities.lab2_habitats;


/**
 *
 * @author andre
 */
public interface Ilab2_habitatsService {
    
    public Optional<List<lab2_habitats>> findAll();
    public Optional<lab2_habitats> findById(Long id);
    
}
