package hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recepcao {
	private List<Estadia> estadias;
	private double lucro;
	
	public Recepcao() {
		this.estadias = new ArrayList<>();
		this.lucro = 0;
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		this.estadias.add(new Estadia(nome, tipo, idade, dias, valor));
		this.lucro += valor;
	}
	
	public void checkOut(String nome) {
		for (Iterator<Estadia> iterator = this.estadias.iterator(); iterator.hasNext();) {
			Estadia estadia = (Estadia) iterator.next();
			if (nome.equalsIgnoreCase(estadia.getAnimal().getNome())){
				iterator.remove();
			}
		}
	}
	
	public int getNumDeHospedes() {
		return this.estadias.size();
	}
	
	public double getLucroTotal() {
		return this.lucro;
	}
	
	@Override
	public String toString() {
		String saida = "Estadias:" + System.lineSeparator();
		for (Estadia estadia : this.estadias) {
			saida += String.format("%s (%s): %d dias com o preco de R$ %.2f", estadia.getAnimal().getNome(),
					estadia.getAnimal().getTipo(), estadia.getDias(), estadia.getValor());
		}
		
		return saida;
	}
	
}