package com.codingdojo.maestrodeobjetos;

public class Samurai extends Human{
	public Samurai() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 200;
	}
	
	public void mortalAttack(Human enemigo) {
		System.out.println("Golpe Mortal");
		enemigo.setHealth(0);
		setHealth(getHealth()/2);
	}
	
	public void meditar() {
		System.out.println("Meditando");
		setHealth(getHealth()+ (getHealth()/2));
	}
	
	public void cantidad() {
		System.out.println("Vida Samurai: "+getHealth());
	}
}
