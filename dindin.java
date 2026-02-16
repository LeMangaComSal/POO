import static java.lang.System.out;
import java.util.Scanner;


public class dindin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double real;

        out.println("Insira o valor em real");
        real = teclado.nextDouble();

        double dolar = real/5.57;
        double euro = real/6.58;

        out.printf("Sua quantia R$%.2f, te oferece:", real);
        out.println("");
        out.printf("%.2f Dolares", dolar);
        out.println("");
        out.printf("%.2f Euros", euro);
    }
}
