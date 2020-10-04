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
import org.una.zoologico.entities.lab2_fotografias;
import org.una.zoologico.repositories.Ilab2_fotografiasRepository;

/**
 *
 * @author rache
 */
@Service
public class lab2_fotografiasServiceImplementation  implements Ilab2_fotografiasService {
    
    @Autowired
    private Ilab2_fotografiasRepository lab2_fotografiasRepository;

      @Override
      @Transactional(readOnly = true)
    public Optional<List<lab2_fotografias>> findAll() {
        return Optional.ofNullable(lab2_fotografiasRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<lab2_fotografias> findById(Long id) {
        return lab2_fotografiasRepository.findById(id);
    }
}
