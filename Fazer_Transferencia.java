import java.util.Scanner;

public class Fazer_Transferencia extends Inicio {
    public static void fazer_transferencia() {
        Scanner trelo = new Scanner(System.in);
        String nconta;
        Inicio.ajuda ref = new ajuda();
        Inicio raf = new Inicio();
        Double valor;
        System.out.println("Qual o número da conta para onde será feita á transferência?");
        nconta = trelo.nextLine();
        while (nconta == "") {
            System.out.println("Informe um valor válido, por favor!");
            Fazer_Transferencia.fazer_transferencia();
        }
        System.out.print("Qual o valor da transfêrencia?");
        valor = trelo.nextDouble();

        while (valor > raf.getSaldo() || valor <= 0) {
            System.out.println("Operação inválida!");
            Fazer_Transferencia.fazer_transferencia();
        }
        raf.setSaldo(valor);

        System.out.println(ref.getNome() + " sua transfêrencia de R$" + valor + " foi feita com sucesso!");
        Ver_Saldo.ver_saldo();

    }
}
