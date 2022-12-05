import java.util.Scanner;



public class Inicio extends Caixa {
     private static double saldo = 100.5;

     public void setSaldo(double valor) {
          saldo -= valor;
     }
     public void setSaldo1(double valor) {
          saldo += valor;
     }
     public Double getSaldo() {
          return saldo;
     }

     public static class ajuda {

          private static String nome;

          public void setNome(String name) {
               nome = name;
          }

          public String getNome() {
               return nome;
          }
          public void mostranome() {
               System.out.println("Olá " + getNome() + " é um prazer ter você por aqui!");
          }
     }

     public static void selecionar() {
          Scanner receba = new Scanner(System.in);

          ajuda y = new ajuda();

          System.out.println("Qual o seu nome?");

          String name = receba.nextLine();

          y.setNome(name);
          Inicio.senha();
     }

     public static void senha() {
          Confirmacao.confirmacao();
     }


     public static void inicio() {
          Scanner receba = new Scanner(System.in);
          ajuda gg = new ajuda();
          gg.mostranome();


          System.out.println("Selecione uma opção, 1.Saldo | 2.Extrato | 3.Saque | 4.Depósito | 5.Transferência | 6.Sair");
                int escolha = receba.nextInt();
          switch(escolha)

                {
                     case 1:
                          Ver_Saldo.ver_saldo();
                          break;
                     case 2:
                          Ver_Extrato.ver_extrato();
                          break;
                     case 3:
                          Fazer_Saque.fazer_saque();
                          break;
                     case 4:
                          Fazer_Deposito.fazer_deposito();
                          break;
                     case 5:
                          Fazer_Transferencia.fazer_transferencia();
                          break;
                     case 6:
                          Sair.sair();
                          break;
                     default:
                          Erro.erro();
                          break;
                }
     }
}

