package com.codingdojo.guardiazoologico;

public class Bat extends Mammal{
	public Bat() {
		this.nivelEnergia = 300;
	}
	
	public void fly() {
		System.out.println("Woosh! Muercielago Volando");
		setNivelEnergia(nivelEnergia-50);
	}
	
	public void eatHumans() {
		System.out.println("Bueno, No importa");
		setNivelEnergia(nivelEnergia+25);
	}
	
	public void attackTown() {
		System.out.println("Ciudad en llamas");
		setNivelEnergia(nivelEnergia-100);
	}
}
