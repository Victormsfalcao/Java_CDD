package acabou;

public class Atleta {
	
	private String nome;
	private int idade;
	
	public Atleta(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void Aquecer(String nome) {
		System.out.printf("%s está aquecendo");
		
	}
}
