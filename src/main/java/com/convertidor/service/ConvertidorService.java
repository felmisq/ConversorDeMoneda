package com.convertidor.service;

import org.springframework.stereotype.Service;

import com.convertidor.model.moneda;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConvertidorService {

    private Map<String, moneda> tasasCambio = new HashMap<>();

    public ConvertidorService() {
        // Tasas de cambio de ejemplo
        tasasCambio.put("USD", new moneda("USD", 1.0)); // Dólar estadounidense
        tasasCambio.put("EUR", new moneda("EUR", 0.85)); // Euro
        tasasCambio.put("JPY", new moneda("JPY", 110.0)); // Yen japonés
    }

    public double convertir(String from, String to, double cantidad) {
        if (tasasCambio.containsKey(from) && tasasCambio.containsKey(to)) {
            double tasaDesde = tasasCambio.get(from).getTasaCambio();
            double tasaHasta = tasasCambio.get(to).getTasaCambio();
            return cantidad * (tasaHasta / tasaDesde);
        } else {
            throw new IllegalArgumentException("Moneda no soportada");
        }
    }
}
