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
import org.una.zoologico.dto.lab2_recorridosDTO;
import org.una.zoologico.entities.lab2_recorridos;
import org.una.zoologico.services.Ilab2_recorridosService;
import org.una.zoologico.utils.MapperUtils;

/**
 *
 * @author Luis
 */
@RestController
@RequestMapping("/lab2_recorridos") 
@Api(tags = {"lab2_Recorridos"})
public class lab2_recorridosController {
    
     @Autowired
    private Ilab2_recorridosService recorridosService;

    @GetMapping() 
    @ApiOperation(value = "Obtiene una lista de todos los recorridos", response = lab2_recorridosDTO.class, responseContainer = "List", tags = "lab2_Recorridos")
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<lab2_recorridos>> result = recorridosService.findAll();
            if (result.isPresent()) {
                List<lab2_recorridosDTO> recorridosDTO = MapperUtils.DtoListFromEntityList(result.get(), lab2_recorridosDTO.class);
                return new ResponseEntity<>(recorridosDTO, HttpStatus.OK);
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

            Optional<lab2_recorridos> recorridosFound = recorridosService.findById(id);
            if (recorridosFound.isPresent()) {
                lab2_recorridosDTO recorridosDto = MapperUtils.DtoFromEntity(recorridosFound.get(), lab2_recorridosDTO.class);
                return new ResponseEntity<>(recorridosDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
