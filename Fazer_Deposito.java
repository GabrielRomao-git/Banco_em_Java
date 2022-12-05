import java.util.Scanner;

public class Fazer_Deposito extends Inicio {
    public static void fazer_deposito() {
        Inicio saldo = new Inicio();
        Scanner chama = new Scanner(System.in);
        Double depo;
        System.out.print("Qual o valor para Depósito?");
        depo = chama.nextDouble();
        boolean res;
        res = depo.isNaN(depo);
        if (res) {
            System.out.println("Isso não é um número! tente novamente");
            Fazer_Deposito.fazer_deposito();
        } else if (depo <= 0) {
            System.out.println("Esse valor não é válido!");
            Fazer_Deposito.fazer_deposito();
        }

        else {
            saldo.setSaldo1(depo);
            Ver_Saldo.ver_saldo();
        }
    }
}
