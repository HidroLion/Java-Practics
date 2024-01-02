package com.codingdojo.pokedex;

public abstract class AbstractPokemon implements PokemonInterface {
	
    public Pokemon createPokemon(String name, int health, String type) {
    	Pokemon pokemon = new Pokemon(name, health, type);
    	return pokemon;
    }
    
    public String pokemonInfo(Pokemon pokemon) {
    	String pokeName = pokemon.name + "|Tipo: " + pokemon.type + "|Health: " + pokemon.health;
    	return pokeName;
    }
}

