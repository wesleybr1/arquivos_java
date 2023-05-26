package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Wesley" ;
		//pessoa.idade = 22;
		pessoa.cpf = "025.369.874-12";
		pessoa.sexo = 'M';
		
		pessoa.retornaIdade(2000);
		
		System.out.println(pessoa);
	}

}
