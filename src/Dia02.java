import java.util.Locale;
import java.util.Scanner;

public class Dia02 {
	
    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US); // Evita erro ao digitar números com ponto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double maior = (x > y) ? x : y;
        double raiz = Math.sqrt(maior);
        boolean condicao = x < 0 || y < 0;

        System.out.printf("Maior valor: %.2f%nRaiz do maior: %.2f%nAlgum número é negativo? %b%n", maior, raiz, condicao);
        sc.close();
    }
}
