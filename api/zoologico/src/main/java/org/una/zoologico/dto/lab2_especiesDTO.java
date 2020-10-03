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
 * @author rache
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class lab2_especiesDTO {

    private Long id;
    private String nombre_Comun;
    private String descripcion;
    private String nombre_Cientifico;
    private String fecha_modificacion;
    private byte estado;
    private Date fecha_registro;
   private lab2_especies lab2_especie;

}
