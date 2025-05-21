import java.util.Locale;

public class Dia01 {
	
    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US); // Configura ponto como separador decimal

        int a = 7, b = 2;
        double media = (double) (a + b) / 2;
        boolean aprovado = media >= 6;

        System.out.printf("Média: %.2f - Aprovado: %b%n", media, aprovado);
    }
}
