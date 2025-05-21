import java.util.Scanner;

public class Dia05 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        char continuar;
        do {
            System.out.print("Digite nome do aluno: ");
            String nome = sc.next();

            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();

            double media = (n1 + n2) / 2;
            String status;

            if (media >= 7) {
                status = "Aprovado";
            } else if (media >= 5) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }

            System.out.printf("%s - Média: %.2f - Situação: %s%n", nome, media, status);

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');

        sc.close();
    }
}
