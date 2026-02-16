import static java.lang.System.out;
import java.util.Scanner;



public class ageOmg {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        out.println("Informe sua idade");
        int idade = teclado.nextInt();

        if (5 <= idade && idade <= 7) {
            out.println("Sua classe é:");
            out.println("Infantil A");
        } else if (8 <= idade && idade <= 10 ){
            out.println("Sua classe é:");
            out.println("Infantil B");
        } else if (11 <= idade && idade <= 13 ) {
            out.println("Sua classe é:");
            out.println("Juvenil A");
        } else if (14 <= idade && idade <= 17 ) {
            out.println("Sua classe é:");
            out.println("Juvenil B");
        } else if (idade >= 18) {
            out.println("Sua classe é:");
            out.println("Adulto");
        }
    out.print("Tchau brigado!!");   
    }
}

