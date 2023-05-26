package entities;

public class Carro {

	public String cor;
	public String placa;
	public String tipoC;
	public String modelo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + cor + "\n" + placa + "\n" + tipoC + "\n" + modelo + "\n";
	}
}
