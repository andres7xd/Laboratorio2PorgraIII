/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.una.zoologico.entities.lab2_habitats;
import org.una.zoologico.entities.lab2_recorridos;

/**
 *
 * @author Luis
 */

@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString

public class lab2_estaciones_recorridosDTO {
    
     private Long id;
     private lab2_recorridos recorrido_id;
     private lab2_habitats lab2_habitat;
}