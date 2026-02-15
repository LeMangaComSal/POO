import static java.lang.System.out;
import java.util.Scanner;


class trabaio {
    void main() {
        Scanner teclado = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        out.println("Insira sua primeira nota:");
        nota1 = teclado.nextInt();
        out.println("Insira sua segunda nota:");
        nota2 = teclado.nextInt();
        out.println("Insira sua terceira nota:");
        nota3 = teclado.nextInt();

        double result = nota1*2 + nota2*3 + nota3*5;
        double media = result/10;

        out.printf("O valor das notas %d %d %d, tem uma média %.2f", nota1, nota2, nota3, media);
    }
}