package com.mslc;

public class Banco {

    public static String determinarCuenta(Cliente cliente) {
        if (esCuentaConfort(cliente)) {
            return "Cuenta Confort";
        } 
        if (esCuentaVamos(cliente)) {
            return "Cuenta Vamos que tú puedes";
        } 
        if (esCuentaAhorra(cliente)) {
            return "Cuenta Ahorra ahora que puedes";
        } 
        if (esCuentaSaltando(cliente)) {
            return "Cuenta Saltando del Nido";
        } 
        if (esCuentaIndependizate(cliente)) {
            return "Cuenta Independízate que va siendo hora";
        } 
        if (esCuentaBienvenido(cliente)) {
            return "Cuenta Bienvenido a la Vida Adulta";
        }
        return "No hay productos disponibles para este cliente";
    }

    private static boolean esCuentaConfort(Cliente cliente) {
        return cliente.getEdad() < 25 && cliente.isEstudiando() && cliente.isViveConPadres();
    }

    private static boolean esCuentaVamos(Cliente cliente) {
        return cliente.getEdad() < 25 && cliente.isEstudiando() && !cliente.isViveConPadres();
    }

    private static boolean esCuentaAhorra(Cliente cliente) {
        return cliente.getEdad() < 25 && cliente.isTrabajando() && cliente.isViveConPadres();
    }

    private static boolean esCuentaSaltando(Cliente cliente) {
        return cliente.getEdad() < 25 && cliente.isTrabajando() && !cliente.isViveConPadres();
    }

    private static boolean esCuentaIndependizate(Cliente cliente) {
        return cliente.getEdad() >= 25 && cliente.isTrabajando() && cliente.isViveConPadres();
    }

    private static boolean esCuentaBienvenido(Cliente cliente) {
        return cliente.getEdad() >= 25 && cliente.isTrabajando() && !cliente.isViveConPadres();
    }
}