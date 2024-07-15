package com.convertidor.controller;

import com.convertidor.service.ConvertidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convertir")
public class convertidorcontroller {

    @Autowired
    private ConvertidorService convertidorService;

    @GetMapping
    public double convertir(@RequestParam String from, @RequestParam String to, @RequestParam double cantidad) {
        return convertidorService.convertir(from, to, cantidad);
    }
}

    

