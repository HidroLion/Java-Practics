package com.codingdojo.guardiazoologico;

public class Mammal {
	public Mammal() {
		this.nivelEnergia = 100;
	}

	int nivelEnergia;

	public int getNivelEnergia() {
		return nivelEnergia;
	}

	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}
	
	public void displayEnergy() {
		System.out.println(getNivelEnergia());
	}
}
