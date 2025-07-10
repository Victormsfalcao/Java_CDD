package encapsulamento;

public class TesteRetangulo {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(0, 0);
		
		r1.setBase(15);
		r1.setAltura(10);
		
		System.out.println(r1.calcularArea());
		System.out.println(r1.calcularPerimetro());
	}

}
