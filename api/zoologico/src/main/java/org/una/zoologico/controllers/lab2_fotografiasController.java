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
import org.una.zoologico.dto.lab2_fotografiasDTO;
import org.una.zoologico.entities.lab2_fotografias;
import org.una.zoologico.services.Ilab2_fotografiasService;
import org.una.zoologico.utils.MapperUtils;

/**
 *
 * @author rache
 */
@RestController
@RequestMapping("/lab2_fotografias")
@Api(tags = {"Fotografias"})
public class lab2_fotografiasController {
    
    @Autowired
    private Ilab2_fotografiasService lab2_fotografiasService;

    @GetMapping()
    @ApiOperation(value = "Obtiene una lista de todos las Fotografias", response = lab2_fotografiasDTO.class, responseContainer = "List", tags = "Fotografias")
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<lab2_fotografias>> result = lab2_fotografiasService.findAll();
            if (result.isPresent()) {
                List<lab2_fotografiasDTO> lab2_fotografiasDto = MapperUtils.DtoListFromEntityList(result.get(), lab2_fotografiasDTO.class);
                return new ResponseEntity<>(lab2_fotografiasDto, HttpStatus.OK);
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

            Optional<lab2_fotografias> usuarioFound = lab2_fotografiasService.findById(id);
            if (usuarioFound.isPresent()) {
                lab2_fotografiasDTO lab2_fotografiasDto = MapperUtils.DtoFromEntity(usuarioFound.get(), lab2_fotografiasDTO.class);
                return new ResponseEntity<>(lab2_fotografiasDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}
