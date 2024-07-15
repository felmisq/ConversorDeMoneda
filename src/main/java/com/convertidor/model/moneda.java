package com.convertidor.model;

public class moneda {
    
    private String codigo;
    private double tasaCambio;

    public moneda(String codigo, double tasaCambio) {
        this.codigo = codigo;
        this.tasaCambio = tasaCambio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
}

