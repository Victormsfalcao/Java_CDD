package acabou;

public class Corredor extends Atleta {

	public Corredor(String nome, int idade) {
		super(nome, idade);
	
	}
	
	public void Correr (String nome) {
		
		System.out.printf("%s está correndo",nome);
	}
	
	public void pararCorrer (String nome) {
		
		System.out.printf("%s parou de correr",nome);
	}

	
}
