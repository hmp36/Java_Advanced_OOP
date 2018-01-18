
public interface PokemonInt {
	Pokemon createPokemon(String name, String type, int health);
	void attackPokemon(Pokemon p);
	String pokemonInfo(Pokemon p);
	
}
