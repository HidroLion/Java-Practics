package com.codingdojo.pokedex;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pichu = new Pokemon("Pichu", 100, "Electrico");
		Pokemon meowscarada = new Pokemon("Meowscarada", 200, "Planta/Siniestro");
		
		meowscarada.attackPokemon(pichu);
		Pokedex pokedex = new Pokedex();
		pokedex.listPokemon();
		System.out.println(pichu.pokemonInfo(pichu));
		System.out.println(pichu.pokemonInfo(meowscarada));
	}

}
