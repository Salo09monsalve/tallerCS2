package com.metro.rutas;

public class RutaMetro {
    private String linea;
    private String estacionInicio;
    private String estacionFin;

    public RutaMetro(String linea, String estacionInicio, String estacionFin) {
        this.linea = linea;
        this.estacionInicio = estacionInicio;
        this.estacionFin = estacionFin;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getEstacionInicio() {
        return estacionInicio;
    }

    public void setEstacionInicio(String estacionInicio) {
        this.estacionInicio = estacionInicio;
    }

    public String getEstacionFin() {
        return estacionFin;
    }

    public void setEstacionFin(String estacionFin) {
        this.estacionFin = estacionFin;
    }
}
