package com.mslc;

public class Banco {

    public static String determinarCuenta(Cliente cliente) {
        validarDatos(cliente);

        int edad = cliente.getEdad();
        boolean estudiando = cliente.isEstudiando();
        boolean viveConPadres = cliente.isViveConPadres();
        boolean trabajando = cliente.isTrabajando();

        if (edad < 25) {
            if (estudiando) {
            	// Suposicion: Si edad < 25. está estudiando y vive en casa de sus padres se le asigna: Cuenta Confort
                return viveConPadres ? "Cuenta Confort" : "Cuenta Vamos que tú puedes"; 
            } else if (trabajando) {
                return viveConPadres ? "Cuenta Ahorra ahora que puedes" : "Cuenta Saltando del Nido";
            }
        } else { 
            if (trabajando) {
                return viveConPadres ? "Cuenta Independízate que va siendo hora" : "Cuenta Bienvenido a la Vida Adulta";
            }
        }     
        
        return "No hay productos disponibles para este cliente";
    }

    private static void validarDatos(Cliente cliente) {
        if (cliente.getEdad() < 0) {
            throw new ClienteInvalidoException("La edad no puede ser negativa.");
        }
        if (cliente.getEdad() < 18 && cliente.isTrabajando()) {
            throw new ClienteInvalidoException("Un menor de edad no debería estar trabajando.");
        }
        if (cliente.isEstudiando() && cliente.isTrabajando()) {
            throw new ClienteInvalidoException("Un cliente no puede estar estudiando y trabajando a la vez.");
        }
    }
}