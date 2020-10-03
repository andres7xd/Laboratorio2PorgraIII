/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author Luis
 */
@Entity

@Table(name = "lab2_recorridos")

@Data

@AllArgsConstructor

@NoArgsConstructor

@ToString
public class lab2_recorridos implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "codigo", length = 45)

    private String codigo;

    @Column(name = "duracion")

    private Time duracion;

    @Column(name = "longitud")

    private Float longitud;

    @Column(name = "visitantes_permitidos")

    private int visitantes_permitidos;

    @Column(name = "fecha_registro")
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.DATE)
    private Date fecha_registro;

    @Column(name = "fecha_modificacion")
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.DATE)
    private Date fecha_modificacion;

    public void prePersist() {

        fecha_registro = new Date();

        fecha_modificacion = new Date();

    }

    @PreUpdate

    public void preUpdate() {

        fecha_modificacion = new Date();

    }

}
