package hotel;

public class Estadia {
	private Animal animal;
	private int valor;
	private int dias;
	
	public Estadia(Animal animal, int valor, int dias) {
		this.animal = animal;
		this.valor = valor;
		this.dias = dias;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String toString() {
		return this.animal.getNome() + ", " + this.animal.getTipo() + ", " + this.dias + " dias com o preço de R$ "
				+ this.valor + ".00" + System.lineSeparator();			
	}
	
	
}
