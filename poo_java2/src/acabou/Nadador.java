package acabou;

	public class Nadador extends Atleta {

		public Nadador(String nome, int idade) {
			super(nome, idade);
		
		}
		
		public void Nadar (String nome) {
			
			System.out.printf("%s está nadando",nome);
		}
		
		public void pararNadar (String nome) {
			
			System.out.printf("%s parou de nadar",nome);
		}

		
	}


