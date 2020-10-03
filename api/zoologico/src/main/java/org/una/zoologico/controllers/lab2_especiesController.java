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
import org.una.zoologico.dto.lab2_especiesDTO;
import org.una.zoologico.entities.lab2_especies;
import org.una.zoologico.services.Ilab2_especiesService;
import org.una.zoologico.utils.MapperUtils;

/**
 *
 * @author rache
 */
@RestController
@RequestMapping("/lab2_especies")
@Api(tags = {"Especies"})
public class lab2_especiesController {
    @Autowired
    private Ilab2_especiesService lab2_especiesService;

    @GetMapping()
    @ApiOperation(value = "Obtiene una lista de todos las especies", response = lab2_especiesDTO.class, responseContainer = "List", tags = "Especies")
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<lab2_especies>> result = lab2_especiesService.findAll();
            if (result.isPresent()) {
                List<lab2_especiesDTO> lab2_especiesDto = MapperUtils.DtoListFromEntityList(result.get(), lab2_especiesDTO.class);
                return new ResponseEntity<>(lab2_especiesDto, HttpStatus.OK);
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

            Optional<lab2_especies> usuarioFound = lab2_especiesService.findById(id);
            if (usuarioFound.isPresent()) {
                lab2_especiesDTO lab2_especiesDto = MapperUtils.DtoFromEntity(usuarioFound.get(), lab2_especiesDTO.class);
                return new ResponseEntity<>(lab2_especiesDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
