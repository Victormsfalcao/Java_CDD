package encapsulamento;

public class TestePet {

	public static void main(String[] args) {
		
		Pet p1 = new Pet();
		
		p1.ajustarNome("Lord");
		System.out.println(p1.mostrarNome());
	
		p1.ajustarIdade(10);
		System.out.println(p1.mostrarIdade());
		
		p1.ajustarTipo("Cachorro");
		System.out.println(p1.mostrarTipo());
		
		p1.ajustarRaca("Poodle");
		System.out.println(p1.mostrarRaca());
		
	}

}
