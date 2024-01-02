package com.codingdojo.maestrodeobjetos;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	
	public void robarVida(Human enemigo) {
		System.out.println("Robando");
		enemigo.setHealth(enemigo.getHealth() - stealth);
		setHealth(getHealth()+stealth);
	}
	
	public void escapar() {
		System.out.println("Escapando");
		setHealth(getHealth()-10);
	}
}
