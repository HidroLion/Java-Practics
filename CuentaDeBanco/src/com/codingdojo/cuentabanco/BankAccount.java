package com.codingdojo.cuentabanco;
import java.util.Random;

public class BankAccount {
	String numeroCuenta = "";
	private double SaldoCuentaCorriente;
	private double SaldoCuentaAhorros;
	
	static int cantidadCuentas = 0;
	static double dineroTotal;
	
	public BankAccount() {
		numeroCuenta = GenerarNumeroCuenta();
		SaldoCuentaCorriente = 0;
		SaldoCuentaAhorros = 0;
		cantidadCuentas++;
	}
	
	private String GenerarNumeroCuenta() {
		Random r = new Random();
		long numeroRandom;
		numeroRandom = r.nextLong(9000000000L)+1000000000L;
		numeroCuenta = String.valueOf(numeroRandom);
		return numeroCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return SaldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorros() {
		return SaldoCuentaAhorros;
	}
	
	public static int getCantidadCuentas() {
		return cantidadCuentas;
	}

	public void depositarDinero(char cuenta, double dinero) {
		if(cuenta == 'C') {
			SaldoCuentaCorriente = SaldoCuentaCorriente + dinero;
		}
		if(cuenta == 'A') {
			SaldoCuentaAhorros = SaldoCuentaAhorros + dinero;
		}
	}
	
	public void retirarDinero(char cuenta, double dinero) {
		if(cuenta == 'C') {
			if(SaldoCuentaCorriente >= dinero) {
				SaldoCuentaCorriente = SaldoCuentaCorriente - dinero;
			}
		}
		if(cuenta == 'A') {
			if(SaldoCuentaAhorros >= dinero) {
				SaldoCuentaAhorros = SaldoCuentaAhorros - dinero;
			}
		}
	}
	
	public void mostrarDinero() {
		System.out.println("Cuenta Corriente:");
		System.out.println(SaldoCuentaCorriente);
		System.out.println("\nCuenta Ahorros:");
		System.out.println(SaldoCuentaAhorros);
	}
}
