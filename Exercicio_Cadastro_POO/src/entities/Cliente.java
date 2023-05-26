package entities;

public class Cliente {
	
	public String nome;
	public String endereco;
	public String dataNascimento;
	public String telefone;
	public String cpf;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + "\n" + endereco + "\n" + dataNascimento + "\n" + cpf;
	}
}
