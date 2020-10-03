/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author rache
 */
@Entity

@Table(name = "lab2_especies")

@Data

@AllArgsConstructor

//@NoArgsConstructor

@ToString

public class lab2_especies implements Serializable {

    @ManyToOne
    @JoinColumn(name = "lab2_especies_id")
    private lab2_especies lab2_especie;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2_habitats")
//    private List<lab2_habitats> Listhabitats = new ArrayList<>();
//    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2_vulnerabilidad")
//    private List<lab2_vulnerabilidad> Listvulnerabilidad = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_Comun", length = 45)
    private String nombre_Comun;

    @Column(name = "nombre_Cientifico", length = 45)
    private String nombre_Cientifico;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "fecha_modificacion", length = 200)
    private String fecha_modificacion;

    @Column

    private byte estado;

    @Column(name = "fecha_registro", updatable = false)

    @Temporal(TemporalType.DATE)

    @Setter(AccessLevel.NONE)

    private Date fecha_registro;

    private static final long serialVersionUID = 1L;

    public lab2_especies() {
      
        estado = 1;
//        fecha_registro = new Date();
    }

}
