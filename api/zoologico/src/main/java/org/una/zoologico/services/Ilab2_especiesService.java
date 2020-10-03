/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.services;

import java.util.List;
import java.util.Optional;
import org.una.zoologico.entities.lab2_especies;

/**
 *
 * @author rache
 */
public interface Ilab2_especiesService {

    public Optional<List<lab2_especies>> findAll();

    public Optional<lab2_especies> findById(Long id);

}
