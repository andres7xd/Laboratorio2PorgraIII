/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.dto;

import java.sql.Time;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Luis
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class lab2_recorridosDTO {

    private Long id;
    private String codigo;
    private Time duracion;
    private Float longitud;
    private int visitantes_permitidos;
    private Date fecha_registro;
    private Date fecha_modificacion;
}
