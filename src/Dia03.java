import java.util.Scanner;

public class Dia03 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int pontos = 0;

        System.out.print("Escolha uma cor (azul, verde, vermelho): ");
        String cor = sc.next();

        if (cor.equals("azul")) {
            pontos += 10;
        } else if (cor.equals("verde")) {
            pontos += 5;
        } else {
            pontos -= 3;
        }

        System.out.print("Digite um número de 1 a 3: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1 -> System.out.println("Você escolheu 1");
            case 2 -> System.out.println("Você escolheu 2");
            case 3 -> System.out.println("Você escolheu 3");
            default -> System.out.println("Opção inválida");
        }

        System.out.println("Pontos finais: " + pontos);
        sc.close();
    }
}
