/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.dto;

import java.sql.Time;
import java.util.Date;
import org.una.zoologico.entities.lab2_especies;
import org.una.zoologico.entities.lab2_habitats;

/**
 *
 * @author andre
 */
public class lab2_vulnerabilidadesDTO {
    
    private Long id;
    private double indice;
    private Date fecha_registro;
    private Date fecha_modificacion;
    private lab2_especies lab2_especie;
    private lab2_habitats lab2_habitat;
}
