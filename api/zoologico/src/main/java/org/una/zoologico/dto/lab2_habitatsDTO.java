/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.una.zoologico.entities.lab2_especies;

/**
 *
 * @author andre
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString

public class lab2_habitatsDTO {
    
    private Long id;
    private String nombre;
    private String clima;
    private String vegetacion;
    private Date fecha_registro;
    private Date fecha_modificacion;
    private byte estado;
    private lab2_especiesDTO lab2_especies;
}
