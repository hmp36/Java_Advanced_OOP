
public class Pokedex extends PokemonAb implements PokemonInt {
	public String pokemonInfo(Pokemon p) {
		return "Name: " + p.getName() + ", Type: " + p.getType() + ", Health: " + p.getHealth();
	}
}