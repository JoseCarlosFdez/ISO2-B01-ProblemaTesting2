package com.mslc;

public class ClienteInvalidoException extends RuntimeException {
    public ClienteInvalidoException(String mensaje) {
        super(mensaje);
    }
}