/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.zoologico.entities.lab2_vulnerabilidades;


/**
 *
 * @author andre
 */
public interface Ilab2_vulnerabilidadesRepository extends JpaRepository<lab2_vulnerabilidades, Long> {
    
    @Query(value = "SELECT t FROM lab2_vulnerabilidades JOIN t.habitat_id po JOIN po.especie_id u where u.nombre_Comun=:nombre")
    public List<lab2_vulnerabilidades> findByNombreComunEspecie(@Param("nombre") String nombre);
    
    @Query(value = "SELECT t FROM lab2_vulnerabilidades JOIN t.habitat_id po JOIN po.especie_id u where u.nombre_Cientifico=:nombrectf")
    public List<lab2_vulnerabilidades> findByNombreCientificoEspecie(@Param("nombrectf") String nombrectf);
    
    @Query(value = "SELECT t FROM lab2_vulnerabilidades JOIN t.habitat_id po JOIN po.especie_id u where u.estado=:estado")
    public List<lab2_vulnerabilidades> findByEstado(@Param("estado") byte estado);
  
    
}
