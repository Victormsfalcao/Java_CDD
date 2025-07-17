package acabou;

	public class Ciclista extends Atleta {

		public Ciclista(String nome, int idade) {
			super(nome, idade);
		
		}
		
		public void Pedalar (String nome) {
			
			System.out.printf("%s está pedalando",nome);
		}
		
		public void pararPedaçar (String nome) {
			
			System.out.printf("%s parou de pedalar",nome);
		}

		
	}


