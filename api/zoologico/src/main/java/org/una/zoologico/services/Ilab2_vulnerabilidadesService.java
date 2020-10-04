/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.services;

import java.util.List;
import java.util.Optional;
import org.una.zoologico.dto.lab2_vulnerabilidadesDTO;
import org.una.zoologico.entities.lab2_vulnerabilidades;

/**
 *
 * @author andre
 */
public interface Ilab2_vulnerabilidadesService {
    
    public Optional<List<lab2_vulnerabilidades>> findAll();
    public Optional<lab2_vulnerabilidades> findById(Long id);
    
    public Optional<List<lab2_vulnerabilidades>> findByNombreComunEspecie(String nombre);
    public Optional<List<lab2_vulnerabilidades>> findByNombreCientificoEspecie(String nombrectf);
    public Optional<List<lab2_vulnerabilidades>> findByEstado(byte estado);
    
      
}
