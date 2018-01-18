
public abstract class PokemonAb implements PokemonInt {

	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon p =new Pokemon();
		p.setName(name);
		p.setType(type);
		p.setHealth(health);
		return p;
	}

	public void attackPokemon (Pokemon p) {
		p.setHealth(p.getHealth() - 10);
		
		
	}
}
