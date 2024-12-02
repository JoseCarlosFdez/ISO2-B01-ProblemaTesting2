package com.mslc;

public class Cliente {
    private int edad;
    private boolean estudiando;
    private boolean viveConPadres;
    private boolean trabajando;

    public Cliente(int edad, boolean estudiando, boolean viveConPadres, boolean trabajando) {
    	try {
    		this.setEdad(edad);
    		this.setEstudiando(estudiando);
    		this.setViveConPadres(viveConPadres);
    		this.setTrabajando(trabajando);	
    	} finally {
    		
    	}
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ClienteInvalidoException {
    	if (edad < 0)
    		throw new ClienteInvalidoException("La edad no puede ser negativa");
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
    	if (this.getEdad() < 18 && trabajando)
    		throw new ClienteInvalidoException("Un menor de edad no debería estar trabajando.");
    	if (this.isEstudiando() && trabajando)
    		throw new ClienteInvalidoException("Un cliente no puede estar estudiando y trabajando a la vez.");
    	
        this.trabajando = trabajando;
    }
}