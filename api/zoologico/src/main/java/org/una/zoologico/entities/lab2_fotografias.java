/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author rache
 */
@Entity

@Table(name = "lab2_fotografias")

@Data

@AllArgsConstructor

@NoArgsConstructor

@ToString

public class lab2_fotografias implements Serializable{
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2_especie")
    private List<lab2_especies> Listespecies = new ArrayList<>();;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parte", length = 10000)
    private String parte;

    @Column(name = "orden")
    private int orden;

    @Column(name = "total_partes")
    private int total_partes;
}
