package com.codingdojo.pokedex;

import java.util.ArrayList;

public class Pokemon extends AbstractPokemon {
	String name;
	int health;
	String type;
	
	static int count;
	static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
		pokemons.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void attackPokemon(Pokemon pokemon) {
		pokemon.health = pokemon.health - 10;
	}

	public void listPokemon() {	}
}
