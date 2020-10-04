/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis
 */
@Entity

@Table(name = "lab2_estaciones_recorridos")

@Data

@AllArgsConstructor

@NoArgsConstructor
public class lab2_estaciones_recorridos implements Serializable {

    @ManyToOne
    @JoinColumn(name = "recorrido_Id")
    private lab2_recorridos lab2_recorridos;

    @ManyToOne
    @JoinColumn(name = "habitat_Id")
    private lab2_habitats lab2_habitat;

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
}
