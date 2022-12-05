import java.util.Scanner;

public class Sair extends Inicio {
    public static void sair() {
        Scanner arroz = new Scanner(System.in);
        System.out.println("Você deseja sair? || 1.Sim 2.Não");
        int escolha = arroz.nextInt();

        switch (escolha) {
            case 1:
                System.exit(0);
                break;
            case 2:
                Inicio.inicio();
        }
    }
}
