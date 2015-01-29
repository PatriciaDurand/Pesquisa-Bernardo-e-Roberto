import java.util.Scanner;


public class Adivinhador {
	
	public int resposta;
	Scanner sc;
	
	public Adivinhador () {
		sc = new Scanner(System.in);
	}

	public void qualAnimalElePensou() {
		System.out.println("Ele pode voar?");
		System.out.println("Digite 1 para sim ou 2 para não.");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: qualAnimalVoador();			
			break;
		case 2: qualAnimalQueNaoEhVoador();
			break;
		default:
			break;
		}
	}

	private void qualAnimalVoador() {
		System.out.println("Será que ele tem penas?");
		System.out.println("Digite 1 para sim ou 2 para não.");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: qualAnimalVoadorEComPenas();			
			break;
		case 2: System.out.println("O animal que você está pensando é o Pavão.");
			break;
		default:
			break;
		}
	}

	private void qualAnimalVoadorEComPenas() {
		System.out.println("Ele começa com a letra 'A'?");
		System.out.println("Digite 1 para sim ou 2 para não.");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que você pensou é a Andorinha.");			
			break;
		case 2: System.out.println("O animal que você pensou é o Papagaio.");		
			break;
		default:
			break;
		}
	}

	private void qualAnimalQueNaoEhVoador() {
		System.out.println("Será que ele vive na água?");
		System.out.println("Digite 1 para sim ou 2 para não");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: qualAnimalAguatico();			
			break;
		case 2: qualAnimalQueNaoEhVoadorENemAguatico();
			break;
		default:
			break;
		}
	}

	private void qualAnimalAguatico() {
		System.out.println("Será que começa com 'B'?");
		System.out.println("Digite 1 para sim ou 2 para não");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que você está pensando é a Baleia.");			
			break;
		case 2: System.out.println("O animal que você está pensando é o Peixe");		
			break;
		default:
			break;
		}
	}

	private void qualAnimalQueNaoEhVoadorENemAguatico() {
		System.out.println("Será que ele rasteja?");
		System.out.println("Digite 1 para sim ou 2 para não");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: qualAnimalRastejador();			
			break;
		case 2: qualAnimalQueNaoEhVoadorENemAguaticoNemRastejador();
			break;
		default:
			break;
		}
	}

	private void qualAnimalRastejador() {
		System.out.println("Será que começa com a letra 'L'?");
		System.out.println("Digite 1 para sim ou 2 para não");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que você está pensando é o Lagarto.");		
			break;
		case 2: System.out.println("O animal que você está pensando é o Camaleão.");		
			break;
		default:
			break;
		}
		
	}

	private void qualAnimalQueNaoEhVoadorENemAguaticoNemRastejador() {
		System.out.println("Ele cava buracos?");
		System.out.println("Digite 1 para sim ou 2 para não");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que você está pensando é o Urso.");		
			break;
		case 2: System.out.println("O animal que você está pensando é o Macaco.");		
			break;
		default:
			break;
		}
		
	}	
	
}
