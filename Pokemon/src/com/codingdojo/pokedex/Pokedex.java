package com.codingdojo.pokedex;

public class Pokedex extends AbstractPokemon {
	
	int myPokemons = Pokemon.count;
	
	public void listPokemon() {
		for(int i=0;i< Pokemon.pokemons.size(); i++) {
			System.out.println(Pokemon.pokemons.get(i).name);
		}
	}    
}


