package com.codingdojo.guardiazoologico;

public class Gorila extends Mammal {
	public Gorila() {}	
	
	public void throwSomething() {
		System.out.println("El gorila lanzo algo!");
		setNivelEnergia(nivelEnergia-5);
	}
	
	public void eatBananas() {
		System.out.println("El gorila se comio un platano...");
		setNivelEnergia(nivelEnergia+10);
	}
	
	public void climb() {
		System.out.println("El gorila esta escalando");
		setNivelEnergia(nivelEnergia-10);
	}
}
