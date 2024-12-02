package com.mslc;

public class Main {

	public static void main(String[] args) {
        Cliente cliente1 = new Cliente(17, true, true, false);
        Cliente cliente2 = new Cliente(22, true, false, false);
        Cliente cliente3 = new Cliente(23, false, true, true);
        Cliente cliente4 = new Cliente(30, false, false, true);
        
        Banco banco = new Banco();
        
        System.out.println(banco.determinarCuenta(cliente1));
        System.out.println(banco.determinarCuenta(cliente2));
        System.out.println(banco.determinarCuenta(cliente3));
        System.out.println(banco.determinarCuenta(cliente4));
	}

}
