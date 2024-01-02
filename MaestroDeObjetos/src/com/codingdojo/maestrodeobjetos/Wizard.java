package com.codingdojo.maestrodeobjetos;

public class Wizard extends Human{
	public Wizard() {
		this.intelligence = 8;
		this.health = 50;
	}
	
	public void curar(Human aliado) {
		System.out.println("Curando");
		aliado.setHealth(aliado.getHealth() + intelligence);
	}
	
	public void fireBall(Human enemigo) {
		System.out.println("Bola de Fuego");
		enemigo.setHealth(enemigo.getHealth() - (intelligence * 3));
	}
}
