import java.util.Scanner;

import static java.nio.file.Files.readString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fazer_Saque extends Inicio {

    public static void fazer_saque() {
        Inicio saldo = new Inicio();
        Scanner chama = new Scanner(System.in);
        Double saque;
        System.out.print("Qual o valor para saque?");
        saque = chama.nextDouble();

        boolean res;
        res = saque.isNaN(saque);
        if (res) {
            System.out.println("Isso não é um número! tente novamente");
            Fazer_Saque.fazer_saque();
        } else if (saque > saldo.getSaldo() || saque <= 0) {
            System.out.println("Esse valor não é válido!");
            Fazer_Saque.fazer_saque();
        }

        else {
            saldo.setSaldo(saque);
            Ver_Saldo.ver_saldo();
        }
    }
}
