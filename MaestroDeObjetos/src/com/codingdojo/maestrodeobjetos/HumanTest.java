package com.codingdojo.maestrodeobjetos;

public class HumanTest {

	public static void main(String[] args) {
		Human juan = new Human();

		Wizard mago = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		mago.fireBall(juan);
		System.out.println(juan.getHealth());
		mago.curar(juan);
		System.out.println(juan.getHealth());
		ninja.robarVida(juan);
		System.out.println(juan.getHealth());
		System.out.println(ninja.getHealth());
		ninja.escapar();
		System.out.println(ninja.getHealth());
		samurai.meditar();
		samurai.cantidad();
		samurai.mortalAttack(juan);
		System.out.println(juan.getHealth());
	}

}
