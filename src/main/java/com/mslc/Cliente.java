package com.mslc;

public class Cliente {
    private int edad;
    private boolean estudiando;
    private boolean viveConPadres;
    private boolean trabajando;

    public Cliente(int edad, boolean estudiando, boolean viveConPadres, boolean trabajando) {
        this.edad = edad;
        this.estudiando = estudiando;
        this.viveConPadres = viveConPadres;
        this.trabajando = trabajando;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstudiando() {
        return estudiando;
    }

    public void setEstudiando(boolean estudiando) {
        this.estudiando = estudiando;
    }

    public boolean isViveConPadres() {
        return viveConPadres;
    }

    public void setViveConPadres(boolean viveConPadres) {
        this.viveConPadres = viveConPadres;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }
}