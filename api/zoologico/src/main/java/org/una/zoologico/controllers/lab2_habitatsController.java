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
import org.una.zoologico.dto.lab2_habitatsDTO;
import org.una.zoologico.entities.lab2_habitats;
import org.una.zoologico.services.Ilab2_habitatsService;
import org.una.zoologico.utils.MapperUtils;

/**
 *
 * @author andre
 */
@RestController
@RequestMapping("/lab2_habitats") 
@Api(tags = {"lab2_Habitast"})
public class lab2_habitatsController {
    
    @Autowired
    private Ilab2_habitatsService habitatsService;

    @GetMapping()
    @ApiOperation(value = "Obtiene una lista de todos los habitats", response = lab2_habitatsDTO.class, responseContainer = "List", tags = "lab2_Habitats")
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<lab2_habitats>> result = habitatsService.findAll();
            if (result.isPresent()) {
                List<lab2_habitatsDTO> habitatsDTO = MapperUtils.DtoListFromEntityList(result.get(), lab2_habitatsDTO.class);
                return new ResponseEntity<>(habitatsDTO, HttpStatus.OK);
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

            Optional<lab2_habitats> habitatsFound = habitatsService.findById(id);
            if (habitatsFound.isPresent()) {
                lab2_habitatsDTO habitatsDto = MapperUtils.DtoFromEntity(habitatsFound.get(), lab2_habitatsDTO.class);
                return new ResponseEntity<>(habitatsDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
