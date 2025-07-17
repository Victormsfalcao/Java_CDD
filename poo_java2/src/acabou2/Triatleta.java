package acabou2;

public class Triatleta implements Corredor,Nadador,Ciclista {

	@Override
	public void Aquecer() {
		System.out.println("Está aquecendo");
	}

	@Override
	public void pedalar() {
		System.out.println("Está pedalar");

	}

	@Override
	public void pararPedalar() {
		System.out.println("Parou de pedalar");

	}

	@Override
	public void nadar() {
		System.out.println("Está nadando");
		
	}

	@Override
	public void pararNadar() {
		System.out.println("Parou de nadar");

	}

	@Override
	public void correr() {
		System.out.println("Está correndo");
		
	}

	@Override
	public void pararCorrer() {
		System.out.println("Parou de correr.");

	}
	
	
}
