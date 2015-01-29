import java.util.Scanner;


public class Adivinhador {
	
	public int resposta;
	Scanner sc;
	
	public Adivinhador () {
		sc = new Scanner(System.in);
	}

	public void qualAnimalElePensou() {
		System.out.println("Ele pode voar?");
		System.out.println("Digite 1 para sim ou 2 para n�o.");
		
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
		System.out.println("Ser� que ele tem penas?");
		System.out.println("Digite 1 para sim ou 2 para n�o.");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: qualAnimalVoadorEComPenas();			
			break;
		case 2: System.out.println("O animal que voc� est� pensando � o Pav�o.");
			break;
		default:
			break;
		}
	}

	private void qualAnimalVoadorEComPenas() {
		System.out.println("Ele come�a com a letra 'A'?");
		System.out.println("Digite 1 para sim ou 2 para n�o.");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que voc� pensou � a Andorinha.");			
			break;
		case 2: System.out.println("O animal que voc� pensou � o Papagaio.");		
			break;
		default:
			break;
		}
	}

	private void qualAnimalQueNaoEhVoador() {
		System.out.println("Ser� que ele vive na �gua?");
		System.out.println("Digite 1 para sim ou 2 para n�o");
		
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
		System.out.println("Ser� que come�a com 'B'?");
		System.out.println("Digite 1 para sim ou 2 para n�o");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que voc� est� pensando � a Baleia.");			
			break;
		case 2: System.out.println("O animal que voc� est� pensando � o Peixe");		
			break;
		default:
			break;
		}
	}

	private void qualAnimalQueNaoEhVoadorENemAguatico() {
		System.out.println("Ser� que ele rasteja?");
		System.out.println("Digite 1 para sim ou 2 para n�o");
		
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
		System.out.println("Ser� que come�a com a letra 'L'?");
		System.out.println("Digite 1 para sim ou 2 para n�o");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que voc� est� pensando � o Lagarto.");		
			break;
		case 2: System.out.println("O animal que voc� est� pensando � o Camale�o.");		
			break;
		default:
			break;
		}
		
	}

	private void qualAnimalQueNaoEhVoadorENemAguaticoNemRastejador() {
		System.out.println("Ele cava buracos?");
		System.out.println("Digite 1 para sim ou 2 para n�o");
		
		resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: System.out.println("O animal que voc� est� pensando � o Urso.");		
			break;
		case 2: System.out.println("O animal que voc� est� pensando � o Macaco.");		
			break;
		default:
			break;
		}
		
	}	
	
}
