public class Ver_Saldo extends Inicio {

    public static void ver_saldo() {
        Inicio saldo = new Inicio();
        System.out.println("Seu saldo é : " + saldo.getSaldo());
        Confirmacao.confirmacao();
    }
}
