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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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
 * @author andre
 */
@Entity
@Table(name = "lab2_habitats")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class lab2_habitats implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "lab2_especies")
    private lab2_especies especies_id;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2_habitat") 
    private List<lab2_vulnerabilidades> Listvulnerabilidades= new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitat_id") 
    private List<lab2_estaciones_recorridos> Listestaciones_recorridos= new ArrayList<>();


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "clima", length = 45)
    private String clima;

    @Column(name = "vegetacion", length = 45)
    private String vegetacion;

    @Column(name = "fecha_registro")
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @Column(name = "fecha_modificacion")
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

   private byte estado;
    @PrePersist

    public void prePersist() {

        estado = 1;

        fechaRegistro = new Date();

        fechaModificacion = new Date();

    }

    @PreUpdate

    public void preUpdate() {

        fechaModificacion = new Date();

    }

}
