package com.codingdojo.pokedex;

public interface PokemonInterface {
	default void def() {
	}
	
	Pokemon createPokemon(String name, int health, String type);
	
	String pokemonInfo(Pokemon pokemon);
	
	void listPokemon();
}
