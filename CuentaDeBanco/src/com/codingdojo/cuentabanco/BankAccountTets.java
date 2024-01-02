package com.codingdojo.cuentabanco;

public class BankAccountTets {

	public static void main(String[] args) {
		BankAccount cuenta1 = new BankAccount();
		BankAccount cuenta2 = new BankAccount();
		
		System.out.println(cuenta1.numeroCuenta);
		cuenta1.depositarDinero('A', 2000000);
		cuenta1.depositarDinero('C', 1000000);
		cuenta1.retirarDinero('A', 500000);
		cuenta1.mostrarDinero();
		
		System.out.println(BankAccount.getCantidadCuentas());
	}

}
