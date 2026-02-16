import static java.lang.System.out;
import java.util.Scanner;

//depois fazer uma opcao para determinar entre os valores 
public class grall {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    double celsius;
    
    out.println("Indique a temperatura:");
    celsius = teclado.nextDouble();

    double kelvin = celsius + 273.15;
    double farenheit = celsius * 1.8 + 32;

    out.printf("A conversao de %.2f é igual a %.2f em Kelvin e %.2f em farenheit.", celsius, kelvin, farenheit);
}
}