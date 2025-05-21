import java.util.Scanner;

public class Dia04 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        // While: soma até 0
        int soma = 0;
        int num;
        System.out.println("Digite números (0 para parar):");
        while ((num = sc.nextInt()) != 0) {
            soma += num;
        }
        System.out.println("Soma total: " + soma);

        // For: tabuada do 3
        System.out.println("\nTabuada do 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }

        // Do while: menu
        int opcao;
        do {
            System.out.println("\n1 - Continuar\n2 - Sair");
            opcao = sc.nextInt();
        } while (opcao != 2);

        sc.close();
    }
}
