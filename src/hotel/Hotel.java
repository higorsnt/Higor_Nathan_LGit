package hotel;

public class Hotel {
	private Recepcao recepcao;
	
	public Hotel() {
		this.recepcao = new Recepcao();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		this.recepcao.checkIn(nome, tipo, idade, dias, valor);
	}
	
	public void checkOut(String nome) {
		this.recepcao.checkOut(nome);
	}
	
	public int getNumDeHospedes() {
		return this.recepcao.getNumDeHospedes();
	}
	
	public double getLucroTotal() {
		return this.recepcao.getLucroTotal();
	}
	
	@Override
	public String toString() {
		return this.recepcao.toString();
	}
}