/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.zoologico.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.zoologico.dto.lab2_vulnerabilidadesDTO;
import org.una.zoologico.entities.lab2_vulnerabilidades;
import org.una.zoologico.services.Ilab2_vulnerabilidadesService;
import org.una.zoologico.utils.MapperUtils;

/**
 *
 * @author andre
 */
@RestController
@RequestMapping("/lab2_vulnerabilidades") 
@Api(tags = {"Vulnerabilidades"})
public class lab2_vulnerabilidadesController {
    
    @Autowired
    private Ilab2_vulnerabilidadesService vulnerabilidadesService;

    @GetMapping()
    @ApiOperation(value = "Obtiene una lista de todos las vulnerabilidades", response = lab2_vulnerabilidadesDTO.class, responseContainer = "List", tags = "Vulnerabilidades")
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<lab2_vulnerabilidades>> result = vulnerabilidadesService.findAll();
            if (result.isPresent()) {
                List<lab2_vulnerabilidadesDTO> vulnerabilidadesDTO = MapperUtils.DtoListFromEntityList(result.get(), lab2_vulnerabilidadesDTO.class);
                return new ResponseEntity<>(vulnerabilidadesDTO, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

@GetMapping("/{id}") 
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try {

            Optional<lab2_vulnerabilidades> vulnerabilidadesFound = vulnerabilidadesService.findById(id);
            if (vulnerabilidadesFound.isPresent()) {
                lab2_vulnerabilidadesDTO vulnerabilidadesDto = MapperUtils.DtoFromEntity(vulnerabilidadesFound.get(), lab2_vulnerabilidadesDTO.class);
                return new ResponseEntity<>(vulnerabilidadesDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
