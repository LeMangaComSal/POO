import static java.lang.System.out;
import java.util.Scanner;


public class TripaSeca {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    double salario;
    
    out.println("Informe o seu cargo");
        out.println("-Gerente-");
        out.println("-Coordenador-");
        out.println("-Analista-");
        out.println("-Outro-");
    String comando = teclado.nextLine();
        if (comando.equals("Gerente")) {
                out.println("Insira o salario");
                salario = teclado.nextDouble();
                double reajuste1 = salario + salario*10/100;
                double dif = reajuste1 - salario;

                out.println("Antigo salario: R$" + salario);
                out.println("Novo salario: R$" + reajuste1);
                out.println("Diferença: R$"+ dif);

            } else if (comando.equals("Coordenador")){
                out.println("Insira o salario");
                salario = teclado.nextDouble();
                double reajuste1 = salario + salario*15/100;
                double dif = reajuste1 - salario;

                out.println("Antigo salario: R$" + salario);
                out.println("Novo salario: R$" + reajuste1);
                out.println("Diferença: R$"+ dif);

        } else if (comando.equals("Analista")) {
                 out.println("Insira o salario");
                salario = teclado.nextDouble();
                double reajuste1 = salario + salario*20/100;
                double dif = reajuste1 - salario;

                out.println("Antigo salario: R$" + salario);
                out.println("Novo salario: R$" + reajuste1);
                out.println("Diferença: R$"+ dif);

        } else {
                out.println("Insira o salario");
                salario = teclado.nextDouble();
                double reajuste1 = salario + salario*40/100;
                double dif = reajuste1 - salario;

                out.println("Antigo salario: R$" + salario);
                out.println("Novo salario: R$" + reajuste1);
                out.println("Diferença: R$"+ dif);
        }

    }
}
