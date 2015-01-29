
public class App {

	public static void main(String[] args) {
		
		System.out.println("Pense em um desses animais:");
		System.out.println("Andorinha");
		System.out.println("Papagaio");
		System.out.println("Pavão");
		System.out.println("Baleia");
		System.out.println("Peixe");
		System.out.println("Lagarto");
		System.out.println("Camaleão");
		System.out.println("Urso");
		System.out.println("Macaco");
		System.out.println("");
		System.out.println("Agora eu vou tentar adivinhar o animal que você pensou.");
		System.out.println("");
		
		Adivinhador adivinha = new Adivinhador();
		adivinha.qualAnimalElePensou();
		
	}

}
