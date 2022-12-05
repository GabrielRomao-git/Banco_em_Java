import java.util.Scanner;


public class Confirmacao extends Inicio {
    public static void confirmacao() {

        Scanner receba = new Scanner(System.in);
        System.out.println("Por favor informe sua senha!");
        int confirmacao = receba.nextInt();
        int senha = 3589;

        while(confirmacao != senha) {
            System.out.println("senha errada!");
            Confirmacao.confirmacao();
        }
        Inicio.inicio();
    }
}
